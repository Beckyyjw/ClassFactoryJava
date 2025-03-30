public class Garage {
    private Vehicule[] vehicules;
    private int count;

    public void ajoutVehicule(Vehicule vehicule){
        vehicules[count] = vehicule;
        count ++;
    }

}
