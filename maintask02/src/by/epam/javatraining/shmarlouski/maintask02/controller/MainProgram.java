package by.epam.javatraining.shmarlouski.maintask02.controller;

import by.epam.javatraining.shmarlouski.maintask02.model.AirlineCompany;
import org.apache.log4j.Logger;

import static by.epam.javatraining.shmarlouski.maintask02.model.AirCompanyUtil.*;
import static by.epam.javatraining.shmarlouski.maintask02.model.filereader.FileReader.*;

import java.io.*;
import java.util.ArrayList;


public class MainProgram {

    private static MainProgram instance = new MainProgram();

    public static MainProgram getInstance() {
        if(instance == null){
            instance = new MainProgram();
        }
        return instance;
    }

    private MainProgram() {
    }

    public static final Logger LOGGER = Logger.getLogger(MainProgram.class);

    public static void start ()  {

        LOGGER.info("Start of main program");

        String filePath = "files\\file";

        AirlineCompany company = new AirlineCompany("Heron");

        ArrayList<String> listOfPlanes = null;

        listOfPlanes = readInputData(filePath);

        addAirplanesToAirlineCompany(listOfPlanes, company);

        findTotalLoadCapacityOfAllPlanes(company);

        findMaxLoadCarrierAirplane(company);

        findMinLoadCarrierAirplane(company);

        findTotalPriceOfAllPlanes(company);

        findMostPreciousOneAirplane(company);

        findMostCheapestOneAirplane(company);

        findTotalPassengerCapacityOfAllPlanes(company);

        findAirplaneWithMaxPassengerCapacity(company);

        findAirplaneWithMinPassengerCapacity(company);

        findAirplaneWithLongestDistanceFlight(company);

        findAirplaneWithShortestDistanceFlight(company);

        findFastestAirplane(company);

        findSlowestAirplane(company);

        LOGGER.info("End of main program");

    }
}
