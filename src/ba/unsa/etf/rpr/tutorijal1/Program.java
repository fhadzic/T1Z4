package ba.unsa.etf.rpr.tutorijal1;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
/*
        while(true){
            System.out.print("- Za izlaz unesite 0: \n- Za kreiranje novog predmeta unesite 1: \n");
            System.out.print("- Za kreiranje  novog studenta unesite 2: \n- Za upis studenta na predmet unesite 3: \n");
            System.out.println("- Za ispis studenta sa predmeta unesite 4: \n- Za ispis spiska studenata na predmetu unesite 5: \n");
            Scanner skener = new Scanner(System.in);
            int n = skener.nextInt();
            if(n == 0){
                break;
            }else if()
        }
*/

        Predmet rpr = new Predmet( "Razvoj programskih rješenja", 1);
        Student s = new Student("Ferid", "Hadžić", 17685);
        Student s1 = new Student("Harun", "Agić", 2400);
        Student s2 = new Student("Vedran", "Ljubović", 14335);
        Student s3 = new Student("Mahir", "Hadžić", 1285);
        s.toString();
/*        rpr.upisi(s);
        rpr.upisi(s1);
        rpr.upisi(s2);
        rpr.upisi(s3);

        rpr.ispisi(s2);
        rpr.ispisi(s3);

        rpr.ispisSpiska();
*/
    }
}
