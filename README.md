# Bank-Projekt-Java
## Eine konsolenbasierte Java-Anwendung zur Simulation von Bankkonten
### Funktionsumfang

#### Das Programm simuliert grundlegende Kontobewegungen und umfasst folgende Funktionen:
- Einzahlen von Beträgen auf ein Konto mit automatischer Validierung (keine Negativbeträge oder Nullbeträge).
- Auszahlen von Beträgen unter Berücksichtigung des aktuellen Kontostandes.
- Erweiterte Auszahlungslogik durch eine Prüfung des hinterlegten Tageslimits.
- Formatierte Ausgabe von Kontobewegungen und Beträgen auf zwei Nachkommastellen.

### Technische Umsetzung und OOP-Konzepte
#### Das Projekt demonstriert die Anwendung wesentlicher Konzepte der objektorientierten Softwareentwicklung:
- Vererbung: Die Klasse Girokonto erweitert die Basisklasse Konto (extends), um deren Eigenschaften zu nutzen und zu spezifizieren.
- Kapselung: Die Attribute der Klassen sind geschützt und werden kontrolliert über Getter- und Setter-Methoden (z. B. getKontostand) angesprochen oder verändert.
- Konstruktoren: Verwendung von Konstruktoren zur Initialisierung von Objekten sowie der Aufruf des Elternkonstruktors mittels super().

### Projektstruktur
- Main.java: Der Einstiegspunkt des Programms. Hier werden Testobjekte erzeugt und Kontobewegungen simuliert.
- Konto.java: Die Basisklasse, welche allgemeine Eigenschaften und Methoden eines Kontos definiert.
- Girokonto.java: Die spezialisierte Klasse, die das Verhalten eines Girokontos und die Dispo-Regulierung abbildet.
