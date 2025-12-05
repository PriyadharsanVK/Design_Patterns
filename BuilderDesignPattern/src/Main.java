public class Main {
    public static void main(String[] args) {
        Burger b = new Burger.BurgerBuilder()
                .setEgg(true)
                .setExtracheese(false)
                .setLettuce(false)
                .setOnion(true).setSize("Medium")
                .build();

        Meal meal = new MealDirector(new VegMealBuilder()).prepareMeal();
    }
}
