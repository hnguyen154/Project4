package project4;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Control {
    Model model;
    View view;
    Database db = new Database();
    
    public Control(Model m, View v){
        model = m;
        view = v;
        init();
        
    }
    public void init() {
//-------------------------------------------------------Updating-----------------------------------------------------------------------------
        //[Add Animal] button
        view.addAddAnimalActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
                if (view.getAddName().equals("")&& view.getAddType().equals("") && view.getAddLocation().equals("")){
                    JOptionPane.showMessageDialog(null,"Invalid!","Error",JOptionPane.ERROR_MESSAGE); 
                }
                else{
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
                
                //Update Table
                try {
                        db.updateLocationTable(view);
                    } catch (SQLException ex) {
                        Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        });
        
//-------------------------------------------------------Searching-----------------------------------------------------------------------------        


//-------------------------------------------------------Deleting-----------------------------------------------------------------------------
        
        //Move out of the Zoo = Delete the Animal off database
        view.addMoveOutListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent evt) {
                db.MoveAnimalOut("Animal", "name", view.getMoveOutName());
                
                try {
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
                view.setActivityLocation("");
            }
        });
        //[Reset3] in Transport Panel
        view.addReset2ActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                view.setMoveName("");
                view.setMoveType("");
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
}
