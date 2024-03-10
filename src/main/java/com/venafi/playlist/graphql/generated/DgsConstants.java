package com.venafi.playlist.graphql.generated;

import java.lang.String;

public class DgsConstants {
  public static final String QUERY_TYPE = "Query";

  public static class PLAYLIST {
    public static final String TYPE_NAME = "Playlist";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Description = "description";

    public static final String Tracks = "tracks";
  }

  public static class TRACK {
    public static final String TYPE_NAME = "Track";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String DurationMs = "durationMs";

    public static final String Explicit = "explicit";

    public static final String Uri = "uri";
  }

  public static class QUERY {
    public static final String TYPE_NAME = "Query";

    public static final String FeaturedPlaylists = "featuredPlaylists";

    public static final String Playlist = "playlist";

    public static final String PlaylistWithLoader = "playlistWithLoader";

    public static class PLAYLIST_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class PLAYLISTWITHLOADER_INPUT_ARGUMENT {
      public static final String Id = "id";
    }
  }
}
