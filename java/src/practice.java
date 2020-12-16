import java.util.*;
public class practice {
    public static void main (String args) {
        int numbers = 5;
        String names = "Muaaz";
        int adds = 5 + 6;
        int multiply = 3 * 4;
        multiply--;
        double decimal = 334.4 + 3232.6;
        int remainder = 5 % 2;
        int sum = 15;
        sum += 10;
        String escapingQuotes = "Aan said,\"peter is learing java\".";
        String concat = "Hey ";
        concat += " this is muaaz";
        String extra = " I always wanted to be a cricketer ";
        extra += " but i skipped that for few months ";
        String Str = " great ";
        String Str1 = " learning to code is ";
        Str1 += Str;
        String FirstName = "Muaaz";
        char FirstLetter = FirstName.charAt(0);
        char LastLetter = FirstName.charAt(FirstName.length() -1);
        String[] myArray = {"peanut butter", "bread"};
        String[][] multidimensionalArray = {{"peanut"}, {"butter"},{"bat"},{"alhumdulillah"}};
        int[] age = {23,45,67};
        age[0] = 12;
        int x = 121;
        int rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        System.out.println(rev);
        int [] arr123 = {-1,-1};
        arr123[0] = 3;

//        String s = "who are you man";
//        s.charAt(8) = 'A';
//        System.out.println(s);
        System.out.println(Arrays.toString(arr123));
        System.out.println(Arrays.toString(age));
        System.out.println(Arrays.deepToString(multidimensionalArray));
        System.out.println(LastLetter);
        System.out.println(Arrays.toString(myArray));
        System.out.println(FirstLetter);
        System.out.println(Str1);
        System.out.println(extra);
        System.out.println(concat);
        System.out.println(escapingQuotes);
        System.out.println(sum);
        System.out.println(remainder);
        System.out.println(decimal);
        System.out.println(multiply);
        System.out.println(numbers);
        System.out.println(adds);
        System.out.println(names);
    }
}
