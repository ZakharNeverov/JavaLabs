
public class Hero {
    private MovementStrategy movementStrategy;

    public Hero(MovementStrategy movementStrategy) {
        this.movementStrategy = movementStrategy;
    }

    public void setMovementStrategy(MovementStrategy movementStrategy) {
        this.movementStrategy = movementStrategy;
    }

    public void move() {
        movementStrategy.move();
    }
}