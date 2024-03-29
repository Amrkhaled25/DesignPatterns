public class Product {
    private int id ;
    private String name ;
    private double price ;
    private String color ;


    public static class  Builder {
        private Product product = new Product() ;

        public Builder id(int id){
            product.id = id ;
            return this ;
        }
        public Builder name(String name){
            product.name = name ;
            return this ;
        }
        public Builder price(double price){
            product.price = price ;
            return this ;
        }

        public Builder color(String color){
            product.color = color ;
            return this ;
        }

        public Product build(){
            return  product ;
        }

    }



}
