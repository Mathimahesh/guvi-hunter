import java.util.*;
public class MyClass {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int x = sc.nextInt();
     ArrayList list = new ArrayList();
     for(int i=0;i<n;i++){
         list.add(sc.nextInt());
     }
     Collections.sort(list,Collections.reverseOrder());
     System.out.println(list.get(x-1));
        
    }
}
