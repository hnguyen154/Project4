package project4;

public class Model {
        private String name;
        private String type;
        Database db;
        
        //Constructor
        public Model() {
              db = new Database(); 
        }
        //Get Animal's Name
        public String getName(){
            return name;
        }
        //Set Animal's Name
        public void setName(String n){
            name = n;
        }
       
        //Get Animal's Type
        public String getType(){
            return type;
        } 
        //Set Animal's Type
        public void setType(String t){
            type = t;
        }
        
        //Get name from database using the type 
        public String getNameDB(){
            return db.getName(type);
        }
        //Get type from database using the name
        public String getTypeDB(){
            return db.getType(name);
        }
        //Get location from the database using the name
        public String getLocationDB(){
            return db.getLocation(name);
        }
        //Get the activity from the database using the name
        public String getActivityDB(){
            return db.getActivity(name);
        }
       
}
