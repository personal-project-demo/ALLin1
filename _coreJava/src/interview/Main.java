package interview;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		Customer objectOne=new Customer("C100", "Amar","1-9-34/A/1,New York");
		Customer objectTwo=new Customer("C100", "Amar","1-9-34/A/1,New York2");
		
			System.out.println("objectOne == objectTwo =>"+(objectOne == objectTwo));
			System.out.println("objectOne equals objectTwo =>"+(objectOne.equals(objectTwo)));
			System.out.println("hashcode objectOne =>"+(objectOne.hashCode()));
			System.out.println("hashcode objectTwo =>"+(objectOne.hashCode()));
	}

}
