package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity
public class WeatherData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double temperature;
    private double humidity;
    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    public WeatherData() {}

    public WeatherData(double temperature, double humidity, LocalDateTime timestamp, Location location) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.timestamp = timestamp;
        this.location = location;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public double getTemperature() {
        return temperature;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public double getHumidity() {
        return humidity;
    }
    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
}
