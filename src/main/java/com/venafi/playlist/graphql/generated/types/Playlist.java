package com.venafi.playlist.graphql.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;

/**
 * A curated collection of tracks designed for a specific activity or mood.
 */
public class Playlist {
  /**
   * The ID for the playlist.
   */
  private String id;

  /**
   * The name of the playlist.
   */
  private String name;

  /**
   * Describes the playlist, what to expect and entices the user to listen.
   */
  private String description;

  private List<Track> tracks;

  public Playlist() {
  }

  /**
   * The ID for the playlist.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The name of the playlist.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Describes the playlist, what to expect and entices the user to listen.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public List<Track> getTracks() {
    return tracks;
  }

  public void setTracks(List<Track> tracks) {
    this.tracks = tracks;
  }

  @Override
  public String toString() {
    return "Playlist{" + "id='" + id + "'," +"name='" + name + "'," +"description='" + description + "'," +"tracks='" + tracks + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Playlist that = (Playlist) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(description, that.description) &&
                            java.util.Objects.equals(tracks, that.tracks);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, name, description, tracks);
  }

  public static com.venafi.playlist.graphql.generated.types.Playlist.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID for the playlist.
     */
    private String id;

    /**
     * The name of the playlist.
     */
    private String name;

    /**
     * Describes the playlist, what to expect and entices the user to listen.
     */
    private String description;

    private List<Track> tracks;

    public Playlist build() {
                  com.venafi.playlist.graphql.generated.types.Playlist result = new com.venafi.playlist.graphql.generated.types.Playlist();
                      result.id = this.id;
          result.name = this.name;
          result.description = this.description;
          result.tracks = this.tracks;
                      return result;
    }

    /**
     * The ID for the playlist.
     */
    public com.venafi.playlist.graphql.generated.types.Playlist.Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The name of the playlist.
     */
    public com.venafi.playlist.graphql.generated.types.Playlist.Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Describes the playlist, what to expect and entices the user to listen.
     */
    public com.venafi.playlist.graphql.generated.types.Playlist.Builder description(
        String description) {
      this.description = description;
      return this;
    }

    public com.venafi.playlist.graphql.generated.types.Playlist.Builder tracks(List<Track> tracks) {
      this.tracks = tracks;
      return this;
    }
  }
}
