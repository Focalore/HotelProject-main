import java.util.Scanner;
public class HotelDemo {
    public void userStart(Scanner keyboard){
        System.out.println("What is your name?");
        String name = keyboard.next();
        System.out.println("How many rooms would you like this Hotel to have?");
        int hotelRoomCount = keyboard.nextInt();
        System.out.println();

    }
    public void hotelRun(Scanner keyboard){
        while (true){
            System.out.println(
                """
                MENU
                ---------
                1: View all rooms.
                2: Reserve a room.
                3: Unreserve a room.
                4: Change current user.
                5: Exit simulation.
                Choice: \n
            """);
            int userInput = keyboard.nextInt();
                if (userInput == 1){
                    Hotel.viewRooms();
                }if (userInput == 2){
                    Hotel.reserveRoom();
                }if (userInput == 3){
                    Hotel.unReserveRoom();
                }if (userInput == 4){
                    Hotel.updateName();
                }if (userInput == 5){
                    break;
                }
                System.out.println("This is not an option...");
                return;
        }
    }
}
