package settingsmanager;

public class Main {

    public static void main(String[] args) {
        SettingsManager settingsManager = SettingsManager.getInstance();
        settingsManager.setSetting("notification", "true");

        System.out.println(settingsManager.getSetting("notification"));
        System.out.println(settingsManager.getSetting("language"));
    }
}
