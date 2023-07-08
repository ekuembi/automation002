package Selenium003;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class RestAssuredTest {

    private Response response;
    private RequestSpecification httpRequest;
    private Object requestBody;

    @BeforeClass
    public void setUp() {

        RestAssured.baseURI = "https://gorest.co.in/public/v2";
        httpRequest = given()
                .header("Authorization", " a01e31c3f767a0876a6d4b5d9350b9020e5d33454e4381400a9e4309e25d790a")
                .contentType(ContentType.JSON);
    }

    @Test
    public void verifyStatusCode() {
        Response response = httpRequest.get("/users");

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }

    @Test
    public void getAllUserTest() {
        response = given()
                .contentType(ContentType.JSON)
                .get("/users");
    }

    @Test
    public void getRequestWithQueryParam() {
        Response response = given()
                .contentType(ContentType.JSON)
                .param("postId", "3312287")
                .when()
                .get("/comments")
                .then()
                .extract().response();
    }
    @Test
    public void postRequest() {
            Response response = given()
                    .header("Content-type", "application/json")
                                .and()
                                .body(requestBody)
                                .when()
                                .post("/posts")
                                .then()
                                .extract().response();
    }
    @Test
    public void putRequest() {
        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .put("/posts/1")
                .then()
                .extract().response();
    }
    @Test
    public void patchRequest() {
        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .patch("/posts/1")
                .then()
                .extract().response();
    }
    @Test
    public void deleteRequest() {
        Response response = given()
                .header("Content-type", "application/json")
                .when()
                .delete("/posts/1")
                .then()
                .extract().response();

        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals("johndoe0123@example.com", response.jsonPath().getString("email"));

        // Verify the status code is 200
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);

        // Get the Response Body--Deserialize the response data
        JsonArray users = new Gson().fromJson(response.getBody().asString(), JsonArray.class);

        // Verify the response body contains the expected user details
        Assert.assertEquals(users.size(), 10);

        // Print each user's data
        for (JsonElement user : users) {
            JsonObject userData = user.getAsJsonObject();

            String id = userData.get("id").getAsString();
            String name = userData.get("name").getAsString();
            String email = userData.get("email").getAsString();
            String gender = userData.get("gender").getAsString();
            String status = userData.get("status").getAsString();

            System.out.println("User ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Gender: " + gender);
            System.out.println("Status: " + status);
            System.out.println("--------------------------------");
        }
    }
}