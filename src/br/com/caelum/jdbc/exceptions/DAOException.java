package br.com.caelum.jdbc.exceptions;

@SuppressWarnings("serial")
public class DAOException extends RuntimeException {

	public DAOException() {
		super();
	}
	
	public DAOException(String message) {
		super(message);
	}
	
	public DAOException(Throwable cause) {
		super(cause);
	}
	
	public DAOException(String message, Throwable cause) {
		super(message, cause);
	}
	

}
