package WeatherMap;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.security.ntlm.Client;


public class WeatherClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // Connect to the URL using java's native library
	    try {
	    	String sURL = "http://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=fbfaa670d58ef1bd46a0d50351982274"; //just a string			
			URL url = new URL(sURL);
			HttpURLConnection request = (HttpURLConnection)url.openConnection();
		    request.connect();
		    JsonParser jp = new JsonParser();
		    JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
		    JsonObject rootobj = root.getAsJsonObject();
		  
		    
		    
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
