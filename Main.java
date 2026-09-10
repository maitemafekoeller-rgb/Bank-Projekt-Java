public class Main {

    public static void main(String[] args) {
      
   //Erstellung eines Objekts von der Klasse Girokonto
   Girokonto meinKonto = new Girokonto("DE19283020222", 14450.20, 100.0);

   System.out.println("Willkommen");

   //Methodenaufruf
   meinKonto.einzahlen(30);

   meinKonto.auszahlung(50);



    }
}