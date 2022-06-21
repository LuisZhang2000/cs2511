package part3Q3;

public class DiscountDecorator extends Decorator {

    private double discount;

    public DiscountDecorator(Product product, double discount) {
        super(product);
        this.discount = discount;
    }

    @Override
    public double getPrice() {
        double price = super.getPrice() * (1 - discount/100);
        return price;
    }

}
