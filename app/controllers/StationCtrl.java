package controllers;

import play.Logger;
import play.mvc.Controller;
import java.util.List;

import models.Reading;
import models.Station;

import static play.mvc.Controller.redirect;


public class StationCtrl {

    public static void addReading(Long id, int code, double temperature, double windSpeed, long pressure, int windDirection)
    {
        Reading reading = new Reading(code, temperature, windSpeed, pressure, windDirection);
        Station station = Station.findById(id);
        station.readings.add(reading);
        station.save();
        redirect ("/stations/" + id);
    }
}
