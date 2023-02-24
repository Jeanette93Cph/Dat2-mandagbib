package Mappere;

import Db.ConnectionConfiguration;
import Entitet.Bruger;
import Entitet.Forfatter;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ForfatterMapper
{


    protected static List<Forfatter> getForfatterList()
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


    protected static Forfatter opretForfatter(Forfatter forfatter) throws SQLException
    {

        try {
            Connection connection = ConnectionConfiguration.getConnection();

            String sql = "INSERT  INTO biblioteksmandag.Forfatter (navn) VALUES (?)";

//          PreparedStatement statement = connection.prepareStatement("INSERT  INTO biblioteksmandag.forfatter (navn)" + "VALUES (?)");
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, forfatter.getNavn());


            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();

            resultSet.next();


            forfatter.setIdforfatter(resultSet.getInt(1));



        } catch (Exception e) {

            e.printStackTrace();

        }

        return forfatter;

    }


    public static List<Forfatter> forfatterInfo(String navn)
    {
        List<Forfatter> forfatterList = new ArrayList<>();


        try {
            Connection connection = ConnectionConfiguration.getConnection();
            {
                PreparedStatement statement = connection.prepareStatement("SELECT  * FROM biblioteksmandag.forfatter where navn = ?");

                statement.setString(1,navn);

                ResultSet result = statement.executeQuery();

                while (result.next())
                {
                    int id = result.getInt("idforfatter");
                    String forfatternavn = result.getString("navn");

                    Forfatter forfatter = new Forfatter(id, forfatternavn);
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
