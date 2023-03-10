import java.util.Arrays;

public class Q1 {
    //عكس مصفوفه باستخدام مصفوفه اخرى

    public static void main(String[] args) {
        int M[]={11,12,13,14,15,16};
        System.out.println(Arrays.toString(M));
        reverse(M);
        System.out.println(Arrays.toString(M));


    }
    public static void reverse(int REE[]){
        int n=REE.length-1;
        for (int i = 0; i <REE.length/2 ; i++) {
            int temp=REE[i];
            REE[i]=REE[n];
            REE[n]=temp;
            n--;
        }
    }



}
