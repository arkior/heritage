package modeleVehicules;

public class Voiture extends Vehicule
{
	
	
	public Voiture (String unType,String unTypeCarburant, 
			 double uneCapacite, double unCarburantRestant ,
			 int unMaxPassagers,  int nbrPassagersActuel )
	{
		super(unType,unTypeCarburant,uneCapacite,unCarburantRestant,unMaxPassagers,nbrPassagersActuel);
	}
	
	
	public Voiture(String unCarburant, double uneCapacite ,double carburantRestant, int nbrPassagersActuels)
	{
		
		super.setType("voiture");
		super.setMaxPassagers(5);
		super.setTypeCarburant(unCarburant);
		super.setCapacite(uneCapacite);
		super.setCapaciteRestant(carburantRestant);
		super.setPassagersActuels(nbrPassagersActuels);
		

	}
	
	public Voiture(String unCarburant, double uneCapacite)
	{
		super.setType("voiture");
		super.setTypeCarburant(unCarburant);
		super.setCapacite(uneCapacite);
	}
	
	
	public Voiture(double uneCapacite ) 
	{
		super.setCapacite(uneCapacite);
		super.setCapaciteRestant(uneCapacite);
		super.setMaxPassagers(1);
		super.setType("voiture");
		
		
		
	}
	
	@Override
	public String toString() 
	{
		return super.toString();
				
	}


}
