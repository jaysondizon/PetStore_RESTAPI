package MavenFrameWork.PetStore_RESTAPI;

import static io.restassured.RestAssured.given;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import resources.resourcesAPI;
import resources.reusableMethods;

public class StoreScenario1 {
	
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
	public void viewInventory() {
		// TODO Auto-generated method stub

		RestAssured.baseURI=prop.getProperty("HOST");
		given().
		queryParam("api_key",prop.getProperty("KEY")).
		queryParam("username",prop.getProperty("user")).
		queryParam("password",prop.getProperty("pass")).
		when().
		get(resourcesAPI.resUserLogin()).
		then().assertThat().statusCode(200);
		
		Response r= given().
		queryParam("api_key",prop.getProperty("KEY")).
		when().
		get(resourcesAPI.resPetInventory()).
		then().assertThat().statusCode(200).
		extract().response();
		
		JsonPath msg = reusableMethods.rawtoJSON(r);	
		System.out.println(msg);		
		
	}

}
