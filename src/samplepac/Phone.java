package samplepac;

public interface Phone {
	//Variables declared can only be static final i.e. constant
	int x = 5;
	
	//all the methods are public and abstract by default
	public String getVersion();
	abstract void showDetails();
	void makeCall();
	void receiveCall();
	
}
