public abstract class Character {

    // attributes
    protected String name;
    protected int hp; // hit points
    protected int strength;
    protected int defense;
    protected double ar; // attack rating -- % chance that you'll hit a target 
    protected int spatt;
    
    // accessors
    public String getName() {
	return name;
    }
    
    public int getHP() {
	return hp;
    }

    public int getStrength() {
	return strength;
    }

    public int getDefense() {
	return defense;
    }

    public double getAR() {
	return ar;
    }

    public int getSpatt() {
	return spatt;
    }
    
    // mutators
    public void setName( String newName ) {
	name = newName;
    }
    
    public void setHP( int newHP ) {
	hp = newHP;
    }

    public void setStrength( int newStrength ) {
	strength = newStrength;
    }

    public void setDefense( int newDefense ) {
	defense = newDefense;
    }

    public void setAR( double newAR ) {
	ar = newAR;
    }

    public void setSpatt( int newSpatt ) {
	spatt = newSpatt;
    }

    // other methods
    public void lowerHP( int hit ) {
	this.setHP(this.getHP() - hit );
    }
    
    public boolean isAlive() {
	return (this.getHP() > 0);
    }

    public int attack( Character opp ) {
	int damage = (int)(this.strength * this.ar) - opp.getDefense();

	if ( damage < 0 )
	    damage = 0;

	opp.lowerHP( damage );
	return damage;
    }

    // abstract methods
    public abstract void specialize();
    public abstract void normalize();
    public abstract String about();

}
