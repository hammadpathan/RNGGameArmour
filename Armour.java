public abstract class Armour {
	
	public String slot;
	public int rarity;
	public String raritystring;
	public String[] mod;
 	

	public int getRarityValue(){
		return rarity;
	}

	public void getDescription(){
		System.out.println("Armour Type: "+ slot);
        System.out.println("Armour Rarity: "+raritystring);
        System.out.println("Armour Rarity Value: "+ rarity);
        System.out.println("Armour Attributes: " + String.join(", ",mod) );
	}
}
