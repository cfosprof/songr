package com.yeet.songr;

import com.yeet.songr.models.Album;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}

	class AlbumTest {

		@Test
		void testAlbumConstructorAndGetters() {
			Album album = new Album("Title", "Artist", 10, 3000, "imageUrl");
			assertEquals("Title", album.getTitle());
			assertEquals("Artist", album.getArtist());
			assertEquals(10, album.getSongCount());
			assertEquals(3000, album.getLength());
			assertEquals("imageUrl", album.getImageUrl());
		}

		@Test
		void testAlbumSetters() {
			Album album = new Album("Title", "Artist", 10, 3000, "imageUrl");
			album.setTitle("New Title");
			album.setArtist("New Artist");
			album.setSongCount(12);
			album.setLength(3600);
			album.setImageUrl("newImageUrl");

			assertEquals("New Title", album.getTitle());
			assertEquals("New Artist", album.getArtist());
			assertEquals(12, album.getSongCount());
			assertEquals(3600, album.getLength());
			assertEquals("newImageUrl", album.getImageUrl());
		}
	}

}
