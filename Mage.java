//Monochrome--Arpita Abrol, Shamaul Dilmohamed, Anna Tolen
//APCS1 pd10
//HW30 -- Ye Olde Role Playing Game, Expanded
//2015-11-15

public class Mage extends Character {

    // methods
    // constructors
    public Mage() {
        setName("Merlin"); //random names yay
        setHP( (int)((Math.random() * 100) + 30 )); // [30,130)
        setStrength( (int)((Math.random() * 100) + 80 )); // [80,180)
        setDefense( (int)((Math.random() * 20) + 30 )); // [30,50)
        setAR( Math.random() ); // random probability for landing hits
        setSpatt((int) ((Math.random() * 30) + 1));
    }
    public Mage( String n ) {
        this();
        setName(n);
    }
    public Mage(String n, int h, int s, int d, double a) {
        this(n);
        setHP(h);
        setStrength(s);
        setDefense(d);
        setAR(a);
    }

}
