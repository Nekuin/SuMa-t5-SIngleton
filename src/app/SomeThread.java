package app;

public class SomeThread implements Runnable {

	@Override
	public void run() {
		Logger l = Logger.getInstance();
		for(int i = 0; i < 5; i++) {
			l.log("threading " + i);
		}
	}

}
