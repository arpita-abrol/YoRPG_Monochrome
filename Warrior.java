public class Warrior extends Character {
    
    // methods
    // constructors
    public Warrior() {
        setName("John Smith"); //random names yay
        setHP( (int)((Math.random() * 100) + 50 )); // [50,150)
        setStrength( (int)((Math.random() * 100) + 50 )); // [50,150)
        setDefense( (int)((Math.random() * 20) + 40 )); // [40,60)
        setAR( Math.random() ); // random probability for landing hits
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

    public void specialize() {
	setStrength( this.getStrength() + 15 );
	setDefense( this.getDefense() - 15 );
    }

    public void normalize() {
	setStrength( this.getStrength() - 15 );
	setDefense( this.getDefense() + 15 );
    }

    public String about() {
	String retStr = "WARRIOR:\tWarriors are a proud sort, noble in spirit and skilled in battle. They are highly proficient with short-range weapons (e.g. shortswords, longswords, broadswords, skinnyswords, axes, spears, javelins, ninja stars, lightsabres...). Normally equipped with heavy armor, which can inhibit their speed and agility. They fight for the honor of their kingdom and the good of their people.";
	return retStr;
    }
}

    

    
