import java.security.Key;
import java.util.Scanner;
public class Hotel {
    private Room[] rooms;
    public static String currentUser;

    public Hotel(int roomCount, String name) {
        currentUser = name;
        rooms = new Room[roomCount];

    }

    public void reserveRoom(Scanner Keyboard, int roomCount) {
        System.out.println("What room number would you like to reserve?");
        int userRoomNumber = Keyboard.nextInt();
        if ( userRoomNumber < roomCount) {
            System.out.println("This room number does not exist");
            System.out.println();
        } else if ( userRoomNumber >= roomCount) {
            for (Room room : rooms) {
                if ( userRoomNumber == userRoomNumber) {
                    System.out.println(rooms[userRoomNumber]);
                    room.reserved(currentUser);
                    break;
                }
            }
        }
    }

    public void unReserveRoom(Scanner Keyboard, int roomCount) {
        System.out.println("What room number would you like to reserve?");
        int userRoomNumber = Keyboard.nextInt();
        if ( userRoomNumber < roomCount) {
            System.out.println("This room number does not exist");
            System.out.println();
        } else if ( userRoomNumber >= roomCount) {
            for (Room room : rooms) {
                if ( userRoomNumber == userRoomNumber) {
                    System.out.println(rooms[userRoomNumber]);
                    room.unreserved(currentUser);
                    break;
                }
            }
        }
    }

    public void viewRooms(){
        for (Room room : rooms) {
            System.out.println(room);
            System.out.println();
        }
    }

    public void updateName(Scanner keyboard){
        System.out.println("What is your name?");
        currentUser = keyboard.nextLine();
    }
}




