import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class TestAPI {
	

	@BeforeTest
	public void setData() {
		//comments
		RestAssured.baseURI="https://reqres.in";
		RestAssured.basePath="/api/users?page=2";
		
	}
	@Test
	public void getData() {
		RestAssured.given().when().get().then().assertThat().statusCode(200);
	}
}
