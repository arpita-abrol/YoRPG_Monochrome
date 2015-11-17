public class Paladin extends Character {

    // methods
    // constructors
    public Paladin() {
        setName("Arthur Jones"); //random names yay
        setHP( (int)((Math.random() * 100) + 75 )); // [75,175)
        setStrength( (int)((Math.random() * 100) + 65 )); // [65,165)
        setDefense( (int)((Math.random() * 30) + 10 )); // [10,40)
        setAR( Math.random() ); // random probability for landing hits
<<<<<<< HEAD
        // setSpatt((int) ((Math.random() * 10) + 1));
=======
        setSpatt((int) ((Math.random() * 8) + 1)); //[1,9)
>>>>>>> fb38cca0dbf606fb1736bcf7043a55e2b80031d8
    }
    public Paladin( String n ) {
        this();
        setName(n);
    }
    public Paladin(String n, int h, int s, int d, double a) {
        this(n);
        setHP(h);
        setStrength(s);
        setDefense(d);
        setAR(a);
    }

<<<<<<< HEAD
    // other methods
    public void specialize() {
	setStrength( this.getStrength() + 10 );
	setDefense( this.getDefense() - 10 );
    }

    public void normalize() {
	setStrength( this.getStrength() - 10 );
	setDefense( this.getDefense() - 10 );
    }

    public String about() {
	String retStr = "PALADIN:\tPaladins are a very prestigious order, often having very close relationships with royalty and high-society figures. Their primary duty is to protect and keep danger far from those they are sworn to keep safe.";
	return retStr;
    }
=======
    public String about() {
	String retStr = "";
	retStr += "PALADIN: \tPaladins are a very prestigious group, being extremely close to royalty in their social group. They fight to keep order in the kingdom and to maintain their positions as the king's right hand men. \n ";
	return retStr;
    }

    public void specialize() {
    	setStrength( strength + spatt );
	setDefense( defense - spatt );
	if (Math.random() < .5) {
	    setDefense( defense + 10 );   //special powerup
	}
    }

    public  void normalize() {
	setStrength( strength - spatt );
	setDefense( defense + spatt );
    }    
>>>>>>> fb38cca0dbf606fb1736bcf7043a55e2b80031d8

}

