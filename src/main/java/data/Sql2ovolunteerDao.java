package data;

import models.volunteer;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

public class Sql2ovolunteerDao implements  volunteerDao{
    public final Sql2o sql2o;

    public Sql2ovolunteerDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(volunteer volunteer) {
        String query="INSERT INTO volunteer(name,email,phone,message,time) VALUES (:name,:email,:phone,:message,now())";
        try(Connection connect=sql2o.open()){
            int id=(int) connect.createQuery(query,true)
                    .bind(volunteer)
                    .throwOnMappingFailure(false)
                    .executeUpdate()
                    .getKey();
            volunteer.setId(id);
        }catch (Sql2oException except){
            System.out.println(except);
        }
    }
}
