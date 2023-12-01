import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        File f = new File("C:/java/Equipment.data");

        // Create a list to store equipment objects
        ArrayList<Equipment> equipmentList = new ArrayList<>();

        // Add equipment objects to the list
        equipmentList.add(new Equipment("Treadmill", "TM001", 4, "C:/Users/Dell/Desktop/GYM APPLICATION/71Oy-vLGCoL._AC_UF1000,1000_QL80_.jpg"));
        equipmentList.add(new Equipment("Rowing Machine", "RM001", 3, "C:/Users/Dell/Desktop/GYM APPLICATION/41kmOFvpQoS._AC_SL1000_.jpg"));
        equipmentList.add(new Equipment("Leg Curl", "LC001", 2, "C:/Users/Dell/Desktop/GYM APPLICATION/optimized---media_1312535_66318.jpg"));
        equipmentList.add(new Equipment("Chest Fly", "CF001", 4, "C:/Users/Dell/Desktop/GYM APPLICATION/RY1471-MAIN.webp"));
        equipmentList.add(new Equipment("Bench Press", "BP001", 6, "C:/Users/Dell/Desktop/GYM APPLICATION/PLBP-PLATELOAD-BENCH-PRESS-MACHINE-570x570-1.jpg"));
        equipmentList.add(new Equipment("Leg Press", "LP001", 3, "C:/Users/Dell/Desktop/GYM APPLICATION/PhototasticCollage-2022-12-27-16-19-32.webp"));

        // Save equipment objects to file
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(equipmentList);
            oos.close();
            fos.close();
//            System.out.println("Equipment data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while saving equipment data: " + e);
        }

        // Read equipment objects from file
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Equipment> machine = (ArrayList<Equipment>) ois.readObject();
            ois.close();
            fis.close();

            // Display equipment information
            for (Equipment equipment : machine) {
                equipment.display();

                System.out.println();
                System.out.println("    ");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error occurred while reading equipment data: " + e);
        }
    }
}