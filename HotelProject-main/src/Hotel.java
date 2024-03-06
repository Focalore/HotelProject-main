import java.security.Key;
import java.util.Scanner;
public class Hotel {
    private Room[] rooms;
    public String currentUser;

    public Hotel(int roomCount, String name) {
        currentUser = name;
        rooms = new Room[roomCount];
        for(int i = 0; i < roomCount; i++){
            rooms[i] = new Room(i+1);
        }
    }

    public void reserveRoom(Scanner Keyboard) {
        System.out.println("What room number would you like to reserve?");
        int userRoomNumber = Keyboard.nextInt();
        if ( userRoomNumber > rooms.length) {
            System.out.println("This room number does not exist");
            System.out.println();
        } else {
            for (Room room : rooms) {
                if ( userRoomNumber == room.number) {
                    room.reserved(currentUser);
                    break;
                }
            }
        }
    }

    public void unReserveRoom(Scanner Keyboard) {
        System.out.println("What room number would you like to un-reserve?");
        System.out.println();
        int userRoomNumber = Keyboard.nextInt();
        if ( userRoomNumber > rooms.length) {
            System.out.println("This room number does not exist");
            System.out.println();
        } else {
            for (Room room : rooms) {
                if ( userRoomNumber == room.number) {
                    room.unreserved(currentUser);
                    break;
                }
            }
        }
    }

    public void viewRooms(){
        for (Room room : rooms) {
            room.printInfo();
        }
    }

    public void updateName(Scanner keyboard){
        System.out.println();
        System.out.println("What is your name?");
        System.out.println();
        currentUser = keyboard.nextLine();
    }
}




