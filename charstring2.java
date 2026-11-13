public class charstring2 {
    public static void main(String[] args) {
        char[] charArray = {'H', 'e', 'l', 'l', 'o',' ','w','o','r','l','d'};
        String str = new String(charArray, 2, 5);
        String str2 = str;
        System.out.println("String created from char array: " + str);
        System.out.println("str2: " + str2);
    }

}
