import java.util.Scanner;
public class TpCelsiusFahren {

	
	
		public static void main(String[] args) {
			
		
		
	Scanner sc = new Scanner(System.in);
		
		String choixA = ("A - Transformer la temp�rature Celsius en Fahrenheit");
		String choixB =("B - Transformer la temp�rature Fahrenheit en Celsius");
		char choix = ' '; 
		
		char again = ' ';
		
		double aConvertir, convertit=0;
		
		
		System.out.println("-------------------------------------------------");
		System.out.println("CONVERTISSEUR DEGR�S CELSIUS ET DEGR�S FAHRENHEIT");
	    System.out.println("-------------------------------------------------");
	    
	    
	    
	    
	    
					
				
	
			
		       {System.out.println("Bienvenue sur mon utilitaire 'Temp�rature plus'!");
		       do //Boucle do
		       {
				    System.out.println("Veuillez choisir un mode de conversion :");
			        System.out.println(choixA);
			        System.out.println(choixB);
			        choix = new Scanner(System.in).nextLine().charAt(0);

	        		switch (choix) 
	        		{
					case 'A':  // Choix A
						System.out.println("Vous avez s�lectionn� le mode Celsius > Fahrenheit");
						System.out.println("Indiquez la temp�rature a convertir");
						aConvertir = new Scanner(System.in).nextDouble();
						convertit = ((9.0/5.0) * aConvertir) + 32.0;
				        System.out.print(aConvertir + " �C correspond � : ");
				        System.out.println(arrondi(convertit, 2) + " �F.");
						break;
						
					case 'B': // Choix B
						System.out.println("Vous avez s�lectionn� le mode Fahrenheit > Celsius");
						System.out.println("Indiquez la temp�rature a convertir");
						aConvertir = new Scanner(System.in).nextDouble();
						convertit = ((aConvertir - 32) * 5) / 9;
				        System.out.print(aConvertir + " �F correspond � : ");
				        System.out.println(arrondi(convertit, 2) + " �C.");
						break;
				        
					default: System.out.println("Veuillez choisir un mode valide !");
					}
	        	 	System.out.println("Voulez-vous effectuer une autre conversion ? O/N");
		   	  		again = new Scanner(System.in).nextLine().charAt(0);
		      }  // Boucle do
		       while (again == 'O');
		            	System.out.println("Voulez-vous effectuer une autre conversion ? O/N");
		   	  		again = new Scanner(System.in).nextLine().charAt(0);
		        
		        
				}
		

		}
		        		
		 public static double arrondi(double A, int B) {
			    return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B); }}

					   

