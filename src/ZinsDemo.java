public class ZinsDemo {

    public static void main(String[] args) {

        double kontostand = 1000;
        double zinssatz = 2.25;

        double zinsen = kontostand * zinssatz / 100;
        System.out.println("Zinsen = " + zinssatz + " % von " + kontostand + " = " + zinsen);


        kontostand = 2000;
        zinssatz = 3.5;

        printZinsen(kontostand, zinssatz, zinsenBerechnen(kontostand, zinssatz));


        kontostand = 4000;
        zinssatz = 4;
        printZinsen(kontostand,zinssatz ,zinsenBerechnen(kontostand , zinssatz  ));



    }


    public static double zinsenBerechnen(double kontostand, double zinssatz){

        double zinsen = kontostand * zinssatz / 100;
        return zinsen;

    }

    public static void printZinsen(double kontostand, double zinssatz, double zinsen) {

        System.out.println("Zinsen = " + zinssatz + " % von " + kontostand + " = " + zinsen);

    }

}
