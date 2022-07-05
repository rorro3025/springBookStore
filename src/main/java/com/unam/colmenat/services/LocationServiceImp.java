package com.unam.colmenat.services;

import com.unam.colmenat.entities.Location;
import com.unam.colmenat.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImp extends BaseServiceImp<Location, Long> implements LocationService {

    public LocationServiceImp(BaseRepository<Location, Long> repository) {
        super(repository);
    }
}
