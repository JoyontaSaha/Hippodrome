package com.codegym.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    private List<Horse> horses;
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return getHorses();
    }

    public void run() throws InterruptedException {
        for(int i = 0; i < 100; i++) {
            move();
            print();

            new Thread().sleep(200);
        }
    }

    public void move() throws InterruptedException {
        for (Horse horse : getHorses()) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse: getHorses()) {
            horse.print();
        }
        for(int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        double maxDistance = 0;
        Horse winner = null;
        for (Horse horse: getHorses()) {
            double currentHorseDistance = horse.getDistance();

            if(maxDistance < currentHorseDistance) {
                maxDistance = currentHorseDistance;
                winner = horse;
            }
        }

        return winner;
    }

    public void printWinner() {
        System.out.println( "Winner is " + getWinner().getName() + "!");
    }

    public static void main (String[] args) throws InterruptedException {
        game = new Hippodrome(new ArrayList<>());

        game.getHorses().add(new Horse("A", 3.0, 0.0));
        game.getHorses().add(new Horse("B", 3.0, 0.0));
        game.getHorses().add(new Horse("C", 3.0, 0.0));


        game.run();
        game.printWinner();

    }
}
