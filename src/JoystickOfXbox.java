public class JoystickOfXbox extends JoystickDecorator {

    public JoystickOfXbox(PriceOfProduct priceOfProduct) {
        super(priceOfProduct);
    }
    @Override
    public Integer getPrice(){
        return priceOfProduct.getPrice() + 25000;
    }
}



