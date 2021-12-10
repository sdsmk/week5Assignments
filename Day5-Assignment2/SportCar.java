
public class SportCar extends Car{
	
	SportCar() {
        super(CarType.SPORT);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building sports car");
        // add accessories
    }

}
