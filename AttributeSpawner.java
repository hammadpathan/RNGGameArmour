import java.util.*;
public class AttributeSpawner extends AttributesDecorator{
    Armour armour;
    int rarityNum;

    ArrayList<String> attribute = new ArrayList<String>(Arrays.asList("Fire Resistance +5 ", "Attack +5", "Water Resistance +5 ", "Earth +5 ","Intellegene +5", "Dexterity +5"));
    public AttributeSpawner(int rarityNum, Armour armour){
        super(armour);
        this.armour = armour;
        this.rarityNum = rarityNum;
        setAttr();
    }

    public void setAttr(){
        if(armour.mod != null){
            return;
        }
        Random random = new Random();
        armour.mod = new String[rarityNum];
        for(int i=0; i<rarityNum;i++){
    		int r = random.nextInt(attribute.size());
            armour.mod[i] = attribute.get(r);
        }
    }
}

