package by.epam.javatraining.shmarlouski.maintask02.model;

import static by.epam.javatraining.shmarlouski.maintask02.controller.MainProgram.LOGGER;


public class AirCompanyUtil {

    public static long findTotalLoadCapacityOfAllPlanes(AirlineCompany company) {

        long totalLoadCapacity = 0;
        for (int i = 0; i < company.getHangar().size(); i++) {
            totalLoadCapacity += company.getHangar().get(i).getLoadCapacityInKg();
        }
        LOGGER.info("Total load capacity in this airline company is " + totalLoadCapacity + " kg");
        return totalLoadCapacity;
    }

    public static Airplane findMaxLoadCarrierAirplane(AirlineCompany company) {

        Airplane heavyCarrier = company.getHangar().get(0);
        for (int i = 1; i < company.getHangar().size(); i++) {
            if (company.getHangar().get(i).getLoadCapacityInKg() > heavyCarrier.getLoadCapacityInKg()) {
                heavyCarrier = company.getHangar().get(i);
            }
        }
        LOGGER.info("Most cargo carrier airplane in this company is " + heavyCarrier.getClass().getSimpleName());
        return heavyCarrier;
    }

    public static Airplane findMinLoadCarrierAirplane(AirlineCompany company) {

        Airplane lightCarrier = company.getHangar().get(0);
        for (int i = 1; i < company.getHangar().size(); i++) {
            if (company.getHangar().get(i).getLoadCapacityInKg() < lightCarrier.getLoadCapacityInKg()) {
                lightCarrier = company.getHangar().get(i);
            }
        }
        LOGGER.info("Airplane that can deliver smallest amount of cargo in this company is "
                + lightCarrier.getClass().getSimpleName());
        return lightCarrier;
    }

    public static double findTotalPriceOfAllPlanes(AirlineCompany company) {

        double totalPrice = 0;
        for (int i = 0; i < company.getHangar().size(); i++) {
            totalPrice += company.getHangar().get(i).getCostInMillionDollars();
        }
        LOGGER.info("Total price of all airplanes in this company is " + totalPrice + " million dollars");
        return totalPrice;
    }

    public static Airplane findMostPreciousOneAirplane(AirlineCompany company) {

        Airplane mostPreciousOne = company.getHangar().get(0);
        for (int i = 1; i < company.getHangar().size(); i++) {
            if (company.getHangar().get(i).getCostInMillionDollars() > mostPreciousOne.getCostInMillionDollars()) {
                mostPreciousOne = company.getHangar().get(i);
            }
        }
        LOGGER.info("Most precious one airplane in this company is " + mostPreciousOne.getClass().getSimpleName());
        return mostPreciousOne;
    }

    public static Airplane findMostCheapestOneAirplane(AirlineCompany company) {

        Airplane cheapestOne = company.getHangar().get(0);
        for (int i = 1; i < company.getHangar().size(); i++) {
            if (company.getHangar().get(i).getCostInMillionDollars() < cheapestOne.getCostInMillionDollars()) {
                cheapestOne = company.getHangar().get(i);
            }
        }
        LOGGER.info("Cheapest one airplane in this company is " + cheapestOne.getClass().getSimpleName());
        return cheapestOne;
    }

    public static long findTotalPassengerCapacityOfAllPlanes(AirlineCompany company) {

        long totalPassengerCapacity = 0;
        for (int i = 0; i < company.getHangar().size(); i++) {
            totalPassengerCapacity += company.getHangar().get(i).getSits();
        }
        LOGGER.info("Total passenger capacity of all airplanes in this company is "
                + totalPassengerCapacity + " passengers");
        return totalPassengerCapacity;
    }

    public static Airplane findAirplaneWithMaxPassengerCapacity(AirlineCompany company) {

        Airplane maxPassengerCarrier = company.getHangar().get(0);
        for (int i = 1; i < company.getHangar().size(); i++) {
            if (company.getHangar().get(i).getSits() > company.getHangar().get(i - 1).getSits()) {
                maxPassengerCarrier = company.getHangar().get(i);
            }
        }
        LOGGER.info("Airplane with biggest passenger capacity in this company is "
                + maxPassengerCarrier.getClass().getSimpleName());
        return maxPassengerCarrier;
    }

    public static Airplane findAirplaneWithMinPassengerCapacity(AirlineCompany company) {

        Airplane minPassengerCarrier = company.getHangar().get(0);
        for (int i = 1; i < company.getHangar().size(); i++) {
            if (company.getHangar().get(i).getSits() < minPassengerCarrier.getSits()) {
                minPassengerCarrier = company.getHangar().get(i);
            }
        }
        LOGGER.info("Airplane with minimal passenger capacity in this company is "
                + minPassengerCarrier.getClass().getSimpleName());
        return minPassengerCarrier;
    }

    public static Airplane findAirplaneWithLongestDistanceFlight(AirlineCompany company) {

        Airplane longDistAirplane = company.getHangar().get(0);
        for (int i = 1; i < company.getHangar().size(); i++) {
            if (company.getHangar().get(i).getFlyRangeKm() > longDistAirplane.getFlyRangeKm()) {
                longDistAirplane = company.getHangar().get(i);
            }
        }
        LOGGER.info("Airplane, that can fly longest distance, in this company is "
                + longDistAirplane.getClass().getSimpleName());
        return longDistAirplane;
    }

    public static Airplane findAirplaneWithShortestDistanceFlight(AirlineCompany company) {

        Airplane shortDistAirplane = company.getHangar().get(0);
        for (int i = 1; i < company.getHangar().size(); i++) {
            if (company.getHangar().get(i).getFlyRangeKm() < shortDistAirplane.getFlyRangeKm()) {
                shortDistAirplane = company.getHangar().get(i);
            }
        }
        LOGGER.info("Airplane, that can fly shortest distance, in this company is "
                + shortDistAirplane.getClass().getSimpleName());
        return shortDistAirplane;
    }

    public static Airplane findFastestAirplane(AirlineCompany company) {

        Airplane fastestOne = company.getHangar().get(0);
        for (int i = 1; i < company.getHangar().size(); i++) {
            if (company.getHangar().get(i).getSpeedKmPerHour() > company.getHangar().get(i - 1).getSpeedKmPerHour()) {
                fastestOne = company.getHangar().get(i);
            }
        }
        LOGGER.info("Fastest airplane in this company is " + fastestOne.getClass().getSimpleName());
        return fastestOne;
    }

    public static Airplane findSlowestAirplane(AirlineCompany company) {

        Airplane slowOne = company.getHangar().get(0);
        for (int i = 1; i < company.getHangar().size(); i++) {
            if (company.getHangar().get(i).getSpeedKmPerHour() < slowOne.getSpeedKmPerHour()) {
                slowOne = company.getHangar().get(i);
            }
        }
        LOGGER.info("Slowest airplane in this company is " + slowOne.getClass().getSimpleName());
        return slowOne;
    }

}
