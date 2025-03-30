public class DateduJour {
    private int jour;
    private int mois;
    private int annee;

    public DateduJour(){}
    public DateduJour(int jour, int mois, int annee)
    {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getJour(){
        return jour;
    }

    public int getAnnee() {
        return annee;
    }

    public int getMois() {
        return mois;
    }

    @Override
    public String toString() {
        return jour + "/" + mois + "/" + annee;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DateduJour)) return false; // verifie si n'est pas null et est une instance de Datedujour

        DateduJour date = (DateduJour) o;
        return this.jour == date.jour &&
                this.mois == date.mois &&
                this.annee == date.annee;
    }
}
