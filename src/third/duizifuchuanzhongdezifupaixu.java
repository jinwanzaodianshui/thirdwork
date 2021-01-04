package third;
import java.util.Scanner;
public class duizifuchuanzhongdezifupaixu {
	public static void main(String[] args){
        System.out.print("Enter a string:");
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        str = sort(str);
        System.out.println("The sorted string is " + str);
    }

    public static String sort(String s){
        char[] chs = s.toCharArray();
        java.util.Arrays.sort(chs);
        String result = String.valueOf(chs);
        return result;
    }
}
