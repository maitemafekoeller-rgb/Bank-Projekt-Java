public class Girokonto extends Konto {
    
double tagesLimit;

//Kontruktor wird aufgerufen
public Girokonto(String kontonummer, double kontostand, double tagesLimit){
    super(kontonummer, kontostand);
        this.tagesLimit = tagesLimit;
    }

    //Methode zur Regulierung der Auszahlung
boolean auszahlung(double betrag){
    if(betrag <= 0){
   System.out.println("Ungültiger Betrag.");
   return false;
    }
 
    //Berechnung zur Ausgabe des Kontostandes nach Abzug des Betrages
    // Begrenzung der Auszahlung durch ein Tageslimit
    if(getkontostand() >= betrag && tagesLimit > betrag){
        setkontostand(getkontostand() - betrag);
        System.out.printf(betrag + " € wurden erfolgreich von ihrem Konto abgehoben. Ihr neuer Kontostand lautet: %.2f €\n", getkontostand());
        return true;
    }
    //Überschreitung des Tageslimits
    else {
        System.out.println("Ihr Tageslimit von: " + tagesLimit + " € wurde überschritten. Auszahlung abgelehnt.");
        return true ;
    }
    
}

}




