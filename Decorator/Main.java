public class Main {
    public static void main(String[] args) {

        Furniture basicFurniture = new BasicFurniture();
        System.out.println(basicFurniture.getDescription());
        System.out.println(basicFurniture.getCost());

        System.out.println("====================================");

        Furniture goldPlatingFurniture = new GoldPlatingFurniture(new BasicFurniture());
        System.out.println(goldPlatingFurniture.getDescription());
        System.out.println(goldPlatingFurniture.getCost());

    }
}

/*
*
* Decorator pattern is used to add new functionality to an existing object without altering its structure.
* in this example we have a basic furniture class that implements the Furniture interface and we have a GoldPlatingFurniture class that implements the Furniture interface.
* The GoldPlatingFurniture class has a constructor that takes an object of type Furniture and it has two methods getDescription() and getCost() that add the gold plating functionality to the basic furniture object.
* we  added gold plating without modifying the basic furniture class.
* */
