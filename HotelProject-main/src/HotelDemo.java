import java.util.Scanner;
public class HotelDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = keyboard.next();
        System.out.println();
        System.out.println("How many rooms would you like this Hotel to have?");
        int hotelRoomCount = keyboard.nextInt();
        System.out.println();
        Hotel hotel = new Hotel(hotelRoomCount, name);

        while (true){
            System.out.println(
                    """
MENU
---------
1: View all rooms.
2: Reserve a room.
3: Un-reserve a room.
4: Change current user.
5: Exit simulation.
Choice:
                """);
            int userInput = keyboard.nextInt();
            System.out.println();
            if (userInput == 1){
                hotel.viewRooms();
            }
            else if (userInput == 2){
                hotel.reserveRoom(keyboard);
            }
            else if (userInput == 3){
                hotel.unReserveRoom(keyboard);
            }
            else if (userInput == 4){
                hotel.updateName(keyboard);
            }
            else if (userInput == 5){
                break;
            }
            else {
                System.out.println("This is not an option...");
            }
        }
    }
}
