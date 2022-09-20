package controllers;

import com.avaje.ebean.SqlRow;
import com.fasterxml.jackson.databind.JsonNode;
import models.BestWorkflow;
import models.CategoryArticles;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

/**
 * @description:
 * @author:
 * @create:
 */

public class workflowController extends Controller {

    public Result findBestWF() {

        JsonNode req = request().body().asJson();

        try {
            List<SqlRow> rows = BestWorkflow.findWF();

            return ok(Json.toJson(rows));
        } catch (RuntimeException e) {
            return ok(Json.toJson(e.toString()));
        }

    }
}