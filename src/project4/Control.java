package project4;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Control {
    Model model;
    View view;
    Database db = new Database();
    String datetime = "";
    
    //Contructor
    public Control(Model m, View v){
        model = m;
        view = v;
        init();
        
    }
  
    public void init() {
//-------------------------------------------------------Updating-----------------------------------------------------------------------------

        //[Search] button
        view.addSearchAnimalActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if(view.getSearch().equals("")){
                    JOptionPane.showMessageDialog(null,"No Value!","Error",JOptionPane.ERROR_MESSAGE);
                }
                else if(db.ConstrainType(view.getSearch())) {
                    db.SearchAnimal(view, view.getSearch()); 
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Values!","Error",JOptionPane.ERROR_MESSAGE);
                }
               
            }
        });
        
        
        //[Add Animal] button
        view.addAddAnimalActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
                if (view.getAddName().equals("")&& view.getAddType().equals("") && view.getAddLocation().equals("")){
                    JOptionPane.showMessageDialog(null,"Invalid Values!","Error",JOptionPane.ERROR_MESSAGE); 
                }
                else if (db.ConstrainName(view.getAddName())){
                    JOptionPane.showMessageDialog(null,"This name exists!","Error",JOptionPane.ERROR_MESSAGE); 
                }else{
                    try {
                        //Add to database
                        db.AddAnimal(view.getAddName(), view.getAddType(), view.getAddLocation());
                        
                        
                        //Add to the Location table
                        view.addLocationLogValue(view.getAddName(), view.getAddType(), view.getAddLocation());
                        
                    
                        
                        //Display Successfully Added
                        Component frame = null;
                        JOptionPane.showMessageDialog(frame,"Successfully Added!","Congratulation",JOptionPane.INFORMATION_MESSAGE); 
                    } catch (ClassNotFoundException ex) {
                        
                        Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                }
                    
                //Update Location Table
                try{
                    db.updateLocationTable(view);
                }catch (SQLException ex) {
                    Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
          
        //[Add Activity] button
        view.addActivityActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
                if (view.getActivityName().equals("")&& view.getAddActivity().equals("") ){
                    JOptionPane.showMessageDialog(null,"Invalid Values!","Error",JOptionPane.ERROR_MESSAGE); 
                }
                else if (db.ConstrainName(view.getActivityName())){
                    try {
                        //Add to database 
                        db.updateActivityTable(view);
                        db.AddActivity(view.getActivityName(),view.getAddActivity(),getDateTime());
                                                             
                        //Add to the Location table
                        view.addActivityLog(view.getActivityName(),view.getAddActivity(),getDateTime());
                       
                        
                        //Display Successfully Added
                        Component frame = null;
                        JOptionPane.showMessageDialog(frame,"Successfully Added!","Congratulation",JOptionPane.INFORMATION_MESSAGE); 
                    } catch (ClassNotFoundException ex) {
                        
                        Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
                    }catch (SQLException ex) {
                        Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"This animal does not exist!","Error",JOptionPane.ERROR_MESSAGE);     
                }
                
            
            }
        });        


//-------------------------------------------------------Deleting-----------------------------------------------------------------------------
        //Move to different place within the zoo
        view.addMoveInListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if(view.getMoveName().equals("")&& view.getMoveLocation().equals("")){
                    JOptionPane.showMessageDialog(null,"No Value!","Error",JOptionPane.ERROR_MESSAGE);
                }
                else if(db.ConstrainName(view.getMoveName())) {
                    try{
                        db.UpdateLocation(view.getMoveLocation(), view.getMoveName());
                        db.updateLocationTable(view);
                        JOptionPane.showMessageDialog(view, "Item moved successfully.");
                    }
                    catch (SQLException ex) {
                        Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Values!","Error",JOptionPane.ERROR_MESSAGE);
                }
               
            }
        });
        //Move out of the Zoo = Delete the Animal off database
        view.addMoveOutListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent evt) {
                
                try {
                    db.MoveAnimalOut("Animal", "name", view.getMoveOutName());
                    db.updateLocationTable(view);
                    JOptionPane.showMessageDialog(view, "Item deleted successfully.");
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        //[Reset1] in Animal Panel
        view.addReset1ActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                view.setAddName("");
                view.setAddType("");
                view.setAddLocation("");
            }
        });
        //[Reset2] in Activity Panel
        view.addReset2ActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                view.setActivityName("");
                view.setActivity("");
            }
        });
        //[Reset3] in Transport Panel
        view.addReset3ActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                view.setMoveName("");
                view.setMoveLocation("");
                view.setMoveOutName("");
                view.setMoveOutType("");
            }
        });
        
        //Exit menu
        view.addExitActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                System.exit(0);
            }
        });
    }
    
         //Get Current Time
        public String getDateTime(){
            Calendar cal = new GregorianCalendar();
            
            int month = cal.get(Calendar.MONTH);
            int year = cal.get(Calendar.YEAR);
            int day = cal.get(Calendar.DAY_OF_MONTH);
            int second = cal.get(Calendar.SECOND);
            int minute = cal.get(Calendar.MINUTE);
            int hour = cal.get(Calendar.HOUR);
            datetime = year + "/" + (month+1) + "/" + day + " " + hour + ":" + (minute) + ":" + second;
            
            return datetime;
        }
    
}
