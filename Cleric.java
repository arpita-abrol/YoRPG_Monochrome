public class Cleric extends Character {
    // constructors
    public Cleric() {
	setName("Robin of Redstone");
	setHP( (int)((Math.random() * 100) + 70 )); // [70,170)
	setStrength( (int)(Math.random() * 50) + 50 ); // [50,100)
	setDefense( (int)(Math.random() * 30) + 20 ); // [20,50)
	setAR( Math.random() );
	setSpatt((int) ((Math.random() * 10) + 1)); // [1,11)
    }

    public Cleric( String n ) {
	this();
	setName(n);
    }

    public Cleric(String n, int h, int s, int d, double a) {
        this(n);
        setHP(h);
        setStrength(s);
        setDefense(d);
        setAR(a);
    }

    public void specialize() {
	setStrength( this.getStrength() + 10 );
	setDefense( this.getDefense() - 10 );
	if (Math.random() < .5) {
	    setHP( hp + 15 );   //special powerup
	}
    }

    public void normalize() {
	setStrength( this.getStrength() - 10 );
	setDefense( this.getDefense() + 10 );
    }

    public String about() {
	String retStr = "CLERIC:\tClerics can harness the power of magic, both to heal and to attack. They travel light, with little armor. Clerics often carry staffs and carry enchanted weapons. They are religious leaders, highly respected in the community.";
	return retStr;
    }
    
} // close class Cleric
	
