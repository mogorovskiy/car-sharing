package com.mogorovskiy.carsharingspringjpa.controller;

import com.mogorovskiy.carsharingspringjpa.dto.*;
import com.mogorovskiy.carsharingspringjpa.model.*;
import com.mogorovskiy.carsharingspringjpa.service.*;
import lombok.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/geolocations")
public class GeolocationController {
    private final GeolocationService geolocationService;

    @PostMapping("/add")
    public Geolocation addGeolocation(@RequestBody GeoRequestDto geoRequestDto) {
        return geolocationService.addGeolocation(geoRequestDto);
    }

    @GetMapping("/getAll")
    public List<Geolocation> getAllGeolocations() {
        return geolocationService.getAllGeolocations();
    }

    @GetMapping("/{geoLocationId}")
    public Geolocation getGeolocationById(@PathVariable Long geoLocationId) {
        return geolocationService.getGeolocationById(geoLocationId);
    }

    @PutMapping("/{geoLocationId}")
    public Geolocation updateGeolocation(@PathVariable Long geoLocationId, @RequestBody Geolocation geoLocationDetails) {
        return geolocationService.updateGeolocation(geoLocationId, geoLocationDetails);
    }

    @DeleteMapping("/{geoLocationId}")
    public void deleteGeolocation(@PathVariable Long geoLocationId) {
        geolocationService.deleteGeolocation(geoLocationId);
    }
}