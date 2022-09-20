package controllers;

import com.avaje.ebean.SqlRow;
import com.fasterxml.jackson.databind.JsonNode;
import models.AllWorkflow;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

/**
 * @description:
 * @author:
 * @create:
 */

public class allWorkflowController extends Controller {

    public Result findAllWF() {

        JsonNode req = request().body().asJson();

        try {
            List<SqlRow> rows = AllWorkflow.findAllWF();

            return ok(Json.toJson(rows));
        } catch (RuntimeException e) {
            return ok(Json.toJson(e.toString()));
        }

    }
}