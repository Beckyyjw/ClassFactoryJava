/**
 * La classe File implémente une file d'attente d'entiers avec une capacité fixe.
 * Elle permet d'ajouter et de retirer des éléments selon le principe FIFO (First-In, First-Out).
 */
public class File {
    /** Tableau contenant les éléments de la file */
    private int[] elements;

    /** Nombre d'éléments actuellement dans la file */
    private int nb;

    /** Compteur statique du nombre d'instances de la classe */
    private static int compteur;

    /**
     * Constructeur de la classe File.
     * Initialise une file vide avec une capacité maximale donnée.
     *
     * @param tailleMax La capacité maximale de la file.
     */
    public File(int tailleMax) {
        this.elements = new int[tailleMax];
        this.nb = 0;
        compteur++;
    }

    /**
     * Ajoute un élément à la fin de la file si elle n'est pas pleine.
     *
     * @param element L'entier à ajouter à la file.
     */
    public void ajouter(int element) {
        if (nb < elements.length) {
            this.elements[nb] = element;
            nb++;
        } else {
            System.out.println("La file est pleine ! Impossible d'ajouter un élément.");
        }
    }

    /**
     * Retire et retourne le dernier élément ajouté à la file.
     * Si la file est vide, retourne -1.
     *
     * @return L'élément retiré de la file, ou -1 si la file est vide.
     */
    public int retourner() {
        if (nb > 0) {
            nb--;
            return elements[nb];
        }
        return -1;
    }

    /**
     * Vérifie si la file est vide.
     *
     * @return true si la file ne contient aucun élément, false sinon.
     */
    public boolean estVide() {
        return nb == 0;
    }

    /**
     * Retourne le nombre d'instances de la classe File créées.
     *
     * @return Le nombre total d'instances de la classe File.
     */
    public static int getNombreInstances() {
        return compteur;
    }

    /**
     * Retourne une représentation sous forme de chaîne des éléments de la file.
     *
     * @return Une chaîne de caractères contenant les éléments de la file séparés par des espaces.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nb; i++) { // Correction pour ne pas afficher les éléments non utilisés
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(elements[i]);
        }
        return sb.toString();
    }

    /**
     * Compare cette file avec un autre objet pour vérifier s'ils sont égaux.
     * Deux files sont considérées comme égales si elles contiennent le même nombre
     * d'éléments et que tous leurs éléments sont identiques dans le même ordre.
     *
     * @param o L'objet à comparer avec cette file.
     * @return true si les files sont identiques, false sinon.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        File otherFile = (File) o;
        if (this.nb != otherFile.nb) return false;

        for (int i = 0; i < nb; i++) {
            if (this.elements[i] != otherFile.elements[i]) return false;
        }

        return true;
    }
}
