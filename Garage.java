/**
 * La classe Garage représente un garage pouvant contenir un nombre défini de véhicules.
 * Elle permet d'ajouter des véhicules, de les supprimer en fonction d'un seuil de kilométrage,
 * et de générer une représentation sous forme de chaîne des véhicules présents dans le garage.
 *
 * @author Becky
 */
public class Garage {

    /** Tableau de véhicules contenus dans le garage. */
    private Vehicule[] vehicules;

    /** Le nombre actuel de véhicules dans le garage. */
    private int count;

    /**
     * Constructeur de la classe Garage.
     * Initialise le garage avec un nombre maximum de véhicules.
     *
     * @param tailleMax La capacité maximale du garage (nombre de véhicules qu'il peut contenir).
     */
    public Garage(int tailleMax){
        this.vehicules = new Vehicule[tailleMax];
        this.count = 0;
    }

    /**
     * Ajoute un véhicule dans le garage si la capacité maximale n'est pas atteinte.
     * Si le garage est plein, un message est affiché pour en informer l'utilisateur.
     *
     * @param v Le véhicule à ajouter au garage.
     */
    public void ajoutVehicule(Vehicule v){
        if(count < vehicules.length){
            vehicules[count] = v;
            count ++;
        } else{
            System.out.println("Le garage est plein");
        }
    }

    /**
     * Retourne une chaîne représentant l'état actuel du garage, incluant tous les véhicules présents
     * et leur état sous forme de chaîne.
     *
     * @return Une chaîne de caractères représentant l'état du garage et des véhicules.
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Le garage contient " + count + " véhicule(s) \n");
        for(int i = 0; i < count; i++){
            sb.append("- ").append(vehicules[i]).append("\n");
        }
        return sb.toString();
    }

    /**
     * Supprime les véhicules dont le totaliseur de kilomètres dépasse un seuil donné.
     * Les véhicules dont le totaliseur est inférieur ou égal au seuil sont conservés dans le garage.
     *
     * @param seuil Le seuil de kilométrage pour supprimer les véhicules ayant un totaliseur supérieur.
     */
    public void supprimerVehicule(int seuil){
        int newcount = 0;
        for(int i = 0; i < count; i++){
            if(vehicules[i].getCompteur().getTotaliseur() <= seuil) {
                vehicules[newcount] = vehicules[i];
                newcount++;
            }
        }
        count = newcount;
    }
}
