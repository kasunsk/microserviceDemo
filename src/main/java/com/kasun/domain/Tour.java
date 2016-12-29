package com.kasun.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by kasunk on 12/27/16.
 */
@Entity
public class Tour implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String title;

    @Column(length = 2000)
    private String description;

    @Column(length = 2000)
    private String blurb;

    @Column
    private Double price;

    @Column
    private String duration;

    @Column(length = 2000)
    private String bullet;

    @Column
    private String keyWords;

    @ManyToOne
    private TourPackage tourPackage;

    @Column
    private Difficulty difficulty;

    @Column
    private Region region;

    public Tour(String title, String description, String blurb, Double price, String duration, String bullet, String keyWords,
            TourPackage tourPackage, Difficulty difficulty, Region region) {
        this.title = title;
        this.description = description;
        this.blurb = blurb;
        this.price = price;
        this.duration = duration;
        this.bullet = bullet;
        this.keyWords = keyWords;
        this.tourPackage = tourPackage;
        this.difficulty = difficulty;
        this.region = region;
    }

    protected Tour() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getBullet() {
        return bullet;
    }

    public void setBullet(String bullet) {
        this.bullet = bullet;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public TourPackage getTourPackage() {
        return tourPackage;
    }

    public void setTourPackage(TourPackage tourPackage) {
        this.tourPackage = tourPackage;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }
}
