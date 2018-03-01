package exception;

public class ItemInexistente extends Exception{
	
	private static final long serialVersionUID = 1L;

	public ItemInexistente(final String msg){
		super(msg);
	}

}
