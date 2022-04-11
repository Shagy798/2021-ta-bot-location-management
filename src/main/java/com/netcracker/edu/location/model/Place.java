package com.netcracker.edu.location.model;

import com.netcracker.edu.location.model.ui.UiPlace;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String city;
    @Column
    private String address;


    @ManyToOne()
    @JoinColumn(name = "category_id")
    private Category category;


    public Place(UiPlace uiPlace, Category category) {
        setCity(uiPlace.getCity());
        setAddress(uiPlace.getAddress());
        setCategory(category);
    }


}
