import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int val1 = 0,val2 = 0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]+a[j]==0){
                    val1 = a[i];
                    val2 = a[j];
                    break;
                }
            }
        }
        System.out.println(val1+" "+val2);
        
    }
}
