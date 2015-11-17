public class Monster extends Character {


    
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

    public void specialize() {
	setStrength( this.getStrength() + 15 );
	setDefense( this.getDefense() - 15 );
    }
    
    public void normalize() {
	setStrength( this.getStrength() - 15 );
	setDefense( this.getDefense() + 15 );
    }
    
    public String about() {
	String retStr = "Monsters are scary, yo.";
	return retStr;
    }
} // close class Monster

    

    
