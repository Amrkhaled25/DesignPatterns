public class GoldPlatingFurniture implements Furniture{
    private final Furniture furniture;
    public GoldPlatingFurniture(Furniture furniture){
        this.furniture = furniture;
    }

    @Override
    public String getDescription() {
        return this.furniture.getDescription() +  " with gold plating";
    }

    @Override
    public int getCost() {
        return this.furniture.getCost() + 5000;
    }
}
