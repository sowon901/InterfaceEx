package oop.Interface_3;

public class Interface3Main {
    public static void main(String[] args) {
        //구현객체 생성
        B b = new B();
        D d = new D();
        B bd = new D();
        System.out.println("================");

        C c = new C();
        E e = new E();
        System.out.println("=================");

        //인터페이스 변수 선언
        
        A a;
        
        a = b;//(자동타입변환)  A  <== B  (B 타입에서 A로 자동 형변환)
        a = c;//A <=== C    A <== C (자동타입변환)
        a = d;//A <=== D
        a = e;//A <=== E

        System.out.println("=================");
        //변수에 구현 객체 대입

        //interface 타입도 원하는 타입으로 강제 캐스팅 가능하다
        //직렬화 역직렬화
        a = b;      
        B b1 = (B)a;        //A를 B 타입으로 캐스팅
        //downCasting이 아니라 원형으로 복구하는 것이다.
        //but 자바에선 upcasting, downcasting을 사용하지 않는다.
        //자동변환 = Promotion
        //강제변환 = Casting


        //upcasting, downcasting은 기본 타입을 변환할 때 사용.


        a = c;
        C c1 = (C)a;

        a = d;
        D d1 = (D)a;

        a = e;
        E e1 = (E)a;
        
    }
}
