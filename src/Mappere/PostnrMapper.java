package Mappere;

import Db.ConnectionConfiguration;
import Entitet.Postnr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PostnrMapper
{

    public static List<Postnr> getPostnrList()
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




}
