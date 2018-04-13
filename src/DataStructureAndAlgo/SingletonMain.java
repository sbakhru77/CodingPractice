package DataStructureAndAlgo;

class Singleton {
	private static Singleton get_instance = null;
	public String str;
	
	private Singleton() {
		str = "Instantiated one String from singleton class";
	}

	public static Singleton getInstance() {
		if (get_instance == null)
			get_instance = new Singleton();
		
		return get_instance;
	}
}

class SingletonMain {
	public static void main(String[] args) {
		Singleton one = Singleton.getInstance();
		Singleton two = Singleton.getInstance();
		
		one.str.toLowerCase();
		
		System.out.println(one.str);
		System.out.println(two.str);
	}
}