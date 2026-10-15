class a{
    private int x=10;
    void display(){
        System.out.println("Value of x(a): "+x);
    }
}
class b extends a{
    void display(){
        System.out.println("Value of x(b): "+x);
    }
}
public class privateinherited{
    public static void main(String args[]){
        a obj1 = new a();
        b obj2 = new b();
        obj1.display();
        obj2.display();
    }
}