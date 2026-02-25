import java.util.Scanner;

public class q5 {

    public static int[] prefix_sum(int[] arr){
        int prefix[]= new int [arr.length];
        prefix[0]=arr[0];
        for ( int i=1;i<=arr.length-1;i++){
            prefix[i]= prefix[i-1] + arr[i];
        }
        return prefix;
    }


    public static int sumarr(int[] arr1, int L, int R){
        if(L==0){
            return arr1[R];
        }
        return (arr1[R] - arr1[L-1]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements u want in array");
        int n= sc.nextInt();

        int [] arr= new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the left side");
        int L = sc.nextInt();
        System.out.println("enter the right side");
        int R = sc.nextInt();

        int [] a1=prefix_sum(arr);

        
        
        for (int i=0;i<a1.length;i++){
            System.out.print(a1[i] + " ");
        }

        System.out.println("Range Sum = " + sumarr(a1,L, R));
    }

}
