package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import com.avaje.ebean.SqlQuery;
import com.avaje.ebean.SqlRow;

import java.util.List;

public class AllWorkflow extends Model {

    public static List<SqlRow> findAllWF() {
        String sql= " select * from sys.lab4tbl";

        SqlQuery sqlQuery = Ebean.createSqlQuery(sql);
        // execute the query returning a List of MapBean objects
        List<SqlRow> list = sqlQuery.findList();
        System.out.println(list);

        return list;
    }
}
