package com.venafi.playlist.graphql.datafetchers;

import com.netflix.graphql.dgs.InputArgument;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.dataloader.DataLoader;
import org.springframework.beans.factory.annotation.Autowired;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.venafi.playlist.graphql.datasources.SpotifyClient;
import com.venafi.playlist.models.MappedPlaylist;
import com.venafi.playlist.models.PlaylistCollection;

import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class PlaylistDataFetcher {
    private final SpotifyClient spotifyClient;
    
    @Autowired
    public PlaylistDataFetcher(SpotifyClient spotifyClient) {
        this.spotifyClient = spotifyClient;
    }

    // The parentType is "Query", the field name is derived from the method name.

    // @DgsData(parentType = "Query")
    // @DgsData(parentType = "Query", field = "featuredPlaylists")
    // @DgsQuery(field= "featuredPlaylists")
    @DgsQuery()
    public List<MappedPlaylist> featuredPlaylists() {
        PlaylistCollection response = spotifyClient.featuredPlaylistsRequest();
        return response.getPlaylists();
    }

    @DgsQuery()
    public MappedPlaylist playlist(@InputArgument String id) {
        return spotifyClient.playlistRequest(id);
    }

    @DgsQuery()
    public CompletableFuture<MappedPlaylist> playlistWithLoader(DataFetchingEnvironment dfe) {
        DataLoader<String, MappedPlaylist> dataLoader = dfe.getDataLoader("playlistdataloader");
        String id = dfe.getArgument("id");
        return dataLoader.load(id);
    }
}
