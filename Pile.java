/**
 * Classe représentant une pile d'entiers avec des opérations de base comme empiler, dépiler,
 * vérifier si la pile est vide, et obtenir le nombre d'instances de la pile créées.
 *
 * @author Becky
 */
public class Pile {

    /** Tableau d'entiers contenant les éléments de la pile. */
    private int[] elements;

    /** Le nombre d'éléments actuellement dans la pile. */
    private int nb;

    /** Le compteur statique pour compter le nombre d'instances créées de la classe Pile. */
    private static int compteur;

    /**
     * Constructeur de la pile.
     * Initialise la pile avec une capacité maximale donnée et un tableau vide d'éléments.
     *
     * @param max La capacité maximale de la pile.
     */
    public Pile(int max){
        this.elements = new int[max];
        this.nb = 0;
        compteur ++;
    }

    /**
     * Empile un élément sur le sommet de la pile.
     * Si la pile est pleine, affiche un message d'erreur.
     *
     * @param element L'élément à ajouter à la pile.
     */
    public void empiler(int element){
        if(nb < elements.length){
            elements[nb] = element;
            nb ++;
        } else {
            System.out.println("La pile est pleine ! Impossible d'ajouter un élément.");
        }
    }

    /**
     * Dépile l'élément du sommet de la pile et le retourne.
     * Si la pile est vide, retourne -1 pour indiquer qu'aucun élément n'a pu être dépilé.
     *
     * @return L'élément au sommet de la pile ou -1 si la pile est vide.
     */
    public int depiler(){
        if(nb > 0){
            nb --;
            return elements[nb];
        }
        return -1;
    }

    /**
     * Vérifie si la pile est vide.
     *
     * @return true si la pile est vide, sinon false.
     */
    public boolean estVide() {
        return nb == 0;
    }

    /**
     * Retourne le nombre d'instances créées de la classe Pile.
     *
     * @return Le nombre d'instances de la classe Pile.
     */
    public static int getNombreInstances(){
        return compteur;
    }

    /**
     * Retourne une chaîne représentant les éléments de la pile.
     * Les éléments sont séparés par des virgules.
     *
     * @return Une chaîne contenant les éléments de la pile séparés par des virgules.
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nb; i++) {
            sb.append(elements[i]);
            if (i < nb - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    /**
     * Compare l'objet actuel à un autre objet pour vérifier si les deux piles sont identiques.
     * Les piles sont considérées égales si elles contiennent le même nombre d'éléments et
     * les mêmes éléments dans le même ordre.
     *
     * @param o L'objet à comparer à la pile actuelle.
     * @return true si les piles sont égales, sinon false.
     */
    @Override
    public boolean equals(Object o){
        // Vérification si l'objet est une instance de la classe Pile
        if (this == o) {
            return true;
        }

        // Vérification si l'objet est de type Pile
        if(null == o || getClass() != o.getClass()){return false;}

        Pile otherPile = (Pile) o;

        // Vérification du nombre d'éléments
        if (this.nb != otherPile.nb){
            return false;
        }

        // Comparaison des éléments
        for(int i = 0; i < this.nb; i++){
            if(this.elements[i] != otherPile.elements[i]){
                return false;
            }
        }

        return true;
    }
}
