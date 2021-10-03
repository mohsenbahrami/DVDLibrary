/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dvdlibrary.ui;

import java.util.List;
import com.mycompany.dvdlibrary.dto.DVD;

/**
 *
 * @author bafsharim
 */
public class DvdView {

    private UserIO io;

    public DvdView(UserIO io) {
        this.io = io;
    }

    public void displayBookTrackerBanner() {
        io.print("Welcome to the DVD Library");
    }

    public int displayMenuAndGetChoice() {
        io.print("");
        io.print("Main Menu");
        io.print("1. View DVDs");
        io.print("2. View DVD Details");
        io.print("3. Add DVD");
        io.print("4. Update DVD");
        io.print("5. Delete DVD");
        io.print("6. Exit");

        return io.readInt("Please select an option:", 1, 6);
    }
    
     public void displayError(String error) {
        io.print("ERROR: " + error);
    }

    public void displayAllBooks(List<DVD>dvd) {
        io.print("");
        io.print("All DVDs");
        dvd.stream()
                .forEach((d) -> io.print(d.getTitle() + " - " + d.getDirectorName()));
    }
    
      public String getDvdTitle() {
        io.print("");
        return io.readString("Enter DVD name:");
    }
        public void displayBookDetails(DVD d) {        
        io.print("");
        io.print("Title: " + d.getTitle());
        io.print("Release date: " + d.getReleaseDate());
        io.print("MPAA rating: " + d.getMpaaRating());
        io.print("Director's name: " + d.getDirectorName());
        io.print("Studio : " +  d.getStudio());
        io.print("User rating :" + d.getRating());
    }
        
        public DVD getNewDvd() {
        io.print("");
        io.print("Enter new Dvd info");
        String title = io.readString("Title");
        String releaseDate = io.readString("Release Date");
        String mpaaRating = io.readString("Mpaa Rating");
        String directorNmea = io.readString("Director's name");
        String studio = io.readString("Studio");
        String rating = io.readString("User rating or note");
        return new DVD(title,releaseDate,mpaaRating,directorNmea,studio,rating);
    }
        
    public void displayAddSuccess() {
        io.print("DVD added successfully");
    }

    public void displayExit() {
        io.print("Existing DVD Tracker");
    }

    public String getDvdTitleToDelete() {
        io.print("");
        return io.readString("Enter DVD name to delete:");
    }

    public void displayDeleteSuccess() {
        io.print("DVD deleted successfully");
    }

    public String getDVDTitleToUpdate() {
        io.print("");
        return io.readString("Enter DVD name to update:");    
    }
    
     public DVD getUpdateDvd(DVD updateDvd) {
        io.print("Updating " + updateDvd.getTitle());
        String releaseDate = io.readString("Entre Release Date" + updateDvd.getReleaseDate() + "):");
        String mpaaRating = io.readString(" Entre Mpaa Rating" + updateDvd.getMpaaRating() + "):");
        String directornmae = io.readString("Entre Director's name" + updateDvd.getDirectorName() + "):");
        String studio = io.readString("Entre Studio" + updateDvd.getStudio() + "):");
        String rating = io.readString("Entre User rating or note" + updateDvd.getRating() + "):");
        
        
       
        if(!releaseDate.isBlank()) {
            updateDvd.setReleaseDate(releaseDate);
        }
        if(!mpaaRating.isBlank()) {
            updateDvd.setMpaaRating(mpaaRating);
        }
        if(!directornmae.isBlank()) {
            updateDvd.setDirectorName(directornmae);
        }
        if(!studio.isBlank()){
            updateDvd.setStudio(studio);
        }
        if(!rating.isBlank()){
            updateDvd.setRating(rating);
        }
        return updateDvd;
    }

    public void displayUpdateSuccess() {
        io.print("DVD updated successfully");
    }


}

