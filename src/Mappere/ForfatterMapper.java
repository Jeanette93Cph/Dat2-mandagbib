package Mappere;

import Db.ConnectionConfiguration;
import Entitet.Forfatter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ForfatterMapper
{


    public static List<Forfatter> getForfatterList()
    {

        List<Forfatter> forfatterList = new ArrayList<>();


        try {
            Connection connection = ConnectionConfiguration.getConnection();
            {
                PreparedStatement statement = connection.prepareStatement("SELECT  * FROM biblioteksmandag.forfatter");

                ResultSet result = statement.executeQuery();

                while (result.next())
                {
                    int id = result.getInt("idforfatter");
                    String navn = result.getString("navn");

                    Forfatter forfatter = new Forfatter(id, navn);
                    forfatterList.add(forfatter);
                }

            }


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return forfatterList;

    }


}
