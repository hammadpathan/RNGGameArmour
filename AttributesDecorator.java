public abstract class AttributesDecorator extends Armour{
	
	protected Armour temparmour;

	public AttributesDecorator(Armour armour){
		temparmour = armour;
	}

	public abstract void setAttr();
	
}
