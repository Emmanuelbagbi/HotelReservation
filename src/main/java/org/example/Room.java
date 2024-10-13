package org.example;

class Room {
    private int roomNumber;
    private boolean isBooked;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isBooked = false;
    }

    public synchronized boolean bookRoom(String userName) {
        if (!isBooked) {
            isBooked = true;
            System.out.println(userName + " successfully booked Room " + roomNumber);
            return true;
        } else {
            return false;
        }
    }
    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }
}

