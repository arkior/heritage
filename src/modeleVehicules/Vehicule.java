package modeleVehicules;

public  class Vehicule
{
	private String type;
	private String typeCarburant;
	private double capacite;
	private double capaciteRestant;
	private int maxPassagers;
	private int passagersActuels;
	
	
	public Vehicule() {}
	
	public Vehicule (String unType,String unTypeCarburant, 
					 double uneCapacite, double unCarburantRestant ,
					 int unMaxPassagers,  int nbrPassagersActuel )
	{
		this.type = unType;
		this.typeCarburant = unTypeCarburant;
		this.capacite = uneCapacite;
		this.capaciteRestant = unCarburantRestant;
		this.maxPassagers = unMaxPassagers;
		this.passagersActuels = nbrPassagersActuel;
	}
	
	public Vehicule (String unType,String unTypeCarburant,double uneCapacite,int unMaxPassagers)
	{
		this.type = unType;
		this.typeCarburant = unTypeCarburant;
		this.capacite = uneCapacite;
		this.maxPassagers = unMaxPassagers;
		this.capaciteRestant = this.capacite;
		this.passagersActuels = 1;
		
	}
	
	

	public void setType(String type)
	{
		this.type = type;
	}

	public void setTypeCarburant(String typeCarburant)
	{
		this.typeCarburant = typeCarburant;
	}

	public void setCapacite(double capacite) 
	{
		this.capacite = capacite;
	}

	public void setCapaciteRestant(double capaciteRestant) {
		this.capaciteRestant = capaciteRestant;
	}

	public void setMaxPassagers(int maxPassagers)
	{
		this.maxPassagers = maxPassagers;
	}

	public void setPassagersActuels(int passagersActuels) 
	{
		this.passagersActuels = passagersActuels;
	}

	public String getType() 
	{
		return this.type;
	}

	public String getTypeCarburant()
{
		return this.typeCarburant;
	}

	public double getCapacite()
	{
		return this.capacite;
	}

	public double getCapaciteRestant()
	{
		return this.capaciteRestant;
	}

	public int getMaxPassagers() 
	{
		return this.maxPassagers;
	}

	public int getPassagersActuels()
	{
		return this.passagersActuels;
	}
	
	public void ajouterCarburant(double uneQuantite)
	{
		double quantiteAjoutee =uneQuantite + this.getCapacite();
		
		this.capaciteRestant = (quantiteAjoutee >= this.getCapacite() )? this.getCapacite() : quantiteAjoutee;
		
	}
	
	public void consommerCarburant(double uneQuantite)
	{
		double quantiteConsommee = this.getCapaciteRestant() - uneQuantite;
		this.capaciteRestant = (quantiteConsommee<= 0.d)?0.d:quantiteConsommee;
	}
	
	public void faireLePlein() 
	{
		 this.ajouterCarburant(this.getCapacite());
	}
	
	public boolean aPlacesLibres(int unNombrePlaces)
	{
	
		int placePotentiel = this.getPassagersActuels()+ unNombrePlaces;
		
		boolean placeDispo = (placePotentiel >=this.getMaxPassagers())?false: true;
		return placeDispo;
	}
	
	public void prendrePassagers( int unNombrePassagers)
	{
		boolean okPourPassager = this.aPlacesLibres(unNombrePassagers);
		int passager = this.getPassagersActuels()+unNombrePassagers;
		this.passagersActuels = (okPourPassager)?passager:this.getPassagersActuels();
		
	}
	
	public String toString() 
	{
		return "je suis un véhicule de type : "+this.getType()
		+"\nje roule : "+this.typeCarburant
		+"\nmon reservoir a une capacite de : "+this.getCapacite()+" L"
		+"\nactuellement mon reservoir est a "+this.getCapaciteRestant()+" L"
		+"\nle nombre de passager maximun que je puisse accueillir est de : "+this.getMaxPassagers()
		+"\nactuellement il y a dans le vehicule : "+this.getPassagersActuels()+" passager(s)\n";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
