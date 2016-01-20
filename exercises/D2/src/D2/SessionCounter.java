package D2;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionCounter implements HttpSessionListener {
	private static int numberOfSessions = 0;
	
	public void sessionCreated(HttpSessionEvent evt){
		numberOfSessions++;
	}
	
	public void sessionDestroyed(HttpSessionEvent evt){
		numberOfSessions--;
	}
	
	public static int getNumberOfSessions(HttpSessionEvent evt){
		return numberOfSessions;
	}
}
