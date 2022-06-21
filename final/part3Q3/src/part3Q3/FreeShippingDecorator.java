package part3Q3;

public class FreeShippingDecorator extends Decorator {

    private int price;
    private int weight;

    public FreeShippingDecorator(Product product, int price, int weight) {
        super(product);
        this.price = price;
        this.weight = weight;
    }

    @Override
    public double getShippingCost() {
        if (super.getPrice() > price && super.getWeight() < weight) {
            return 0;
        }
        return super.getShippingCost();
    }
    

}
