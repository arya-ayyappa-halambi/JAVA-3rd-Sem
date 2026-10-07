class privateexample{
    private int a=10;
    void display(){
        System.out.println("Value of a: " +a);
    }
}
public class privatedemo{
    public static void main(String[] arg){
        privateexample obj=new privateexample();
        obj.display();
        obj.a=20; 
    }
}