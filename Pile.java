public class Pile {
    private int[] elements;
    private int nb;
    private static int compteur;

    public Pile(int max){
        this.elements = new int[max];
        this.nb = 0;
        compteur ++;
    }

    public void empiler(int element){
        if(nb < elements.length){
            elements[nb] = element;
            nb ++;
        }else {
            System.out.println("La pile est pleine ! Impossible d'ajouter un élément.");
        }
    }

    public int deplier(){
        if(nb > 0){
            nb --;
            return elements[nb];
        }
        return -1;
    }

    public boolean estVide() {
        return nb == 0; // Retourne true si la pile est vide (nb == 0), sinon false
    }

    public static int getNombreInstances(){
        return compteur;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nb; i++) {
            sb.append(elements[i]); // Ajoute chaque élément
            if (i < nb - 1) {
                sb.append(", "); // Ajoute une virgule et un espace après chaque élément sauf le dernier
            }
        }
        return sb.toString(); // Retourne la chaîne construite
    }

    @Override
    public boolean equals(Object o){
        // Vérification si l'objet est une instance de la classe Pile
        if (this == o) {
            return true; // Si les deux objets sont identiques en mémoire (même référence)
        }

        // Vérification si l'objet est de type Pile
        if(null == o || getClass() != o.getClass()){
            return false;
        }

        Pile otherPile = (Pile) o;

        if (this.nb != otherPile.nb){
            return false;
        }

        for(int i = 0; i < this.nb; i++){
            if(this.elements[i] != otherPile.elements[i]){
                return false;
            }
        }

        // Si toutes les vérifications sont passées, les piles sont égales
        return true;
    }
}
