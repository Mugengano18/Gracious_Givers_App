package data;

import models.donator;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

public class Sql2odonatorDao implements donatorDao {

    public final Sql2o sql2o;


    public Sql2odonatorDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(donator donate) {
        String query="INSERT INTO donator(name,email,phone,donations,time) VALUES (:name,:email,:phone,:donations,now())";
        try(Connection connect=sql2o.open()){
            int id=(int) connect.createQuery(query,true)
                    .bind(donate)
                    .throwOnMappingFailure(false)
                    .executeUpdate()
                    .getKey();
            donate.setId(id);
        }catch (Sql2oException except){
            System.out.println(except);
        }
    }
    }

