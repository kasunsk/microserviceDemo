package com.kasun.service;

import com.kasun.domain.Difficulty;
import com.kasun.domain.Region;
import com.kasun.domain.Tour;
import com.kasun.domain.TourPackage;
import com.kasun.repo.TourPackageRepository;
import com.kasun.repo.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by kasunk on 12/27/16.
 */
@Service
public class TourService {

    @Autowired
    private TourPackageRepository tourPackageRepository;

    @Autowired
    private TourRepository tourRepository;

    @Autowired
    public TourService(TourPackageRepository tourPackageRepository, TourRepository tourRepository) {
        this.tourPackageRepository = tourPackageRepository;
        this.tourRepository = tourRepository;
    }

    public Tour createTour(String title, String description, String blurb, Double price, String duration, String bullet, String keyWords,
            String tourPackageCode, Difficulty difficulty, Region region) {

        TourPackage tourPackage = tourPackageRepository.findOne(tourPackageCode);

        if (tourPackage == null) {
            throw new RuntimeException("Tour Package Not exist : " + tourPackageCode);
        }
        return new Tour(title,description,blurb,price,duration,bullet, keyWords,tourPackage, difficulty, region);
    }

    public Iterable<Tour> lookup() {
        return tourRepository.findAll();
    }

    public long count() {
        return tourRepository.count();
    }
}
