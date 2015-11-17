public class Rogue extends Character {

    // methods
    // constructors
    public Rogue() {
<<<<<<< HEAD
        setName("Christopher Wells"); //random names yay
        setHP( (int)((Math.random() * 100) + 30 )); // [30,130)
        setStrength( (int)((Math.random() * 100) + 40 )); // [40,140)
        setDefense( (int)((Math.random() * 30) + 20 )); // [20,50)
        setAR( Math.random() ); // random probability for landing hits
=======
        setName("Riley of Swiftneck"); //random names yay
        setHP( (int)((Math.random() * 100) + 50 )); // [50,150)
        setStrength( (int)((Math.random() * 100) + 55 )); // [55,155)
        setDefense( (int)((Math.random() * 20) + 10 )); // [10,30)
        setAR( Math.random() + .1); // random probability for landing hits [.01, 1.1)
        setSpatt((int) ((Math.random() * 7) + 1)); // [1, 8)
>>>>>>> fb38cca0dbf606fb1736bcf7043a55e2b80031d8
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

<<<<<<< HEAD
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
=======
    public String about() {
	String retStr = "";
	retStr += "ROGUE :\tRogues are stealthy and versatile, capable of acquiring valuable resources at a moment's notice. They are very crude and will take any means necessary to get their goal. \n";
	return retStr;
    }

    public void specialize() {
    	setStrength( strength + spatt );
	setDefense( defense - spatt );
	if (Math.random() < .5) {
	    setHP( hp + 5 );   //special powerup
	}
    }

    public  void normalize() {
	setStrength( strength - spatt );
	setDefense( defense + spatt );
    }

>>>>>>> fb38cca0dbf606fb1736bcf7043a55e2b80031d8
}
