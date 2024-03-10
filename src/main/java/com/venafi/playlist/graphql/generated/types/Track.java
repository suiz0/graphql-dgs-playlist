package com.venafi.playlist.graphql.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class Track {
  /**
   * The ID for the track.
   */
  private String id;

  /**
   * The name of the track
   */
  private String name;

  /**
   * The track length in milliseconds.
   */
  private int durationMs;

  private boolean explicit;

  /**
   * The URI for the track, usually a Spotify link.
   */
  private String uri;

  public Track() {
  }

  /**
   * The ID for the track.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The name of the track
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The track length in milliseconds.
   */
  public int getDurationMs() {
    return durationMs;
  }

  public void setDurationMs(int durationMs) {
    this.durationMs = durationMs;
  }

  public boolean getExplicit() {
    return explicit;
  }

  public void setExplicit(boolean explicit) {
    this.explicit = explicit;
  }

  /**
   * The URI for the track, usually a Spotify link.
   */
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  @Override
  public String toString() {
    return "Track{" + "id='" + id + "'," +"name='" + name + "'," +"durationMs='" + durationMs + "'," +"explicit='" + explicit + "'," +"uri='" + uri + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track that = (Track) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(name, that.name) &&
                            durationMs == that.durationMs &&
                            explicit == that.explicit &&
                            java.util.Objects.equals(uri, that.uri);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, name, durationMs, explicit, uri);
  }

  public static com.venafi.playlist.graphql.generated.types.Track.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID for the track.
     */
    private String id;

    /**
     * The name of the track
     */
    private String name;

    /**
     * The track length in milliseconds.
     */
    private int durationMs;

    private boolean explicit;

    /**
     * The URI for the track, usually a Spotify link.
     */
    private String uri;

    public Track build() {
                  com.venafi.playlist.graphql.generated.types.Track result = new com.venafi.playlist.graphql.generated.types.Track();
                      result.id = this.id;
          result.name = this.name;
          result.durationMs = this.durationMs;
          result.explicit = this.explicit;
          result.uri = this.uri;
                      return result;
    }

    /**
     * The ID for the track.
     */
    public com.venafi.playlist.graphql.generated.types.Track.Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The name of the track
     */
    public com.venafi.playlist.graphql.generated.types.Track.Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The track length in milliseconds.
     */
    public com.venafi.playlist.graphql.generated.types.Track.Builder durationMs(int durationMs) {
      this.durationMs = durationMs;
      return this;
    }

    public com.venafi.playlist.graphql.generated.types.Track.Builder explicit(boolean explicit) {
      this.explicit = explicit;
      return this;
    }

    /**
     * The URI for the track, usually a Spotify link.
     */
    public com.venafi.playlist.graphql.generated.types.Track.Builder uri(String uri) {
      this.uri = uri;
      return this;
    }
  }
}
