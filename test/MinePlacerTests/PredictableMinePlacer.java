package MinePlacerTests;

import Field.Coordinate;
import MinePlacer.IMinePlacer;

import java.util.List;

public class PredictableMinePlacer implements IMinePlacer {

    private List<Coordinate> mines;
    private int callCounter = -1;

    public PredictableMinePlacer(List<Coordinate> mines) {
        this.mines = mines;
    }

    @Override
    public int numberOfMines() {
        return mines.size();
    }

    @Override
    public Coordinate nextCoordinate() {
        callCounter++;

        if (callCounter == mines.size()) {
            callCounter = 0;
        }

        return mines.get(callCounter);
    }
}
