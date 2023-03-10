import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        int[] arr= new int[]{1, 2, 3, 4, 5};
        removeElement(arr);
    }
public static  void removeElement( int[] arr){
    Random r=new Random();
    while (arr.length > 0) {
        int index=r.nextInt(arr.length);
        System.out.println("index= "+ index+"  element= "+ arr[index]);
        int[] arr2=new int[arr.length-1];
        for (int i = 0; i <index ; i++)
            arr2[i]=arr[i];
            for (int i =index ; i <arr.length-1 ; i++)
                arr2[i]=arr[i+1];
                arr=arr2;

        }
    }
}

