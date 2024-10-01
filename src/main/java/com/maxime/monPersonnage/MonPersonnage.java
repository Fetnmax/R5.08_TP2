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
        if (fois == 0) {
            return null;
        }
        int index = (direction.ordinal() + fois) % Direction.values().length;
        direction = Direction.values()[index];
        return direction;
    }

}
