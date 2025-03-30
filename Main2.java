import java.util.Scanner;

public class Main2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int choix;
        do{
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Gestion d'une Pile");
            System.out.println("2. Gestion d'une File");
            System.out.println("3. Gestion d'une Liste Chaînée");
            System.out.println("4. Quitter");
            System.out.print("Votre choix : ");

            choix = scanner.nextInt();

            switch (choix){
                case 1:
                    gererPile();
                    break;
                case 2:
                    gererFile();
                    break;
                case 3:
                    gererListeChainee();
                    break;
                case 4:
                    System.out.println("✅ Programme terminé.");
                    break;
                default:
                    System.out.println("❌ Choix invalide. Veuillez essayer à nouveau.");
            }
        }while(choix != 4);
    }

    private static void gererPile() {
        Pile pile = new Pile(1000);
        int choix;
        do {
            System.out.println("\n=== GESTION D'UNE PILE ===");
            System.out.println("1. Empiler (ajouter)");
            System.out.println("2. Dépiler (supprimer)");
            System.out.println("3. Afficher la pile");
            System.out.println("4. Retour au menu principal");
            System.out.print("Votre choix : ");

            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    System.out.print("Entrez un élément à empiler : ");
                    int element = scanner.nextInt();
                    pile.empiler(element);
                    break;
                case 2:
                    int val = pile.depiler();
                    System.out.println(val != -1 ? "Élément dépilé : " + val : "La pile est vide !");
                    break;
                case 3:
                    System.out.println("Pile actuelle : " + pile);
                    break;
                case 4:
                    System.out.println("Retour au menu principal...");
                    break;
                default:
                    System.out.println("❌ Choix invalide.");
            }
        } while (choix != 4);
    }

    private static void gererFile() {
        File file = new File(10);
        int choix;
        do {
            System.out.println("\n=== GESTION D'UNE FILE ===");
            System.out.println("1. Ajouter un élément");
            System.out.println("2. Retirer un élément");
            System.out.println("3. Afficher la file");
            System.out.println("4. Retour au menu principal");
            System.out.print("Votre choix : ");

            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Entrez un élément à ajouter : ");
                    int element = scanner.nextInt();
                    file.ajouter(element);
                    break;
                case 2:
                    int val = file.retourner();
                    System.out.println(val != -1 ? "Élément retiré : " + val : "La file est vide !");
                    break;
                case 3:
                    System.out.println("File actuelle : " + file);
                    break;
                case 4:
                    System.out.println("Retour au menu principal...");
                    break;
                default:
                    System.out.println("❌ Choix invalide.");
            }
        } while (choix != 4);
    }

    private static void gererListeChainee() {
        ListeChaine liste = new ListeChaine();
        int choix;
        do {
            System.out.println("\n=== GESTION D'UNE LISTE CHAÎNÉE ===");
            System.out.println("1. Ajouter un élément");
            System.out.println("2. Supprimer un élément");
            System.out.println("3. Afficher la liste");
            System.out.println("4. Retour au menu principal");
            System.out.print("Votre choix : ");

            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    System.out.print("Entrez un élément à ajouter : ");
                    int element = scanner.nextInt();
                    liste.ajouter(element);
                    break;
                case 2:
                    System.out.print("Entrez un élément à supprimer : ");
                    int val = scanner.nextInt();
                    liste.supprimer(val);
                    break;
                case 3:
                    System.out.println("Liste actuelle : " + liste);
                    break;
                case 4:
                    System.out.println("Retour au menu principal...");
                    break;
                default:
                    System.out.println("❌ Choix invalide.");
            }
        } while (choix != 4);
    }
}
