/**
 * La classe {@code Compteur} représente un compteur qui suit les distances parcourues en deux unités :
 * un totaliseur qui cumule la distance totale et un compteur partiel qui est réinitialisé après avoir atteint
 * une certaine limite définie par une constante.
 *
 * La classe permet d'ajouter des valeurs au compteur, de récupérer les valeurs actuelles et de réinitialiser
 * le compteur partiel une fois qu'il atteint une certaine valeur.
 */
public class Compteur {

    /**
     * Le totaliseur qui cumule la distance totale parcourue.
     */
    private int totaliseur;

    /**
     * Le compteur partiel qui est réinitialisé à zéro après avoir atteint la valeur de la constante.
     */
    private int partiel;

    /**
     * La constante qui définit la valeur limite pour réinitialiser le compteur partiel.
     */
    private static final int CONSTANTE = 1000;

    /**
     * Constructeur par défaut du compteur.
     * Initialise les valeurs de totaliseur et partiel à zéro.
     */
    public Compteur(){}

    /**
     * Récupère la valeur actuelle du compteur partiel.
     *
     * @return La valeur actuelle du compteur partiel.
     */
    public double getPartiel() {
        return partiel;
    }

    /**
     * Récupère la valeur actuelle du totaliseur.
     *
     * @return La valeur actuelle du totaliseur.
     */
    public double getTotaliseur(){
        return totaliseur;
    }

    /**
     * Modifie la valeur du compteur partiel.
     *
     * @param partiel La nouvelle valeur du compteur partiel.
     */
    public void setPartiel(int partiel) {
        this.partiel = partiel;
    }

    /**
     * Modifie la valeur du totaliseur.
     *
     * @param totaliseur La nouvelle valeur du totaliseur.
     */
    public void setTotaliseur(int totaliseur) {
        this.totaliseur = totaliseur;
    }

    /**
     * Réinitialise le compteur partiel à zéro.
     */
    public void reserPartiel(){
        partiel = 0;
    }

    /**
     * Ajoute une valeur au compteur. La valeur est ajoutée au compteur partiel, et si le compteur partiel
     * atteint la constante définie, il est réinitialisé. Le totaliseur est également mis à jour.
     *
     * @param value La valeur à ajouter aux compteurs.
     */
    public void add(int value){
        this.partiel = (this.partiel + value) % CONSTANTE;
        this.totaliseur += value;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères du compteur, incluant le totaliseur
     * et le compteur partiel.
     *
     * @return Une chaîne formatée représentant l'état du compteur.
     */
    @Override
    public String toString(){
        return "compteur = [Totaliseur = " + totaliseur + "| Partiel = " + partiel + "]";
    }
}
