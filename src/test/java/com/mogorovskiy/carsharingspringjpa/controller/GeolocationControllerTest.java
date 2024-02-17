package com.mogorovskiy.carsharingspringjpa.controller;

import com.mogorovskiy.carsharingspringjpa.controller.*;
import com.mogorovskiy.carsharingspringjpa.dto.*;
import com.mogorovskiy.carsharingspringjpa.model.*;
import com.mogorovskiy.carsharingspringjpa.service.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class GeolocationControllerTest {

    @Mock
    private GeolocationService geolocationService;

    @InjectMocks
    private GeolocationController geolocationController;

    @Test
    void testAddGeolocation() {
        GeoRequestDto geoRequestDto = new GeoRequestDto();
        geoRequestDto.setLatitude(30.1234f);
        geoRequestDto.setLongitude(40.5678f);
        Geolocation geolocation = new Geolocation();
        geolocation.setId(1L);
        geolocation.setLatitude(30.1234f);
        geolocation.setLongitude(40.5678f);
        when(geolocationService.addGeolocation(geoRequestDto)).thenReturn(geolocation);
        Geolocation result = geolocationController.addGeolocation(geoRequestDto);
        assertEquals(geolocation, result);
    }

    @Test
    void testGetAllGeolocations() {
        List<Geolocation> geolocations = new ArrayList<>();
        geolocations.add(new Geolocation());
        geolocations.add(new Geolocation());
        when(geolocationService.getAllGeolocations()).thenReturn(geolocations);
        List<Geolocation> result = geolocationController.getAllGeolocations();
        assertEquals(2, result.size());
    }

    @Test
    void testGetGeolocationById() {
        Long geoLocationId = 1L;
        Geolocation geolocation = new Geolocation();
        geolocation.setId(geoLocationId);
        when(geolocationService.getGeolocationById(geoLocationId)).thenReturn(geolocation);
        Geolocation result = geolocationController.getGeolocationById(geoLocationId);
        assertEquals(geoLocationId, result.getId());
    }

    @Test
    void testUpdateGeolocation() {
        Long geoLocationId = 1L;
        Geolocation geolocationDetails = new Geolocation();
        geolocationDetails.setLatitude(30.1234f);
        geolocationDetails.setLongitude(40.5678f);
        Geolocation updatedGeolocation = new Geolocation();
        updatedGeolocation.setId(geoLocationId);
        updatedGeolocation.setLatitude(30.1234f);
        updatedGeolocation.setLongitude(40.5678f);
        when(geolocationService.updateGeolocation(geoLocationId, geolocationDetails)).thenReturn(updatedGeolocation);
        Geolocation result = geolocationController.updateGeolocation(geoLocationId, geolocationDetails);
        assertEquals(updatedGeolocation, result);
    }

    @Test
    void testDeleteGeolocation() {
        Long geoLocationId = 1L;
        geolocationController.deleteGeolocation(geoLocationId);
        verify(geolocationService, times(1)).deleteGeolocation(geoLocationId);
    }
}