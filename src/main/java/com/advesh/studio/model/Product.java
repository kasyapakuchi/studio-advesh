package com.advesh.studio.model;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;


@Entity
@Table
@Data
public class Product {

    @Id
    @Column
    private int productid;

    @Column
    private String shortname;

    @Column
    private String longname;

    @Column
    private String imageurls;

    @Column
    private String price;

    @Column
    private String description;

    @Column
    private String category;

    @Column
    private String subcategory;

    @Column
    private String material;

    @Column
    private String colour;

    public int getProductid() {
        return this.productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getShortname() {
        return this.shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getLongname() {
        return this.longname;
    }

    public void setLongname(String longname) {
        this.longname = longname;
    }

    public String getImageurls() {
        return this.imageurls;
    }

    public void setImageurls(String imageurls) {
        this.imageurls = imageurls;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubcategory() {
        return this.subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
}
