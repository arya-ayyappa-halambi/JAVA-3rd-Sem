abstract class car{
    abstract void model();
    abstract void music();
}
class audi extends car{
    void model(){
        System.out.println("Audi A6");
    }
    void music(){
        System.out.println("Bose");
    }
}
class bmw extends car{
    void model(){
        System.out.println("BMW X5");
    }
    void music(){
        System.out.println("Harman Kardon");
    }
}
class tesla extends car{
    void model(){
        System.out.println("Tesla Model S");
    }
    void music(){
        System.out.println("Premium Sound System");
    }
}
class cvl extends car{
    void model(){
        System.out.println("Civic");
    }
    void music(){
        System.out.println("Bose");
    }
}
public class carabstract {
    public static void main(String[] args) {
        car myCar;

        myCar = new audi();
        myCar.model();
        myCar.music();

        myCar = new bmw();
        myCar.model();
        myCar.music();

        myCar = new tesla();
        myCar.model();
        myCar.music();

        myCar = new cvl();
        myCar.model();
        myCar.music();
    }
}