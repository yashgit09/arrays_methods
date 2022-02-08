  /*Name: Yash Kelkar
  Student number: A00242148
  Program description: JAV-1001 - 11329 - App Development for Android 
  Lab - 1 Variable and logic  */

  // importing java scanner to read user input
  import java.util.*;

  public class Arrays{


    public static void main(String[] args){

        // Creating a Scanner object 
        Scanner scan = new Scanner(System.in);

        while(true){

         //asking user to input which thing he/she wants to run
           System.out.println("Enter 1: For Ceaser Cipher, 2: For Average of an array, 3: For Array Contains, 4: For Reverse of an array, and 5: For Exit");

           String userInitialInput = scan.next();

         //checking what user has inserted and then calling method accordingly  
           if(userInitialInput.equals("1")){ 

               String userInput="";
               String userKey= "";
               int userKeyInt= 0;

               System.out.println("Enter a string you want to encrypt");
               userInput = scan.next();

               System.out.println("Enter a key (shift value)"); 
               while(true){

                userKey = scan.next(); 
                  // try and catch to convert - string to Integer
                try 
                {
                  userKeyInt = Integer.valueOf(userKey);
                  break;
              } catch(Exception e){
                  System.out.println("You've entered " + userKey + " which is not a number, please enter a valid positive number.");              
              }

          }

           //calling encrypt method to encrypt the string
          String encryptedString = encrypt(userInput, userKeyInt);
          System.out.println("Encrypted String is "+ encryptedString);

          //calling encrypt method again with same negative key to decrypt the encrypted string
          String decryptedString = encrypt(encryptedString, ((-1)*userKeyInt));
          System.out.println("Decrypted String is "+ decryptedString);

      }

      else if (userInitialInput.equals("2")){    
          double average = average();
          System.out.println("Average of array is "+ average);
      }
      else if (userInitialInput.equals("3")){ 
          arrayContains();
      }
      else if (userInitialInput.equals("4")){ 
         arrayReverse();
     }
     else if (userInitialInput.equals("5")){ 
        break;
    }
    else {
        System.out.println("Enter input only 1,2,3,4 or 5");
    }

    
}
}

//ceaser cipher (encrypt) method
static String encrypt (String userInput, int key){

  //character array storing sequence of characters from string 
 char [] chars = userInput.toCharArray();

   //declaring result
 String result="";

   //foreach loop iterating chars as c
 for(char c : chars){
    c += key;    //shifting characters
    result = result+c;
}
return result;  //returning encrypted string

}

//array average method
static double average (){

   // Creating a Scanner object
 Scanner scan1 = new Scanner(System.in);
 int n;

 System.out.println("Enter the number of integers you want in the array");
 n = scan1.nextInt();
   Integer [] array = new Integer[n];   //initializing array
   System.out.println("Enter " + n +" elements in array one by one");
   double sum = 0;
   double avg = 0;

   //  
   for(int i=0;i<n;i++){
    array[i]=scan1.nextInt(); //taking values from user
    sum+=array[i]; //adding the values 
    avg=sum/n; //taking average
}
return avg;

}


//array contains method
static void arrayContains (){

   // Creating a Scanner object
 Scanner scan2 = new Scanner(System.in);
 int n;
 int element;
 int count=0;


 System.out.println("Enter the number of integers you want in the array");
 n = scan2.nextInt();

   Integer [] array = new Integer[n]; //initialized array
   System.out.println("Enter " + n +" elements in array one by one");

   //taking values from user
   for(int i=0;i<n;i++){
    array[i]=scan2.nextInt();   
}
System.out.println("Array elements: ");
for(int i=0;i<n;i++){
    System.out.println(array[i]+" ");
}
//finding elemt in array using loop
System.out.println("Enter search element ");
element = scan2.nextInt();
for(int i=0;i<n;i++){
   if(array[i]==element){
    count++;   
}
}
if(count>0){
 System.out.println("Element "+element+" found");
 count=0;
}
else{
    System.out.println("Element not found");
}

}


//array reverse method
static void arrayReverse (){

 Scanner scan3 = new Scanner(System.in);
 int n;

 System.out.println("Enter the number of integers you want in the array");
 n = scan3.nextInt(); 
   Integer [] array = new Integer[n]; //initialized array
   System.out.println("Enter " + n +" elements in array one by one");

 //taking values from user
   for(int i=0;i<n;i++){
    array[i]=scan3.nextInt();   
}
System.out.print("Array is: ");
for(int i=0;i<n;i++){
    System.out.print(array[i]+" ");
    
}
System.out.println("");
System.out.print("The Reversed Array is: ");
//reversing array using loop
for(int i=array.length-1;i>=0;i--){
   System.out.print(array[i]+" "); 
}
System.out.println("");

}

}








