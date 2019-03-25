package Field;

import java.util.Random;

public class RandomMinePlacer implements MinePlacer {

    private final IRandom randomNumberGenerator;
    private final int xUpper;
    private final int yUpper;

    public RandomMinePlacer(Size fieldSize, IRandom randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
        this.xUpper = fieldSize.getHeight();
        this.yUpper = fieldSize.getWidth();
    }

    @Override
    public int numberOfMines() {
        return randomNumberGenerator.nextInt((xUpper * yUpper) - 1) + 1;
    }

    @Override
    public Coordinates nextCoordinate() {
        return new Coordinates(randomNumberGenerator.nextInt(xUpper), randomNumberGenerator.nextInt(yUpper));
    }
}
