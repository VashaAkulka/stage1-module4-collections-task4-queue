package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            list.add(i);
        }

        int i = everyDishNumberToEat - 1;
        while (!list.isEmpty()) {
            if (i >= list.size()) {
                i = i % list.size();
            }

            queue.add(list.get(i));
            list.remove(i);

            i += everyDishNumberToEat - 1;
        }

        return queue;
    }
}