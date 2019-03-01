package driver;

import urlcaller.URLCaller;

public class Driver {

	public static void main(String[] args) {
		
		URLCaller myURLCaller = new URLCaller(); 
		
		// Config proxy if needed
	
		System.getProperties().put("http.proxyHost", "adc-proxy.oracle.com");
		System.getProperties().put("http.proxyPort", "80");
		// System.getProperties().put("http.proxyUser", "someUserName");
		// System.getProperties().put("http.proxyPassword", "somePassword");
		
		String contenido = myURLCaller.callURL("http://localhost:8080/PeliculaSearchService/PeliculaSearch?user=pepe");
		
		System.out.println(contenido);
		
	}
}

