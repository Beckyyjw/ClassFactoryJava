public class Vehicule {
    private int numeroImmatriculation;
    private Compteur compteur;
    private double jauge;
    private double consoKilometrique;

    private static double capacite = 50.0;
    private static int registre = 0;

    public int getNumeroImmatriculation(){
        return numeroImmatriculation;
    }

    public void setNumeroImmatriculation(int numeroImmatriculation) {
        this.numeroImmatriculation = numeroImmatriculation;
    }

    public Compteur getCompteur(){
        return compteur;
    }

    public double getJauge(){
        return jauge;
    }

    public Vehicule(){
        this.compteur = new Compteur();
        this.consoKilometrique = 0.01; //1L de carburant pour 100 km parcouru
        registre ++;
    }

    public Vehicule(double consoKilometrique){
        this.compteur = new Compteur();
        this.consoKilometrique = consoKilometrique;
        registre ++;
    }

    public void mettreDeLessence(double quantite) {
        if (quantite <= 0) {
            System.out.println("❌ Erreur : La quantité doit être positive. Opération annulée.");
            return;
        }

        if (quantite > capacite) {
            System.out.println("❌ Erreur : Impossible d'ajouter plus que la capacité du réservoir.");
            return;
        }

        /*// Vérification si la quantité est une fraction de la capacité du réservoir
        if (capacite % quantite != 0) {
            System.out.println("⚠ Attention : La quantité ajoutée n'est pas une fraction exacte de la capacité.");
        }*/

        if (jauge + quantite <= capacite) {
            jauge += quantite;
            System.out.println("✅ Ajout de " + quantite + " L effectué. Niveau actuel : " + jauge + " L / " + capacite + " L");
        } else {
            System.out.println("❌ Dépassement de la capacité du réservoir !");
        }
    }

    public void faireLePlein(){
        jauge = capacite;
    }

    public double rouler (double distance){
        if (distance < 0){
            System.out.println("La distance doit être positive");
            return compteur.getTotaliseur();
        }

        jauge -=  consoKilometrique * distance;
        compteur.add((int) distance);
        System.out.println("Le vehicule " + registre + " a parcouru " + distance);

        return compteur.getTotaliseur();
    }

    public void afficherEtat() {
        System.out.println(this);
        System.out.println(); // Ajoute une ligne vide
    }

    @Override
    public String toString() {
        return String.format("Vehicule %d : %s ;; jauge = %.2f", numeroImmatriculation, compteur.toString(), jauge);
    }

}
