import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Apprenants> listeApprenants = new ArrayList<>();
        ArrayList<Classes> listeClasses = new ArrayList<>(); // Création de la liste de classes
        int choix;
        do {
            System.out.println("\t\t/////////////////////////////////< Menu >////////////////////////////////\t");
            System.out.println("\t\t//                                                                     //");
            System.out.println("\t\t//  < 1 > Gérer les apprenants                                         //");
            System.out.println("\t\t//  < 2 > Gérer les classes                                            //");
            System.out.println("\t\t//  < 0 > Quitter!                                                     //");
            System.out.println("\t\t//                                                                     //");
            System.out.println("\t\t/////////////////////////////////////////////////////////////////////////\t\n");

            System.out.print("Choix: ");
            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    manageApprenants(scanner, listeApprenants);
                    break;
                case 2:
                    manageClasses(scanner, listeClasses); // Passage de la liste de classes en argument
                    break;
                case 0:
                    System.out.println("Au revoir!");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez entrer un nombre valide.");
            }
        } while (choix != 0);
        scanner.close();
    }

    public static void manageApprenants(Scanner scanner, ArrayList<Apprenants> listeApprenants) {
        int choixApprenant;
        do {
            System.out.println("\t\t/////////////////////////////< Gestion des Apprenants >//////////////////////////\t");
            System.out.println("\t\t//                                                                             //");
            System.out.println("\t\t//  < 1 > Ajouter un nouvel apprenant                                          //");
            System.out.println("\t\t//  < 2 > Consulter la liste des apprenants                                    //");
            System.out.println("\t\t//  < 3 > Modifier les informations d'un apprenant existant                    //");
            System.out.println("\t\t//  < 4 > Supprimer un apprenant existant                                      //");
            System.out.println("\t\t//  < 5 > Rechercher un apprenant par nom, prénom ou numéro d'identifiant      //");
            System.out.println("\t\t//  < 0 > Retourner au menu principal                                          //");
            System.out.println("\t\t//                                                                             //");
            System.out.println("\t\t/////////////////////////////////////////////////////////////////////////////////\t\n");

            System.out.print("Choix: ");
            choixApprenant = scanner.nextInt();
            switch (choixApprenant) {
                case 1:
                    System.out.println("Entrez les informations de l'apprenant :");
                    System.out.print("Nom: ");
                    String nom = scanner.next();
                    System.out.print("Prénom: ");
                    String prenom = scanner.next();
                    System.out.print("Date de naissance (format: dd-MM-yyyy): ");
                    String dateNaissanceStr = scanner.next();
                    System.out.print("Téléphone: ");
                    String telephone = scanner.next();
                    System.out.print("Numéro de classe: ");
                    int numeroClasse = scanner.nextInt();
                    Apprenants.ajouterApprenant(nom, prenom, dateNaissanceStr, telephone, numeroClasse, listeApprenants);
                    break;
                case 2:
                    Apprenants.afficherListeApprenants(listeApprenants);
                    break;
                case 3:
                    Apprenants.afficherListeApprenants(listeApprenants);
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
                    System.out.print("Entrez l'ID de l'apprenant que vous souhaitez supprimer : ");
                    int idSupp = scanner.nextInt();
                    Apprenants.supprimerApprenant(idSupp, listeApprenants);
                    break;
                case 5:
                    System.out.print("Entrez le nom, prénom ou l'ID de l'apprenant que vous souhaitez rechercher : ");
                    String critere = scanner.next();
                    Apprenants.rechercherApprenant(critere, listeApprenants);
                    break;
                default:
                    System.out.println("Exite");
            }
        } while (choixApprenant != 0);
    }

    
    public static void manageClasses(Scanner scanner, ArrayList<Classes> listeClasses) {
        int choixClasse;
        do {
            System.out.println("\t\t/////////////////////////////< Gestion des Classes >/////////////////////////////\t");
            System.out.println("\t\t//                                                                             //");
            System.out.println("\t\t//  < 1 > Ajouter une nouvelle classe                                          //");
            System.out.println("\t\t//  < 2 > Consulter la liste des classes                                       //");
            System.out.println("\t\t//  < 3 > Modifier les informations d'une classe existante                     //");
            System.out.println("\t\t//  < 4 > Supprimer une classe existante                                       //");
            System.out.println("\t\t//  < 0 > Retourner au menu principal                                          //");
            System.out.println("\t\t//                                                                             //");
            System.out.println("\t\t/////////////////////////////////////////////////////////////////////////////////\t\n");
    
            System.out.print("Choix: ");
            choixClasse = scanner.nextInt();
            switch (choixClasse) {
                case 1:
                    System.out.print("Entrez le numéro de classe: ");
                    int numeroClasse = scanner.nextInt();
                    System.out.print("Entrez le nom de la classe: ");
                    String nomClasse = scanner.next();
                    System.out.print("Entrez l'effectif de la classe: ");
                    int effectif = scanner.nextInt();
                    Classes nouvelleClasse = new Classes(numeroClasse, nomClasse, effectif);
                    listeClasses.add(nouvelleClasse);
                    System.out.println("Nouvelle classe ajoutée avec succès.");
                    break;
                case 2:
                    if (listeClasses.isEmpty()) {
                        System.out.println("Aucune classe à afficher.");
                    } else {
                        System.out.println("Liste des classes:");
                        for (Classes classe : listeClasses) {
                            System.out.println(classe);
                        }
                    }
                    break;
                case 3:
                    if (listeClasses.isEmpty()) {
                        System.out.println("Aucune classe à modifier.");
                    } else {
                        System.out.print("Entrez le numéro de la classe à modifier : ");
                        int numeroModif = scanner.nextInt();
                        boolean classeTrouvee = false;
                        for (Classes classe : listeClasses) {
                            if (classe.getNumeroClasse() == numeroModif) {
                                System.out.println("Entrez les nouvelles informations de la classe :");
                                System.out.print("Nouveau nom de classe : ");
                                String nouveauNom = scanner.next();
                                System.out.print("Nouvel effectif : ");
                                int nouvelEffectif = scanner.nextInt();
                                classe.setNom(nouveauNom);
                                classe.setEffectif(nouvelEffectif);
                                System.out.println("Informations de la classe modifiées avec succès.");
                                classeTrouvee = true;
                                break;
                            }
                        }
                        if (!classeTrouvee) {
                            System.out.println("Classe non trouvée.");
                        }
                    }
                    break;
                case 4:
                    if (listeClasses.isEmpty()) {
                        System.out.println("Aucune classe à supprimer.");
                    } else {
                        System.out.print("Entrez le numéro de la classe à supprimer : ");
                        int numeroSupp = scanner.nextInt();
                        boolean classeSupprimee = false;
                        for (int i = 0; i < listeClasses.size(); i++) {
                            if (listeClasses.get(i).getNumeroClasse() == numeroSupp) {
                                listeClasses.remove(i);
                                System.out.println("Classe supprimée avec succès.");
                                classeSupprimee = true;
                                break;
                            }
                        }
                        if (!classeSupprimee) {
                            System.out.println("Classe non trouvée.");
                        }
                    }
                    break;
                case 0:
                    // Retourner au menu principal
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez entrer un nombre valide.");
            }
        } while (choixClasse != 0);
    }
    
}
