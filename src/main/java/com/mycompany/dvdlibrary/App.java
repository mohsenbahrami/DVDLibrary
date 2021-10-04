/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dvdlibrary;
import com.mycompany.dvdlibrary.controller.DvdController;
import com.mycompany.dvdlibrary.dao.DvdDao;
import com.mycompany.dvdlibrary.dao.DvdDaoMI;
import com.mycompany.dvdlibrary.dto.DVD;
import com.mycompany.dvdlibrary.service.DvdService;
import com.mycompany.dvdlibrary.ui.DvdView;
import com.mycompany.dvdlibrary.ui.UserIO;
import com.mycompany.dvdlibrary.ui.UserIOConsoleImpl;


/**
 *
 * @author bafsharim
 */
public class App {
    
    public static void main(String[] args) {
        UserIO io = new UserIOConsoleImpl();
        DvdView view = new DvdView(io);
        
        DvdDao dao = new DvdDaoMI();
        DvdService service = new DvdService(dao);
        
        DvdController controller = new DvdController(service, view);
        controller.run();
    }  
}
