package by.epam.javatraining.shmarlouski.maintask02.model;

import java.util.ArrayList;


public class AirlineCompany {

    private String title;

    private ArrayList<Airplane> hangar = new ArrayList<>();

    public AirlineCompany(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Airplane> getHangar(){
        return hangar;
    }

    public void setAirplaneInHangar(Airplane airplane){
        hangar.add(airplane);
    }

    public void removeAirplaneFromHangar(Airplane airplane){
        if(hangar.contains(airplane)){
            hangar.remove(airplane);
        }
    }

}
