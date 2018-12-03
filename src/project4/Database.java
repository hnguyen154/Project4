
package project4;

import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.*;
import javax.swing.table.DefaultTableModel;

public class Database {
    Connection conn = null;
    Statement st = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String url = "jdbc:sqlite:zooDB.db";
    int out =0; 
    
    public Database(){
        try{
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(url);
            System.out.println("Connected");
        }catch(Exception e){
            System.out.println(""+e);
        }
    
    }
    public void SearchAnimal(View v, String name) {
        try {
            //System.setProperty("jdbc.drivers", jdbc_drivers);

            conn = DriverManager.getConnection(url);
            st = conn.createStatement();

            String sql = "SELECT * FROM Animal WHERE Type = ?";

            pst = conn.prepareStatement(sql);
           
            pst.setString(1, name);
            rs = pst.executeQuery();
            

            if (rs.next()) {
                System.out.println(rs.getString(1));
                v.setSearchName(rs.getString(1));
                v.setSearchType(rs.getString(2));
                v.setSearchLocation(rs.getString(3));
                
            } 

        } catch (SQLException ex) {
            //Logger lgr = Logger.getLogger(Version.class.getName());
            //lgr.log(Level.SEVERE, ex.getMessage(), ex);
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException ex) {
                // Logger lgr = Logger.getLogger(Version.class.getName());
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
                //lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
        }
    }   
    public int AddAnimal(String name, String type, String location) throws ClassNotFoundException {

        try {
            conn = DriverManager.getConnection(url);
            st = conn.createStatement();

            String sql = "INSERT INTO Animal(name, type, location) VALUES (?,?,?);";
            pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, type);
            pst.setString(3, location);
            
            pst.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return out;
    }
    public boolean ConstrainName (String name) {
      
         try{
            conn = DriverManager.getConnection(url);
            st = conn.createStatement();

            String sql = "SELECT * FROM Animal WHERE Name='"+name+"';";
            rs = st.executeQuery(sql);
            
            if (rs.next()){
                System.out.println(sql + "\nSuccessful!");
                return true;
            }
                System.out.println(sql + "\nFail!");
                return false;
            
            
        }  catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean ConstrainType (String type) {
      
         try{
            conn = DriverManager.getConnection(url);
            st = conn.createStatement();

            String sql = "SELECT * FROM Animal WHERE Type='"+type+"';";
            rs = st.executeQuery(sql);
            
            if (rs.next()){
                System.out.println(sql + "\nSuccessful!");
                return true;
            }
                System.out.println(sql + "\nFail!");
                return false;
            
            
        }  catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public int AddActivity(String name, String activity, String datetime) throws ClassNotFoundException {

        try {
            conn = DriverManager.getConnection(url);
            st = conn.createStatement();

            String sql = "INSERT INTO Activity(name, activity, datetime) VALUES (?,?,?);";
            pst = conn.prepareStatement(sql);
            
            pst.setString(1, name);
            pst.setString(2, activity);
            pst.setString(3, datetime);

            pst.executeUpdate();
            
          
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return out;
    }
//    //Update a new location
//    public void UpdateLocation (String location, String name){
//        try {
//            conn = DriverManager.getConnection(url);
//            st = conn.createStatement();
//
//            //Delete Location table
//            String sql = "UPDATE Animal SET Location='" + location + "'" + " WHERE Name ='" + name + "';";
//            st.executeUpdate(sql);
//            System.out.println("Location got updated!");
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
//
//        } finally {
//            try {
//                if (rs != null) {
//                    rs.close();
//                }
//                if (st != null) {
//                    st.close();
//                }
//                if (conn != null) {
//                    conn.close();
//                }
//
//            } catch (SQLException ex) {
//                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
//    
//    
    //Delete item based on Animal's name
    public void MoveAnimalOut(String Table, String col, String data) {

        try {
            conn = DriverManager.getConnection(url);
            st = conn.createStatement();

            //Delete Location table
            String sql = "DELETE FROM Animal WHERE Name = ?";

            pst = conn.prepareStatement(sql);
            pst.setString(1, data);
            System.out.println(Table);
            System.out.println(col);
            System.out.println(data);
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //Update Location Table
    public void updateLocationTable(View v) throws SQLException {
        ResultSet s;
        try {
            conn = DriverManager.getConnection(url);
            st = conn.createStatement();

            String updateTable = "SELECT * FROM Animal";
            s = st.executeQuery(updateTable);

            v.setLocationTableModel(buildTableModel(s));


        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);


        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException ex) {
               
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
         
            }
        }
    }
    
    //Update Location Table
    public void updateActivityTable(View v) throws SQLException {
        ResultSet s;
        try {
            conn = DriverManager.getConnection(url);
            st = conn.createStatement();

            String updateTable = "SELECT * FROM Activity";
            s = st.executeQuery(updateTable);

            v.setActivityTableModel(buildTableModel(s));


        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);


        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException ex) {
               
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
         
            }
        }
    }

    public static DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {

        ResultSetMetaData metaData = rs.getMetaData();

        // names of columns
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        // data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }

        return new DefaultTableModel(data, columnNames);

    }
    
}