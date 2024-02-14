package co.mz.rent;

public class Rent {



	private final long id;
	private final String context;
	
	
	
	public Rent(long id, String context) {
		this.id = id;
		this.context = context;
	}
	
	

	public long getId() {
		return id;
	}
	
	public String getContext() {
		return context;
	}
	
}
