public class Girokonto extends Konto {
    
double dispoLimit;

//Kontruktor wird aufgerufen
public Girokonto(String kontonummer, double kontostand, double dispoLimit){
    super(kontonummer, kontostand);
        this.dispoLimit = dispoLimit;
    }

    //Methode zur Regulierung der Auszahlung
boolean auszahlung(double betrag){
    if(betrag <= 0){
   System.out.println("Ungültiger Betrag.");
   return false;
    }
 
    //Berechnung zur Ausgabe des Kontostandes nach Abzug des Betrages
    if(getkontostand() + dispoLimit >= betrag){
        setkontostand(getkontostand() - betrag);
        System.out.printf(betrag + " € wurden erfolgreich von ihrem Konto abgehoben. Ihr neuer Kontostand lautet: %.2f €\n", getkontostand());
        return true;
    }

    // Regulierung der Auszahlung durch ein Dispolimit
    else{
        System.out.println("Ihr Limit von: " + dispoLimit + " wurde überschritten. Auszahlung abgelehnt.");
        return false;

    }
}
}




