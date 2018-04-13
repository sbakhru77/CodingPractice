package samplepac;

//The purpose of this class to understand the behavior of implementing interfaces and extending abstract classes
public class AndroidPhone extends SmartPhone implements MP3Player {

	private String version = "1.0.1";
	
	public static void main(String[] args) {
		AndroidPhone ap = new AndroidPhone();
		String ver;
		int a;
		
		ver = ap.getVersion();
		System.out.println(ver);
		ap.showDetails();
		ap.openNavigation();
		ap.makeCall();
		ap.receiveCall();
		ap.endCall();
		ap.camera();
		ap.getList();
		ap.playSong();
		a = ap.getA();
		System.out.println("The value of a = "+a);
		
		//Accessing field value x from class says it is ambiguous since it is defined in two interfaces
		//System.out.println("The value of x = "+ap.x);
		System.out.println("The value of y = "+y);
		
		ap.dial();
		ap.dial(2221111);
		ap.dial(1112222, 321);
	}
	
	//implementing abstract class method
	public void openNavigation(){
		System.out.println("Navigate through phone applications");
	}
	
	//implementing all Phone interface methods
	public String getVersion(){
		System.out.println("The phone version is:");
		return version;
	}
	
	public void showDetails()
	{
		System.out.println("The smart phone I own is Droid X");
	}
	
	public void makeCall(){
		System.out.println("Making a call....");
	}
	
	public void receiveCall(){
		System.out.println("Hello! How are you?");
	}
	//end phone interface methods
	
	//Class method
	public void endCall(){
		System.out.println("Bye. End Call");
	}
	
	//implementing MP3Player interface methods
	public void getList(){
		
	}
	
	public void playSong(){
		System.out.println("Playing my favorite songs");
	}
	//end MP3Player interface methods
	
	//this is method overriding since we are changing the implementation in the child class
	//we are not using the implementation of the parent SmartPhone.java class
	void dial(int n){
		System.out.println("Click on the speaker if you want");
		makecall(n);
	}
	
	void connectExtn(int e){
		System.out.println("Connecting Extension");
	}
	
	//this is method overloading since the method signature is different from the parent class method
	void dial(int n, int e){
		makecall(n);
		connectExtn(e);
	}

	//Static methods cannot be overriden as non-static
	//void test(){
		
}
