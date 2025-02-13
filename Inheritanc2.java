public class Inheritanc2 {

    public class Vehicle {
        protected String brand;
        protected int speed;

        public Vehicle(String brand, int speed)
        {
            this.brand = brand;
            this.speed = speed;
        }

        public void accelerate(int increase){
            speed += increase;
        }

        public void brake(int decrease){
            while(speed > 0) {                
                speed -= decrease;
            }
        }

        public void showDetails(){
            System.out.println("A Vehicle");
        }
    
        
    }

    public class Car extends Vehicle {
        protected int FuelLevel;

        public Car(int FuelLevel)
        {
            this.FuelLevel = FuelLevel;
        }

        public void refuel(int amount){
            while (FuelLevel != 100) {
                FuelLevel++;
            }
        }

        @Override
        public void showDetails(){}
        
    }

    public class Bike extends Vehicle {
        protected boolean helmetOn;

        public Bike(boolean helmetOn)
        {
            this.helmetOn = helmetOn;
        }


        public void wearHelmet(){
            helmetOn = true;
        }

        @Override
        public void showDetails(){}
        
    }

    public static void main(String[] args) {
        
    }
    
}
