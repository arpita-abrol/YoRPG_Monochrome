//Monochrome--Arpita Abrol, Shamaul Dilmohamed, Anna Tolen
//APCS1 pd10
//HW30 -- Ye Olde Role Playing Game, Expanded
//2015-11-15

public class Warrior extends Character{
    
    // methods
    // constructors
    public Warrior() {
        setName("John Smith"); //random names yay
        setHP( (int)((Math.random() * 100) + 50 )); // [50,150)
        setStrength( (int)((Math.random() * 100) + 50 )); // [50,150)
        setDefense( (int)((Math.random() * 20) + 40 )); // [40,60)
        setAR( Math.random() ); // random probability for landing hits
        setSpatt((int) ((Math.random() * 10) + 1));
    }
    public Warrior( String n ) {
        this();
        setName(n);
    }
    public Warrior(String n, int h, int s, int d, double a) {
        this(n);
        setHP(h);
        setStrength(s);
        setDefense(d);
        setAR(a);
    }

}

    

    
