package com.venafi.playlist.models;

import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.List;
import java.io.IOException;

public class PlaylistCollection {
	List<MappedPlaylist> playlists;
	public void setPlaylists(JsonNode playlists) throws StreamReadException, DatabindException, IOException {
		JsonNode playlistItems = playlists.get("items");
		ObjectMapper mapper = new ObjectMapper();

		this.playlists = mapper.readValue(playlistItems.traverse(), new TypeReference<List<MappedPlaylist>>(){});
	}

	public List<MappedPlaylist> getPlaylists() {
    return this.playlists;
}
}
