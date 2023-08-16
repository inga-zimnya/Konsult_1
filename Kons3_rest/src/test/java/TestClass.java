import Schemas.UserData;
import com.sun.net.httpserver.Request;
import helper.RequestRunner;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class TestClass {
    RequestRunner requestRunner = new RequestRunner();
    @Test
    public void test(){
       String page = requestRunner.request().get("page").toString();
       Assertions.assertEquals("1", page, "The current page is not corresponding");
       System.out.println("Page: " + page);
        //given().when().baseUri("https://reqres.in/").contentType(ContentType.JSON).get("api/users?page=2").then().log().all();
    }

    @Test
    public void test_data(){
        List<UserData> users =  requestRunner.request().get("data", UserData.class).toString();
        requestRunner.checkDatas(users);
    }



}
