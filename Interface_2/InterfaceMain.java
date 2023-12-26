package oop.Interface_2;

import java.sql.SQLOutput;

public class InterfaceMain {
    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl();

        InterfaceA interfaceA = impl;

        //System.out.println(InterfaceA.toString());    -->안됨
        //인터페이스는 부르고 끝나기때문에 method stub만 찾아서 impl만 객체로 확인할 수 있다.
        System.out.println(impl.toString());
        //인터페이스의 타입캐스팅은 인터페이스와 구현 클래스간에 벌어지는 일

        //***(중요!!!!!!)부모클래스가 반드시 해당 인터페이스를 구현 해야 자식 클래스도 인터페이스를 담을 수 있다.

        InterfaceB interfaceB = impl;
        InterfaceC interfaceC = impl;

        interfaceA.methodA();

        interfaceB.methodB();

        interfaceC.methodA();
        interfaceC.methodB();
        interfaceC.methodC();
        //상속했기때문에 가능
        //interfaceC 타입으로만 호출해야 모든 메소드를 호출할 수 있다.


    }
}
