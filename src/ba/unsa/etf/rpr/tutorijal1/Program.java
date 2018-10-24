package ba.unsa.etf.rpr.tutorijal1;

public class Program {

    public static void main(String[] args) {

        Predmet rpr = new Predmet( "Razvoj programskih rješenja", 1);
        Student s = new Student("Ferid", "Hadžić", 17685);
        Student s1 = new Student("Harun", "Agić", 2400);
        Student s2 = new Student("Vedran", "Ljubović", 14335);
        Student s3 = new Student("Mahir", "Hadžić", 1285);
        rpr.upisi(s);
        rpr.upisi(s1);
        rpr.upisi(s2);
        rpr.upisi(s3);

        rpr.ispisi(s3);

        rpr.ispisSpiska();

        //System.out.println(s);
    }
}
