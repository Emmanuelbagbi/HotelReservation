package org.example;

public class HotelReservation {
    public static void main(String[] args) {
        Room[] rooms = new Room[6];
        for (int i = 0; i < 6; i++) {
            rooms[i] = new Room(i + 1);
        }

        User user1 = new User("User1", rooms);
        User user2 = new User("User2", rooms);
        User user3 = new User("User3", rooms);
        User user4 = new User("User4", rooms);
        User user5 = new User("User5", rooms);
        User user6 = new User("User6", rooms);
        User user7 = new User("User7", rooms);

        user1.start();
        user2.start();
        user3.start();
        user4.start();
        user5.start();
        user6.start();
        user7.start();

        try {
            user1.join();
            user2.join();
            user3.join();
            user4.join();
            user5.join();
            user6.join();
            user7.join();
        } catch (InterruptedException e) {
            System.out.println("User reservation process was interrupted.");
        }

    }
}