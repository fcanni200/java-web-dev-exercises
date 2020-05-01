package exercises;

import java.util.Arrays;

public class arrayPractice {
    public static void main(String[] args) {
        int[] numArray = {1, 1, 2, 3, 5, 8};

        for (int i : numArray) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        String greenEggs = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house." +
                " I will not eat them with a mouse.";

        String[] eggsSplit = greenEggs.split(" ");
        System.out.println(Arrays.toString(eggsSplit));

        String[] eggsSplitDel = greenEggs.split("\\.");
        System.out.println(Arrays.toString(eggsSplitDel));

    }
}

