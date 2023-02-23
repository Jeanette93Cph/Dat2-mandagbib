package Entitet;

public class Forfatter
{
    private int idforfatter;

    private String navn;

    public Forfatter(int idforfatter, String navn)
    {
        this.idforfatter = idforfatter;
        this.navn = navn;
    }

    public Forfatter(String navn)
    {
        this.navn = navn;
    }

    public int getIdforfatter()
    {
        return idforfatter;
    }

    public void setIdforfatter(int idforfatter)
    {
        this.idforfatter = idforfatter;
    }

    public String getNavn()
    {
        return navn;
    }

    public void setNavn(String navn)
    {
        this.navn = navn;
    }

    @Override
    public String toString() {
        return "Forfatter{" +
                "idforfatter=" + idforfatter +
                ", navn='" + navn + '\'' +
                '}';
    }


}
