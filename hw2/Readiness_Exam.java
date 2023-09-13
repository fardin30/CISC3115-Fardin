public class Readiness_Exam {
public static void main(String[]args){

}

public int m1(int[]arr){
    int sum=0;
    for (int i=0;i<arr.length;i++){
        if (arr[i]>i && arr[i]%9==0){
            sum+=arr[i];
        }
    }
    return sum;
}

public int m2(double[] arr) {
    int maxIndex = 0;
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > arr[maxIndex]) {
            maxIndex = i;
        }
    }
    return maxIndex;
}
public int m3(double[] arr, double x) {
    int count = 0;
    for (double value : arr) {
        if (value == x) {
            count++;
        }
    }
    return count;
}
//////////P1
   /*
   import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Enter the number of double values to be input:");
        int header = scnr.nextInt();

        // Assuming there's at least one value after reading the header.
        double min = scnr.nextDouble();

        for (int i = 1; i < header; i++) {
            System.out.println("Enter value " + (i + 1) + ":");
            double value = scnr.nextDouble();
            if (value < min) {
                min = value;
            }
        }
        
        System.out.println("The smallest value is: " + min);
        
        scnr.close();
    }
}

    } */



////////P2
/*import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int negativeCount = 0;

        while (scnr.hasNextInt()) {
            int number = scnr.nextInt();

            if (number == 0) {
                System.out.print(negativeCount + " ");
                negativeCount = 0; 
            } else if (number < 0) {
                negativeCount++;
            }
        }

        scnr.close();
    }
}
 */
}