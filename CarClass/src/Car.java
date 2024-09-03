public class Car {
    String make;
    String model;
    int year;
    private double mileage;

    Car(String make, String model, int year, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }
    void drive(double newMileage) {
        mileage += newMileage;
    }

    public double getMileage() {
        if (mileage > 3000) {
            System.out.println("Your car needs an oil change");
        }
        return mileage;

    }


}