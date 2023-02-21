package Mappere;

import Db.ConnectionConfiguration;
import Entitet.Udlaan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UdlaanMapper
{
    public static List<Udlaan> getUdlaanList()
    {

        List<Udlaan> udlaanList = new ArrayList<>();


        try {
            Connection connection = ConnectionConfiguration.getConnection();
            {
                PreparedStatement statement = connection.prepareStatement("SELECT  * FROM biblioteksmandag.udlaan");

                ResultSet result = statement.executeQuery();

                while (result.next())
                {
                    int id = result.getInt("idudlaan");
                    int idbog = result.getInt("idbog");
                    int idbruger = result.getInt("idbruger");

                    Udlaan udlaan = new Udlaan(id, idbog, idbruger);
                    udlaanList.add(udlaan);
                }

            }


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return udlaanList;

    }
}
