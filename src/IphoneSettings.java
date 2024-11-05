public class IphoneSettings {

    private static IphoneSettings instance;

    private int brightness;
    private boolean wifi;

    private IphoneSettings() {
        brightness = 100;
        wifi = false;
    }

    public static IphoneSettings getInstance() {
        if (instance == null) {
            instance = new IphoneSettings();
        }
        return instance;
    }


    public void disableWifi() {

        wifi = false;

    }

    public void enableWifi() {

        wifi = true;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    @Override
    public String toString() {
        return "IphoneSettings{" +
                "brightness=" + brightness +
                ", wifi=" + wifi +
                '}';
    }
}
