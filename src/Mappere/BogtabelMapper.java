package Mappere;

import Db.ConnectionConfiguration;
import Entitet.Bogtabel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BogtabelMapper
{
    public static List<Bogtabel> getBogtabelList()
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
}
