package com.practical;

/**
 * @author Rhiana Thelemaque
 */

public class Music {

    private String title, genre, releaseDate, lyrics, artist, writer;
    private double length, ratings;

    /**
     * @param title
     * @param genre
     * @param releaseDate
     * @param lyrics
     * @param artist
     * @param writer
     * @param length
     * @param ratings
     */
    public Music(String title, String genre, String releaseDate, String lyrics, String artist, String writer, double length, double ratings) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.lyrics = lyrics;
        this.artist = artist;
        this.writer = writer;
        this.length = length;
        this.ratings = ratings;
    }

    /**
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {}

}
