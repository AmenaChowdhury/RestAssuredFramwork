package post;

import RestAssuredCore.BaseAssertion;
import RestAssuredCore.BaseTest;
import RestAssuredCore.RESTCalls;
import io.restassured.response.Response;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import utils.PayloadGenerator;
import utils.URL;



public class CreateIssueTest {

    private static Logger log = LogManager.getLogger(CreateIssueTest.class.getName());


    @Test
    public void createIssue(){

     String sessionId = BaseTest.doLogin();
     String payLoad = PayloadGenerator.generatePayLoadString("CreateBug.json");
     String uri = URL.getEndPoint("/rest/api/2/issue/");
     Response response = RESTCalls.POSTRequest(uri,payLoad, sessionId);
     // BaseAssertion.verifyResonseBodyByJsonPath(response,"key", "REST-41");
        BaseAssertion.verifyResponseHeader(response,"Content-Type" ,"application/json;charset=UTF-8");
        BaseAssertion.verifyStatusCode(response,201);


    }


}
