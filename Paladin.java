public class Paladin extends Character {

    // methods
    // constructors
    public Paladin() {
        setName("Arthur Jones"); //random names yay
        setHP( (int)((Math.random() * 100) + 75 )); // [75,175)
        setStrength( (int)((Math.random() * 100) + 75 )); // [75,175)
        setDefense( (int)((Math.random() * 30) + 15 )); // [15,45)
        setAR( Math.random() ); // random probability for landing hits
        // setSpatt((int) ((Math.random() * 10) + 1));
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

}

