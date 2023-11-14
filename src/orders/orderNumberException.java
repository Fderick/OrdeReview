package orders;

public class orderNumberException extends RuntimeException {
	public orderNumberException(String errorMessage) {
		super(errorMessage);
	}
}
