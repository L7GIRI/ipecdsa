public class q4 {

    public static int[] prefix_sum(int[] arr){
        int prefix[]= new int [arr.length];
        prefix[0]=arr[0];
        for ( int i=1;i<=arr.length-1;i++){
            prefix[i]= prefix[i-1] + arr[i];
            
        }
        
        return prefix;

    }

    public static void main(String[] args) {
        int [] arr= new int[5];
        arr =new int[]{3,4,5,7,8,7};
        int [] a1=prefix_sum(arr);
        for (int i=0;i<a1.length;i++){
            System.out.print(a1[i] + " ");
        }
    }


    
}
