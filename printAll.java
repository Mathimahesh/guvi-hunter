import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int k =0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                 k = a[i]+a[j];
                // System.out.println(k);
                for(int s=0;s<a.length;s++){
                    if(k==a[s]){
                        System.out.println(a[i]+" "+a[j]+" "+k );
                    }
                }
               }
            }
        }
}
