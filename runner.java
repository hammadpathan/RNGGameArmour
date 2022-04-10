public class runner {
    public static void main(String[] args){
        Armour armour;

		ArmourFactory spawner = new ArmourSpawner(); 
        armour = spawner.spawnArmour();
		
		System.out.println("Spawning Armour");

        new AttributeSpawner(armour.getRarityValue(), armour);
        armour.getDescription();
    }
}
