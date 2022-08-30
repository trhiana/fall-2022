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
     * getter for the song title / name
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * setter for the song title / name
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * getter for the song genre
     * @return
     */
    public String getGenre() {
        return genre;
    }

    /**
     * setter for song genre
     * @param genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * getter for the song release date
     * @return
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * setter for the song release date
     * @param releaseDate
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * getter for the song lyrics
     * @return
     */
    public String getLyrics() {
        return lyrics;
    }

    /**
     * setter for the song lyrics
     * @param lyrics
     */
    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    /**
     * getter for the song artist
     * @return
     */
    public String getArtist() {
        return artist;
    }

    /**
     * setter for the song artist
     * @param artist
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * getter for the songwriter(s)
     * @return
     */
    public String getWriter() {
        return writer;
    }

    /**
     * setter for the songwriter(s)
     * @param writer
     */
    public void setWriter(String writer) {
        this.writer = writer;
    }

    /**
     * getter for the song length
     * @return
     */
    public double getLength() {
        return length;
    }

    /**
     * setter for the song length
     * @param length
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * getter for the song ratings
     * @return
     */
    public double getRatings() {
        return ratings;
    }

    /**
     * setter for the song ratings
     * @param ratings
     */
    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {}

}
