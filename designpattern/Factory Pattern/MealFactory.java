public class MealFactory {

    public static Meal prepareVeganMeal(String mealType) {
        return switch (mealType) {
            case "Vegan" -> new VeganMeal();
            case "NonVegan" -> new NonVeganMeal();
            case "GlutenFree" -> new GlutenFreeMeal();
            case "Keto" -> new KetoMeal();
            default -> null;
        };
    }
}
