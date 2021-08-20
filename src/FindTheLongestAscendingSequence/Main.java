package FindTheLongestAscendingSequence;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input string");
        System.out.println(showArraylist(sortUp(input.nextLine())));
    }

    public static ArrayList<Character> sortUp(String string) {
        ArrayList<Character> subString = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            ArrayList<Character> list = new ArrayList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.get(list.size() - 1))
                    list.add(string.charAt(j));
            }
            if (list.size() > subString.size())
                subString = list;
        }
        return subString;
    }

    public static String showArraylist(ArrayList<Character> arr) {
        String string = "";
        for (Character e : arr) {
            string += e;
        }
        return string;
    }
}
