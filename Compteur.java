public class Compteur {
    private int totaliseur;
    private int partiel;
    private static final int CONSTANTE = 1000;

    public Compteur(){}

    public double getPartiel() {
        return partiel;
    }

    public double getTotaliseur(){
        return totaliseur;
    }

    public void setPartiel(int  partiel) {
        this.partiel = partiel;
    }

    public void setTotaliseur(int totaliseur) {
        this.totaliseur = totaliseur;
    }

    public void reserPartiel(){

        /*if(partiel == 1000){
            partiel = 0;
        } else if (partiel > 1000){
            partiel = 0;
        }*/ // pour reset le partiel des 1000
        partiel = 0;
    }

    public void add(int value){
        this.partiel = (this.partiel + value) % 1000;
        this.totaliseur += value;
    }

    @Override
    public String toString(){
        return "compteur = [Totaliseur = " + totaliseur + "| Partiel = " + partiel + "]";
    }
}
