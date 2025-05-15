public class Main{
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Item item = new Item("Item Genérico", 20);
        Fruit fruit = new Fruit("Maçã", 20, "Fuji");
        Weapon weapon = new Weapon("Silver Sword", 20, 20, "Rare");

        inventory.addItem(item);
        inventory.addItem(fruit);
        inventory.addItem(weapon);

        inventory.displayInventory();
    }
}