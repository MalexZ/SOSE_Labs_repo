package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionStage;

public class FindAllWF {

    //output list.
    public List<String> allWF = new ArrayList<>();

    public CompletionStage<WSResponse> outputAllWF() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        WSRequest request = ws.url("http://localhost:9005/find-all-workflow");
        ObjectNode res = Json.newObject();
        System.out.println("FindAllWF request: " + res);
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }

}
