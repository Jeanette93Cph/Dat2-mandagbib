package Mappere;

import Db.ConnectionConfiguration;
import Entitet.Bruger;
import Entitet.Udlaan;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UdlaanMapper
{
    protected static List<Udlaan> getUdlaanList()
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


    protected static Udlaan opretUdlaan(Udlaan udlaan) throws SQLException
    {

        try {
            Connection connection = ConnectionConfiguration.getConnection();

            String sql = "INSERT  INTO biblioteksmandag.udlaan (idbog, idbruger) VALUES (?,?)";

//          PreparedStatement statement = connection.prepareStatement("INSERT  INTO biblioteksmandag.udlaan (idbog, idbruger)" + "VALUES (?,?)");
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            statement.setInt(1, udlaan.getIdbog());
            statement.setInt(2, udlaan.getIdbruger());

            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();

            resultSet.next();


            udlaan.setIdudlaan(resultSet.getInt(1));



        } catch (Exception e) {

            e.printStackTrace();

        }

        return udlaan;

    }


    public static List<Udlaan> udlaanInfo(int idbog)
    {

        List<Udlaan> udlaanList = new ArrayList<>();


        try {
            Connection connection = ConnectionConfiguration.getConnection();
            {
                PreparedStatement statement = connection.prepareStatement("SELECT  * FROM biblioteksmandag.udlaan where idbog = ?");

                statement.setInt(1,idbog);

                ResultSet result = statement.executeQuery();

                while (result.next())
                {
                    int id = result.getInt("idudlaan");
                    int idbogid = result.getInt("idbog");
                    int idbruger = result.getInt("idbruger");

                    Udlaan udlaan = new Udlaan(id, idbogid, idbruger);
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
