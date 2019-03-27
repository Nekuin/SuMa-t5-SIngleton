package app;

public class SingletonMain {
	
	
	public static void main(String[] args) {
		Logger l = Logger.getInstance();
		new Thread(new SomeThread()).start();
		l.log("error in ... retrying");
		l.log("successfully did something");
		
			
	}
}
