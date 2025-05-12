class DesignParkingSystem {
    int bigCars = 0;
    int mediumCars = 0;
    int smallCars = 0;
    public ParkingSystem(int big, int medium, int small) {
        bigCars = big;
        mediumCars = medium;
        smallCars = small;
    }

    public boolean addCar(int carType) {
        if(carType == 1){
            if(bigCars  >= 1) bigCars --;
            else return false;
        }
        else if(carType == 2){
            if(mediumCars >= 1) mediumCars --;
            else return false;
        }
        else{
            if(smallCars >= 1) smallCars --;
            else return false;
        }

        return true;
    }
}