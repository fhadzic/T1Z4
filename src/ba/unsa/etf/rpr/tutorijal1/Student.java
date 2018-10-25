package ba.unsa.etf.rpr.tutorijal1;

public class Student {
    private String ime;
    private String prezime;
    private int index;


    public Student(String ime, String prezime, int index){ this.ime=ime; this.prezime= prezime; this.index=index ; }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getIndex() {
        return index;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setIndex(int index) {
        this.index = index;
    }


    @Override
    public String toString() {
        return prezime + " " + ime + " (" + index + ")";
    }
}
