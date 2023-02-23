package Entitet;

public class Bruger
{

    private int idbruger;

    private String navn;

    private String adresse;

    private int postnr;

    public Bruger(int idbruger, String navn, String adresse, int postnr)
    {
        this.idbruger = idbruger;
        this.navn = navn;
        this.adresse = adresse;
        this.postnr = postnr;
    }

    public Bruger(String navn, String adresse, int postnr)
    {
        this.navn = navn;
        this.adresse = adresse;
        this.postnr = postnr;
    }


    public int getIdbruger()
    {
        return idbruger;
    }

    public void setIdbruger(int idbruger)
    {
        this.idbruger = idbruger;
    }

    public String getNavn()
    {
        return navn;
    }

    public void setNavn(String navn)
    {
        this.navn = navn;
    }

    public String getAdresse()
    {
        return adresse;
    }

    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }

    public int getPostnr()
    {
        return postnr;
    }

    public void setPostnr(int postnr)
    {
        this.postnr = postnr;
    }

    @Override
    public String toString() {
        return "Bruger{" +
                "idbruger=" + idbruger +
                ", navn='" + navn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", postnr=" + postnr +
                '}';
    }

}



