package com.consume.api.restapiconsume.model.weather;
import lombok.Data;

@Data
public class Main {
    private double temp;
    private double feelsLike;
    private double tempMin;
    private double tempMax;
    private long pressure;
    private long humidity;
    private long seaLevel;
    private long grndLevel;
}
