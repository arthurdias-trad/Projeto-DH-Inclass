package br.com.mgoficina.exception;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private static final String message = "O seguinte item não foi encontrado: ";
	
	public ObjectNotFoundException(String item) {
		super(message + item);
	}

}
