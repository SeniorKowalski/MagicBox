package com.kowalski;

public class Main {

    public static void main(String[] args) {
	    MagicBox <String> box = new MagicBox<>(3);

        box.add("Rock");
        box.add("Paper");
        box.add("Scissors");
        System.out.println(box.add("Scissors2"));

        for (int i = 0; i < 5; i++) {
            System.out.println(box.pick());
        }

        MagicBox <Integer> rndm = new MagicBox<>(7);

        for (int i = 0; i < 7; i++) {
            rndm.add(i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(rndm.pick());
        }
    }
}
