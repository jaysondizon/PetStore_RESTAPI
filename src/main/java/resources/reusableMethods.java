package resources;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class reusableMethods {
	
	public static XmlPath rawtoXML(Response r)
	{
		
		String responseString = r.asString();
		XmlPath x = new XmlPath(responseString);
		return x;
		
	}

	
	public static JsonPath rawtoJSON(Response r)
	{
		
		String responseString = r.asString();
		JsonPath x = new JsonPath(responseString);
		return x;
		
	}
	
	public static String getsessionID()
	{
		//create session
		RestAssured.baseURI="localhost:8080";
		Response res = given().header("Context-Type","application/json").
		body("{ \"username\": \"myuser\", \"password\": \"mypassword\" }").
		when().
		post("/rest/auth/1/session").
		then().statusCode(200).
		extract().response();
		JsonPath json = reusableMethods.rawtoJSON(res);	
		String sessionid = json.get("session.value");
		return sessionid;
		
		
	}
	
	
	
	
}
