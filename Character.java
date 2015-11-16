public class Character {

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

    public void specialize() {
	setStrength( strength + spatt );
	setDefense( defense - spatt );
    }

    public void normalize() {
	setStrength( strength - spatt );
	setDefense( defense + spatt );
    }

    public static String about() {
	String retStr = "";
	retStr += "WARRIOR :\tWarriors are a proud sort, noble in spirit and skilled in battle. They have great proficiency with short-range weapons (e.g. shortswords, longswords, broadswords, axes, spears, ninja stars, lightsabers...). Normally equipped with heavy armor. They fight for the honor of their kingdom and the good of their people.\n";
	retStr += "ROGUE :\tRogues are stealthy and versatile, capable of acquiring valuable resources at a moment's notice. They are very crude and will take any means necessary to get their goal. \n";
	retStr += "PALADIN: \tPaladins are a very prestigious group, being extremely close to royalty in their social group. They fight to keep order in the kingdom and to maintain their positions as the king's right hand men. \n ";
	retStr += "MAGE: \tMages are a very gifted group of people, as they control the power to cast spells and create potions to their advantage. Their knowlege of the magical realm makes them a useful asset while engaged in battle. \n";
	return retStr;
    }
}
