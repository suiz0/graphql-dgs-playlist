package com.venafi.playlist.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;
import com.venafi.playlist.graphql.generated.types.Track;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MappedTrack extends Track {
    @JsonSetter("track")
    public void setTrackProperties(JsonNode trackObject) {
        this.setId(trackObject.get("id").asText());
        this.setName(trackObject.get("name").asText());
        this.setDurationMs(trackObject.get("duration_ms").asInt());
        this.setExplicit(trackObject.get("explicit").asBoolean());
        this.setUri(trackObject.get("uri").asText());
    }

    public Track getTrack() {
        return this;
      }
}