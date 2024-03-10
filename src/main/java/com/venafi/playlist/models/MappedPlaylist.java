package com.venafi.playlist.models;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.venafi.playlist.graphql.generated.types.Playlist;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MappedPlaylist extends Playlist {
    @JsonSetter("tracks")
    public void mapTracks(JsonNode tracks) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode items = tracks.get("items");

        List<MappedTrack> trackList = mapper.readValue(items.traverse(), new TypeReference<>() {});
        this.setTracks(trackList.stream().map(MappedTrack::getTrack).toList());
    }
}
