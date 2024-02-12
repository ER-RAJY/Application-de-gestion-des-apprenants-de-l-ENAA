import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Apprenants {
    private static int lastAssignedId = 0;
    private int id;
    private String nom;
    private String prenom;
    private String date_de_naissance;
    private String telephone;
    private int numero_de_classe;

    // Constructor
    public Apprenants(int id, String nom, String prenom, String date_de_naissance, String telephone, int numero_de_classe) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.date_de_naissance = date_de_naissance;
        this.telephone = telephone;
        this.numero_de_classe = numero_de_classe;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDate_de_naissance() {
        return date_de_naissance;
    }

    public String getTelephone() {
        return telephone;
    }

    public int getNumero_de_classe() {
        return numero_de_classe;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDate_de_naissance(String date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setNumero_de_classe(int numero_de_classe) {
        this.numero_de_classe = numero_de_classe;
    }

    // Validation of date of birth
    public static boolean validateDateOfBirth(String dateOfBirth) {
        try {
            // Parse the date of birth string to LocalDate
            LocalDate dob = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

            // Calculate age using birth date and current date
            long age = ChronoUnit.YEARS.between(dob, LocalDate.now());

            // Validate age
            return age >= 18 && age <= 30;
        } catch (DateTimeParseException e) {
            System.out.println("pls entrer age >= 18 && age <= 30 ;");
            return false; 
        }
    }

    // Validate telephone number format
    public static boolean validateTelephone(String telephone) {
        return telephone.matches("\\d{10,}") && telephone.startsWith("0");
    }

    // Add new apprenant
    public static void ajouterApprenant(String nom, String prenom, String date_de_naissance, String telephone, int numero_de_classe, ArrayList<Apprenants> listeApprenants) {
        // Validate date of birth format
        if (!validateDateOfBirth(date_de_naissance)) {
            System.out.println("Format de date incorrect. Utilisez le format dd-MM-yyyy.");
            return;
        }

        // Validate telephone number format
        if (!validateTelephone(telephone)) {
            System.out.println("Numéro de téléphone invalide. Assurez-vous d'entrer un numéro de téléphone valide.");
            return;
        }

        // Add new apprenant
        lastAssignedId++;
        Apprenants apprenant = new Apprenants(lastAssignedId, nom, prenom, date_de_naissance, telephone, numero_de_classe);
        listeApprenants.add(apprenant);
        System.out.println("Nouvel apprenant ajouté avec succès.\n\n");
    }

    // Display list of apprenants
    public static void afficherListeApprenants(ArrayList<Apprenants> listeApprenants) {
        if (listeApprenants.isEmpty()) {
            System.out.println("Aucun apprenant trouvé.");
        } else {
            System.out.println("+----+-------------------+-------------------------+----------------------+----------------------+");
            System.out.println("| ID |       Nom         |        Prénom           |   Date de naissance  |       Téléphone      |");
            System.out.println("+----+-------------------+-------------------------+----------------------+----------------------+");
            for (Apprenants apprenant : listeApprenants) {
                System.out.printf("| %-3d| %-18s| %-24s| %-20s | %-20s |%n",
                        apprenant.getId(),
                        apprenant.getNom(),
                        apprenant.getPrenom(),
                        apprenant.getDate_de_naissance(),
                        apprenant.getTelephone());
            }
            System.out.println("+----+-------------------+-------------------------+----------------------+----------------------+\n\n");
        }
    }

    // Modify apprenant details
    public static void modifierApprenant(int id, String nom, String prenom, String date_de_naissance, String telephone, int numero_de_classe, ArrayList<Apprenants> listeApprenants) {
        for (Apprenants apprenant : listeApprenants) {
            if (apprenant.getId() == id) {
                apprenant.setNom(nom);
                apprenant.setPrenom(prenom);
                apprenant.setDate_de_naissance(date_de_naissance);
                apprenant.setTelephone(telephone);
                apprenant.setNumero_de_classe(numero_de_classe);
                System.out.println("Informations de l'apprenant modifiées avec succès.\n\n");
                return;
            }
        }
        System.out.println("Aucun apprenant trouvé avec l'ID " + id);
    }

    // Delete apprenant
    public static void supprimerApprenant(int id, ArrayList<Apprenants> listeApprenants) {
        for (int i = 0; i < listeApprenants.size(); i++) {
            if (listeApprenants.get(i).getId() == id) {
                listeApprenants.remove(i);
                System.out.println("Apprenant supprimé avec succès.\n\n");
                return;
            }
        }
        System.out.println("Aucun apprenant trouvé avec l'ID " + id);
    }

    // Search for apprenant
    public static void rechercherApprenant(String critere, ArrayList<Apprenants> listeApprenants) {
        boolean found = false;
        for (Apprenants apprenant : listeApprenants) {
            if (apprenant.getNom().equalsIgnoreCase(critere) || apprenant.getPrenom().equalsIgnoreCase(critere) || String.valueOf(apprenant.getId()).equals(critere)) {
                System.out.println("Apprenant trouvé : " + apprenant);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Aucun apprenant trouvé avec le critère de recherche : " + critere);
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nom: " + nom + ", Prénom: " + prenom + ", Date de naissance: " + date_de_naissance + ", Téléphone: " + telephone + ", Numéro de classe: " + numero_de_classe;
    }
}
