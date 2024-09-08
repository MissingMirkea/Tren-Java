//Clasa Tren
public class Train {
    //Variabilile
    private String Destinatia;
    private String Numar;
    private String Ora;
    private String Locuri;

    //Constructor cu nimic
    public Train() {}

    //Constructor cu parametrii
    public Train(String Destinatia,String Numar,String Ora,String Locuri){
        this.Destinatia = Destinatia;
        this.Numar = Numar;
        this.Ora = Ora;
        this.Locuri = Locuri;
    }

    //Getteri si setteri
    public String getDestinatia() {
        return Destinatia;
    }

    public void setDestinatia(String destinatia) {
        Destinatia = destinatia;
    }

    public String getLocuri() {
        return Locuri;
    }

    public void setLocuri(String locuri) {
        Locuri = locuri;
    }

    public String getNumar() {
        return Numar;
    }

    public void setNumar(String numar) {
        Numar = numar;
    }

    public String getOra() {
        return Ora;
    }

    public void setOra(String ora) {
        Ora = ora;
    }

    @Override
     public String toString() {
        return "Trenul " + Numar + " de tip " + Locuri + " pleaca spre " + Destinatia + " la ora " + Ora;

    }
}
