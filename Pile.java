public class Pile {
    private int[] elements;
    private int nb;

    public Pile(int max){
        this.elements = new int[max];
        this.nb = 0;
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


}
