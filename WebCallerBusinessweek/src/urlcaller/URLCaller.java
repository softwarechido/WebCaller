package urlcaller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLCaller {

	public String callURL(String urlAsString) {

		String content = "";
		try {
			URL url = new URL(urlAsString);
			URLConnection con = url.openConnection();

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

			String linea;
			while ((linea = in.readLine()) != null) {
				content += linea +"\n";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return content;
	}
}
