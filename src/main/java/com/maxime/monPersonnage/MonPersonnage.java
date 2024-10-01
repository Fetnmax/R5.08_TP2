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
        if (fois < 0) {
            throw new IllegalArgumentException("Le nombre de fois doit être positif");
        }
        int index = (direction.ordinal() + fois) % Direction.values().length;
        direction = Direction.values()[index];
        return direction;
    }

}
