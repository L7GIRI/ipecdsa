public class q2 {
    
    
        public static int subtractProductAndSum(int n) {
            int sum=0;
            int product=1;
            while (n!=0){
                int a = n%10;
                sum = sum +a ;
                product = product * a;
                n=n/10;
            }
            int x=product-sum;
            return x;
            
        }
    
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4343));
    }

}
