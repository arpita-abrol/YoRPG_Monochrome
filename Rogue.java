//Monochrome--Arpita Abrol, Shamaul Dilmohamed, Anna Tolen
//APCS1 pd10
//HW30 -- Ye Olde Role Playing Game, Expanded
//2015-11-15

public class Rogue extends Character{

    // methods
    // constructors
    public Rogue() {
        setName("Christopher Wells"); //random names yay
        setHP( (int)((Math.random() * 100) + 30 )); // [30,130)
        setStrength( (int)((Math.random() * 100) + 40 )); // [40,140)
        setDefense( (int)((Math.random() * 30) + 20 )); // [20,50)
        setAR( Math.random() ); // random probability for landing hits
        setSpatt((int) ((Math.random() * 15) + 1));
    }
    public Rogue( String n ) {
        this();
        setName(n);
    }
    public Rogue(String n, int h, int s, int d, double a) {
        this(n);
        setHP(h);
        setStrength(s);
        setDefense(d);
        setAR(a);
    }

    public String about() {
	String retStr = "";
	retStr += "ROGUE :\tRogues are stealthy and versatile, capable of acquiring valuable resources at a moment's notice. They are very crude and will take any means necessary to get their goal. \n";
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
