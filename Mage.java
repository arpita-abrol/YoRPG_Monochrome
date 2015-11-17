//Monochrome--Arpita Abrol, Shamaul Dilmohamed, Anna Tolen
//APCS1 pd10
//HW30 -- Ye Olde Role Playing Game, Expanded
//2015-11-15

public class Mage extends Character {

    // methods
    // constructors
    public Mage() {
        setName("Skyler of Woodbirch"); //random names yay
        setHP( (int)((Math.random() * 100) + 50 )); // [50,150)
        setStrength( (int)((Math.random() * 100) + 60 )); // [60,160)
        setDefense( (int)((Math.random() * 30) + 5 )); // [5,35)
        setAR( Math.random() ); // random probability for landing hits
        setSpatt((int) ((Math.random() * 10) + 1)); // [1,11)
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

    public  String about() {
	String retStr = "";
	retStr += "MAGE: \tMages are a very gifted group of people, as they control the power to cast spells and create potions to their advantage. Their knowlege of the magical realm makes them a useful asset while engaged in battle. \n";
	return retStr;
    }

    public void specialize() {
    	setStrength( strength + spatt );
	setDefense( defense - spatt );
	if (Math.random() < .5) {  
	    setHP( hp + 15 );   //special powerup
	}
    }

    public void normalize() {
	setStrength( strength - spatt );
	setDefense( defense + spatt );
    }

}
