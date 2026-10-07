public class commandllinedemo {
    public static void main(String[] args) {
        // Displays the total count of arguments
        System.out.println("Number of arguments = " + args.length);

        // Loops through the array to display each argument and its index
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}
