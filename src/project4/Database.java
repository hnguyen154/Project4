
package project4;

import java.sql.*;
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
    
    //Delete item based on Animal's name
    public void MoveAnimalOut(String Table, String col, String data) {

        try {
            conn = DriverManager.getConnection(url);
            st = conn.createStatement();

            //Delete table
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
    
    //Update database 
    public void Update(String Table, String colu1, String data1, String colu2, String data2) {

        try {
           // System.setProperty("jdbc.drivers", jdbc_drivers);

            conn = DriverManager.getConnection(url);
            st = conn.createStatement();

            String updateTable = "UPDATE " + Table + " SET " + colu1 + " = " + data1 + " WHERE " + colu2 + " = " + data2 + ";";
            st.executeUpdate(updateTable);
            System.out.println("Updated table in database...");

        } catch (SQLException ex) {
            // Logger lgr = Logger.getLogger(Version.class.getName());
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
                // Logger lgr = Logger.getLogger(Version.class.getName());
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
                //lgr.log(Level.WARNING, ex.getMessage(), ex);
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
    //Get the animal's name using animal's type
    public String getName(String n){
        try{
            st = conn.createStatement();
            rs = st.executeQuery("SELECT Name, Type FROM Animal;");
            while(rs.next()){
                if(rs.getString("Type").equals(n)){
                    return rs.getString("Name");
                }
            }
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return "Fail";
    } 
    
    //Get the animal type using animal's name
    public String getType(String l){
        try{
            st = conn.createStatement();
            rs = st.executeQuery("SELECT Name, Type FROM Animal;");
            while(rs.next()){
                if(rs.getString("Name").equals(l)){
                    return rs.getString("Type");
                }
            }
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return "Fail";
    }
    
    //Get the location using animal's name
    public String getLocation(String l){
        try{
            st = conn.createStatement();
            rs = st.executeQuery("SELECT Name, Location FROM Animal;");
            while(rs.next()){
                if(rs.getString("Name").equals(l)){
                    return rs.getString("Location");
                }
            }
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return "Fail";
    }
    //Get the location using animal's name
    public String getActivity(String l){
        try{
            st = conn.createStatement();
            rs = st.executeQuery("SELECT Name, Location FROM Activity;");
            while(rs.next()){
                if(rs.getString("Name").equals(l)){
                    return rs.getString("Activity");
                }
            }
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return "Fail";
    }  
}