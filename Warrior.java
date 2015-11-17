//Monochrome--Arpita Abrol, Shamaul Dilmohamed, Anna Tolen
//APCS1 pd10
//HW30 -- Ye Olde Role Playing Game, Expanded
//2015-11-15

public class Warrior extends Character{
    
    // methods
    // constructors
    public Warrior() {
        setName("John Smith"); //random names yay
        setName("Harper of Ridgewood"); //random names yay
        setHP( (int)((Math.random() * 100) + 50 )); // [50,150)
        setStrength( (int)((Math.random() * 100) + 55 )); // [60,160)
        setDefense( (int)((Math.random() * 30) + 15 )); // [15,45)
        setAR( Math.random() - .1); // random probability for landing hits [-.1,.9)
        setSpatt((int) ((Math.random() * 7) + 1)); // [1,8)
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
    
}

    

    
