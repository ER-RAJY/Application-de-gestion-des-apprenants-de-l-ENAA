import java.util.ArrayList;
import java.util.Scanner;


public class Apprenants {
    private int id;
    private String nom;
    private String prenom;
    private String date_de_naissance;
    private String telephone;
    private String adresse;
    private int numero_de_classe;


    // Constructors

    public Apprenants(int id, String nom, String prenom, String date_de_naissance, String telephone,String adresse, int numero_de_classe) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.date_de_naissance = date_de_naissance;
        this.telephone = telephone;
        this.adresse = adresse;
        this.numero_de_classe = numero_de_classe;
    }


    // Getters
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

    public String getAderesse(){
        return adresse;
    }

    public int getNumero_de_classe() {
        return numero_de_classe;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
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
    public String setAderesse(){
        return adresse;
    }
}