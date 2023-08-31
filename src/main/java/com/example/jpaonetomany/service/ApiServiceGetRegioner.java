package com.example.jpaonetomany.service;

import com.example.jpaonetomany.model.Region;

import java.util.List;

public interface ApiServiceGetRegioner {
    List<Region> getRegioner();

    Region findRegionByKode(String kode);


    void deleteRegion(Region regionToDelete);
}
