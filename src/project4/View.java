
package project4;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class View extends javax.swing.JFrame {

    
    public View() {
        initComponents();
        
        //Center
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((screen.getWidth() - getWidth()) / 2);
        int y = (int) ((screen.getHeight() - getHeight()) / 2);
        setLocation(x, y);
       
    }
    
    //Add Animal Panel
    public String getAddName() {
        return AddNameField.getText();
    }
    public void setAddName(String name) {
        AddNameField.setText(name);
    }
    public String getAddType() {
        return AddTypeField.getText();
    }
    public void setAddType(String type) {
        AddTypeField.setText(type);
    }
    public String getAddLocation(){
        return AddLocationField.getText();
    }
    public void setAddLocation(String location) {
        AddLocationField.setText(location);
    }
    public void addAddAnimalActionListener(ActionListener a) {
        addAnimalBtn.addActionListener(a);
    }
    public void addReset1ActionListener(ActionListener a) {
        Reset1.addActionListener(a);
    }
    
    //Add Activity
    public String getActivityName() {
        return NameField.getText();
    }
    public void setActivityName(String name) {
        NameField.setText(name);
    }
    public String getAddActivity() {
        return ActivityField.getText();
    }
    public void setActivity(String activity) {
        ActivityField.setText(activity);
    }
    public String getActivityLocation() {
        return LocationField.getText();
    }
    public void setActivityLocation(String location) {
        LocationField.setText(location);
    }
    public void addActivityActionListener(ActionListener a) {
        AddActivityBtn.addActionListener(a);
    }
    public void addReset2ActionListener(ActionListener a) {
        Reset2.addActionListener(a);
    }
    
    //Transport
    public String getMoveName(){
        return MoveInNameField.getText();
    }
    public void setMoveName(String s){
        MoveInNameField.setText(s);
    }
    public String setMoveType(){
        return MoveInTypeField.getText();
    }   
    public void setMoveType(String s){
        MoveInTypeField.setText(s);
    }
    public String getMoveLocation(){
        return MoveInField.getText();
    }
    public void setMoveLocation(String in) {
        MoveInField.setText(in);
    }
    
    public String getMoveOutName(){
        return MoveOutNameField.getText();
    }
    public void setMoveOutName(String s){
        MoveOutNameField.setText(s);
    }
    public String getMoveOutType(){
        return MoveOutTypeField.getText();
    }
    public void setMoveOutType(String s){
        MoveOutTypeField.setText(s);
    }    
    
    public void addMoveInListener(ActionListener a) {
        MoveInBtn.addActionListener(a);
    }
    public void addMoveOutListener(ActionListener a) {
        MoveOutBtn.addActionListener(a);
    }
    public void addReset3ActionListener(ActionListener a) {
        Reset3.addActionListener(a);
    }
    
    //Activity Log
    public void setActivityLogValue (String s, int row, int column){
        ActivityLog.setValueAt((Object)s, row, column);
    }
    public void addActivityLog (String str1, String str2, String str3, String str4){
        DefaultTableModel table = (DefaultTableModel) ActivityLog.getModel();
        table.addRow(new Object[]{str1,str2,str3,str4});
    }
    
    //Location Log
     public void getLocationTableModel(TableModel model) {
        LocationLog.setModel(model);
    }

    public void setLocationTableModel(TableModel model) {
        LocationLog.setModel(model);
    }
    
    public void setLocationLogValue (String s, int row, int column){
        LocationLog.setValueAt((Object)s, row, column);
    }    
    public void addLocationLogValue (String str1, String str2, String str3){
        DefaultTableModel table = (DefaultTableModel) LocationLog.getModel();
        table.addRow(new Object[]{str1,str2,str3});
    }
    
    
    //Menu Item: Exit
    public void addExitActionListener(ActionListener a) {
        Exit.addActionListener(a);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane2 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        ContentPane = new javax.swing.JTabbedPane();
        AddAnimalPane = new javax.swing.JPanel();
        addNameTitle = new javax.swing.JLabel();
        addTypeTitle = new javax.swing.JLabel();
        AddNameField = new javax.swing.JTextField();
        AddLocationField = new javax.swing.JTextField();
        addAnimalBtn = new java.awt.Button();
        addLocationTitle = new javax.swing.JLabel();
        AddTypeField = new javax.swing.JTextField();
        Reset1 = new javax.swing.JButton();
        AddActivityPane = new javax.swing.JPanel();
        AnimalNameTitle = new javax.swing.JLabel();
        AddActivityTitle = new java.awt.Label();
        LocationTitle = new javax.swing.JLabel();
        ActivityField = new javax.swing.JTextField();
        LocationField = new javax.swing.JTextField();
        AddActivityBtn = new javax.swing.JButton();
        Reset2 = new javax.swing.JButton();
        NameField = new javax.swing.JTextField();
        TransportPane = new javax.swing.JPanel();
        CategoryIn = new javax.swing.JLabel();
        CateoryOut = new javax.swing.JLabel();
        MoveInTitle = new javax.swing.JLabel();
        MoveInField = new javax.swing.JTextField();
        MoveOutBtn = new javax.swing.JButton();
        MoveInBtn = new javax.swing.JButton();
        Reset3 = new javax.swing.JButton();
        MoveOutTitle1 = new javax.swing.JLabel();
        MoveOutTypeTitle = new javax.swing.JLabel();
        MoveOutNameField = new javax.swing.JTextField();
        MoveOutTypeField = new javax.swing.JTextField();
        MoveInNameTitle = new javax.swing.JLabel();
        MoveInTypeTitle = new javax.swing.JLabel();
        MoveInTypeField = new javax.swing.JTextField();
        MoveInNameField = new javax.swing.JTextField();
        ActivityPane = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ActivityLog = new javax.swing.JTable();
        LocationPane = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LocationLog = new javax.swing.JTable();
        Title = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        Exit = new javax.swing.JMenu();

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        addNameTitle.setText("Name:");

        addTypeTitle.setText("Type:");

        addAnimalBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        addAnimalBtn.setLabel("Add Animal");

        addLocationTitle.setText("Location:");

        Reset1.setText("Reset");

        javax.swing.GroupLayout AddAnimalPaneLayout = new javax.swing.GroupLayout(AddAnimalPane);
        AddAnimalPane.setLayout(AddAnimalPaneLayout);
        AddAnimalPaneLayout.setHorizontalGroup(
            AddAnimalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddAnimalPaneLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(AddAnimalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addLocationTitle)
                    .addComponent(addTypeTitle)
                    .addComponent(addNameTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddAnimalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddLocationField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(542, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddAnimalPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AddAnimalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Reset1)
                    .addComponent(addAnimalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(235, 235, 235))
        );
        AddAnimalPaneLayout.setVerticalGroup(
            AddAnimalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddAnimalPaneLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(AddAnimalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNameTitle)
                    .addComponent(AddNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(addAnimalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(AddAnimalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addTypeTitle)
                    .addComponent(AddTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(Reset1)
                .addGap(4, 4, 4)
                .addGroup(AddAnimalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addLocationTitle)
                    .addComponent(AddLocationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        ContentPane.addTab("Add Animal", AddAnimalPane);

        AnimalNameTitle.setText("Name:");

        AddActivityTitle.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        AddActivityTitle.setText("Add Activity");

        LocationTitle.setText("Location: ");

        AddActivityBtn.setText("Add Activity");

        Reset2.setText("Reset");

        javax.swing.GroupLayout AddActivityPaneLayout = new javax.swing.GroupLayout(AddActivityPane);
        AddActivityPane.setLayout(AddActivityPaneLayout);
        AddActivityPaneLayout.setHorizontalGroup(
            AddActivityPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddActivityPaneLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(AddActivityPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddActivityTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnimalNameTitle)
                    .addComponent(LocationTitle))
                .addGap(30, 30, 30)
                .addGroup(AddActivityPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ActivityField)
                    .addComponent(LocationField)
                    .addComponent(NameField, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(AddActivityPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddActivityBtn)
                    .addComponent(Reset2))
                .addGap(170, 170, 170))
        );
        AddActivityPaneLayout.setVerticalGroup(
            AddActivityPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddActivityPaneLayout.createSequentialGroup()
                .addGroup(AddActivityPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddActivityPaneLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(AddActivityBtn))
                    .addGroup(AddActivityPaneLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(AddActivityPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AnimalNameTitle))
                        .addGap(27, 27, 27)
                        .addGroup(AddActivityPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddActivityTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ActivityField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addGroup(AddActivityPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocationTitle)
                    .addComponent(LocationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset2))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        ContentPane.addTab("Add Activity", AddActivityPane);

        CategoryIn.setText("Within Zoo");

        CateoryOut.setText("Outside of the Zoo");

        MoveInTitle.setText("Move to: ");
        MoveInTitle.setToolTipText("");

        MoveOutBtn.setText("Move");

        MoveInBtn.setText("Move");

        Reset3.setText("Reset");

        MoveOutTitle1.setText("Name:");
        MoveOutTitle1.setToolTipText("");

        MoveOutTypeTitle.setText("Type:");
        MoveOutTypeTitle.setToolTipText("");

        MoveInNameTitle.setText("Name:");
        MoveInNameTitle.setToolTipText("");

        MoveInTypeTitle.setText("Type:");
        MoveInTypeTitle.setToolTipText("");

        javax.swing.GroupLayout TransportPaneLayout = new javax.swing.GroupLayout(TransportPane);
        TransportPane.setLayout(TransportPaneLayout);
        TransportPaneLayout.setHorizontalGroup(
            TransportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransportPaneLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(CategoryIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CateoryOut)
                .addGap(201, 201, 201))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransportPaneLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(TransportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MoveInTypeTitle)
                    .addGroup(TransportPaneLayout.createSequentialGroup()
                        .addGroup(TransportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MoveInTitle)
                            .addComponent(MoveInNameTitle))
                        .addGap(34, 34, 34)
                        .addGroup(TransportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MoveInTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MoveInField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MoveInNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(TransportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MoveOutTitle1)
                    .addComponent(MoveOutTypeTitle))
                .addGap(60, 60, 60)
                .addGroup(TransportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MoveOutTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MoveOutNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransportPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Reset3)
                .addGap(192, 192, 192)
                .addComponent(MoveOutBtn)
                .addGap(186, 186, 186))
            .addGroup(TransportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TransportPaneLayout.createSequentialGroup()
                    .addGap(185, 185, 185)
                    .addComponent(MoveInBtn)
                    .addContainerGap(681, Short.MAX_VALUE)))
        );
        TransportPaneLayout.setVerticalGroup(
            TransportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransportPaneLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(TransportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CategoryIn)
                    .addComponent(CateoryOut))
                .addGroup(TransportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TransportPaneLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(TransportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MoveOutTitle1)
                            .addComponent(MoveOutNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MoveInNameTitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransportPaneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MoveInNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(TransportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MoveOutTypeTitle)
                    .addComponent(MoveOutTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MoveInTypeTitle)
                    .addComponent(MoveInTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TransportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MoveInTitle)
                    .addComponent(MoveInField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(TransportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MoveOutBtn)
                    .addComponent(Reset3))
                .addGap(94, 94, 94))
            .addGroup(TransportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransportPaneLayout.createSequentialGroup()
                    .addContainerGap(263, Short.MAX_VALUE)
                    .addComponent(MoveInBtn)
                    .addGap(93, 93, 93)))
        );

        ContentPane.addTab("Transporting", TransportPane);

        ActivityLog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Activity", "Animal's Name", "Animal's Type", "Date and Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ActivityLog);

        javax.swing.GroupLayout ActivityPaneLayout = new javax.swing.GroupLayout(ActivityPane);
        ActivityPane.setLayout(ActivityPaneLayout);
        ActivityPaneLayout.setHorizontalGroup(
            ActivityPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ActivityPaneLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        ActivityPaneLayout.setVerticalGroup(
            ActivityPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );

        ContentPane.addTab("Activity Log", ActivityPane);

        LocationLog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Animal's Name", "Animal's Type", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(LocationLog);

        javax.swing.GroupLayout LocationPaneLayout = new javax.swing.GroupLayout(LocationPane);
        LocationPane.setLayout(LocationPaneLayout);
        LocationPaneLayout.setHorizontalGroup(
            LocationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LocationPaneLayout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        LocationPaneLayout.setVerticalGroup(
            LocationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );

        ContentPane.addTab("Location Log", LocationPane);

        Title.setText("ZOOLOGISTICS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPane)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title)
                .addGap(411, 411, 411))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(Title)
                .addGap(30, 30, 30)
                .addComponent(ContentPane, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        File.setText("File");

        Exit.setText("Exit");
        File.add(Exit);

        MenuBar.add(File);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ActivityField;
    private javax.swing.JTable ActivityLog;
    private javax.swing.JPanel ActivityPane;
    private javax.swing.JButton AddActivityBtn;
    private javax.swing.JPanel AddActivityPane;
    private java.awt.Label AddActivityTitle;
    private javax.swing.JPanel AddAnimalPane;
    private javax.swing.JTextField AddLocationField;
    private javax.swing.JTextField AddNameField;
    private javax.swing.JTextField AddTypeField;
    private javax.swing.JLabel AnimalNameTitle;
    private javax.swing.JLabel CategoryIn;
    private javax.swing.JLabel CateoryOut;
    private javax.swing.JTabbedPane ContentPane;
    private javax.swing.JMenu Exit;
    private javax.swing.JMenu File;
    private javax.swing.JTextField LocationField;
    private javax.swing.JTable LocationLog;
    private javax.swing.JPanel LocationPane;
    private javax.swing.JLabel LocationTitle;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JButton MoveInBtn;
    private javax.swing.JTextField MoveInField;
    private javax.swing.JTextField MoveInNameField;
    private javax.swing.JLabel MoveInNameTitle;
    private javax.swing.JLabel MoveInTitle;
    private javax.swing.JTextField MoveInTypeField;
    private javax.swing.JLabel MoveInTypeTitle;
    private javax.swing.JButton MoveOutBtn;
    private javax.swing.JTextField MoveOutNameField;
    private javax.swing.JLabel MoveOutTitle1;
    private javax.swing.JTextField MoveOutTypeField;
    private javax.swing.JLabel MoveOutTypeTitle;
    private javax.swing.JTextField NameField;
    private javax.swing.JButton Reset1;
    private javax.swing.JButton Reset2;
    private javax.swing.JButton Reset3;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel TransportPane;
    private java.awt.Button addAnimalBtn;
    private javax.swing.JLabel addLocationTitle;
    private javax.swing.JLabel addNameTitle;
    private javax.swing.JLabel addTypeTitle;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
