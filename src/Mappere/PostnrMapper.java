package Mappere;

import Db.ConnectionConfiguration;
import Entitet.Bruger;
import Entitet.Postnr;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PostnrMapper
{

    protected static List<Postnr> getPostnrList()
    {

        List<Postnr> postnrList = new ArrayList<>();


        try
        {
            Connection connection = ConnectionConfiguration.getConnection();
            {
                PreparedStatement statement = connection.prepareStatement("SELECT  * FROM biblioteksmandag.postnr");

                ResultSet result = statement.executeQuery();

                while (result.next())
                {
                    int id = result.getInt("idpostnr");
                    String navn = result.getString("bynavn");

                    Postnr postnr = new Postnr(id, navn);
                    postnrList.add(postnr);
                }

            }


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return postnrList;

    }



    protected static Postnr opretPostnr(Postnr postnr) throws SQLException
    {


        try {
            Connection connection = ConnectionConfiguration.getConnection();

            String sql = "INSERT  INTO biblioteksmandag.postnr (bynavn) VALUES (?)";

//          PreparedStatement statement = connection.prepareStatement("INSERT  INTO biblioteksmandag.postnr (bynavn)" + "VALUES (?)");
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, postnr.getBynavn());


            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();

            resultSet.next();


            postnr.setIdpostnr(resultSet.getInt(1));



        } catch (Exception e) {

            e.printStackTrace();

        }

        return postnr;

    }




}
