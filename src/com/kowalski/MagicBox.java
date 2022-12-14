package com.kowalski;

import java.util.Random;

public class MagicBox <T> {

    private int quantity;
    private T[] items;
    private Random random = new Random();

    public MagicBox(int quantity) {
        this.quantity = quantity;
        this.items = (T[]) new Object[quantity];
    }

    public boolean add(T item) {
        boolean isAdd = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                isAdd = true;
                break;
            }
        }
        return isAdd;
    }

    public T pick(){
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null){
                int needAdd = items.length - i;
                throw new RuntimeException ("It is necessary to fill the box! Add " + needAdd + ((needAdd > 1) ? " more items" : " more item"));
            }
        }
        return items[random.nextInt(items.length)];
    }
}