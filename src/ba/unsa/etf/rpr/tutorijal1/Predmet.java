package ba.unsa.etf.rpr.tutorijal1;


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
        if(brojStudenata == studenti.length-1){
            System.out.println("Kapacitet popunjen!");
        } else {
            studenti[brojStudenata] = s;
            brojStudenata++;
        }
    }

    public void ispisi(Student s) {
        if(brojStudenata == 0) {
            System.out.println("Nema ni jednog studenata!");
        } else {
            for (int i = 0; i < brojStudenata; i++) {
                if (studenti[i] == s) {
                    for (int j = i+1; j < brojStudenata ; j++) {
                        studenti[j-1] = studenti[j];

                    }
                    brojStudenata--;
                    break;
                } else if (i == brojStudenata-1) {
                    System.out.println("Nema trazenog studenata!");
                }
            }
        }
    }

    public void ispisSpiska() {
        if(brojStudenata == 0) {
            System.out.println("Nema ni jednog studenata!");
        }
        for (int i = 0; i < brojStudenata; i++) {
            System.out.println((i + 1) + ". " + studenti[i]);
        }
    }

}
