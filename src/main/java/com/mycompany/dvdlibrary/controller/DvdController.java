/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dvdlibrary.controller;
import com.mycompany.dvdlibrary.service.DvdService;
import com.mycompany.dvdlibrary.ui.DvdView;
import java.util.List;
import com.mycompany.dvdlibrary.dto.DVD;

/**
 *
 * @author bafsharim
 */
public class DvdController {
     private DvdService service;
    private DvdView view;

    public DvdController(DvdService service, DvdView view) {
        this.service = service;
        this.view = view;
    }
    public void run() {
        view.displayDvdTrackerBanner();
        
        while(true) {
            int choice = view.displayMenuAndGetChoice();
            
            switch(choice) {
                case 1: //view all
                    List<DVD> dvds = service.getAllDVD();
                    view.displayAllDVD(dvds);
                    break;
                case 2: //view one
                    String title = view.getDvdTitle();
                    DVD dvd = service.getDvdByTitle(title);
                    if(dvd != null) {
                        view.displayBookDetails(dvd);
                    } else {
                        view.displayError("Dvd does not exist");
                    }
                    break;
                case 3: //add
                    DVD newDvd = view.getNewDvd();
                    service.addDvd(newDvd);
                    view.displayAddSuccess();
                    break;
                case 4: //update
                    String updateTitle = view.getDVDTitleToUpdate();
                    DVD updateDvd = service.getDvdByTitle(updateTitle);
                    if(updateDvd != null) {
                        updateDvd = view.getUpdateDvd(updateDvd);
                        service.updateDVD(updateDvd);
                        view.displayUpdateSuccess();
                    } else {
                        view.displayError("Dvd doesn't exist");
                    }
                    break;
                case 5: //delete
                    String deleteTitle = view.getDvdTitleToDelete();
                    DVD deleteDvd = service.getDvdByTitle(deleteTitle);
                    if(deleteDvd != null) {
                        service.deleteDVDByTitle(deleteTitle);
                        view.displayDeleteSuccess();
                    } else {
                        view.displayError("Dvd doesn't exist");
                    }
                    break;
                case 6: //exit
                    view.displayExit();
                    System.exit(0);
                    break;
                default: //unknown
                    view.displayError("Unknown Option");
                    break;
            }
        }
    }
    
    
    
}
