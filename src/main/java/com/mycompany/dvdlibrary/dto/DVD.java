/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dvdlibrary.dto;

import java.util.Objects;

/**
 *
 * @author bafsharim
 */
public class DVD {
   private String title;
   private String releaseDate;
   private String mpaaRating;
   private String directorName;
   private String studio;
   private String rating;

    public DVD() {
    }

    public DVD(String title, String releaseDate, String mpaaRating, String directorName, String studio, String rating) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.mpaaRating = mpaaRating;
        this.directorName = directorName;
        this.studio = studio;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
    @Override
    public int hashCode() {
        int hash = 6;
        hash = 97 * hash + Objects.hashCode(this.title);
        hash = 97 * hash + Objects.hashCode(this.releaseDate);
        hash = 97 * hash + Objects.hashCode(this.mpaaRating);
        hash = 97 * hash + Objects.hashCode(this.directorName);
        hash = 97 * hash + Objects.hashCode(this.studio);
        hash = 97 * hash + Objects.hashCode(this.rating);
        return hash;
    }

  //  @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final DVD other = (DVD) obj;
//        if (this.releaseDate != other.releaseDate) {
//            return false;
//        }
//        if (!Objects.equals(this.directorName, other.directorName)) {
//            return false;
//        }
//        if (!Objects.equals(this.title, other.title)) {
//            return false;
//        }
//        if (!Objects.equals(this.studio, other.studio)) {
//            return false;
//        }
//        return true;
//    }
}
