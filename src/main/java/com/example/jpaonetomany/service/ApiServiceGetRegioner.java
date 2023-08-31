package com.example.jpaonetomany.service;

import com.example.jpaonetomany.model.Region;

import java.util.List;

public interface ApiServiceGetRegioner {
    List<Region> getRegioner();

    Region findByKode(String kode);

    Region findRegionByKode(String regionKode);

    void deleteRegion(Region regionToDelete);
}
