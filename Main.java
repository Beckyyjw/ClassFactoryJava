//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Exercice 1 : ");
        DateduJour d1 = new DateduJour();
        d1.setJour(27);
        d1.setAnnee(2022);
        System.out.println("La date d1 est = " + d1.toString());
        DateduJour d2 = new DateduJour(27, 3, 2021);
        System.out.println("La date d2 est = " + d2.toString()) ;
        if (d1 == d2){
            System.out.println(d1.toString() + " est égale à " + d2.toString());
        }else {
            System.out.println(d1.toString() + " est différente de " + d2.toString());
        }
        System.out.println("Le jour de d2 est : " + d2.getJour());

        // ************************************************+*********
        System.out.println("************************************************+*****");
        System.out.println("Exercice 2 : ");
        System.out.println("####### TESTS DES COMPTEURS #######");

        Compteur compt = new Compteur();
        System.out.println(compt.toString());
        compt.add(200);
        System.out.println(compt.toString());
        compt.add(300);
        System.out.println(compt.toString());
        compt.reserPartiel();
        System.out.println(compt.toString());
        compt.add(150);
        System.out.println(compt.toString());

        // ************************************************+*********
        System.out.println("####### TESTS DES VEHICULES #######");
        Vehicule vehicule1 = new Vehicule(0.053);

        vehicule1.afficherEtat();

        vehicule1.faireLePlein();
        vehicule1.rouler(0.0);
        vehicule1.afficherEtat();

        vehicule1.rouler(300.0);
        vehicule1.afficherEtat();

        vehicule1.rouler(643.39);
        vehicule1.faireLePlein();
        vehicule1.afficherEtat();

        vehicule1.rouler(200.0);
        vehicule1.afficherEtat();

        vehicule1.rouler(540.1886);
        vehicule1.afficherEtat();

        vehicule1.faireLePlein();
        vehicule1.afficherEtat();

        vehicule1.rouler(260);
        vehicule1.afficherEtat();

        vehicule1.mettreDeLessence(6.0);
        vehicule1.afficherEtat();

        vehicule1.mettreDeLessence(16.0);
        vehicule1.afficherEtat();

        Vehicule vehicule2 = new Vehicule();
        vehicule2.setNumeroImmatriculation(1);
        vehicule2.afficherEtat();

        System.out.println("####### TESTS GARAGE #######");

        Garage garage = new Garage(10);

        garage.ajoutVehicule(vehicule1);
        garage.ajoutVehicule(vehicule2);

        System.out.println("État initial du garage :");
        System.out.println(garage);

        garage.supprimerVehicule(600);

        System.out.println("État du garage après suppression des véhicules avec plus de 600 km :");
        System.out.println(garage);

    }
}