public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }
    public void subtractVolumeBy10(){
        this.volume -= 10;
    }

    public void refillBottle(){
        this.volume += 100;
    }
}
