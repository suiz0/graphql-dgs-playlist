package com.venafi.playlist.graphql.datasources;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import com.venafi.playlist.models.MappedPlaylist;
import com.venafi.playlist.models.PlaylistCollection;

@Component
public class SpotifyClient {
  private static final String SPOTIFY_API_URL = "https://spotify-demo-api-fe224840a08c.herokuapp.com/v1";
  private final RestClient client = RestClient.builder().baseUrl(SPOTIFY_API_URL).build();

  public PlaylistCollection  featuredPlaylistsRequest() {
    return client
            .get()
            .uri("/browse/featured-playlists")
            .retrieve()
            .body(PlaylistCollection.class);
  }

  public MappedPlaylist playlistRequest(String playlistID) {
    return client
    .get()
    .uri("/playlists/{playlist_id}", playlistID)
    .retrieve()
    .body(MappedPlaylist.class);
  }

  public List<MappedPlaylist> playlistRequest(List<String> playlistIDs) {
    return List.of(playlistRequest(playlistIDs.get(0)));
  }
}
