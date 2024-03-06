import java.util.Scanner;
public class Room {
    Scanner keyboard = new Scanner(System.in);
    public String owner;
    public int number;
    public boolean reserved;
    public Room(int roomNumber) {
        owner = "N/A";
        number = roomNumber;
        reserved = false;
    }
    public void reserved(String newOwner) {
        {
            if (reserved) {
                System.out.println("This room is already reserved,");
                return;
            }
            reserved = true;
            owner = newOwner;
            System.out.println("your reservation is complete, enjoy your stay in room " + number);
        }
    }
    public void unreserved(String newOwner) {
            if (reserved) {
                System.out.println("Would you like to un-reserve this room?");
                System.out.println("Y/N");
                String userAnswer = keyboard.next();
                if (userAnswer.equalsIgnoreCase("y")) {
                    if (owner.equals(newOwner)) {
                        owner = "N/A";
                        reserved = false;
                        System.out.println("This room has been un-reserved");
                        return;
                        } return;
                    }
                System.out.println("You do not own this room.");
                return;
                }
            System.out.println("This room is not reserved and therefor can not be un-reserved.");
            return;
            }
    public void printInfo() { //TODO FORMATTING
        System.out.print("Room number " + number + " Room owner " + owner + " Resereved? " + reserved );
    }
}