public abstract class Garbage {
    int quantity;
    WeightAdapter weight;

    abstract void setQuantity(int quantity);

    public int calculateQuantity(int units){
        return units*quantity;
    }
}