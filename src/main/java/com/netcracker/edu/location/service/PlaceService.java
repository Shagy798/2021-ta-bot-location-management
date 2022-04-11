package com.netcracker.edu.location.service;

import com.netcracker.edu.location.model.Category;
import com.netcracker.edu.location.model.Place;
import com.netcracker.edu.location.model.ui.UiPlace;
import com.netcracker.edu.location.repository.CategoryRepository;
import com.netcracker.edu.location.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlaceService {

    @Autowired
    private PlaceRepository placeRepository;

    @Autowired
    private CategoryRepository categoryService;

    public Iterable<Place> getPlaces() {
        return placeRepository.findAll();
    }

    public Optional<Place> getPlaceById(int id) {
        return placeRepository.findById(id);
    }

    public Place getPlaceByAddress(String address){
        return placeRepository.findPlaceByAddress(address);
    }

    public Place createPlace(UiPlace uiPlace, Category category) {
        category = categoryService.findCategoryByName(uiPlace.getCategoryName());
        return placeRepository.saveAndFlush(new Place(uiPlace, category));
    }

    public Place updatePlaceById(int id, Place place) {
        return placeRepository.save(place);
    }

    public void deletePlace(int id) {
        placeRepository.deleteById(id);
    }

}
