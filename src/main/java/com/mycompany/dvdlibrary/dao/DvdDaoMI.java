/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dvdlibrary.dao;

import com.mycompany.dvdlibrary.dto.DVD;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bafsharim
 */
public class DvdDaoMI implements DvdDao {

    private List<DVD> dvds = new ArrayList<>();

    @Override
    public DVD getDVDByTitle(String title) {
        for (DVD dvd : dvds) {
            if (dvd.getTitle().equals(title)) {
                return dvd;
            }
        }
        return null;
    }

    @Override
    public List<DVD> getAllDVD() {
        return dvds;
    }

    @Override
    public DVD addDVD(DVD dvd) {
        dvds.add(dvd);
        return dvd;
    }

    @Override
    public void updateDVD(DVD dvd) {
        int index = dvds.indexOf(dvd);
        if (index > -1) {
            dvds.remove(index);
            dvds.add(index, dvd);
        }
    }

    @Override
    public void deleteDVDByTitle(String title) {
        DVD dvd = getDVDByTitle(title);
        int index = dvds.indexOf(dvd);
        if (index > -1) {
            dvds.remove(index);
        }
    }

}
