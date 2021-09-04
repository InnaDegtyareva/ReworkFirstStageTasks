package planes;

import models.ClassificationLevel;
import models.ExperimentalType;

public class ExperimentalPlane extends Plane {

    private ExperimentalType type;
    private ClassificationLevel level;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity,
                             ExperimentalType type, ClassificationLevel level) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
        this.level = level;
    }

    public ClassificationLevel getLevel() {
        return level;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

