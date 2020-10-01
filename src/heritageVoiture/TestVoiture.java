package heritageVoiture;

import modeleVehicules.Camion;
import modeleVehicules.Vehicule;
import modeleVehicules.Voiture;

public class TestVoiture {

	public static void main(String[] args)
	{
		Vehicule[] vehicule = new Vehicule[3];
		
		Voiture voiture1 = new Voiture("Voiture","Diesel",75.0d, 18.0d,5,1);
		Voiture voiture2 = new Voiture("Voiture","Essence",100.0d, 25.0d,5,1);
		
		Camion camion1 = new Camion("Diesel",150.0d,37.0d,2,300.0d,150.0d);

		
		
		vehicule[0] = voiture1;
		vehicule[1] = camion1;
		vehicule[2] = voiture2;
		
		
		for(int i=0;i<vehicule.length;i++) 
		{
			System.out.println("\n*********** VEHICULE "+(i+1)+"*************\n");
			System.out.println(vehicule[i].toString());
			System.out.println("\n***********PLEIN DU VEHICULE "+(i+1)+"*************\n");
			vehicule[i].faireLePlein();
			System.out.println("mon reservoir est actuellement a : "+vehicule[i].getCapaciteRestant());
System.out.println(‘ coucou’) ; 
			
			
			
		}
		
	}

}
