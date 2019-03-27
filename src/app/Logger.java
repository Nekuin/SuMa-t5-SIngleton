package app;

import java.time.LocalTime;

public enum Logger {
	INSTANCE;
	
	private Logger() {
	}
	
	public void log(String str) {
		//could also write into a file
		System.out.println(LocalTime.now() + " [LOG] " + str);
	}
	
	public static Logger getInstance() {
		return INSTANCE;
	}
}
