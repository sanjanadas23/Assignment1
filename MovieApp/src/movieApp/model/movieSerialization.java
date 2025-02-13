package movieApp.model;

import java.io.*;

public class movieSerialization implements Serializable {
	    private int id;
	    private String name;
	    private String genre;
	    private int year;

	    // Constructor
	    public movieSerialization(int id, String name, String genre, int year) {
	        this.id = id;
	        this.name = name;
	        this.genre = genre;
	        this.year = year;
	    }

	    // Getters and Setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getGenre() {
	        return genre;
	    }

	    public void setGenre(String genre) {
	        this.genre = genre;
	    }

	    public int getYear() {
	        return year;
	    }

	    public void setYear(int year) {
	        this.year = year;
	    }

	    @Override
	    public String toString() {
	        return "Movie [ID=" + id + 
	        		", Name=" + name + 
	        		", Genre=" + genre + 
	        		", Year=" + year + "]";
	    }

}
