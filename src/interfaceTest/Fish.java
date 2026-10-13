package interfaceTest;

public interface Fish {
	
	public static final double pi=3.14;
	
	public void swim();
	public void dive();
	
	public static void staticTest() { // 정적 메서드
		System.out.println("나는 정적 메서드야");
	}
	
	public default void defualtTest() { // 기본 메서드
		System.out.println("나는 기본 메서드야");
	}
	
	

}
