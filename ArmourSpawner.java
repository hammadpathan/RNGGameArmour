
import java.util.*;

public class ArmourSpawner implements ArmourFactory{

	ArrayList<Armour> armourType = new ArrayList<Armour>(Arrays.asList(new Helm(), new ChestPiece(), new Gloves(), new Boots()));
	ArrayList<RarityTuple> rarityTuple = new ArrayList<RarityTuple>(Arrays.asList(new RarityTuple("Common",1),new RarityTuple("Uncommon",2),new RarityTuple("Rare",3),new RarityTuple("Epic",4)));

	public Armour spawnArmour() {
		
		Random random = new Random();
		int a = random.nextInt(armourType.size());
		int r = random.nextInt(rarityTuple.size());

		Armour armour = armourType.get(a);
		armour.raritystring = rarityTuple.get(r).rarityString;
		armour.rarity = rarityTuple.get(r).rarityValue;

		return armour;
	}
}
