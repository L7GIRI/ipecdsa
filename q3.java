//reverse an array
public class q3 {
    //2 array approach
    
    public static int[] revarr1(int[] l1){
    int temp[] = new int[l1.length];

    for(int i = 0; i < l1.length; i++){
        temp[i] = l1[l1.length - 1 - i];
    }

    return temp;
}

    //by swaping 
    public static int[] revarr2(int[] l1){
    int p1 = 0;
    int p2 = l1.length - 1;

    while (p1 < p2){
        int temp = l1[p1];
        l1[p1] = l1[p2];
        l1[p2] = temp;

        p1++;
        p2--;
    }

    return l1;
}


    public static void main(String[] args) {

        int[] arr = {2, 4, 8, 12, 16};

        int[] rev1 = revarr1(arr);
        int[] rev2 = revarr2(arr);

        for(int i : rev1)
            System.out.print(i + " ");

        System.out.println();

        for(int i : rev2)
            System.out.print(i + " ");
    }
    
}
