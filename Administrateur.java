

public class Administrateur {
    private String nameAdmin ;
    private String frisnameAdmin ;

    
    public Administrateur() {
    }


    public String getNameAdmin() {
        return this.nameAdmin;
    }

    public void setNameAdmin(String nameAdmin) {
        this.nameAdmin = nameAdmin;
    }

    public String getFrisnameAdmin() {
        return this.frisnameAdmin;
    }

    public void setFrisnameAdmin(String frisnameAdmin) {
        this.frisnameAdmin = frisnameAdmin;
    }

    public Administrateur(String nameAdmin, String frisnameAdmin) {
        this.nameAdmin = nameAdmin;
        this.frisnameAdmin = frisnameAdmin;
    }

    public Administrateur nameAdmin(String nameAdmin) {
        setNameAdmin(nameAdmin);
        return this;
    }

    public Administrateur frisnameAdmin(String frisnameAdmin) {
        setFrisnameAdmin(frisnameAdmin);
        return this;
    }



}
