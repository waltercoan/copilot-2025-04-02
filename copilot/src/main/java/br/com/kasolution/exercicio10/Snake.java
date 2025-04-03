package br.com.kasolution.exercicio10;

import java.util.LinkedList;

public class Snake {
    private LinkedList<Cell> body;
    private Direction direction;

    public Snake(Cell initialPosition) {
        body = new LinkedList<>();
        body.add(initialPosition);
        direction = Direction.RIGHT;
    }

    public LinkedList<Cell> getBody() {
        return body;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void grow(Cell newHead) {
        body.addFirst(newHead);
    }

    public void move(Cell newHead) {
        body.addFirst(newHead);
        body.removeLast();
    }
}