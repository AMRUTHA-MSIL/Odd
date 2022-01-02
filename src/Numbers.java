import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner t = new Scanner(System.in);
        String x = t.nextLine();
        char[]array = x.toCharArray();
        int y = 0;
        double q;
        int z = 0,j=0,k=0,counter =0,counter2 = 0;
        boolean isodd=false;
        for(int i = 0;i <= array.length - 1;i ++ ) {
            if (array[i] % 2 == 0) {
                counter++;
               y = y + Character.getNumericValue(array[i]);
                j++;

            } else {
                counter2++;
                z = z + Character.getNumericValue(array[i]);
                k++;

            }

        }

        if(counter >= counter2)
        {
          isodd=false;
            System.out.println("number is even");
            System.out.println("sum is:"+y);
        }
        else
        {
            isodd=true;
            System.out.println("its odd" + z);
            System.out.println("sum is"+z);
        }
        if(isodd){
            q=z/y;
            System.out.println("value is:" + q);

        }else{
            q=y/z;
            System.out.println("value is:" + q);
        }
        if(q>z){
           System.out.println(q+"  largest number") ;
        }else{
            System.out.println(z+" is largest number");
        }

    }
}