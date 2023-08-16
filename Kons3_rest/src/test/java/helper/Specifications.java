package helper;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specifications {
    public static RequestSpecification requestSpecification(){
       return new RequestSpecBuilder().setContentType(ContentType.JSON).setBaseUri("https://reqres.in/").build();
    }

    public static ResponseSpecification responseSpecification(){
        return new ResponseSpecBuilder().expectStatusCode(200).build();
    }

    public static void installSpecification(){
        RestAssured.requestSpecification = requestSpecification();
        RestAssured.responseSpecification = responseSpecification();
    }

}
