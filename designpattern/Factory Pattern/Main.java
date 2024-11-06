public class Main {

    public static void main(String[] args) {
        MealFactory.prepareVeganMeal("Vegan").prepare();
        MealFactory.prepareVeganMeal("NonVegan").prepare();
        MealFactory.prepareVeganMeal("Keto").prepare();
        MealFactory.prepareVeganMeal("GlutenFree").prepare();
    }
}
