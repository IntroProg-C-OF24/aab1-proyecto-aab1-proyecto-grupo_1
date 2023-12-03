import java.util.Random;
import java.util.Scanner;
public class Propuesta_1 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner dato= new Scanner(System.in);
        double noteACD, noteAPE, noteAA,total,percentApp,percentRep;
        String name,condition;
        int ced,contApp=0,contRep=0;
        do {
            System.out.println("Enter the name of the Student");
            name=dato.next();
            System.out.println("Enter the ID Student");
            ced=dato.nextInt();
            System.out.println("Bimonthly notes");
            noteACD=random.nextInt(10)+1;
            noteAPE=random.nextInt(10)+1;
            noteAA=random.nextInt(10)+1;
            total=(noteACD+noteAPE+noteAA)/3;
            System.out.println("Total Note: "+total);
            System.out.println("--------//REPORT//--------");
            System.out.println("--NOTES FOR BIMONTHLY--");
            System.out.println("Note ACD: "+noteACD);
            System.out.println("Note APE: "+noteAPE);
            System.out.println("Note AA: "+noteAA);
            if (total>=7) {
                System.out.println("Name Student: "+ name + " with ced: "+ced +" is APPROVED");
                contApp++;
            }else{
                System.out.println("Name Student: "+ name + "with ced:a "+ced +" is NOT APPROVED");
                contRep++;
            }
            System.out.println("______________________________________");
            System.out.println("Do you want to enter one more student?");
            condition=dato.next().toLowerCase();
        } while (("s").equals(condition));
        percentApp=((contApp*100)/(contRep+contApp));
        percentRep=((contRep*100)/(contRep+contApp));
        System.out.println("______________________________________________");
        System.out.println("The percentage of students approved is: "+percentApp+"%");
        System.out.println("The percentage of students not approved is: "+percentRep+"%");
        /*
Enter the name of the Student: a
Enter the ID Student: 1
--------//REPORT//--------
--NOTES FOR BIMONTHLY--
Note ACD:  5
Note APE:  10
Note AA:  8
Total Note:  7.666666666666667
Student is approved for next semester.
______________________________________
Do you want to enter one more student?s
Enter the name of the Student: b
Enter the ID Student: 2
--------//REPORT//--------
--NOTES FOR BIMONTHLY--
Note ACD:  8
Note APE:  8
Note AA:  9
Total Note:  8.333333333333334
Student is approved for next semester.
______________________________________
Do you want to enter one more student?s
Enter the name of the Student: c
Enter the ID Student: 3
--------//REPORT//--------
--NOTES FOR BIMONTHLY--
Note ACD:  1
Note APE:  8
Note AA:  3
Total Note:  4.0
Student is not approved for next semester.
______________________________________
Do you want to enter one more student?s
Enter the ID Student: 4
--------//REPORT//--------
--NOTES FOR BIMONTHLY--
Note ACD:  9
Note APE:  9
Note AA:  2
Total Note:  6.666666666666667
Student is not approved for next semester.
Do you want to enter one more student?n
______________________________________________
The percentage of students approved is:  50.0 %
The percentage of students not approved is:  50.0 %
         */
    }
}
