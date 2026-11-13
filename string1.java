import java.lang.String;
import java.util.Scanner;
public class string1 {
    public static void main(String[] args) {
        String str1= new String();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str1 = scanner.nextLine();
        System.out.println("You entered: " + str1);
        scanner.close();
        String str2= new String();
        str2=str1;
        System.out.println("str2: " + str2);
        if(str1.equals(str2)){
            System.out.println("str1 and str2 are equal");
        }
        str2 = "Hello, World!";
        System.out.println("str2: " + str2);
        if(!str1.equals(str2)){
            System.out.println("str1 and str2 are not equal");
        }
        String str3="arya";
        System.out.println("str3: " + str3);
        try{
            str3="Hello, World!";
            System.out.println("str3: " + str3);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }

    }

    

