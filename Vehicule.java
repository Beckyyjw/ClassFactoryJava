/**
 * La classe {@code Vehicule} représente un véhicule avec un compteur de distance, une jauge de carburant,
 * et une capacité de réservoir. Elle permet de gérer les principales fonctionnalités d'un véhicule, telles que :
 * ajouter du carburant, rouler, et afficher son état.
 *
 * Chaque véhicule possède un numéro d'immatriculation unique généré à chaque création d'instance.
 * La consommation est paramétrable et la capacité du réservoir est fixe.
 *
 * <p>
 * La classe permet également de contrôler le niveau de carburant, effectuer le plein et gérer les déplacements
 * en fonction de la distance parcourue et de la consommation de carburant.
 * </p>
 */
public class Vehicule {

    /**
     * Le numéro d'immatriculation du véhicule.
     */
    private int numeroImmatriculation;

    /**
     * Le compteur de distance du véhicule.
     */
    private Compteur compteur;

    /**
     * Le niveau actuel de carburant dans le réservoir, en litres.
     */
    private double jauge;

    /**
     * La consommation du véhicule en litres pour 100 kilomètres parcourus.
     */
    private double consoKilometrique;

    /**
     * La capacité maximale du réservoir du véhicule, en litres.
     */
    private static double capacite = 50.0;

    /**
     * Un registre statique pour générer un numéro d'immatriculation unique pour chaque véhicule.
     */
    private static int registre = 0;

    /**
     * Récupère le numéro d'immatriculation du véhicule.
     *
     * @return Le numéro d'immatriculation du véhicule.
     */
    public int getNumeroImmatriculation(){
        return numeroImmatriculation;
    }

    /**
     * Modifie le numéro d'immatriculation du véhicule.
     *
     * @param numeroImmatriculation Le nouveau numéro d'immatriculation à affecter au véhicule.
     */
    public void setNumeroImmatriculation(int numeroImmatriculation) {
        this.numeroImmatriculation = numeroImmatriculation;
    }

    /**
     * Récupère le compteur du véhicule.
     *
     * @return Le compteur du véhicule.
     */
    public Compteur getCompteur(){
        return compteur;
    }

    /**
     * Récupère la jauge de carburant actuelle du véhicule.
     *
     * @return La jauge du véhicule.
     */
    public double getJauge(){
        return jauge;
    }

    /**
     * Constructeur par défaut pour initialiser un véhicule avec une consommation de carburant de 0.01 L/100 km.
     */
    public Vehicule(){
        this.compteur = new Compteur();
        this.consoKilometrique = 0.01; // 1L de carburant pour 100 km parcourus
        registre ++;
    }

    /**
     * Constructeur permettant de spécifier la consommation de carburant du véhicule.
     *
     * @param consoKilometrique La consommation de carburant en L/100 km.
     */
    public Vehicule(double consoKilometrique){
        this.compteur = new Compteur();
        this.consoKilometrique = consoKilometrique;
        registre ++;
    }

    /**
     * Ajoute de l'essence dans le réservoir du véhicule.
     *
     * @param quantite La quantité d'essence à ajouter, en litres.
     */
    public void mettreDeLessence(double quantite) {
        if (quantite <= 0) {
            System.out.println("❌ Erreur : La quantité doit être positive. Opération annulée.");
            return;
        }

        if (quantite > capacite) {
            System.out.println("❌ Erreur : Impossible d'ajouter plus que la capacité du réservoir.");
            return;
        }

        if (jauge + quantite <= capacite) {
            jauge += quantite;
            System.out.println("✅ Ajout de " + quantite + " L effectué. Niveau actuel : " + jauge + " L / " + capacite + " L");
        } else {
            System.out.println("❌ Dépassement de la capacité du réservoir !");
        }
    }

    /**
     * Remplie complètement le réservoir du véhicule.
     */
    public void faireLePlein(){
        jauge = capacite;
    }

    /**
     * Permet au véhicule de rouler sur une certaine distance, en consommant du carburant.
     *
     * @param distance La distance parcourue, en kilomètres.
     * @return Le total de distance parcourue enregistré dans le compteur.
     */
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

    /**
     * Affiche l'état actuel du véhicule (numéro d'immatriculation, compteur, et jauge de carburant).
     */
    public void afficherEtat() {
        System.out.println(this);
        System.out.println(); // Ajoute une ligne vide
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de l'état du véhicule.
     *
     * @return Une chaîne formatée représentant l'état du véhicule (numéro d'immatriculation, compteur, jauge).
     */
    @Override
    public String toString() {
        return String.format("Vehicule %d : %s ;; jauge = %.2f", numeroImmatriculation, compteur.toString(), jauge);
    }
}
