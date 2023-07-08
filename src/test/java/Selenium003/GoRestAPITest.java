package Selenium003;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class GoRestAPITest {

        private WebDriver driver;
        private Response response;
        private RequestSpecification httpRequest;
        @BeforeClass
        public void setUp() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().minimize();
            RestAssured.baseURI = "https://gorest.co.in/public/v2";
            httpRequest = given()
                    .header("Authorization", " a01e31c3f767a0876a6d4b5d9350b9020e5d33454e4381400a9e4309e25d790a")
                    .contentType(ContentType.JSON);
        }
        @Test(priority = 0)
        public void verifyStatusCode() {
            Response response = httpRequest.get("/users");
            int statusCode = response.getStatusCode();
            Assert.assertEquals(statusCode, 200);
        }
        @Test(priority = 1)
        public void createUserTest() {
            // Set base URI and path
            RestAssured.baseURI = "https://gorest.co.in/public/v2";
            String endpoint = "/users";
            // Define request payload
            JSONObject requestParams = new JSONObject();
            requestParams.put("name", "John Doe");
            requestParams.put("email", "johndoe0123@example.com");
            requestParams.put("gender", "male");
            requestParams.put("status", "active");
            // Send POST request using RestAssured
            Response response = given()
                    .header("Authorization", "Bearer a01e31c3f767a0876a6d4b5d9350b9020e5d33454e4381400a9e4309e25d790a") // Replace with the actual access token
                    .contentType(ContentType.JSON)
                    .body(requestParams.toString())
                    .when()
                    .post(endpoint);
            // Assert the response
            int statusCode = response.getStatusCode();
            Assert.assertEquals(statusCode, 201);
            // Retrieve the created user's ID from the response
            String userId = response.jsonPath().getString("id");
            System.out.println("User Created With id: " + userId);
        }
        @Test(priority = 2)
        public void updateUserTest() {
            // Set base URI and path
            RestAssured.baseURI = "https://gorest.co.in/public/v2";
            String endpoint = "/users";
            //get the id of user we just created
            Response response1 = given()
                    .header("Authorization", "Bearer a01e31c3f767a0876a6d4b5d9350b9020e5d33454e4381400a9e4309e25d790a") // Replace with the actual access token
                    .when().get(endpoint);
            // Define the user ID you want to update
            String userId = response1.jsonPath().getString("[0].id") ; // Replace with the actual user ID we get from create user
            // Define request payload
            JSONObject requestParams = new JSONObject();
            requestParams.put("name", "Jason Smith");
            requestParams.put("email","Jason.Smith@example.com");
            // Send PATCH request using RestAssured
            Response response = given()
                    .header("Authorization", "Bearer a01e31c3f767a0876a6d4b5d9350b9020e5d33454e4381400a9e4309e25d790a") // Replace with the actual access token
                    .contentType(ContentType.JSON)
                    .pathParam("userId", userId)
                    .body(requestParams.toString())
                    .when()
                    .patch(endpoint + "/{userId}");
            // Assert the response
            int statusCode = response.getStatusCode();
            Assert.assertEquals(statusCode, 200);
            // Retrieve the updated user details from the response
            String updatedName = response.jsonPath().getString("name");
            System.out.println("Your Updated name: "+" "+updatedName);
        }
        @Test(priority = 3)
        public void  getUserTest() {
            // Set base URI and path
            RestAssured.baseURI = "https://gorest.co.in/public/v2";
            String endpoint = "/users";
            //get the id of user we just created
            Response getId = given()
                    .header("Authorization", "Bearer a01e31c3f767a0876a6d4b5d9350b9020e5d33454e4381400a9e4309e25d790a") // Replace with the actual access token
                    .when().get(endpoint);
            // Define the user ID you want to update
            String userId = getId.jsonPath().getString("[0].id") ; // Replace with the actual user ID we get from create user
            // Send GET request using RestAssured
            Response response = given()
                    .header("Authorization", "Bearer a01e31c3f767a0876a6d4b5d9350b9020e5d33454e4381400a9e4309e25d790a") // Replace with the actual access token
                    .pathParam("userId", userId)
                    .when()
                    .get(endpoint + "/{userId}");
            // Assert the response
            int statusCode = response.getStatusCode();
            Assert.assertEquals(statusCode, 200);
            // Retrieve the user details from the response
            int id = response.jsonPath().getInt("id");
            String name = response.jsonPath().getString("name");
            String email = response.jsonPath().getString("email");
            String gender = response.jsonPath().getString("gender");
            String status = response.jsonPath().getString("status");
            System.out.println("Your Updated User: "+" " +id + " " + name + " " + email + " " + gender + " " + status);
        }
        @Test(priority = 4)
        public void deleteUserTest() {
            // Set base URI and path
            RestAssured.baseURI = "https://gorest.co.in/public/v2";
            String endpoint = "/users";
            //get the id of user we just created
            Response getId = given()
                    .header("Authorization", "Bearer a01e31c3f767a0876a6d4b5d9350b9020e5d33454e4381400a9e4309e25d790a") // Replace with the actual access token
                    .when().get(endpoint);
            // Define the user ID you want to update
            String userId = getId.jsonPath().getString("[0].id") ; // Replace with the actual user ID we get from create user
            // Send DELETE request using RestAssured
            Response response = given()
                    .header("Authorization", "Bearer a01e31c3f767a0876a6d4b5d9350b9020e5d33454e4381400a9e4309e25d790a") // Replace with the actual access token
                    .pathParam("userId", userId)
                    .when()
                    .delete(endpoint + "/{userId}");
            // Assert the response
            int statusCode = response.getStatusCode();
            Assert.assertEquals(statusCode, 204);
            System.out.println(statusCode+ " " + "User Deleted with id: " + userId);
        }
        @AfterClass
        public void tearDown(){
            driver.quit();
        }
    }

