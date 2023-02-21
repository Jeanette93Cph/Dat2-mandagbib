package Entitet;

public class Postnr
{
    private int idpostnr;

    private String bynavn;

    public Postnr(int idpostnr, String bynavn)
    {
        this.idpostnr = idpostnr;
        this.bynavn = bynavn;
    }

    public int getIdpostnr() {
        return idpostnr;
    }

    public void setIdpostnr(int idpostnr) {
        this.idpostnr = idpostnr;
    }

    public String getBynavn() {
        return bynavn;
    }

    public void setBynavn(String bynavn) {
        this.bynavn = bynavn;
    }

    @Override
    public String toString() {
        return "postnr{" +
                "idpostnr=" + idpostnr +
                ", bynavn='" + bynavn + '\'' +
                '}';
    }

}
