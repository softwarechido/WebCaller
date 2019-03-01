package driver;

import urlcaller.URLCaller;
import urlcaller.XMLParser;

public class Driver {

	public static void main(String[] args) {
		
		URLCaller myURLCaller = new URLCaller(); 
		
		// Config proxy if needed
	
		//System.getProperties().put("http.proxyHost", "adc-proxy.oracle.com");
		//System.getProperties().put("http.proxyPort", "80");
		// System.getProperties().put("http.proxyUser", "someUserName");
		// System.getProperties().put("http.proxyPassword", "somePassword");
		
		String contenido = myURLCaller.callURL("http://www.businessweek.com/topStories/rss/topStories.rss");
		
		System.out.println(contenido);
		
		XMLParser myParser = new XMLParser();
		
		myParser.parse(contenido);
	}
}

