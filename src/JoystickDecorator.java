public class JoystickDecorator implements PriceOfProduct {
    PriceOfProduct priceOfProduct;

    public JoystickDecorator(PriceOfProduct priceOfProduct){
        this.priceOfProduct = priceOfProduct;
    }
    @Override
    public Integer getPrice() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
