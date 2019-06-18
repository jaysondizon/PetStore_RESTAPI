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
import resources.payLoad;
import resources.resourcesAPI;
import resources.reusableMethods;

public class StoreScenario2 {
		
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
	public void placeOrderSuccess() {
		// TODO Auto-generated method stub

		RestAssured.baseURI=prop.getProperty("HOST");
		Response r = given().
		queryParam("api_key",prop.getProperty("KEY")).
		body(payLoad.placeOrder()).
		when().
		post(resourcesAPI.resStoreOrder()).
		then().assertThat().statusCode(200).
		extract().response();
		
		JsonPath msg = reusableMethods.rawtoJSON(r);	
		System.out.println(msg);
		String id = msg.get("id");
		System.out.println(id);	
	}

}
