package D2;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class SessionAttributeListenerExample implements HttpSessionAttributeListener{
	
	public void attributeAdded(HttpSessionBindingEvent sessionBindingEvent){
		//get the session
		HttpSession session = sessionBindingEvent.getSession();
		//log some information
		System.out.println("[SessionAttr]" + new java.util.Date() + "Attribute added, session" + session +":" + sessionBindingEvent.getName() + "=" + sessionBindingEvent.getValue());	
	}
	
	public void attributeRemoved(HttpSessionBindingEvent sessionBindingEvent){
		HttpSession session = sessionBindingEvent.getSession();
		System.out.println(new java.util.Date() + "Attribute removed, session" + session + ":" + sessionBindingEvent.getName());
	}

	public void attributeReplaced(HttpSessionBindingEvent sessionBindingEvent){
		HttpSession session = sessionBindingEvent.getSession();
		System.out.println(new java.util.Date() + "Attribute relpaced, session" + session + ":" + sessionBindingEvent.getName() +  "=" + sessionBindingEvent.getValue());
	}
	
}

