package com.mogorovskiy.carsharingspringjpa.service.impl;

import com.mogorovskiy.carsharingspringjpa.dto.GeoRequestDto;
import com.mogorovskiy.carsharingspringjpa.mapper.GeoMapper;
import com.mogorovskiy.carsharingspringjpa.model.Geolocation;
import com.mogorovskiy.carsharingspringjpa.repository.GeolocationRepository;
import com.mogorovskiy.carsharingspringjpa.service.GeolocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

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
            geolocation.setLatitude(geolocationDetails.getLatitude());
            geolocation.setLongitude(geolocationDetails.getLongitude());
            return geolocationRepository.save(geolocation);
        }
        return null;
    }

    @Override
    public void deleteGeolocation(Long geoLocationId) {
        geolocationRepository.deleteById(geoLocationId);
    }
}
