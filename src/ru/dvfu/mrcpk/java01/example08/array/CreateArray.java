package ru.dvfu.mrcpk.java01.example08.array;

public class CreateArray {
    public static void main(String[] args) {

        int[] price = new int[10];

        int[] rooms = new int[]{ 4,8,9};

        for (int i = 0; i < rooms.length; i++) {
            System.out.println("rooms[" + i +"] =" + rooms[i]);
        }
    }
}

