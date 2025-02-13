package movieApp.model;

import java.io.*;
import java.util.*;

import movieApp.model.customExceptions.*;

public class movieManager {
	private List<movieSerialization> movies; // List to store movies
    private static final String FILE_PATH = "C:\\Users\\sanjana.das\\Desktop\\aurionproproj\\MovieApp\\bin\\movieApp\\movie.txt"; // Path to store serialized data

    // Constructor
    public movieManager() {
        movies = new ArrayList<>();
        loadMovies(); 
    }

    // Add a movie to the list
    public void addMovie(movieSerialization movie) throws CapacityFullException {
        if (movies.size() >= 5) {
            throw new customExceptions.CapacityFullException("Cannot add more than 5 movies!");
        }
        movies.add(movie);
        saveMovies(); 
    }

    // Clear all movies
    public void clearMovies() {
        movies.clear();
        saveMovies(); 
    }

    // Get the list of movies
    public List<movieSerialization> getMovies() {
        return new ArrayList<>(movies); // Return a copy 
    }

    // Generate a unique movie ID
    public int getMovieId() {
        return movies.size() + 1; // Next ID = current size + 1
    }

   
  
    public void loadMovies() {
        File file = new File(FILE_PATH);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                movies = (List<movieSerialization>) ois.readObject(); // Deserialize the list
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Error loading movies: " + e.getMessage());
                movies = new ArrayList<>(); // Initialize a new list in case of error
            }
        } else {
            movies = new ArrayList<>(); // If the file does not exist, initialize a new list
        }
    }

   
    public void saveMovies() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(movies); // Serialize the list
        } catch (IOException e) {
            System.err.println("Error saving movies: " + e.getMessage());
        }
    }

    // Delete all movies from the file
    public void deleteAllMovies() {
        clearMovies();
        File file = new File(FILE_PATH);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("All movies deleted successfully.");
            } else {
                System.err.println("Failed to delete movies file.");
            }
        }
    }

}
