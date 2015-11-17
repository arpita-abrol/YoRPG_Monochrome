public class Warrior extends Character {
    
    // methods
    // constructors
    public Warrior() {
        setName("John Smith"); //random names yay
        setName("Harper of Ridgewood"); //random names yay
        setHP( (int)((Math.random() * 100) + 50 )); // [50,150)
<<<<<<< HEAD
        setStrength( (int)((Math.random() * 100) + 50 )); // [50,150)
        setDefense( (int)((Math.random() * 20) + 40 )); // [40,60)
        setAR( Math.random() ); // random probability for landing hits
=======
        setStrength( (int)((Math.random() * 100) + 55 )); // [60,160)
        setDefense( (int)((Math.random() * 30) + 15 )); // [15,45)
        setAR( Math.random() - .1); // random probability for landing hits [-.1,.9)
        setSpatt((int) ((Math.random() * 7) + 1)); // [1,8)
>>>>>>> fb38cca0dbf606fb1736bcf7043a55e2b80031d8
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
	String retStr = "WARRIOR:\tWarriors are a proud sort, noble in spirit and skilled in battle. They are highly proficient with short-range weapons (e.g. shortswords, longswords, broadswords, skinnyswords, axes, spears, javelins, ninja stars, lightsabres...). Normally equipped with heavy armor, which can inhibit their speed and agility. They fight for the honor of their kingdom and the good of their people.";
	return retStr;
    }
=======
    public String about() {
	String retStr = "";
	retStr += "WARRIOR :\tWarriors are a proud sort, noble in spirit and skilled in battle. They have great proficiency with short-range weapons (e.g. shortswords, longswords, broadswords, axes, spears, ninja stars, lightsabers...). Normally equipped with heavy armor. They fight for the honor of their kingdom and the good of their people.\n";
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

    

    
