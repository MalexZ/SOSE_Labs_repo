package controllers;

import com.avaje.ebean.SqlRow;
import com.fasterxml.jackson.databind.JsonNode;
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

public class CategoryArticlesController extends Controller {

    public Result findCategoryArticles() {

        JsonNode req = request().body().asJson();
        String category = req.get("categories").asText();

        try {
            List<SqlRow> rows = CategoryArticles.findCategoryArticles(category);

            return ok(Json.toJson(rows));
        }
        catch (RuntimeException e) {
            return ok(Json.toJson(e.toString()));
        }

    }
}
