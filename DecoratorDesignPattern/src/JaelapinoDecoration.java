public class JaelapinoDecoration extends PizzaDecorator{
    public JaelapinoDecoration(Pizza pizza) {
        super(pizza);
    }

    public String addJaelapino(){
        return "Jaelapino";
    }

    @Override
    public String bake() {
        return pizza.bake() + addJaelapino();
    }
}
