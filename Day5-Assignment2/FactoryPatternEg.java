public class FactoryPatternEg {
    public static void main(String[] args) {
    	
    	Car sObj = CarFactory.buildCar(CarType.SMALL);
    	
    	Car snObj = CarFactory.buildCar(CarType.SEDAN);
    	
    	Car lObj = CarFactory.buildCar(CarType.LUXURY);
    	
    	Car scobj = CarFactory.buildCar(CarType.SPORT);
    	//How to avoid printing of Class name along with hashcode
        System.out.println(sObj);
        
        System.out.println(snObj);
        
        System.out.println(lObj);
        
        System.out.println(scobj);
    }
}