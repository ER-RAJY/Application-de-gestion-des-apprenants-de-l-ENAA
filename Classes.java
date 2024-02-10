public class Classes {
    private int numeroClasse;
    private String nomClasse;
    private boolean enSession; // Pour indiquer si la classe est en session ou non

    // Constructeur, getters et setters

    public int getNumeroClasse() {
        return numeroClasse;
    }

    public void setNumeroClasse(int numeroClasse) {
        this.numeroClasse = numeroClasse;
    }

    public String getNomClasse() {
        return nomClasse;
    }

    public void setNomClasse(String nomClasse) {
        this.nomClasse = nomClasse;
    }

    public boolean isEnSession() {
        return enSession;
    }

    public void setEnSession(boolean enSession) {
        this.enSession = enSession;
    }
}