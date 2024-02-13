package com.mogorovskiy.carsharingspringjpa.service.impl;

import com.mogorovskiy.carsharingspringjpa.dto.*;
import com.mogorovskiy.carsharingspringjpa.mapper.*;
import com.mogorovskiy.carsharingspringjpa.model.*;
import com.mogorovskiy.carsharingspringjpa.repository.*;
import com.mogorovskiy.carsharingspringjpa.service.*;
import lombok.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
@RequiredArgsConstructor
public class GeolocationServiceImpl implements GeolocationService {
    private final GeolocationRepository geolocationRepository;
    private final GeoMapper geoMapper;

    @Override
    public Geolocation addGeolocation(GeoRequestDto geoRequestDto) {
        Geolocation geolocation = geoMapper.toModel(geoRequestDto);
        return geolocationRepository.save(geolocation);
    }

    @Override
    public List<Geolocation> getAllGeolocations() {
        return geolocationRepository.findAll();
    }

    @Override
    public Geolocation getGeolocationById(Long geolocationId) {
        Optional<Geolocation> geolocationOptional = geolocationRepository.findById(geolocationId);
        return geolocationOptional.orElse(null);
    }

    @Override
    public Geolocation updateGeolocation(Long geolocationId, Geolocation geolocationDetails) {
        Optional<Geolocation> geolocationOptional = geolocationRepository.findById(geolocationId);
        if (geolocationOptional.isPresent()) {
            Geolocation geolocation = geolocationOptional.get();
            // Обновление полей геолокации
            geolocation.setLatitude(geolocationDetails.getLatitude());
            geolocation.setLongitude(geolocationDetails.getLongitude());
            // Сохранение обновленной геолокации в базе данных
            return geolocationRepository.save(geolocation);
        }
        return null;
    }

    @Override
    public void deleteGeolocation(Long geoLocationId) {
        geolocationRepository.deleteById(geoLocationId);
    }
}
