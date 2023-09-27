public class example1 {
    //Example 1:   Put "*" between 2 consecutive characters and to the end in a String.
    //             For example -> Hello ==> H*e*l*l*o*

    public static void main(String[] args) {

        String str = "Deniz";
        for (int i = 0; i < str.length(); i++) {

            System.out.print(str.charAt(i) + "*");

        }
    }
}
