abstract class car{
    abstract void model();
    abstract void music();
    abstract void fly();
}
class audi extends car{
    void model(){
        System.out.println("Audi A6");
    }
    void music(){
        System.out.println("Bose");
    }
    void fly(){
        System.out.println("Cannot Fly");
    }
}
class bmw extends car{
    void model(){
        System.out.println("BMW X5");
    }
    void music(){
        System.out.println("Harman Kardon");
    }
    void fly(){
        System.out.println("Cannot Fly");
    }
}
class tesla extends car{
    void model(){
        System.out.println("Tesla Model S");
    }
    void music(){
        System.out.println("Premium Sound System");
    }
    void fly(){
        System.out.println("Can Fly");
    }
}
class cvl extends car{
    void model(){
        System.out.println("Civic");
    }
    void music(){
        System.out.println("Bose");
    }
    void fly(){
        System.out.println("Cannot Fly");
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