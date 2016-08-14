package WeatherMap;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.sun.xml.internal.txw2.Document;

public class WeatherClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL googleWeatherXml = new URL("http://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=fbfaa670d58ef1bd46a0d50351982274");
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	        DocumentBuilder db = dbf.newDocumentBuilder(); 
	        InputStream stream = googleWeatherXml.openStream();
	        org.w3c.dom.Document doc = db.parse(stream);
	        doc.getDocumentElement ().normalize ();
		} catch (MalformedURLException | ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
