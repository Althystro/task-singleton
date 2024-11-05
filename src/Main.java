public class Main {
    public static void main(String[] args) {
        IphoneSettings iphoneSettings = IphoneSettings.getInstance();
        IphoneSettings iphoneSettings2 = IphoneSettings.getInstance();


        System.out.println("1: " + iphoneSettings);
        System.out.println("2: " + iphoneSettings2);

        iphoneSettings.enableWifi();
        iphoneSettings2.setBrightness(5);

        System.out.println("1: " + iphoneSettings);
        System.out.println("2: " + iphoneSettings2);


    }
}