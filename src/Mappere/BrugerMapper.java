package Mappere;

import Db.ConnectionConfiguration;
import Entitet.Bruger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BrugerMapper
{


    protected static List<Bruger> getBrugerList()
    {


        List<Bruger> brugerList = new ArrayList<>();

        try {
            Connection connection = ConnectionConfiguration.getConnection();


            PreparedStatement statement = connection.prepareStatement("SELECT * FROM biblioteksmandag.bruger ");

            ResultSet result = statement.executeQuery();

            while (result.next()) {

                int id = result.getInt("idbruger");
                String navn = result.getString("navn");
                String adresse = result.getString("adresse");
                int post = result.getInt("postnr");

                Bruger bruger = new Bruger(id, navn, adresse, post);
                brugerList.add(bruger);

            }


        } catch (Exception e) {

            e.printStackTrace();

        }

        return brugerList;

    }


    protected static Bruger opretBruger(Bruger bruger) throws SQLException
    {

        try {
            Connection connection = ConnectionConfiguration.getConnection();

            String sql = "INSERT  INTO biblioteksmandag.Bruger (navn, adresse, postnr) VALUES (?,?,?)";

//          PreparedStatement statement = connection.prepareStatement("INSERT  INTO biblioteksmandag.bruger (navn, adresse, postnr)" + "VALUES (?,?,?)");
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, bruger.getNavn());
            statement.setString(2, bruger.getAdresse());
            statement.setInt(3, bruger.getPostnr());


            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();

            resultSet.next();


            bruger.setIdbruger(resultSet.getInt(1));



        } catch (Exception e) {

            e.printStackTrace();

        }

        return bruger;

    }


    public static List<Bruger> brugerInfo(String navn) throws SQLException
    {
        List<Bruger> brugerList = new ArrayList<>();

        try {
            Connection connection = ConnectionConfiguration.getConnection();


            PreparedStatement statement = connection.prepareStatement("SELECT * FROM biblioteksmandag.bruger where navn = ?");

            statement.setString(1,navn);

            ResultSet result = statement.executeQuery();

            while (result.next()) {

                int id = result.getInt("idbruger");
                String brugernavn = result.getString("navn");
                String adresse = result.getString("adresse");
                int post = result.getInt("postnr");

                Bruger bruger = new Bruger(id, brugernavn, adresse, post);
                brugerList.add(bruger);

            }


        } catch (Exception e) {

            e.printStackTrace();

        }

        return brugerList;
    }

}


