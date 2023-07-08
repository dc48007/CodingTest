package Practise;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.List;

public class TestRestAssuredProgram {

    public static void main(String[] args) {

        verifyTheattributeInResponse();
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/Posts";

        // Send GET request
        Response response = RestAssured.given().header("Authorization", "Bearer your_token_here")
                .get(RestAssured.baseURI);

        response.then().assertThat().statusCode(200);
        // Get the response body as a string
        String responseBody = response.getBody().asString();


        // Get the status code
        List<String> listOfTitles = response.jsonPath().getList("title");

        listOfTitles.forEach(System.out::println);

        // Print the complete JSON response
       /* System.out.println("Complete JSON Response: " + jsonPath.prettify());

        System.out.println(jsonPath.getList("").size());
        for (Object o:jsonPath.getList("")
             ) {
                String post = ((LinkedHashMap)o).get("userId").toString();
            if( post.equals("10")){
                System.out.println("Post title is: "+ ((LinkedHashMap)o).get("title").toString());
            }

        }*/
    }


    public static void verifyTheattributeInResponse() {
       RestAssured.given().baseUri("https://jsonplaceholder.typicode.com").header("ContentType", ContentType.JSON).when().get("/Posts").then().statusCode(200);
    }




}
