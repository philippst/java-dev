# Objektorientierte Programmierung in JAVA

## Version 4 des Programms
Es wurden Packete im Java Programm ergänzt für eine bessere Strukturierung. Als Packetname für das Programm wurde
exemplarisch `de.rhkoeln.app` gewählt. Die Klasse `Auto` ist im Unterpaket `fahrzeuge` abgelegt.
Zusätzlich wurde rudimentär die Klasse `Schiff` angelegt.

### Klassendiagramm

```mermaid
classDiagram
    class Main{
        +main(args) void
    }
  
    class Auto{
      +int autoZaehler$
      +String farbe
      +String marke
      +String kennzeichen
      +int kmStand
      +int erstzulassungJahr
      +Auto() void
      +Auto(farbe, marke, kennzeichen) void
      +fahren() void
      +hupen() void
      +beschreiben() void
      +autoVorschlaege()$ void
    }     
    
    class Schiff{
        +String farbe
        +String marke
    }
    
    Main ..> Auto: uses
```
