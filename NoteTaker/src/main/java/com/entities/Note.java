package com.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate the ID
    private int id;
    private String titleString;
    private String contentString;
    private Date addeDate;

    // Default constructor (required by Hibernate)
    public Note() {
        super();
    }

    // Parameterized constructor (without id, as it will be auto-generated)
    public Note(String titleString, String contentString, Date addeDate) {
        super();
        this.titleString = titleString;
        this.contentString = contentString;
        this.addeDate = addeDate;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitleString() {
        return titleString;
    }

    public void setTitleString(String titleString) {
        this.titleString = titleString;
    }

    public String getContentString() {
        return contentString;
    }

    public void setContentString(String contentString) {
        this.contentString = contentString;
    }

    public Date getAddeDate() {
        return addeDate;
    }

    public void setAddeDate(Date addeDate) {
        this.addeDate = addeDate;
    }
}