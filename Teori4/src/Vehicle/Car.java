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
public class Car extends Vehicle implements Drivable {
    public Car(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void startEngine() {
        System.out.println("Menghidupkan mesin mobil...");
    }

    @Override
    public void drive() {
        System.out.println("Mengemudi mobil...");
    }
}