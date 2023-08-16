package helper;

import Schemas.UserData;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Assertions;

import java.util.List;

import static io.restassured.RestAssured.given;

public class RequestRunner {
    public JsonPath request(){
        return given()
                .when()
                .baseUri("https://reqres.in/")
                .contentType(ContentType.JSON)
                .get("api/users?page=2")
                .then()
                .extract()
                .body()
                .jsonPath();
    }

    public void checkDatas(List<UserData> list){
        list.forEach(user -> Assertions.assertTrue(user.getAvatar().contains(user.id.toString())));

    }

    public void checkFields(String key, String expectedValue, String factualValue){
        Assertions.assertEquals(expectedValue, factualValue, "Значение поля " + key + "don't correspond " + expectedValue+ " " + factualValue );
    }

}
