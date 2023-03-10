public class Q2 {
    public static void main(String[] args) {
        //نسخ مصفوفه الى مصفوفه اخرى


        int ar[]=new int[]{1,2,3,4,5};
        int ar2[]=new int[ar.length];

        for (int i = 0; i <ar.length ; i++) {
            ar2[i]=ar[i];
        }



        //print
        System.out.println("array1=");
        for (int i = 0; i <ar.length ; i++) {
            System.out.println(ar[i]+" ");
        }
        System.out.println("array2=");
        for (int i = 0; i <ar2.length ; i++) {
            System.out.println(ar2[i]+" ");
        }


    }


    }

