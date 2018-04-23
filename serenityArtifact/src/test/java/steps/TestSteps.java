package steps;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;
import net.thucydides.core.annotations.Step;

/**
 * Created by demch on 4/23/2018.
 */

@Slf4j
public class TestSteps {

    Response response;

    @Step
    public void sendRequestToGoogle() {
        System.out.println("sending request now");
        response = RestAssured
                .given()
                    .baseUri("http://google.com")
                .when().get();
        System.out.println("sending request done");
    }

    @Step
    public void checkMessage() {
        System.out.println("this is checkMessage");
        response.then().statusCode(200);
        System.out.printf("and response is \n %s", response.body().asString());
    }

    @Step
    public void doShitNow() {
        Gson gson = new Gson();
        String s = gson.toJson(response);
        System.out.println(s);
    }
}
