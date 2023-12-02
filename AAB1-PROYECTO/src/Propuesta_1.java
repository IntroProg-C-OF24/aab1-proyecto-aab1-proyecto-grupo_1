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
                System.out.println("Name Student: "+ name + "with ced: "+ced +" is NOT APPROVED");
                contRep++;
            }
            System.out.println("______________________________________");
            System.out.println("Do you want to enter one more student?");
            condition=dato.next().toLowerCase();
        } while (("s").equals(condition));
        percentApp=((contApp*100)/(contApp+contRep));
        percentRep=((contApp*100)/(contApp+contRep));
        System.out.println("______________________________________________");
        System.out.println("The percentage of students approved is: "+percentApp+"%");
        System.out.println("The percentage of students not approved is: "+percentRep+"%");
    }
}
