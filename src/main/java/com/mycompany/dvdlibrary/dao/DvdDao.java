/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dvdlibrary.dao;
import com.mycompany.dvdlibrary.dto.DVD;
import java.util.List;


public interface DvdDao {

    DVD getDVDByTitle(String title);

    List<DVD> getAllDVD();

    DVD addDVD(DVD dvd);

    void updateDVD(DVD dvd);

    void deleteDVDByTitle(String title);

}
