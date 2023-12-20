import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Main {

	public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } 
		catch (ParseException e) {
            return null;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Création liste de TOUS les militaires
		ArrayList<Militaire> listMilitaire = new ArrayList<Militaire>();

		// Création liste reservistes
		ArrayList<Militaire> listMilitaireReserv = new ArrayList<Militaire>();

		// Création liste pro
		ArrayList<Militaire> listMilitairePro = new ArrayList<Militaire>();

		int i = 0;
		try {
			while(i != 8) {
				System.out.println("-------- BIENVENUE --------");
				System.out.println("-------- MENU --------\n");
				System.out.println(
					"1- Ajouter un professionnel\r\n" + 
					"2- Supprimer un professionnel\r\n" + 
					"3- Lister les professionnels existants\r\n" + "\n" +
					"4- Ajouter un réserviste\r\n" +
					"5- Supprimer un réserviste\r\n" +
					"6- Lister les réservistes existants\r\n" + "\n" +
					"7- Lister les militaires existants en mettant en évidence la fonction (Professionnel\r\n" +
					"ou Réserviste)\r\n" + "\n" +
					"8 - Quitter"
				);
				System.out.println("Selectionnez votre choix (1,2,3,...) : ");
				// Convert en Int
				i = Integer.parseInt(in.readLine());
				if(i == 1) {
					int codePro;
					String nomPro;
					String prenomPro;
					String datePro;
					int nbAnneeFormationPro;

					System.out.println("----- AJOUT MILITAIRE PROFESSIONNEL -----");

					// Saisie utilisateur pour ajouter un militaire pro
					System.out.println("Saisir un code :");
					codePro = Integer.parseInt(in.readLine());

					// Vérification du code déjà existant ou non 
					for(int v = 0; v < listMilitairePro.size(); v++) {
						if(codePro == listMilitaire.get(v).getCode()) {
							System.out.println("Code déjà existant !");
							codePro = Integer.parseInt(in.readLine());
							break;	
						}
					}

					System.out.println("Saisir un nom :");
					nomPro = in.readLine();

					System.out.println("Saisir un prénom :");
					prenomPro = in.readLine();

					System.out.println("Saisir une date de debut de carrière :");
					datePro = in.readLine();

					System.out.println("Saisir le nombre d'annee de formation :");
					nbAnneeFormationPro = Integer.parseInt(in.readLine());

					listMilitairePro.add(new Militaire_Pro(codePro, nomPro, prenomPro, parseDate(datePro), nbAnneeFormationPro));
					listMilitaire.add(new Militaire_Pro(codePro, nomPro, prenomPro, parseDate(datePro), nbAnneeFormationPro));
				}
				else if(i == 2) {

					// Affichage des codes déjà existant
					System.out.println("Codes enregistrés :\n");
					for(int ii = 0; ii < listMilitairePro.size(); ii++ ) {
						System.out.println(listMilitairePro.get(ii).getCode());
					}

					// Saisie utilisateur du code souhaité
					int codeSuppPro;
					System.out.println("Saisir le code :");
					codeSuppPro = Integer.parseInt(in.readLine());

					// Suppression du militaire via le code saisi
					for (int v = 0; v < listMilitairePro.size(); v++) {
						// Vérification de l'existence du code
						if (codeSuppPro == listMilitairePro.get(v).getCode()) {
							listMilitairePro.remove(v);
							System.out.println("Suppression du militaire professionnel n° : " + codeSuppPro);
							break;  
						} else if (v == listMilitairePro.size() - 1) {
							System.out.println("Code inexistant");
							System.out.println("Saisir à nouveau le code :");
							codeSuppPro = Integer.parseInt(in.readLine());
							v = -1; 
						}
					}

				}
				else if(i == 3) {
					if(listMilitairePro.size() == 0) {
						System.out.println("Aucune données disponible");
					}
					else {
						for(int ii = 0; ii < listMilitairePro.size(); ii++ ) {
							// Trie par ordre croissant de code
							Collections.sort(listMilitairePro, Militaire.ComparatorAge);
							System.out.println(listMilitairePro.get(ii).toString());
							System.out.println("-------------------------------");
						}
					}
				}
				else if(i == 4) {
					int codeReserv;
					String nomReserv;
					String prenomReserv;
					String dateReserv;
					int nbIntervention;

					System.out.println("----- AJOUT MILITAIRE RESERVISTE -----");

					// Saisie du code
					System.out.println("Saisir un code :");
					codeReserv = Integer.parseInt(in.readLine());

					// Vérification du code déjà existant ou non 
					for(int v = 0; v < listMilitaireReserv.size(); v++) {
						if(codeReserv == listMilitaire.get(v).getCode()) {
							System.out.println("Code déjà existant !");
							codeReserv = Integer.parseInt(in.readLine());	
							break;
						}
					}

					System.out.println("Saisir un nom :");
					nomReserv = in.readLine();

					System.out.println("Saisir un prénom :");
					prenomReserv = in.readLine();

					System.out.println("Saisir une date de début de carrière :");
					dateReserv = in.readLine();

					System.out.println("Saisir le nombre d'intervention :");
					nbIntervention = Integer.parseInt(in.readLine());

					listMilitaireReserv.add(new Militaire_Reserviste(codeReserv, nomReserv, prenomReserv, parseDate(dateReserv), nbIntervention));
					listMilitaire.add(new Militaire_Reserviste(codeReserv, nomReserv, prenomReserv, parseDate(dateReserv), nbIntervention));
				}
				else if(i == 5) {
					// Affichage des codes déjà existant
					System.out.println("Codes enregistrés :\n");
					for(int ii = 0; ii < listMilitaireReserv.size(); ii++ ) {
						System.out.println(listMilitaireReserv.get(ii).getCode());
					}

					// Saisie utilisateur du code souhaité
					int codeSuppReserv;
					System.out.println("Saisir le code :");
					codeSuppReserv = Integer.parseInt(in.readLine());

					// Suppression du militaire via le code saisie
					for(int v = 0; v < listMilitaireReserv.size(); v++) {
						// Vérification de l'existance du code
						if(codeSuppReserv == listMilitaireReserv.get(v).getCode()) {
							listMilitaireReserv.remove(v);
							System.out.println("Suppression du militaire reserviste n° : " + codeSuppReserv);
						}  else if (v == listMilitaireReserv.size() - 1) {
							System.out.println("Code inexistant");
							System.out.println("Saisir à nouveau le code :");
							codeSuppReserv = Integer.parseInt(in.readLine());
							v = -1;
						}
					}
					
					
				}
				else if(i == 6) {
					// Affichage des militaires reservistes
					if(listMilitaireReserv.size() == 0) {
						System.out.println("Aucune données disponible");
					}
					else {
						for(int ii = 0; ii < listMilitaireReserv.size(); ii++ ) {
							Collections.sort(listMilitaireReserv, Militaire.ComparatorAge);
							System.out.println(listMilitaireReserv.get(ii).toString());
							System.out.println("-------------------------------");
						}
					}
				}
				else if(i == 7) {

					// Affichage de TOUS les militaires
					if(listMilitaire.size() == 0) {
						System.out.println("Aucune données disponible");
					}
					else {
						for(int ii = 0; ii < listMilitairePro.size(); ii++ ) {
							System.out.println(listMilitairePro.get(ii).printAll());
							System.out.println("-------------------------------");
						}

						for(int ii = 0; ii < listMilitaireReserv.size(); ii++ ) {
							System.out.println(listMilitaireReserv.get(ii).printAll());
							System.out.println("-------------------------------");
						}
					}
				}
				else{
					System.out.println("Au revoir !");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
