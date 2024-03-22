public class Main {
    public static void main(String[] args) {
        Product.Builder product1 = new Product.Builder()
                .id(1)
                .price(5)
                .name("amr")
                .color("red")
                ;
        Product.Builder product2 = new Product.Builder()
                .id(2)
                .price(5.5)
                .name("amr2")

                ;

    }
}

/*
*
* The Builder design pattern is a creational pattern that is used to construct complex objects step by step.
* It separates the construction of a complex object from its representation,
* allowing the same construction process to create different representations.
*
* example : we can use same constructor to make several representation of products instead
* of make  a constructor for every representation
* */
