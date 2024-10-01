package com.maxime.monPersonnage;

public class MonPersonnage {

    private Direction direction;

    public MonPersonnage() {
        this.direction = Direction.NORD;
    }

    public Direction getDirection() {
        return direction;
    }

    public Direction tourner(int fois) {
        if (fois == 1) {
            return Direction.EST;
        }
        return direction;
    }

}
