import java.util.ArrayList;

public class Classes {
    private int numeroClasse;
    private String nom;
    private int effectif;
    
    // Constructor
    public Classes(int numeroClasse, String nom, int effectif) {
        this.numeroClasse = numeroClasse;
        this.nom = nom;
        this.effectif = effectif;
    }

    // Getters and setters
    public int getNumeroClasse() {
        return numeroClasse;
    }
    
    public void setNumeroClasse(int numeroClasse) {
        this.numeroClasse = numeroClasse;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public int getEffectif() {
        return effectif;
    }
    
    public void setEffectif(int effectif) {
        this.effectif = effectif;
    }

    // Méthodes pour gérer les classes
    public static void ajouterClasse(int numeroClasse, String nom, int effectif, ArrayList<Classes> listeClasses) {
        Classes classe = new Classes(numeroClasse, nom, effectif);
        listeClasses.add(classe);
        System.out.println("Nouvelle classe ajoutée avec succès.\n");
    }

    public static void afficherListeClasses(ArrayList<Classes> listeClasses) {
        if (listeClasses.isEmpty()) {
            System.out.println("Aucune classe trouvée.\n");
        } else {
            System.out.println("+--------------+----------------------+--------------+");
            System.out.println("| Numéro classe|         Nom          |   Effectif   |");
            System.out.println("+--------------+----------------------+--------------+");
            for (Classes classe : listeClasses) {
                System.out.printf("| %-13d| %-20s| %-13d|%n", classe.getNumeroClasse(), classe.getNom(), classe.getEffectif());
            }
            System.out.println("+--------------+----------------------+--------------+\n");
        }
    }

    public static void modifierClasse(int numeroClasse, String nom, int effectif, ArrayList<Classes> listeClasses) {
        for (Classes classe : listeClasses) {
            if (classe.getNumeroClasse() == numeroClasse) {
                classe.setNom(nom);
                classe.setEffectif(effectif);
                System.out.println("Informations de la classe modifiées avec succès.\n");
                return;
            }
        }
        System.out.println("Aucune classe trouvée avec le numéro " + numeroClasse + ".\n");
    }

    public static void supprimerClasse(int numeroClasse, ArrayList<Classes> listeClasses) {
        for (int i = 0; i < listeClasses.size(); i++) {
            if (listeClasses.get(i).getNumeroClasse() == numeroClasse) {
                listeClasses.remove(i);
                System.out.println("Classe supprimée avec succès.\n");
                return;
            }
        }
        System.out.println("Aucune classe trouvée avec le numéro " + numeroClasse + ".\n");
    }
}
