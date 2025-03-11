/*program to show inheritance
 * Author: Gregory Kimani
 * Reg No: CT101/G/19915/23
 * Date: 13rd February 2025
 */

public class InheritanceTwo {

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

        public Car(String brand, int speed, int FuelLevel)
        {
            super(brand, speed);
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
        public Bike(String brand, int speed, boolean helmetOn)
        {
            super(brand, speed);
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
