public class CheeseBurstDecoration extends PizzaDecorator{

    public CheeseBurstDecoration(Pizza pizza) {
        super(pizza);
    }
    public String addCheese(){
        return "CheeseBurst";
    }

    public String bake(){
        return pizza.bake() + addCheese();
    }
}
