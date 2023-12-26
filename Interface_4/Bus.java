package oop.Interface_4;

public class Bus implements Vehicle{


    Bus(){}
    public void drive(Vehicle v) {

    }

    @Override
    public void run() {
        System.out.println("Bus Drive");
    }

    public void checkFare() {
        System.out.println("승차요금을 확인해주세요!");
    }

}
