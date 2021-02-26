package vitals;

public class Main {
    static boolean batteryIsOk(float temperature, float soc, float chargeRate) {
        if(temperature < 0 || temperature > 45) {
            return false;
        } else if(soc < 20 || soc > 80) {
            return false;
        } else if(chargeRate > 0.8) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        assert(vitalsAreOk(25, 70, 0.7) == true);
        assert(vitalsAreOk(50, 85, 0) == false);
        System.out.println("Some more tests needed");
    }
}
