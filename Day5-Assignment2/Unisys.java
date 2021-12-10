
abstract class Delta {
	Delta(){
		System.out.println("Delta() constructor");
	}
}


public class Unisys extends Delta{
	Unisys(){
		System.out.println("Teta() constructor");
	}
	
	public static void main(String[] args) {
		Unisys obj = new Unisys();
	}
}