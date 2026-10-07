import java.util.Scanner;
class student{
    static int count=0;
    student(){
        count++;
    }
    static int getCount(){
        return count;
    }
}
public class staticdemo{
    public static void main(String[] args)
    {   Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n=sc.nextInt();
        student[] s=new student[n];
        for(int i=0;i<n;i++)
        {
            s[i]=new student();
        }
        System.out.println("Total students created: " + student.getCount());
    }
}