package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;


import static io.restassured.module.jsv.JsonSchemaValidator.*;
;

public class JSONchemaValidator {
    @Test
    public void testGet(){
      baseURI = "https://reqres.in/api";//https://reqres.in/api/users?page=2
        given()
                .get("/users?page=2")
                .then()
                .assertThat()
                .body(matchesJsonSchemaInClasspath("schema.json"))
                .statusCode(200);

    }
}
