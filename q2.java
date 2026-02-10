public class q2 {
    
    public int reverse(int x) {
        int ans=0;
        while( x>0){
            int y=x%10;
            ans= ans*10 +y;
            x=x/10;
        }
        System.out.println("ans");

        
        

        
        
    }
}
