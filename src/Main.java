public class Main {

    public static void main(String[] args) {
	// write your code here

//        System.out.println("BILL BURGER HOUSE");
//        Item coke = new Item("DRINK", "coke", 1.25);
//        coke.setSize("LARGE");
////        coke.printItem();
////
//        Item avacado = new Item("TOPPING", "AVACADO", 1.0);
//        avacado.setSize("LARGE");
////        avacado.printItem();
//
//        Burger burger = new Burger("REGULAR ", 4.0);
//        burger.addTopping("AVACADO","LETTUCE","HAM");
//        //burger.addTopping("AVACADO","LETTUCE");
//        //burger.addTopping("AVACADO");
////        burger.printItem();
//
//


//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON", "LETTUCE", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

        //Constructer with 3 arguments
//        MealOrder secondMeal = new MealOrder("turkey", "7-up", "CHILI");
//        secondMeal.addBurgerToppings("LETTUCE", "MAYO", "CHEESSE");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe", "coke","chili");
        deluxeMeal.addBurgerToppings("AVACADO","BACON","LETTUCE","MAYO","CHEESE");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();

    }
}
