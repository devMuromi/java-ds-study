public class Code01 {
	static int num; // Java에서 모든건 클래스 안에 선언되야함

	public static void main(String[] args) {
		int anotherNum = 5;
		num = 2;

		System.out.println(num + anotherNum);
		System.out.println("Num: " + num);
		System.out.println("AnotherNum: " + anotherNum);
		System.out.println("AnotherNum: " + num + anotherNum); // String + int가먼저 계산되며 변환되는 것 
		System.out.println("AnotherNum: " + (num + anotherNum));
		System.out.println(num + anotherNum+ "<< AnotherNum");
	}
}