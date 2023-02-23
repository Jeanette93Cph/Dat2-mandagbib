package Mappere;

import Db.ConnectionConfiguration;
import Entitet.Bogtabel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BogtabelMapper
{
    protected static List<Bogtabel> getBogtabelList()
    {

        List<Bogtabel> bogtabelList = new ArrayList<>();


        try {
            Connection connection = ConnectionConfiguration.getConnection();
            {
                PreparedStatement statement = connection.prepareStatement("SELECT  * FROM biblioteksmandag.bogtabel");

                ResultSet result = statement.executeQuery();

                while (result.next())
                {
                    int id = result.getInt("idbogtabel");
                    String titel = result.getString("titel");
                    int idforfatter = result.getInt("idforfatter");

                    Bogtabel bogtabel = new Bogtabel(id, titel, idforfatter);
                    bogtabelList.add(bogtabel);
                }

            }


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return bogtabelList;

    }


    protected static Bogtabel opretBogtabel(Bogtabel bogtabel) throws SQLException
    {


        try {
            Connection connection = ConnectionConfiguration.getConnection();

            String sql = "INSERT  INTO biblioteksmandag.bogtabel (titel, idforfatter) VALUES (?,?)";

//            PreparedStatement statement = connection.prepareStatement("INSERT  INTO biblioteksmandag.bruger (titel, idforfatter)" + "VALUES (?,?)");
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, bogtabel.getTitel());
            statement.setInt(2, bogtabel.getIdforfatter());


            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();

            resultSet.next();


            bogtabel.setIdbogtabel(resultSet.getInt(1));



        } catch (Exception e) {

            e.printStackTrace();

        }

        return bogtabel;


    }






}
