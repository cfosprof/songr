package com.yeet.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String splash() {
        return "splash";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/albums")
    public String albums(Model model) {
        Album album1 = new Album("Recovery", "Eminem", 17, 4414, "/images/Recovery.jpeg");
        Album album2 = new Album("Need You Now", "Lady Antebellum", 12, 2690, "/images/needyounow.jpeg");
        Album album3 = new Album("Speak Now", "Taylor Swift", 14, 4065, "/images/speaknow.jpeg");
        List<Album> albums = Arrays.asList(album1, album2, album3);
        model.addAttribute("albums", albums);
        return "albums";
    }

    @GetMapping("/capitalize/{text}")
    public String capitalize(@PathVariable String text, Model model) {
        model.addAttribute("capitalized", text.toUpperCase());
        return "capitalize";
    }
}
