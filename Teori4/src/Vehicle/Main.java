/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicle;

/**
 *
 * @author Jihan
 */
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022);
        Motorcycle myMotorcycle = new Motorcycle("Honda", 2020);

        System.out.println("Mobil saya: " + myCar.getBrand() + " " + myCar.getYear());
        myCar.startEngine();
        myCar.drive();

        System.out.println("Sepeda motor saya: " + myMotorcycle.getBrand() + " " + myMotorcycle.getYear());
        myMotorcycle.startEngine();
        myMotorcycle.drive();
    }
}