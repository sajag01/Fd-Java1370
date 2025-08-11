import java.util.*;

public class alphabet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        while(ch <= 'z')
        {
            System.out.print(ch);
            System.out.print(" ");
            ch++;
        }
    }
}
