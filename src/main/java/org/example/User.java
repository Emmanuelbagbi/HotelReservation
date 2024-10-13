package org.example;
import java.util.Random;

class User extends Thread {
    private String userName;
    private Room[] rooms;
    private static Random random = new Random();

    public User(String userName, Room[] rooms) {
        this.userName = userName;
        this.rooms = rooms;
    }

    @Override
    public void run() {
        boolean roomBooked = false;

        for (int i = 0; i < rooms.length; i++) {
            int roomIndex = random.nextInt(rooms.length);
            if (rooms[roomIndex].bookRoom(userName)) {
                roomBooked = true;
                break;
            }
        }

        if (!roomBooked) {
            System.out.println(userName + " could not book a room.");
        }
    }
}