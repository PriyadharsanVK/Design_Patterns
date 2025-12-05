public class Main {
    public static void main(String[] args){
        Pizza pizza = new JaelapinoDecoration(new CheeseBurstDecoration(new BasePizza()));
        System.out.println(pizza.bake());
    }
}
