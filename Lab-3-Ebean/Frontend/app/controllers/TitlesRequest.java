package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;

public class TitlesRequest {
    //input or request attributes
    public String category;

    //response attributes
    public String titles;

    public CompletionStage<WSResponse> findCategoryArticles() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        WSRequest request = ws.url("http://localhost:9005/find-category-articles");
        ObjectNode res = Json.newObject();
        res.put("categories", this.category);
        System.out.println("findCategoryArticles request: " + res);
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }


}
