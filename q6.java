class q6 {  // first occurance

    public static int firstocc(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if (arr[i]==target){
                return i;
            }

        }
        return 0;

    }
    public static void main(String[] args) {
        int [] arr= new int[7];
        arr =new int[]{3,4,5,7,8,7,5,4};
        System.out.println(firstocc(arr, 5));


    }
}
