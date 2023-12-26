package oop.Interface_4;

public class Taxi implements Vehicle{

    Taxi(){}
    public void drive(Vehicle v) {

    }

    @Override
    public void run() {
        System.out.println("Taxi Drive");
    }
}
