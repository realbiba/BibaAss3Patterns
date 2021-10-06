public class JoystickOfPlaystation extends JoystickDecorator {
    public JoystickOfPlaystation(PriceOfProduct priceOfProduct) {
        super(priceOfProduct);
    }
    @Override
    public Integer getPrice(){
        return priceOfProduct.getPrice() + 40000;
    }
}
