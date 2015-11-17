public class Mage extends Character {

    // methods
    // constructors
    public Mage() {
<<<<<<< HEAD
        setName("Merlin"); //random names yay
        setHP( (int)((Math.random() * 100) + 30 )); // [30,130)
        setStrength( (int)((Math.random() * 100) + 80 )); // [80,180)
        setDefense( (int)((Math.random() * 20) + 30 )); // [30,50)
        setAR( Math.random() ); // attack rating -- random probability for landing hits
        //setSpatt((int)((Math.random() * 30) + 1));
=======
        setName("Skyler of Woodbirch"); //random names yay
        setHP( (int)((Math.random() * 100) + 50 )); // [50,150)
        setStrength( (int)((Math.random() * 100) + 60 )); // [60,160)
        setDefense( (int)((Math.random() * 30) + 5 )); // [5,35)
        setAR( Math.random() ); // random probability for landing hits
        setSpatt((int) ((Math.random() * 10) + 1)); // [1,11)
>>>>>>> fb38cca0dbf606fb1736bcf7043a55e2b80031d8
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

<<<<<<< HEAD
    // other methods
    public void specialize() {
	setStrength( strength + 30 );
	setDefense( defense - 30 );
    }

    public void normalize() {
	setStrength( strength - 30 );
	setDefense( defense + 30 );
    }

    public String about() {
	String retStr = "MAGE:\tMages are incredibly gifted, capable of casting spells and brewing potions using the forces of sorcery and witchcraft. Their knowledge of the magical ream makes them an asset whilst engaged in battle.\n";
	return retStr;
=======
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
>>>>>>> fb38cca0dbf606fb1736bcf7043a55e2b80031d8
    }

}
