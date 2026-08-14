import java.util.*;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.next();
        String string2 = sc.next();
        
        int tot_len = string1.length() + string2.length();
        System.out.println(tot_len);
        
        if(string1.compareTo(string2)>0) {
            System.out.println("Yes");
        
        }
        else {
            System.out.println("No");
        }
        String res1 = string1.substring(0,1).toUpperCase() + string1.substring(1);
        String res2 = string2.substring(0,1).toUpperCase() + string2.substring(1);
        System.out.println(res1 + " " + res2);
        sc.close();
    }
}
