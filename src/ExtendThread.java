
class NewThreadExtend extends Thread {
	
	NewThreadExtend() {
		super("My Thread Extend");
		System.out.println("my thread name "+ this);
		start();
	}
	
	public void run() {
		try {
			for(int i=5; i>0; i--){
				System.out.println("Inside new thread count " + i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e) {
			System.out.println("New thread interrupted");
			//e.printStackTrace();
		}
		System.out.println("Over with new thread");
	}
}



public class ExtendThread {

	public static void main(String arg[]) {
		new NewThreadExtend();
		
		try {
			for(int i=5; i>0; i--){
				System.out.println("Inside main thread count " + i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Main thread interrupted");
			e.printStackTrace();
		}
		System.out.println("Over with main thread");
	}
}
