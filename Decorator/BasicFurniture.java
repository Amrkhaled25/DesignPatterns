public class BasicFurniture implements Furniture{
    @Override
    public String getDescription() {
        return  "Furniture with heavenly wood" ;
    }

    @Override
    public int getCost() {
        return 1000 ;
    }
}
