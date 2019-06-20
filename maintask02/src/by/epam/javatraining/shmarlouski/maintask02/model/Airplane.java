package by.epam.javatraining.shmarlouski.maintask02.model;

import java.util.Arrays;
import java.util.Objects;

public abstract class Airplane {

    private long loadCapacityInKg;

    private double costInMillionDollars;

    private int sits;

    private long flyRangeKm;

    private int speedKmPerHour;

    public Airplane() {
    }

    public Airplane(long loadCapacityInKg, double costInMillionDollars, int sits, long flyRangeKm, int speedKmPerHour) {
        this.loadCapacityInKg = loadCapacityInKg;
        this.costInMillionDollars = costInMillionDollars;
        this.sits = sits;
        this.flyRangeKm = flyRangeKm;
        this.speedKmPerHour = speedKmPerHour;
    }

    public int getSits() {
        return sits;
    }

    public long getFlyRangeKm() {
        return flyRangeKm;
    }

    public int getSpeedKmPerHour() {
        return speedKmPerHour;
    }

    public double getCostInMillionDollars() {
        return costInMillionDollars;
    }

    public long getLoadCapacityInKg() {
        return loadCapacityInKg;
    }
    @Override
    public String toString() {

        return  getClass().getSimpleName() + " cost " + getCostInMillionDollars() +
                " million dollars, can carry about " + getLoadCapacityInKg() + " kg, has "
                + getSits() + " sits, fly up to " + getFlyRangeKm()
                + " km distance and it's maximum flight height is " + getSpeedKmPerHour();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Airplane airplane = (Airplane) obj;
        if (airplane.getSits() != getSits() ) {
            return false;
        }
        if (airplane.getFlyRangeKm() != getFlyRangeKm() ) {
            return false;
        }
        if (airplane.getFlyRangeKm() != getFlyRangeKm() ) {
            return false;
        }
        if (airplane.getSpeedKmPerHour() != getSpeedKmPerHour() ) {
            return false;
        }
        if (airplane.getCostInMillionDollars() != getCostInMillionDollars() ) {
            return false;
        }
        if (airplane.getLoadCapacityInKg() != getLoadCapacityInKg() ) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getSits());
        result = 42 * result + Integer.hashCode(this.getSits());
        return result;
    }

}
