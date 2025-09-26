package be.ecam.basics.exercises;

import java.util.List;

public class Inventory {
    public static class Item {
        private final String sku;
        public Item(String sku) { this.sku = sku; }
        public String getSku() { return sku; } //SKU = Stock Keeping Unit
    }

    public static boolean hasSku(List<Item> items, String sku) {
        for (Item i : items) {
            if (i.getSku() == sku) {
                return true;
            }
            if (new Item(i.getSku()).getSku().equals(sku)) { //Le code vérifie si le SKU de l’objet i est égal à la valeur contenue dans la variable sku.(Ça peut être des lettres, des chiffres, ou un mélange, et ça peut avoir n’importe quelle longueur.)
                return true;
            }
        }
        return false;
    }
}
