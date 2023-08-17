package com.cloudvoid.darkskyz.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.time.LocalDate;

@Slf4j
@RequiredArgsConstructor
@RestController
public class WeatherDataController {
    @Value("${darkSky.X-RapidAPI-Key}")
    private final String apiKey_DarkSky = "";
    @Value("${darkSky.X-RapidAPI-Host}")
    private final String apiHost_DarkSky = "";
    @Value("${darkSky.request-url}")
    private final String apiUrl_DarkSky = "";
    private final String latitude = "37.774929";
    private final String longitude = "-122.419418";

    private final LocalDate date = LocalDate.now();
    private final String units = "";
    /* OPTIONAL:
    Return weather conditions in the requested units. [units] should be one of the following:
    auto: automatically select units based on geographic location ca: same as si, except that windSpeed is in kilometers per hour uk2:
    same as si, except that nearestStormDistance and visibility are in miles and windSpeed is in miles per hour us: Imperial units (the default) si: SI units*/
    private final String exclude = "";
    /* OPTIONAL:
    Exclude some number of data blocks from the API response. This is useful for reducing latency and saving cache space.
    The value blocks should be a comma-delimeted list (without spaces) of any of the following: currently, minutely, hourly, daily, alerts, flags*/
    private final String lang = "";
    /* OPTIONAL:
    Return summary properties in the desired language. (Note that units in the summary will be set according to the units parameter,
    so be sure to set both parameters appropriately.) Use 2-letter language code (full list in API Details). en is default.*/

    OkHttpClient client = new OkHttpClient();

    public Response requestWeatherDataTimeMachine() throws IOException {
        Request request = new Request.Builder()
                .url("https://dark-sky.p.rapidapi.com/" + latitude + "," + longitude + "," + date.toString()) //TODO wtf cant parse Value string to url for missmatching http/s schema
                .get()
                .addHeader("X-RapidAPI-Key", apiKey_DarkSky)
                .addHeader("X-RapidAPI-Host", apiHost_DarkSky)
                .build();

        return client.newCall(request).execute();
    }


    public Response requestWeatherDataTimeForecast() throws IOException {
        Request request = new Request.Builder()
                .url("https://dark-sky.p.rapidapi.com/%7B" + latitude + "%7D,%7B" + longitude + "%7D?lang=en&units=auto")
                .get()
                .addHeader("X-RapidAPI-Key", apiKey_DarkSky)
                .addHeader("X-RapidAPI-Host", apiHost_DarkSky)
                .build();
        return client.newCall(request).execute();
    }
}
