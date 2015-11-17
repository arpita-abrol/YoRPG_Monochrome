//Monochroms--Arpita Abrol, Shamaul Dilmohamed, Anna Tolen
//APCS1 pd10
//HW28 -- Ye Olde Role Playing Game
//2015-11-12

public class Monster extends Character{
    
    // methods
    // constructor 
    public Monster() {
	int randStrenf = (int)(Math.random() * 45 + 20); // random int [20,65)
	setStrength( randStrenf ); 

	setHP( 150 );
	setDefense( 20 );
	setAR( 1 );
    }

    public String about() {
	String retStr = "";
	retStr += "MONSTER: \tMonsters are ruthless folk, who depend on their brute streghth alone to carry out attacks. They lack intelligence, and are single-minded in their endeavors. They strive to follow the commands and wishes of their masters. They are unplayable characters. \n";
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

    
} // close class Monster

    

    
