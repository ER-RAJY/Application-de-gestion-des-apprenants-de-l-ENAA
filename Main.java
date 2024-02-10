import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Apprenants> listeApprenants = new ArrayList<>(); // Initialisation de la liste des apprenants

        int choix;
        do {
            // Affichage du menu
            System.out.println("\t\t/////////////////////////////////< Menu >//////////////////////////////////////\t");
            System.out.println("\t\t//                                                                           //");
            System.out.println("\t\t//  < 1 > Ajouter un nouvel apprenant avec les informations suivantes.       //");
            System.out.println("\t\t//  < 2 > Consulter la liste des apprenants.                                 //");
            System.out.println("\t\t//  < 3 > Modifier les informations d'un apprenant existant.                 //");
            System.out.println("\t\t//  < 4 > Supprimer un apprenant existant.                                   //");
            System.out.println("\t\t//  < 5 > Rechercher un apprenant par nom, prénom ou numéro d'identifiant.   //");
            System.out.println("\t\t//  < 0 > Quitter!                                                           //");
            System.out.println("\t\t//                                                                           //");
            System.out.println("\t\t///////////////////////////////////////////////////////////////////////////////\t\n");            

            // Demande de choix à l'utilisateur
            System.out.print("Choix: ");
            choix = scanner.nextInt();

            // Traitement du choix de l'utilisateur
            switch (choix) {
                case 1:
                    // Ajouter un nouvel apprenant
                    System.out.println("Entrez les informations de l'apprenant :");
                    System.out.print("Nom: ");
                    String nom = scanner.next();
                    System.out.print("Prénom: ");
                    String prenom = scanner.next();
                    System.out.print("Date de naissance: ");
                    String dateNaissance = scanner.next();
                    System.out.print("Téléphone: ");
                    String telephone = scanner.next();
                    System.out.print("Numéro de classe: ");
                    int numeroClasse = scanner.nextInt();
                    Apprenants.ajouterApprenant(nom, prenom, dateNaissance, telephone, numeroClasse, listeApprenants);
                    System.out.println("Nouvel apprenant ajouté avec succès.\n\n");
                    break;
                case 2:
                    // Consulter la liste des apprenants
                    Apprenants.afficherListeApprenants(listeApprenants);
                    break;
                case 3:
                    Apprenants.afficherListeApprenants(listeApprenants);
                    // Modifier les informations d'un apprenant existant
                    System.out.print("Entrez l'ID de l'apprenant que vous souhaitez modifier : ");
                    int idModif = scanner.nextInt();
                    System.out.println("Entrez les nouvelles informations de l'apprenant :");
                    System.out.print("Nom: ");
                    String newNom = scanner.next();
                    System.out.print("Prénom: ");
                    String newPrenom = scanner.next();
                    System.out.print("Date de naissance: ");
                    String newDateNaissance = scanner.next();
                    System.out.print("Téléphone: ");
                    String newTelephone = scanner.next();
                    System.out.print("Numéro de classe: ");
                    int newNumeroClasse = scanner.nextInt();
                    Apprenants.modifierApprenant(idModif, newNom, newPrenom, newDateNaissance, newTelephone, newNumeroClasse, listeApprenants);
                    break;
                
                case 4:
                    Apprenants.afficherListeApprenants(listeApprenants);
                    // Supprimer un apprenant existant
                    System.out.print("Entrez l'ID de l'apprenant que vous souhaitez supprimer : ");
                    int idSupp = scanner.nextInt();
                    Apprenants.supprimerApprenant(idSupp, listeApprenants);
                    break;
                
                case 5:
                    // Rechercher un apprenant par nom, prénom ou numéro d'identifiant
                    System.out.print("Entrez le nom, prénom ou l'ID de l'apprenant que vous souhaitez rechercher : ");
                    String critere = scanner.next();
                    Apprenants.rechercherApprenant(critere, listeApprenants);
                    break;                
                default:
                    System.out.println("Choix invalide. Veuillez entrer un nombre valide.");
            }
        } while (choix != 0);

        scanner.close();
    }
}
