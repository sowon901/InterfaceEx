package oop.Interface_1;

public class ServiceMain {

    public static void main(String[] args) {
        Service service = new ServiceImpl(); //인터페이스는 구현할 수 없으므로 구현 객체 대입.
        service.defaultMethod1();
        System.out.println();

        service.defaultMethod2();
        System.out.println();

        Service.staticMethod1();
        System.out.println();
        Service.staticMethod2();

        //정적메소드는 왜 호출 못해..?
        //static 붙으면 interface에서 메소드를 직접 호출해야한다.
        //service.staticMethod1();    //static


    }
}
