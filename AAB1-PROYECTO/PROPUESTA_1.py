import random
contApp=int (0)
contRep=int (0)
condition=str("s")
while condition== "s" or condition=="si":
    name = str (input ("Enter the name of the Student: ")) 
    ced = int (input ("Enter the ID Student: "))
    noteACD=random.randint(1,10)
    noteAPE=random.randint(1,10)
    noteAA=random.randint(1,10)
    total = float((noteAPE+noteAA+noteACD)/3) 
    print("--------//REPORT//--------")
    print("--NOTES FOR BIMONTHLY--");
    print("Note ACD: ",noteACD);
    print("Note APE: ",noteAPE);
    print("Note AA: ",noteAA);
    print("Total Note: ", total)
    if(total>=7):
        print("Student is approved for next semester.")
        contApp=contApp+1
    else:
        print("Student is not approved for next semester.")
        contRep=contRep+1
    print("______________________________________")
    condition = input("Do you want to enter one more student?").lower()
percentApp=float((contApp*100)/(contApp+contRep))
percentRep=float((contRep*100)/(contApp+contRep))
print("______________________________________________");
print("The percentage of students approved is: ",percentApp,"%");
print("The percentage of students not approved is: ",percentRep,"%");
