package com.mogorovskiy.carsharingspringjpa.controller;

import com.mogorovskiy.carsharingspringjpa.dto.GeoRequestDto;
import com.mogorovskiy.carsharingspringjpa.model.Geolocation;
import com.mogorovskiy.carsharingspringjpa.service.GeolocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

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