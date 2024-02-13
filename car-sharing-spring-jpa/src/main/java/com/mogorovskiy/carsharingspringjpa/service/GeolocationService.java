package com.mogorovskiy.carsharingspringjpa.service;

import com.mogorovskiy.carsharingspringjpa.dto.*;
import com.mogorovskiy.carsharingspringjpa.model.*;

import java.util.*;

public interface GeolocationService {
    Geolocation addGeolocation(GeoRequestDto GeoRequestDto);
    List<Geolocation> getAllGeolocations();
    Geolocation getGeolocationById(Long geoLocationId);
    Geolocation updateGeolocation(Long geoLocationId, Geolocation geoLocationDetails);
    void deleteGeolocation(Long geoLocationId);
}
