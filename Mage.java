public class Mage extends Character {

    // methods
    // constructors
    public Mage() {
        setName("Merlin"); //random names yay
        setHP( (int)((Math.random() * 100) + 30 )); // [30,130)
        setStrength( (int)((Math.random() * 100) + 80 )); // [80,180)
        setDefense( (int)((Math.random() * 20) + 30 )); // [30,50)
        setAR( Math.random() ); // attack rating -- random probability for landing hits
        //setSpatt((int)((Math.random() * 30) + 1));
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
    }

}
