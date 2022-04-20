package inheritance;

import java.util.ArrayList;

public class FoodTest {
    public static void main(String[] args) {
        Food food1 = new Food();
        food1.taste = "delicious";
        food1.name = "sushi";
        food1.isSpicy = true;
        food1.setOrganic(true);

        System.out.println(food1.name);
        System.out.println(food1.isOrganic());
        System.out.println(food1);

        ///////////////////////////////////

        Vegetable veg1 = new Vegetable();
        veg1.name = "parsley";
        veg1.taste = "good";
        veg1.isSpicy = false;
        veg1.setOrganic(true);
        veg1.color = "green";

        System.out.println(veg1.name);
        System.out.println(veg1.color);
        System.out.println(veg1.isOrganic());
        System.out.println(veg1);

        ///////////////////////////////////

        Vegetable veg2 = new Vegetable();
        veg2.name = "broccoli";
        System.out.println(veg2);

        ArrayList<Food> allFoods = new ArrayList<>();

        allFoods.add(food1);
        allFoods.add(veg1);
        allFoods.add(veg2);

        int howMany = 0;

        for(Food food : allFoods){
            if(food.name.length() > 5) howMany++;
        }
        System.out.println(howMany);

        int count2 = 0;






    }
}
