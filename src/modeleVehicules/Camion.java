package modeleVehicules;

public class Camion extends Vehicule
{
	private double capaciteMarchandise;
	private double marchandiseActuelle;
	
	
	
	public Camion (String unTypeCarburant,double uneCapacite,
				   double unCarburantRestant ,int nbrPassagersActuel,
				   double uneCapaciteMarchandise, double uneMarchandiseActuelle)
	{
		super.setType("camion");
		super.setTypeCarburant(unTypeCarburant);
		super.setCapacite(uneCapacite);
		super.setCapaciteRestant(unCarburantRestant);
		super.setPassagersActuels(nbrPassagersActuel);
		this.capaciteMarchandise = uneCapaciteMarchandise;
		this.marchandiseActuelle = uneMarchandiseActuelle;
	}
	
	
	public Camion(String unTypeCarburant,double uneCapacite,double uneCapaciteMarchandise) 
	{
		super.setType("camion");
		super.setTypeCarburant(unTypeCarburant);
		super.setCapacite(uneCapacite);
		this.capaciteMarchandise = uneCapaciteMarchandise;
		this.marchandiseActuelle = 0.d;
	}
	
	
	
	public double getCapaciteMarchandise()
	{
		return this.capaciteMarchandise;
	}

	public double getMarchandiseActuelle()
	{
		return this.marchandiseActuelle;
	}



	public void chargerMarchandise(double uneQuantite) {}
	
	public void dechargerMarchandise(double uneQuantite) {}

	
	public String toString() 
	{
		return super.toString()
				+"j'ai une capacite de marchandise de "+this.getCapaciteMarchandise()+"m3"
						+ "\nactuellement j'ai : "+ this.getMarchandiseActuelle()+ " m3 de chargé.";
	}
}



