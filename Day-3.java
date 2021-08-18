/*
 
Final

- Final is the keyword and access modifier which is used to apply restictions on a class, methode or variable.

- Final keyword is used with the classes, methods and variables.

- (1) Once declared, final variable becomes constant and cannot be modified.
- (2) Final method cannot be overridden by sub class.
- (3) Final class cannot be inherited.

- Final method is executed only when we call it.

Finally

- Finally is the block in java exception handling to execute the important code whether the exception occurs or not.

- Finally block is always related to the try and catch block in exception handling.

- (1) Finally block runs the important coad even if exception occurs or not.
- (2) Finally block cleans up all the resources used in try block.

- Finally block is executed as soon as try catch block is executed.
it's execution is not dependant on the exception.

Finalize

- Finalize is the method in java which is used to perform clean up processing just before object is garbage collected.

- Finalize method is used with the objects.

- Finalize methode performs the cleaning activities with respect to the object before its destruction.

- Finalize method is executed just before the object is destroyed.

*/
                                                                                  

//Mini project : Cab Fare Calculation
import java.util.Scanner;


public class RideCab {
    public static void main(String[] args) {
        int cd; //distance of cab from user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance of cab from you : ");
        cd = sc.nextInt();
        if(cd > 5){
            Cab ob = new Cab(50 + 10 *(cd-5));
            System.out.print("Enter the distance travelled : ");
            ob.d = sc.nextInt();
            ob.fare += 10 * ob.d;
            System.out.println("Total fare Rs: "+ ob.fare);

        }
        else{
            Cab ob = new Cab();
            System.out.print("Enter the distance travelled : ");
            ob.d = sc.nextInt();
            ob.fare += 10 * ob.d;
            System.out.println("Total fare Rs: "+ ob.fare);

        }
        
    }
}

class Cab{
    int fare;
    int d;
    Cab(){
        fare = 50;
    }

    public Cab(int amt){
      fare = amt;
    }
}

    