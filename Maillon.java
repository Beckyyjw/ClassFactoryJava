public class Maillon {
    private int valeur;
    private Maillon suivant;

    public Maillon(int valeur){
        this.valeur = valeur;
        this.suivant = null;
    }

    public Maillon getSuivant(){
        return suivant;
    }

    public void setSuivant(Maillon suivant){
        this.suivant = suivant;
    }
    public int getValeur(){
        return valeur;
    }
}
