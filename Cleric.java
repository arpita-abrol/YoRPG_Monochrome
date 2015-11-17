public class Cleric extends Character {
    // constructors
    public Cleric() {
	setName("Robin Redstone");
	setHP( (int)((Math.random() * 70) + 70 )); // [70,140)
	setStrength( (int)(Math.random() * 50) + 50 ); // [50,100)
	setDefense( (int)(Math.random() * 30) + 20 ); // [20,50)
	setAR( Math.random() );
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
	
