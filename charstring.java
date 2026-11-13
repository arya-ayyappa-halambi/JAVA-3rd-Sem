public class charstring {
    public static void main(String[] args) {
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        for(int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
        }
        String str = new String(charArray);
        String str2 = str;
        System.out.println("String created from char array: " + str);
        System.out.println("str2: " + str2);
    }

}
