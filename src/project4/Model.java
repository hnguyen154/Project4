package project4;

public class Model {
        private String name;
        private String type;
        private String location;
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
        
        //Get Animal's Type
        public String getLocation(){
            return location;
        } 
        //Set Animal's Type
        public void setLocation(String t){
            location = t;
        }
       
       
}
