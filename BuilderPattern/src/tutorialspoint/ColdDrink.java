package tutorialspoint;


public abstract class ColdDrink implements Item{
	@Override
	public Packing packing(){
		return new Bootle();
	}
	
	@Override 
	public abstract float price();

}
