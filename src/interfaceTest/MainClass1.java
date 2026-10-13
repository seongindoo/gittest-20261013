package interfaceTest;

public class MainClass1 {

	public static void main(String[] args) {
		
//		Animal animal = new Annimal(); // 인터페이스->인스턴스화 불가능
		Animal animal; // 객체 변수 선언만은 가능
		
		Dog dog = new Dog();
		animal = dog; // 인터페이스도 업 캐스팅 가능
		
//		Fish fish = new Fish(); -> 인터페이스이므로 인스턴스화 불가능
		
		
		Shark shark = new Shark();
		Fish fish;
		
		Fish.staticTest();

	}

}
