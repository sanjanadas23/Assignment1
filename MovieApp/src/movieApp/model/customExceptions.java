package movieApp.model;

public class customExceptions {
	public static class CapacityFullException extends Exception {
	    public CapacityFullException(String message) {
	        super(message);
	    }
	}

	public static class NoSuchMovieFoundException extends Exception {
	    public NoSuchMovieFoundException(String message) {
	        super(message);
	    }
	}

}
