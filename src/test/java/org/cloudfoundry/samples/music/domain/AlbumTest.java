package org.cloudfoundry.samples.music.domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class AlbumTest {

    @Test
    public void testAlbumGettersAndSetters() {
        Album album = new Album("Test Title", "Test Artist", "2024", "Pop");
        album.setId("id123");
        album.setTrackCount(10);
        album.setAlbumId("album123");

        assertEquals("Test Title", album.getTitle());
        assertEquals("Test Artist", album.getArtist());
        assertEquals("2024", album.getReleaseYear());
        assertEquals("Pop", album.getGenre());
        assertEquals("id123", album.getId());
        assertEquals(10, album.getTrackCount());
        assertEquals("album123", album.getAlbumId());
    }

    @Test
    public void testEmptyConstructor() {
        Album album = new Album();
        assertNull(album.getTitle());
    }
}
