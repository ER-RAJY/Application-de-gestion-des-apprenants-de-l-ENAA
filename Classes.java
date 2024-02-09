
    public class Classes {
        private int n_classe;
        private String nom_classe;
        private boolean effectif;

        // Constructors
        public Classes() {
        }

        public Classes(int n_classe, String nom_classe, boolean effectif) {
            this.n_classe = n_classe;
            this.nom_classe = nom_classe;
            this.effectif = effectif;
        }

        // Getters and Setters
        public int getN_classes() {
            return n_classe;
        }

        public void setN_classes(int n_classe) {
            this.n_classe = n_classe;
        }

        public String getNom_classes() {
            return nom_classe;
        }

        public void setNom_classse(String nom_classe) {
            this.nom_classe = nom_classe;
        }

        public boolean isEffectif() {
            return effectif;
        }

        public void setEffectif(boolean effectif) {
            this.effectif = effectif;
        }


    }


