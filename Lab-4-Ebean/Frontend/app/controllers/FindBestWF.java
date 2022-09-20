package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionStage;

public class FindBestWF {

    //output list.
    public List<String> bestWF = new ArrayList<>();

    public CompletionStage<WSResponse> outputWF() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        WSRequest request = ws.url("http://localhost:9005/find-best-workflow");
        ObjectNode res = Json.newObject();
        System.out.println("FindBestWF request: " + res);
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }

}
