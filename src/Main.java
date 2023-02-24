import Db.ConnectionConfiguration;
import Entitet.*;
import Language.Dansk;
import Language.Dialog;
import Language.English;
import Mappere.*;
import Utilities.Input;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws SQLException
    {

      /*  while(true)
        {
            switch(getString("angiv dit ønske ? "))
            {
                case"lån bog":
                    System.out.println("du ønsker at låne en bog");
                    break;
                // case "stop":
                // break;

            }
            if (getString("q for quit").equalsIgnoreCase("q"))
            {
                break;
            }
        }

        */


        /* Gennemløb og print af tabellerne via Mapper */
//
//       List<Bruger> brugerList = BrugerMapper.getBrugerList();
//
//        for (Bruger bruger : brugerList)
//        {
//            System.out.println(bruger.toString());
//
//        }
//
//
//        List<Forfatter> forfatterList = ForfatterMapper.getForfatterList();
//
//        for (Forfatter forfatter : forfatterList)
//        {
//            System.out.println(forfatter.toString());
//        }
//
//
//        List<Postnr> postnrList = PostnrMapper.getPostnrList();
//
//        for (Postnr postnr : postnrList)
//        {
//            System.out.println(postnr.toString());
//        }
//
//
//
//        List<Bogtabel> bogtabelList = BogtabelMapper.getBogtabelList();
//
//        for (Bogtabel bogtabel : bogtabelList)
//        {
//            System.out.println(bogtabel.toString());
//        }
//
//
//
//        List<Udlaan> udlaanList = UdlaanMapper.getUdlaanList();
//
//        for (Udlaan udlaan : udlaanList)
//        {
//            System.out.println(udlaan.toString());
//        }
//


        /* Skifte sprog */
        /*

        Dialog dialog;

        dialog = new Dansk();

        System.out.println(dialog.hello());


        dialog = new English();

        System.out.println(dialog.hello());


        System.out.println(Input.getString(dialog.askAge()));

        dialog = new Dansk();


        while(true)
        {
            System.out.println(Input.getString(dialog.askAge()));
            if(Input.getString(dialog.changeLanguage()).equalsIgnoreCase("y"))
            {
                if(dialog instanceof Dansk)
                {
                    dialog = new English();

                }
                else if(dialog instanceof English)
                {
                    dialog = new Dansk();
                }

            }
        }
        */


        /* Opret bruger */

//        Facade facade = new Facade();
//
//        Bruger bruger = new Bruger("karl", "rosevej", 2800);
//
//        facade.hentOpretBruger(bruger);


        
        /* Få bruger info */
//        List<Bruger> brugerList = new ArrayList<>();
//
//        brugerList = Facade.brugerInfo("ole");
//
//        for (Bruger bruger : brugerList)
//        {
//            System.out.println(bruger.toString());
//        }


        /* Få bogtabel info */
//
//        List<Bogtabel> bogtabelList = new ArrayList<>();
//
//        bogtabelList = Facade.bogtabelInfo("fasandræberne");
//
//        for (Bogtabel bogtabel : bogtabelList)
//        {
//            System.out.println(bogtabel.toString());
//        }


        /* Få forfatter info */
//        List<Forfatter> forfatterList = new ArrayList<>();
//
//        forfatterList = Facade.forfatterInfo("jussi adler");
//
//        for (Forfatter forfatter : forfatterList)
//        {
//            System.out.println(forfatter.toString());
//        }


        /* Få postnr info */
//
//        List<Postnr> postnrList = new ArrayList<>();
//
//        postnrList = Facade.postnrInfo("lyngby");
//
//        for (Postnr postnr : postnrList)
//        {
//            System.out.println(postnr.toString());
//        }


        /* Få udlaan info */
//         List<Udlaan> udlaanList = new ArrayList<>();
//
//         udlaanList = Facade.udlaanInfo(4);
//
//        for (Udlaan udlaan : udlaanList)
//        {
//            System.out.println(udlaan.toString());
//        }


        /* View hvor tabellerne bliver klasket sammen */




    }




}

