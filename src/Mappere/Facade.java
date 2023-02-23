package Mappere;

import Entitet.*;

import java.sql.SQLException;
import java.util.List;

public class Facade {


    /* getBrugerList */

    public static List<Bruger> hentBrugere() {
        return BrugerMapper.getBrugerList();
    }

    public static List<Bogtabel> hentBogtabel() {
        return BogtabelMapper.getBogtabelList();
    }

    public static List<Forfatter> hentForfatter() {
        return ForfatterMapper.getForfatterList();
    }

    public static List<Postnr> hentPostnr() {
        return PostnrMapper.getPostnrList();
    }

    public static List<Udlaan> hentUdlaan() {
        return UdlaanMapper.getUdlaanList();
    }


    /* opret bruger */

    public static Bruger hentOpretBruger(Bruger bruger) throws SQLException
    {
        return BrugerMapper.opretBruger(bruger);
    }

    public static Bogtabel hentOpretBogtabel(Bogtabel bogtabel) throws SQLException
    {
        return BogtabelMapper.opretBogtabel(bogtabel);
    }

    public static Forfatter hentOpretForfatter(Forfatter forfatter) throws SQLException
    {
        return ForfatterMapper.opretForfatter(forfatter);
    }

    public static Postnr hentOpretPostnr(Postnr postnr) throws SQLException
    {
        return PostnrMapper.opretPostnr(postnr);
    }

    public static Udlaan hentOpretUdlaan(Udlaan udlaan) throws SQLException
    {
        return UdlaanMapper.opretUdlaan(udlaan);
    }


}