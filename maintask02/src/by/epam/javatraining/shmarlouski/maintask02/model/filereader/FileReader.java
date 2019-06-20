package by.epam.javatraining.shmarlouski.maintask02.model.filereader;

import by.epam.javatraining.shmarlouski.maintask02.model.AirlineCompany;
import by.epam.javatraining.shmarlouski.maintask02.model.civilairplanetypes.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static by.epam.javatraining.shmarlouski.maintask02.controller.MainProgram.LOGGER;


public class FileReader {

    public static ArrayList<String> readInputData(String filePath)  {

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<String> listOfPlanes = new ArrayList<>();

        while (scanner.hasNextLine()) {
            listOfPlanes.add(scanner.nextLine());
        }

        LOGGER.info("Airplane list was made from file");
        return listOfPlanes;
    }

    public static void addAirplanesToAirlineCompany(ArrayList<String> listOfPlanes, AirlineCompany company) {

        for (String note : listOfPlanes) {
            switch (note) {
                case "AirbusA310":
                    company.setAirplaneInHangar(new AirbusA310());
                    break;
                case "Boeing737":
                    company.setAirplaneInHangar(new Boeing737());
                    break;
                case "Boeing747":
                    company.setAirplaneInHangar(new Boeing747());
                    break;
                case "IL62":
                    company.setAirplaneInHangar(new IL62());
                    break;
                case "TU134":
                    company.setAirplaneInHangar(new TU134());
                    break;
                case "TU204":
                    company.setAirplaneInHangar(new TU204());
                    break;
                default:
                    LOGGER.warn("incorrect data input in " + note);
                    break;
            }
        }
        LOGGER.info("Airplanes was moved to the AirlineCompany's hangar");
    }

}


