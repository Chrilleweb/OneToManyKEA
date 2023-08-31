package com.example.jpaonetomany.controller;

import com.example.jpaonetomany.model.Region;
import com.example.jpaonetomany.service.ApiServiceGetRegioner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class RegionRestController {

    @Autowired
    ApiServiceGetRegioner apiServiceGetRegioner;

    @GetMapping("/getregioner")
    public List<Region> getRegioner() {
        List<Region> lstRegioner = apiServiceGetRegioner.getRegioner();
        return lstRegioner;
    }

    @DeleteMapping("/deleteregion/{regionKode}")
    public ResponseEntity<String> deleteRegion(@PathVariable String regionKode) {
        Region regionToDelete = apiServiceGetRegioner.findRegionByKode(regionKode);

        if (regionToDelete != null) {
            // Implement the deletion logic here
            apiServiceGetRegioner.deleteRegion(regionToDelete);
            return ResponseEntity.ok("Region deleted");
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
