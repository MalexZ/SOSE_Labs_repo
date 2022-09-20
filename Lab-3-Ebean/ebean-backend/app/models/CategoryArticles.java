package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import com.avaje.ebean.SqlQuery;
import com.avaje.ebean.SqlRow;

import java.util.List;

public class CategoryArticles extends Model {
    //private static final long serialVersionUID = 1L;

    //delete the Entity and id to avoid create a new table.
    //public static Find<Long, R1523> find = new Find<Long, R1523>(){};

    public static List<SqlRow> findCategoryArticles(String category) {
        String sql= " select titles from sys.lab3tbl"
                + " where categories = :categories";
        // String sql = "select id, name from customer where name like :name and status_code = :status";

        SqlQuery sqlQuery = Ebean.createSqlQuery(sql);
        sqlQuery.setParameter("categories",category);
        // execute the query returning a List of MapBean objects
        List<SqlRow> list = sqlQuery.findList();
        System.out.println(list);
/*
        List<SqlRow> list;
        list = Ebean.find(Lab2Tbl.class)
                .setDistinct(true)
                .select("location.") //must include id for select to work
                .where()
                .eq("booktitle", booktitle)
                .ge("year", year1)
                .le("year", year2)
                .findList();

 */
        return list;
    }
}

