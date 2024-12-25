package TP;

import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit> {

    private List<Produit> listeProduits = new ArrayList<>();

    public MetierProduitImpl() {
    }



    @Override
    public void add(Produit produit) {
            listeProduits.add(produit);
    }

    @Override
    public List<Produit> getAll() {
        return listeProduits;
    }

    @Override
    public Produit findById(long id) {
        for (Produit produit : listeProduits) {
            if (produit.getId() == id) {
                return produit;
            }
        }
        return null;
    }

    @Override
    public void delete(long id) {
        listeProduits.removeIf(produit -> produit.getId() == id);

    }

}
