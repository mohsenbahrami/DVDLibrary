
package com.mycompany.dvdlibrary.service;
import java.util.List;
import com.mycompany.dvdlibrary.dto.DVD;
import com.mycompany.dvdlibrary.dao.DvdDao;

public class DvdService {
        private DvdDao dao;

    public DvdService(DvdDao dao) {
        this.dao = dao;
    }
    
    public DVD getDvdByTitle(String title) {
        return dao.getDVDByTitle(title);
    }
    
    public List<DVD> getAllDVD() {
        return dao.getAllDVD();
    }
    
    public DVD addDvd(DVD dvd) {
        return dao.addDVD(dvd);
    }
    
    public void updateDVD(DVD dvd) {
        dao.updateDVD(dvd);
    }
    
    public void deleteDVDByTitle(String title) {
        dao.deleteDVDByTitle(title);
    }
}
