package movieApp.model;

import java.util.Scanner;

import movieApp.model.customExceptions.CapacityFullException;

public class movieController {
	private movieManager manager = new movieManager();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1: 
                	addMovie(scanner);
                	break;
                case 2 : 
                	displayMovies();
                	break;
                case 3 :
                	clearMovies();
                	break;
                case 4 :
                	System.out.println("Exiting application...");
                	break;
                default :
                	System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private void displayMenu() {
        System.out.println("\nMovie Store Menu:");
        System.out.println("1. Add movie");
        System.out.println("2. Display Movie");
        System.out.println("3. Clear All Movies");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private void displayMovies() {
    	
    	if (manager.getMovies().isEmpty()) {
            System.out.println("\nThere are no movies in the list. First add the movies using choice 1");
            return;
        }
        System.out.println("Movies:");
        for (movieSerialization movie : manager.getMovies()) {
            System.out.println(movie);
        }
        
    }

    private void addMovie(Scanner scanner) {
        try {
        	System.out.print("Enter Movie ID (should be a number only): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Error: Please enter a valid integer for Movie ID.");
                scanner.next(); 
                return;
            }
            int id = scanner.nextInt();
            if (id < 0) {
                System.out.println("Error: Movie ID cannot be negative.");
                return;
            }
            scanner.nextLine(); 

            // Validate Movie Name 
            System.out.print("Enter Movie Name: ");
            String name = scanner.nextLine().trim();
            if (name.matches(".*\\d.*")) {
                System.out.println("Error: Movie name should contain only letters.");
                return;
            }

            // Validate Movie Genre 
            System.out.print("Enter Movie Genre: ");
            String genre = scanner.nextLine().trim();
            if (genre.matches(".*\\d.*")) {
                System.out.println("Error: Movie genre should contain only letters.");
                return;
            }

            // Validate Movie Year
            System.out.print("Enter Movie Year (positive integer): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Error: Please enter a valid integer for the year.");
                scanner.next(); 
                return;
            }
            int year = scanner.nextInt();
            if (year < 0) {
                System.out.println("Error: Year cannot be negative.");
                return;
            }
            scanner.nextLine(); 

            // Create and add movie
            movieSerialization movie = new movieSerialization(id, name, genre, year);
            manager.addMovie(movie);
            System.out.println("Movie added successfully.");
        } catch (CapacityFullException e) {
        	
            System.err.println(e.getMessage());
        }
        
    }

    private void clearMovies() {
        manager.clearMovies();
        System.out.println("All movies cleared.");
    }

}
