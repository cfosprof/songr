package com.yeet.songr.controllers;

import com.yeet.songr.models.Album;
import com.yeet.songr.models.Song;
import com.yeet.songr.repository.AlbumRepository;
import com.yeet.songr.repository.SongRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private final AlbumRepository albumRepository;
    private final SongRepository songRepository;

    public HomeController(AlbumRepository albumRepository, SongRepository songRepository) {
        this.albumRepository = albumRepository;
        this.songRepository = songRepository;
    }

    @GetMapping("/songs")
    public String songs(Model model) {
        model.addAttribute("songs", songRepository.findAll());
        return "songs";
    }

    @PostMapping("/albums/{id}/songs")
    public String addSongToAlbum(@PathVariable Long id, @RequestParam String title, @RequestParam int length, @RequestParam int trackNumber) {
        Album album = albumRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid album Id:" + id));
        Song song = new Song(title, length, trackNumber, album);
        songRepository.save(song);

        return "redirect:/albums/" + id;
    }


    @GetMapping("/albums/{id}")
    public String albumById(@PathVariable Long id, Model model) {
        Album album = albumRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid album Id:" + id));
        model.addAttribute("album", album);
        return "album";
    }
    @GetMapping("/albums/new")
    public String newAlbum() {
        return "newAlbum";
    }

    @PostMapping("/albums")
    public String addNewAlbum(@RequestParam String title, @RequestParam String artist, @RequestParam int songCount, @RequestParam int length, @RequestParam String imageUrl, Model model) {
        Album newAlbum = new Album(title, artist, songCount, length, imageUrl);
        albumRepository.save(newAlbum);
        return "redirect:/albums";
    }

    @GetMapping("/albums")
    public String getAllAlbums(Model model) {
        model.addAttribute("albums", albumRepository.findAll());
        return "albums";
    }

}

