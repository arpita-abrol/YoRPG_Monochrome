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

    
    // mutators
    public void setHP( int newHP ) {
    	hp = newHP;
    }

    public void setStrength( int newStrength ) {
    	strength = newStrength;
    }

    public void setDefense( int newDefense ) {
    	defense = newDefense;
    }

    public void setAR( int newAR ) {
    	ar = newAR;
    }

    
} // close class Monster

    

    
