public class HillsStationsTour{
    
    public class HillStations{
        //method to be overide by its subclass
        public void location(){
            System.out.println("This is a hill station");
        }

        // method to be overide by subclass
        public void famousFor(){
            System.out.println("Famous for its scenic beauty");
        }
    }

    // subclass 1 Manali
    public class Manali extends HillStations{
        // overriding location method
         public void location(){
            System.out.println("manali is located in Himachal pradesh");
         }

         // override famous for method
        public void famousFor(){
            System.out.println("Manali is famous for snow-clad mountains and adventure sports");

        }
    }

    // subclass 2 Mussoorie
    public class Mussoorie extends HillStations {
        //override location method
        public void location(){
            System.out.println("Mussoorie is located in Uttrakhand");
        }

        // override FamousFor method
        public void famousFor(){
            System.out.println("Mussoorie is famous for its scenic hills and colonial architecture.");
            
        }
    
        
    }
    // subclass 2 Gulmarg

    public class Gulmarg extends HillStations{

        //override location methodn                                                                                                 
        public void location(){
            System.out.println("Gulmarg is located in Jammu and Kashmir.");
        }

        // override FamousFor method
        public void famousFor(){
            System.out.println("Gulmarg is famous for skiing and winter sports.");
            
        }


    }

    public static void main(String[] args) {
        // create a instance of the outer class
        HillsStationsTour tour = new HillsStationsTour();

        /// using the outer class instance create a inner class instances
        HillStations hillStations;
        
        // refrering to manali object
        hillStations = tour.new Manali();
        hillStations.location();
        hillStations.famousFor();

        // refering to Mossoorie object
        hillStations = tour.new Mussoorie();
        hillStations.location();
        hillStations.famousFor();

        // refering to the Gulmarg object
        hillStations = tour.new Gulmarg();
        hillStations.location();
        hillStations.famousFor();




        
        




        
    }



}