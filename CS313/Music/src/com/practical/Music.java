package com.practical;

/**
 * @author Rhiana Thelemaque
 */

public class Music {

    private String title, genre, releaseDate, lyrics, artist, writer;
    private double length, ratings;

    /**
     * @param title the song title/name
     * @param genre the song genre
     * @param releaseDate the song release date
     * @param lyrics the song lyrics
     * @param artist the song artist / the musician
     * @param writer the songwriter(s)
     * @param length the song length / duration
     * @param ratings the song ratings
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
     * @return getter for the song title / name
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title setter for the song title / name
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return
     * getter for the song genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre
     * setter for song genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return
     * getter for the song release date
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * @param releaseDate
     * setter for the song release date
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * @return
     * getter for the song lyrics
     */
    public String getLyrics() {
        return lyrics;
    }

    /**
     * @param lyrics
     * setter for the song lyrics
     */
    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    /**
     * @return
     * getter for the song artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * @param artist
     * setter for the song artist
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * @return
     * getter for the songwriter(s)
     */
    public String getWriter() {
        return writer;
    }

    /**
     * @param writer
     * setter for the songwriter(s)
     */
    public void setWriter(String writer) {
        this.writer = writer;
    }

    /**
     * @return
     * getter for the song length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length
     * setter for the song length
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * @return
     * getter for the song ratings
     */
    public double getRatings() {
        return ratings;
    }

    /**
     * @param ratings
     * setter for the song ratings
     */
    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    /**
     * @param args
     * main method
     */
    public static void main(String[] args) {}

}
