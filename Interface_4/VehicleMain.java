package oop.Interface_4;

public class VehicleMain {

    public static void main(String[] args) {
        Driver driver = new Driver();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();


        driver.drive(bus);  //promotion-->오버라이딩 메소드 호출되어 다형성을 구현했다.
        driver.drive(taxi);
        ride(taxi);
        ride(bus);
        //instanceof : 객체타입 확인 연산자

        //Bus와 Taxi가 vehicle 타입을 implements했기 때문에 자동 타입 변환됨
    }

    //인터페이스 매개변수를 갖는 메소드
    public static void ride(Vehicle vehicle) {
        if(vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;    //원래는 캐스팅을 해줘야한다.
            bus.checkFare();
        }
        if(vehicle instanceof Bus bus)
               bus.checkFare(); //자바 12부터 가능
            vehicle.run();
    }
}
