public class Rogue extends Character {

    // methods
    // constructors
    public Rogue() {
        setName("Christopher Wells"); //random names yay
        setHP( (int)((Math.random() * 100) + 30 )); // [30,130)
        setStrength( (int)((Math.random() * 100) + 40 )); // [40,140)
        setDefense( (int)((Math.random() * 30) + 20 )); // [20,50)
        setAR( Math.random() ); // random probability for landing hits
    }
    
    public Rogue( String n ) {
        this();
        setName(n);
    }
    
    public Rogue(String n, int h, int s, int d, double a) {
        this(n);
        setHP(h);
        setStrength(s);
        setDefense(d);
        setAR(a);
    }

    public void specialize() {
	setStrength( this.getStrength() + 15 );
	setDefense( this.getDefense() - 15 );
    }

    public void normalize() {
	setStrength( this.getStrength() - 15 );
	setDefense( this.getDefense() + 15 );
    }

    public String about() {
	String retStr = "ROGUE:\tRogues are stealthy and versatile, capable of acquiring valuable resources at a moment's notice. They are very crude and will take any means necessary to achieve their goal. They are often motivated by money, are swift, wear little to no armor, and are extremely skilled with knives and daggers.";
	return retStr;
    }
}
