package ba.unsa.etf.rpr.tutorijal1;

import com.sun.deploy.util.ArrayUtil;

public class Predmet {

    private static final int max = 100;
    private Student[] studenti = new Student[max];
    private String nazivPredmeta;
    private int sifraPredmeta;
    private int brojStudenata = 0;

    public Predmet(String naziv_predmeta, int sifra_predmeta) {
        this.nazivPredmeta = naziv_predmeta;
        this.sifraPredmeta = sifra_predmeta;
    }

    public Student[] getStudenti() {
        return studenti;
    }

    public void setStudenti(Student[] studenti) {
        this.studenti = studenti;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getSifraPredmeta() {
        return sifraPredmeta;
    }

    public void setSifraPredmeta(int sifraPredmeta) {
        this.sifraPredmeta = sifraPredmeta;
    }

    public void upisi(Student s) {
        studenti[brojStudenata] = s;
        brojStudenata++;
    }

    public void ispisi(Student s) {
        if(brojStudenata == 0) {
            System.out.println("Nema studenata!");
        } else {
            for (int i = 0; i < brojStudenata; i++) {
                if (s == studenti[i]) {
                    for (int j = i; j < studenti.length - 1; i++) {
                        studenti[j] = studenti[j + 1];
                    }
                    break;
                } else if (i == brojStudenata-1) {
                    System.out.println("Nema trazenog studenata!");
                }
            }
        }
    }

    public void ispisSpiska() {
        for (int i = 0; i < brojStudenata; i++) {
            System.out.println((i + 1) + ". " + studenti[i]);
        }
    }

}
