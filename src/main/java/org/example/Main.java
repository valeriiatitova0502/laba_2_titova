package org.example;

public class Main {

    public static void main(String[] args) {
        Participant[] participants = {
                new Cat(5, 350, "Боря"),
                new Cat(2,400,"Вася"),
                new Human(2, 350, "Итан"),
                new Robot(7, 900, "Анатолий"),

        };
        Challenge[] challenges = {

                new RunningRoad(RoadLenght.HIGH),
                new RunningRoad(RoadLenght.HIGH),
                new RunningRoad(RoadLenght.LOW),
                new Wall(WallHeight.LOW),
                new RunningRoad(RoadLenght.MEDIUM),
                new Wall(WallHeight.MEDIUM),
                new RunningRoad(RoadLenght.HIGH),
                new Wall(WallHeight.HIGH),

        };

        for(Participant p: participants) {
            for (Challenge c: challenges) {
                if (!c.isCan(p)) break;
            }
        }
    }
}