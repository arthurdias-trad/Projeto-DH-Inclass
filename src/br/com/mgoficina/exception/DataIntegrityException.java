package br.com.mgoficina.exception;

public class DataIntegrityException extends RuntimeException {
	private static final String texto ="Campo Invalido: ";
	public DataIntegrityException(String mensagem) {
		super(texto + mensagem);
		
	}
}
