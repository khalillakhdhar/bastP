package bastP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in)) {
			List<Joueurs> joueurs=new ArrayList<Joueurs>();
			String c = "oui";
			
			do
			{
				System.out.println("Entrer le nom du joueur");
				String nom=scanner.nextLine();
				System.out.println("Entrer le prénom du joueur");
				String prenom=scanner.nextLine();

				int  age =0;
				
				try {
				System.out.println("Entrer l'age du joueur");
				  String a=scanner.nextLine();
				  age=Integer.parseInt(a);
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println("l'age doit être numérique");
					
				}
				
				Joueurs joueur=new Joueurs(nom, prenom,age);
				if(!joueur.getCategorie().equals("Refusé"))
				{
					joueurs.add(joueur);
					System.out.println("joueur ajouté: "+joueur.toString());
					
				}
				else
				{
					System.out.println("Ajout du joueur refusé ");
				}
				System.out.println("Voulez-vous ajouter un autre joueur ? oui/non");
				c=scanner.nextLine();
				
			}while(c.equals("oui"));
			System.out.print("décision: "+c);

			System.out.println("\nListe des joueurs inscrit:");
			joueurs.forEach(System.out::println);
		}

	}

}
