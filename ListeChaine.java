/**
 * Classe représentant une liste chaînée simple.
 */
public class ListeChaine {
    private Maillon tete;

    /**
     * Constructeur par défaut. Initialise une liste vide.
     */
    public ListeChaine(){
        this.tete = null;
    }

    /**
     * Ajoute un élément à la fin de la liste chaînée.
     *
     * @param element L'élément entier à ajouter.
     */
    public void ajouter(int element){
        Maillon nouveau = new Maillon(element);

        if(tete == null){
            tete = nouveau;
        } else {
            Maillon actuel = tete;
            while(actuel.getSuivant() != null){
                actuel = actuel.getSuivant();
            }
            actuel.setSuivant(nouveau);
        }
    }

    /**
     * Supprime le premier maillon contenant l'élément donné.
     *
     * @param element L'élément à supprimer de la liste.
     */
    public void supprimer(int element){
        if (tete == null) {
            System.out.println("La liste est vide. Suppression impossible.");
            return;
        }

        // Cas où la tête contient l'élément à supprimer
        if (tete.getValeur() == element) {
            tete = tete.getSuivant();
            return;
        }

        Maillon precedent = tete;
        Maillon actuel = tete.getSuivant();

        while (actuel != null){
            if(actuel.getValeur() == element){
                precedent.setSuivant(actuel.getSuivant()); // Supprime l'élément
                return;
            }
            precedent = actuel;
            actuel = actuel.getSuivant();
        }

        System.out.println("Élément non trouvé dans la liste.");
    }

    /**
     * Retourne une représentation textuelle de la liste chaînée.
     * Les éléments sont affichés sous la forme : |valeur|@ --> |valeur|@ --> NULL
     *
     * @return Une chaîne de caractères représentant la liste chaînée.
     */
    @Override
    public String toString() {
        if (tete == null) {
            return "Liste vide";
        }

        StringBuilder sb = new StringBuilder();
        Maillon actuel = tete;

        while (actuel != null) {
            sb.append("|").append(actuel.getValeur()).append("|@");
            if (actuel.getSuivant() != null) {
                sb.append(" --> ");
            } else {
                sb.append(" --> NULL");
            }
            actuel = actuel.getSuivant();
        }

        return sb.toString();
    }
}
