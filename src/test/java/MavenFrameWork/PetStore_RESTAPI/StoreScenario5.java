package MavenFrameWork.PetStore_RESTAPI;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import resources.resourcesAPI;

public class StoreScenario5 {

	Properties prop= new Properties();
	@BeforeTest
	public void getData() throws IOException
	{
		//Properties prop= new Properties();
		FileInputStream fis = new FileInputStream("C:\\Training4.9\\Eclipse4.9_workspace\\PetStore_RESTAPI\\src\\main\\java\\resources\\env.properties");
		prop.load(fis);
		//prop.getProperty("HOST");		
	}
	
	@Test
	public void deleteOrderByID() {
		// TODO Auto-generated method stub
		RestAssured.baseURI=prop.getProperty("HOST");
		Response r = given().
		param("api_key", prop.getProperty("KEY")).
		param("id", prop.getProperty("orderid")).
		when().
		delete(resourcesAPI.resDeleteOrder()).
		then().assertThat().statusCode(400).
		extract().response();		
		System.out.println(r);
	}
}
