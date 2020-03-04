import org.apache.poi.ss.formula.functions.T;

public class Car {
    public String sModel;
    public int iHighestSpeed;
    public static int iSteering;
    public static int iWheel;
    public static int iDoors;

    public Car(){
        iSteering = 1;
        iWheel = 4;
    }

    public void DisplayCharacterstics() {
        System.out.println("Model of the Car: " + sModel);
        System.out.println("Max speed of the Car: " + iHighestSpeed);
        System.out.println("Number of Steering in the Car: " + iDoors);
    }

    public static void DisplayStaticCharacterstics() {
        //DisplayCharacterstics();//Compile time error
        System.out.println("Max speed of the Car: " + iDoors);//Compile time error
        System.out.println("Number of Wheels in the Car: " + iWheel);
        System.out.println("Number of Steering in the Car: " + iSteering);
    }


    public static void main(String[] args) {
        Car.DisplayStaticCharacterstics();
    }

}