package Array;

public class secondMax {
    public static void main(String[] args){
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 1;
        // int max = Integer.MIN_VALUE;
        // int smax = Integer.MIN_VALUE;
        // for(int i = 0; i < 5; i++){
        //     if(arr[i] > max){
        //         max = arr[i];
        //     }
        // }
        // for(int i = 0; i < 5; i++){
        //     if(arr[i] != max && smax < arr[i]){
        //         smax = arr[i];
        //     }
        // }
        // System.out.println(max);
        // System.out.println(smax);
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int maxIndex = 0;
        for(int i = 0; i < 5; i++){
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }
        for(int i = 0; i < 5; i++){
            if(arr[i] != maxIndex && smax < arr[i]){
                smax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
