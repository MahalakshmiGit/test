package GetRessured;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {
	
	@Test
	public void testResponsecode()
	
	{
		Response resp1=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
	
		
		int code = resp1.getStatusCode();
		
		System.out.println("Status code is "+code);
		
		
		
		
	
	
	}

}
