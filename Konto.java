public class Konto {
    
    private String kontonummer;
    private double kontostand;
     
    //Konstruktor als Bauplan
     Konto (String kontonummer, double kontostand){
        this.kontonummer = kontonummer;
        this.kontostand = kontostand;
     }

     //Methode zur Berechnung der Einzahlung
public void einzahlen(double betrag){
    if (betrag > 0){
        this.kontostand = kontostand + betrag;
        //Double auf 2 Nachkommastellen reduzieren mit printf
        System.out.printf(betrag + " € wurden erfolgreich auf ihr Konto eingezahlt. Ihr neuer Kontostand lautet: %.2f €\n", this.kontostand);
    }
}

//Kapselung der privaten Information
public String getkontonummer(){
    return this.kontonummer;
}

//Kontostand kann nur zurückegegeben aber nicht verändert werden
public double getkontostand(){
    return this.kontostand;
}

//Kontostand kann verändert werden
public void setkontostand(double meinKontostand){
    this.kontostand = meinKontostand;
}
}
