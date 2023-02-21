import Db.ConnectionConfiguration;
import Entitet.*;
import Mappere.*;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args)
    {
        //System.out.println(getString("hvad hedder du ? "));
        //System.out.println(getInt("angiv venligt din skostørrelse ?"));
        //System.out.println(getInt("angiv venligt din højde ?"));

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


       /*
       List<Bruger> brugerList = BrugerMapper.getBrugerList();

        for (Bruger bruger : brugerList)
        {
            System.out.println(bruger.toString());

        }
        */

        /*
        List<Forfatter> forfatterList = ForfatterMapper.getForfatterList();

        for (Forfatter forfatter : forfatterList)
        {
            System.out.println(forfatter.toString());
        }
        */

       /*
        List<Postnr> postnrList = PostnrMapper.getPostnrList();

        for (Postnr postnr : postnrList)
        {
            System.out.println(postnr.toString());
        }
        */


        /*
        List<Bogtabel> bogtabelList = BogtabelMapper.getBogtabelList();

        for (Bogtabel bogtabel : bogtabelList)
        {
            System.out.println(bogtabel.toString());
        }
         */

        List<Udlaan> udlaanList = UdlaanMapper.getUdlaanList();

        for (Udlaan udlaan : udlaanList)
        {
            System.out.println(udlaan.toString());
        }







    }


}

