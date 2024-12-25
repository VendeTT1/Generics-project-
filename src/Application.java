import TP.MetierProduitImpl;
import TP.Produit;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Application {
    public static void main(String[] args) {

        Produit produit1 = new Produit(1, "produit 1", "marque 1",
                                        225.50,"description produit 1",5 );

        Produit produit2 = new Produit(2, "produit 2", "marque 2",
                125.00,"description produit 2",15 );

        Produit produit3 = new Produit(3, "produit 3", "marque 3",
                1250.75,"description produit 3",3 );

        MetierProduitImpl metier = new MetierProduitImpl();

        Scanner sc = new Scanner(System.in);

        int option = 10;
        while (option != 0) {
            System.out.print("Entrer option :");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Afficher la liste des produits");
                    System.out.println(metier.getAll());
                    break;
                case 2:
                    System.out.println("Rechercher un produit");
                    System.out.println(metier.findById(1));
                    break;
                case 3:
                    System.out.println("Ajouter un nouveau produit");
                    metier.add(produit1);
                    metier.add(produit2);
                    metier.add(produit3);
                    System.out.println("3 produits on ete ajouter");

                    break;
                case 4:
                    System.out.println("Supprimer un produit");
                    metier.delete(2);
                    System.out.println("Produit supprimer");
                    break;
                case 5:
                    System.out.println("Quitter le programme");
                default:
                    break;

            }
        }


    }
}