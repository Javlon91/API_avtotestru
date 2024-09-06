package tests;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.matcher.ResponseAwareMatcher.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;

public class Testone {
    @Test
    public void test_1(){

        Response response = get("https://reqres.in/api/users?page=2");
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200);
    }

    public void test_2(){
        baseURI="https://reqres.in/api";
        given().get("/api/users?page=2").then().statusCode(200).
                body("data[1].id",equalTo(8))
                .log().all();

    }

}
