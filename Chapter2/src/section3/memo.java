package section3;

public class memo {

}

// 자바에서 상속하면 반드시 부모 클래스의 생성자를 호출해줘야함.
// 아니면 자동으로 기본생성자를 가져다 씀.

// 자식에게 공유하려면 private이 아닌 protected등 사용
// 그냥 super() 하면 생성자, super.func() 하면 부모의 함수 호출가능

// polymorphism(다형성)

// 모든 객체는 Object를 상속함 기본적으로

// primitive타입을 객체로 써야할때 wrapper 클래스를 이용함

// 원래라면 그냥 primitive type을 객체에 못넣지만, 그걸 컴파일러가 자동으로 해주는게 Autoboxing(wrapping)
// 반대로 int b = (Integer)a 도 됨(unwrapping)

// abstract method를 하나라도 가지면 abstract class. 추상~는 abstract keyword료 표시
// interface: 모든 method가 abstract method인 abstract class
// class->interface. interface 내부에서는 굳이 abstact를 안적어줘도 된다. 그리고 extends 대신 implements를 쓴다.
// 그리고 static final 은 가질 수 있다.

// 자바에서 기본적으로 제공해주는 Comparable interface, compareTo() method, 이를 implement하면
// 자바에서 제공하는 Array.sort()등을 사용할 수 있다.

// interface VS Full abstract class의 차이는? interface는 다중 상속이 가능.

// Generic. generics를 쓰면 그냥 Object타입으로 설정하는것과 달리 type casting을 할일이 줄어듬.