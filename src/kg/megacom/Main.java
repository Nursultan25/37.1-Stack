package kg.megacom;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<String> cars = new Stack<>();

        cars.push("Jeep Vrangler");
        cars.push("Jeep Gladiator");
        cars.push("Range Rover Velar");
        cars.push("BMW M5");
        cars.push("Ford Bronco");

        System.out.println(cars);

        cars.pop();
        System.out.println(cars);
        System.out.println(cars.peek());
        System.out.println(cars.search("Jeep Vrangler"));

    }
}
