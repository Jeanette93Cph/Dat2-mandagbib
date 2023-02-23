package Entitet;

public class Udlaan
{

    private int idudlaan;

    private int idbog;

    private int idbruger;


    public Udlaan(int idudlaan, int idbog, int idbruger)
    {
        this.idudlaan = idudlaan;
        this.idbog = idbog;
        this.idbruger = idbruger;
    }

    public Udlaan(int idbog, int idbruger)
    {
        this.idbog = idbog;
        this.idbruger = idbruger;
    }

    public int getIdudlaan() {
        return idudlaan;
    }

    public void setIdudlaan(int idudlaan) {
        this.idudlaan = idudlaan;
    }

    public int getIdbog() {
        return idbog;
    }

    public void setIdbog(int idbog) {
        this.idbog = idbog;
    }

    public int getIdbruger() {
        return idbruger;
    }

    public void setIdbruger(int idbruger) {
        this.idbruger = idbruger;
    }

    @Override
    public String toString() {
        return "Udlaan{" +
                "idudlaan=" + idudlaan +
                ", idbog=" + idbog +
                ", idbruger=" + idbruger +
                '}';
    }
}
