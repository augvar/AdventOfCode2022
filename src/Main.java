
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menu();
        File file = new File("input.txt");

        StringBuilder content = new StringBuilder();
        String[] gnomes;
        ArrayList<Integer> foodlist = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String st;

            while ((st = br.readLine()) != null) {
                content.append(st).append("\n");
            }

            gnomes = content.toString().split("\n");
            int currentSum = 0;

            for (String gnome : gnomes) {
                if (!gnome.isEmpty()) {
                    int value = Integer.parseInt(gnome);
                    currentSum += value;
                } else {
                    foodlist.add(currentSum);
                    currentSum = 0;
                }
            }
            Collections.sort(foodlist);

            System.out.println("Highest value: " + foodlist.get(foodlist.size() - 1));

            int top3 = foodlist.get(foodlist.size() - 1) + foodlist.get(foodlist.size() - 2) + foodlist.get(foodlist.size() - 3);

            System.out.println("Three highest values combined: " + top3);


        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());

        }
    }
}