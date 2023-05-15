package com.yeet.songr.controllers;

import com.yeet.songr.models.Album;
import com.yeet.songr.repository.AlbumRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@Controller
public class HomeController {

    private final AlbumRepository albumRepository;

    public HomeController(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @GetMapping("/albums")
    public String albums(Model model) {
        model.addAttribute("albums", albumRepository.findAll());
        return "albums";
    }

    @PostMapping("/albums")
    public String addAlbum(@RequestParam String title, @RequestParam String artist, @RequestParam int songCount, @RequestParam int length, @RequestParam String imageUrl) {
        Album album = new Album(title, artist, songCount, length, imageUrl);
        albumRepository.save(album);
        return "redirect:/albums";
    }
    @GetMapping("/albums/{title}")
    public String albumByTitle(@PathVariable String title, Model model) {
        Album album = albumRepository.findByTitle(title);
        model.addAttribute("album", album);
        return "album";
    }
    @PutMapping("/albums/{id}/update")
    public String updateAlbum(@PathVariable Long id, @RequestParam String title, @RequestParam String artist, @RequestParam int songCount, @RequestParam int length, @RequestParam String imageUrl) {
        Album album = albumRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid album Id:" + id));
        album.setTitle(title);
        album.setArtist(artist);
        album.setSongCount(songCount);
        album.setLength(length);
        album.setImageUrl(imageUrl);
        albumRepository.save(album);
        return "redirect:/albums";
    }
    @DeleteMapping("/albums/{id}/delete")
    public String deleteAlbum(@PathVariable Long id) {
        Album album = albumRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid album Id:" + id));
        albumRepository.delete(album);
        return "redirect:/albums";
    }
}

