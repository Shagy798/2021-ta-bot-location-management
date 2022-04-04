package com.example.location.repository;

import com.example.location.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Integer> {

    List<Place> findPlaceByCategoryId(int categoryId);

    Place findPlaceByAddress(String address);

}
