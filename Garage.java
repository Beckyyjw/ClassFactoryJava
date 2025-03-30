public class Garage {
    private Vehicule[] vehicules;
    private int count;

    public Garage(int tailleMax){
        this.vehicules = new Vehicule[tailleMax];
        this.count = 0;
    }

    public void ajoutVehicule(Vehicule v){
        if(count < vehicules.length){
            vehicules[count] = v;
            count ++;
        } else{
            System.out.println("Le garage est plein");
        }
    }

    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder("Le garage contient " + count + " véhicule(s) \n");
        for(int i = 0; i < count; i++){
            sb.append("- ").append(vehicules[i]).append("\n");
        }
        return sb.toString();
    }

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
