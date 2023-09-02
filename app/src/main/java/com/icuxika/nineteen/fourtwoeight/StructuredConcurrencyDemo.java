package com.icuxika.nineteen.fourtwoeight;

import java.time.Duration;
import java.time.Instant;

public class StructuredConcurrencyDemo {

    public void run() {
        {
            Instant begin = Instant.now();
            Weather weather = Weather.readWeatherShutdownOnSuccess();
            Instant end = Instant.now();
            System.out.println("weather = " + weather);
            System.out.println("Time is = " + Duration.between(begin, end).toMillis() + "ms");
        }
        {
            Instant begin = Instant.now();
            Quotation quotation = Quotation.readQuotation();
            Instant end = Instant.now();
            System.out.println("quotation = " + quotation);
            System.out.println("Time is = " + Duration.between(begin, end).toMillis() + "ms");
        }
        {
            Instant begin = Instant.now();
            TravelPage travelPage = TravelPage.readTravelPage();
            Instant end = Instant.now();
            System.out.println("travelPage = " + travelPage);
            System.out.println("Time is = " + Duration.between(begin, end).toMillis() + "ms");
        }
    }
}
