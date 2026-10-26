module com.cinema.cinemabooking {
    requires javafx.controls;
    requires javafx.fxml;

    //allow java fx to read pack
    opens com.cinema.cinemabooking to javafx.fxml;
    opens com.cinema.cinemabooking.controller to javafx.fxml;
    
    //export pkgs to outside
    exports com.cinema.cinemabooking;
    exports com.cinema.cinemabooking.controller;
    
    //comment until these pkgs have file in it to prevent err
    //exports com.cinema.cinemabooking.service;
    //exports com.cinema.cinemabooking.model;
    //exports com.cinema.cinemabooking.db;
}
