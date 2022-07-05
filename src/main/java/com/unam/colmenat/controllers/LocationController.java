package com.unam.colmenat.controllers;

import com.unam.colmenat.entities.Location;
import com.unam.colmenat.services.LocationServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/location")
public class LocationController {
    private final LocationServiceImp locationService;

    public LocationController(LocationServiceImp locationService) {
        this.locationService = locationService;
    }

    @GetMapping("")
    public List<Location> getAll() throws Exception{
        return locationService.findAll();
    }

    @GetMapping("/{id}")
    public Location getById(@PathVariable Long id) throws Exception{
        return locationService.findById(id);
    }

    @PostMapping("")
    public Location save(@RequestBody Location location) throws Exception{
       return locationService.save(location);
    }

    @PutMapping("/update")
    public Location update(@RequestBody Location location) throws Exception{
        return locationService.update(location);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Long id) throws Exception{
        return locationService.delete(id);
    }
}
