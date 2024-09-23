package tests;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class SoapXML  {
    @Test
    public void validateSoapXML(){
        baseURI = "http://dneonline.com";

        given()
                .contentType("text/xml")
                .accept(ContentType.XML)
                .body("wqw" );
    }
}
