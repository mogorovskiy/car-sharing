package com.mogorovskiy.carsharingspringjpa.mapper;

import com.mogorovskiy.carsharingspringjpa.dto.GeoRequestDto;
import com.mogorovskiy.carsharingspringjpa.model.Geolocation;
import org.springframework.stereotype.Service;

@Service
public class GeoMapper {
    public Geolocation toModel(GeoRequestDto geoRequestDto) {
        Geolocation geolocation = new Geolocation();
        geolocation.setLongitude(geoRequestDto.getLongitude());
        geolocation.setLatitude(geoRequestDto.getLatitude());
        return geolocation;
    }
}
