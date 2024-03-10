package com.venafi.playlist.graphql.dataloaders;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import org.dataloader.BatchLoader;

import com.netflix.graphql.dgs.DgsDataLoader;
import com.venafi.playlist.graphql.datasources.SpotifyClient;
import com.venafi.playlist.models.MappedPlaylist;

@DgsDataLoader(name = "playlistdataloader")
public class PlaylistDataloader implements BatchLoader<String, MappedPlaylist> {

    private final SpotifyClient client;
    public PlaylistDataloader(SpotifyClient client) {
        this.client = client;
    }
    @Override
    public CompletionStage<List<MappedPlaylist>> load(List<String> keys) {
        // TODO Auto-generated method stub
        return CompletableFuture.supplyAsync(() -> client.playlistRequest(keys));
    }
    
}
