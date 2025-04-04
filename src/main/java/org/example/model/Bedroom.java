package org.example.model;

public class Bedroom {
    public String name;
    public Wall wall1;
    public Wall wall2;
    public Wall wall3;
    public Wall wall4;
    public Ceiling ceiling;
    public Bed bed;
    public Lamp lamp;
    public Wardrobe wardrobe;
    public Carpet carpet;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp, Wardrobe wardrobe, Carpet carpet){
        this.name= name;
        this.wall1 = wall1;
        this.wall2= wall2;
        this.wall3=wall3;
        this.wall4=wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
        this.carpet= carpet;
    }

    public Bedroom() {

    }

    public String getName() {
        return name;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }
}
