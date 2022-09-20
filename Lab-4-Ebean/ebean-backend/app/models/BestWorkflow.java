package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import com.avaje.ebean.SqlQuery;
import com.avaje.ebean.SqlRow;

import java.util.List;

public class BestWorkflow extends Model {

    public static List<SqlRow> findWF() {
        String sql= " select * from sys.lab4tbl"
                + " where FitnessValue = (Select max(FitnessValue) from sys.lab4tbl)";

        SqlQuery sqlQuery = Ebean.createSqlQuery(sql);
        // execute the query returning a List of MapBean objects
        List<SqlRow> list = sqlQuery.findList();
        System.out.println(list);

        return list;
    }
}
