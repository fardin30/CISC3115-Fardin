import java.util.Scanner;

public class ImmutableObject{
    public static void main (String[]args){
        float fahrenheit;
        float centigrade;
        fahrenheit=98.6f;

        centigrade=(fahrenheit-32f) * (5.0f/9.0f);

        System.out.println("Fahrenheit: "+fahrenheit+"° F");
        System.out.println("Celcius: "+ centigrade+"° C");

        for (float i=0.0f; i<=40.0f;i+=4.0f){           //Conversion algorithm via for loop
            centigrade=(i-32.0f) * (5.0f/9.0f);
            System.out.println("For Fahrenheit value "+i+"° F "+"Centigrade value is: "+centigrade+"° C");
        }

        System.out.println();                           //Spacing
        System.out.println();                           // Spacing
            
        float F=0.0f;
        while (F<=40.0f){                              // Conversion algorithm via while loop
            centigrade=(F-32.0f) * (5.0f/9.0f);
            System.out.println("For Fahrenheit value "+F+"° F "+"Centigrade value is: "+centigrade+"° C");
            F+=4.0f;
        }
        StopChecking();                                 //In place for debugging
    }

    public static void StopChecking (){
      String Cars[]={"BMW","Ferrari","Lambo"};
      String Food[]={"pizza","burger","dumpling"};

      String myArray[][]={Cars,Food};
      String isin;
      String inputwords;

      Scanner stdin= new Scanner(System.in);

      while (true){
      System.out.println("Enter a word");
      inputwords=stdin.nextLine();

      if (inputwords.equals("STOP")){
        break;
      }

      boolean isPresent=false;
      for (int i=0;i<myArray.length;i++){
        for (int j=0;j<myArray[i].length;j++) {
            if(myArray[i][j].equals(inputwords)){
                isPresent=true;
                break;
            }
      }
      }
      if(isPresent){
        isin="True";
        System.out.println(inputwords + " is in the 2D array.");
      }
      else{
        isin="False";
        System.out.println(inputwords+ " is not in the 2D array.");
      }
    }
    stdin.close();
}
}