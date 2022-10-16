class ParkingSystem {
    
    private int big;
    private int medium;
    private int small;
    
    private final int BIG_TYPE = 1;
    private final int MEDIUM_TYPE = 2;
    private final int SMALL_TYPE = 3;
    
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == BIG_TYPE && big > 0){
            big--;
            return true;
        }
        
        if(carType == MEDIUM_TYPE && medium > 0){
            medium--;
            return true;
        }
        
        if(carType == SMALL_TYPE && small >0){
            small--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */