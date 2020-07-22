package com.cc1500.DesignPatterns;

public class DecoratorMode {
    public static void main(String[] args) {
        Food food = new Bread(new Vegetable(new Cream(new Food("香肠"))));
        System.out.println(food.make());
    }

     static class Food {

        private String food_name;

        public Food() {
        }

        public Food(String food_name) {
            this.food_name = food_name;
        }

        public String make() {
            return food_name;
        };
    }
    //面包类
    public static class Bread extends Food {

        private Food basic_food;

        public Bread(Food basic_food) {
            this.basic_food = basic_food;
        }

        public String make() {
            return basic_food.make()+"+面包";
        }
    }

    //奶油类
    public static class Cream extends Food {

        private Food basic_food;

        public Cream(Food basic_food) {
            this.basic_food = basic_food;
        }

        public String make() {
            return basic_food.make()+"+奶油";
        }
    }

    //蔬菜类
    public static class Vegetable extends Food {

        private Food basic_food;

        public Vegetable(Food basic_food) {
            this.basic_food = basic_food;
        }

        public String make() {
            return basic_food.make()+"+蔬菜";
        }

    }
}
