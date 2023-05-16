package com.yeet.songr.models;

import jakarta.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String title;

    private int trackNumber;

    @ManyToOne
    @JoinColumn(name = "album_id")
    protected Album album;

    protected Song() {
    }
    @Column
    private int length;
    public int getLength() {
        return this.length;
    }

    public Song(String title, int length, int trackNumber, Album album) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.album = album;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }
}
