package Part_3;

class FarmMachine{
	
	// [1] : 속성(특징)
	int price;
	int year;
	String color;
	
	// [2] : 동작/기능/행동(method) 
	void move(){
		System.out.println("Farm-machine is moving~");
	}
	
	void dig(){
		System.out.println("Farm-machine is digging~");
	}
	
	void grind(){
		System.out.println("Farm-machine is grinding~");
	}
	
}


public class Java100_oop_Exam002 {

	public static void main(String[] args){
		
		// [1] : 객체 생성
		
		FarmMachine fm = new FarmMachine();
		System.out.println(fm);
		
		// [2] : 생성된 객체에 속성 값 입력하기
		fm.price = 10000000;
		fm.color = "blue";
		fm.year = 2002;
		
		// [3] : 속성 값 출력하기
		System.out.println(fm.price);
		System.out.println(fm.color);
		System.out.println(fm.year);
		
		// [4] : 동작 수행하기
		fm.move();
		fm.dig();
		fm.grind();
	}
}
