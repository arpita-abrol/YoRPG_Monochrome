//Monochrome--Arpita Abrol, Shamaul Dilmohamed, Anna Tolen
//APCS1 pd10
//HW30 -- Ye Olde Role Playing Game, Expanded
//2015-11-15

public class Paladin extends Character {

    // methods
    // constructors
    public Paladin() {
        setName("Arthur Jones"); //random names yay
        setHP( (int)((Math.random() * 100) + 75 )); // [75,175)
        setStrength( (int)((Math.random() * 100) + 75 )); // [75,175)
        setDefense( (int)((Math.random() * 30) + 15 )); // [15,45)
        setAR( Math.random() ); // random probability for landing hits
        setSpatt((int) ((Math.random() * 10) + 1));
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

    public String about() {
	String retStr = "";
	retStr += "PALADIN: \tPaladins are a very prestigious group, being extremely close to royalty in their social group. They fight to keep order in the kingdom and to maintain their positions as the king's right hand men. \n ";
	return retStr;
    }

    public void specialize() {
    	setStrength( strength + spatt );
	setDefense( defense - spatt );
    }

    public  void normalize() {
	setStrength( strength - spatt );
	setDefense( defense + spatt );
    }    

}

