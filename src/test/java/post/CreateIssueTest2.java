package post;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateIssueTest2 {

        @Test
        public void createIssueTest() throws IOException {

        Response response;

        String uri = "http://localhost:8080/jira/rest/auth/1/session";
        String filePath = "/Users/jahidul/IdeaProjects/RestAssuredFramwork/resources/JiraLogin.json";
        // This will convert the .json payload to Strign
        String payLoad = new String(Files.readAllBytes(Paths.get(filePath)));

        //response = RESTCalls.POSTRequest(endPointURI, loginPayload);

        RequestSpecification requestSpecification = RestAssured.given().body(payLoad);
        requestSpecification.contentType("application/json");
        // Make send call
        response = requestSpecification.post(uri);

     /* //  log.debug(requestSpecification.log().all());


        //log.info("Login Response Body: " + response.getBody().asString());
        String strResponse = TestUtils.getResposeString(response);
        JsonPath jsonRes = TestUtils.jsonParser(strResponse);
        String sessionID = jsonRes.getString("session.value");

    public post.CreateIssueTest() throws IOException {
        }
        log.info("JIRA JSession ID : " + sessionID);
        return sessionID;
*/
    }

}
