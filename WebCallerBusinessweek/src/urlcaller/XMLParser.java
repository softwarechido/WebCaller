package urlcaller;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class XMLParser {

	public void parse(String contenido) {

		try {
			
			Document document;

			document = DocumentHelper.parseText(contenido);

			List<Element> myElements = document.selectNodes("//rss/channel/item");

			for (Element element : myElements) {
				
				System.out.println("title: " + element.elementText("title"));
				System.out.println("description: " + element.elementText("description"));
				System.out.println("link: " + element.elementText("link"));
				System.out.println(" - - - - - ");
				
			}
			
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}

	}

}
