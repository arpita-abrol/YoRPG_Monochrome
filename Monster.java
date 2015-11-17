//Monochroms--Arpita Abrol, Shamaul Dilmohamed, Anna Tolen
//APCS1 pd10
//HW28 -- Ye Olde Role Playing Game
//2015-11-12

public class Monster extends Character{
    
    // methods
    // constructor 
    public Monster() {
        setName("Harper of Ridgewood"); //random names yay
        setHP( (int)((Math.random() * 100) + 50 )); // [50,150)
        setStrength( (int)((Math.random() * 100) + 55 )); // [60,160)
        setDefense( (int)((Math.random() * 30) + 15 )); // [15,45)
        setAR( Math.random() - .1); // random probability for landing hits [-.1,.9)
        setSpatt((int) ((Math.random() * 7) + 1)); // [1,8)
    }

    public String about() {
	String retStr = "";
	retStr += "MONSTER: \tMonsters are ruthless folk, who depend on their brute streghth alone to carry out attacks. They lack intelligence, and are single-minded in their endeavors. They strive to follow the commands and wishes of their masters. They are unplayable characters. \n";
	return retStr;
    }

    public void specialize() {
    	setStrength( strength + spatt );
	setDefense( defense - spatt );
	if (Math.random() < .5) {
	    setStrength( strength + 10 );   //special powerup
	}
    }

    public  void normalize() {
	setStrength( strength - spatt );
	setDefense( defense + spatt );
    }

    
} // close class Monster

    

    
