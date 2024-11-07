package settingsmanager;

import java.util.HashMap;
import java.util.Map;

public class SettingsManager {

    private static SettingsManager instance;

    private static Map<String, String> settings;

    private SettingsManager() {
    }

    public synchronized static SettingsManager getInstance() {
        if (instance == null) {
            settings = new HashMap<>();
            // Default settings
            settings.put("theme", "dark");
            settings.put("language", "english");
            instance = new SettingsManager();
        }
        return instance;
    }

    public void setSetting(String key, String value) {
        settings.put(key, value);
    }

    public String getSetting(String key) {
        return settings.get(key);
    }

    public void displaySettings() {
        System.out.println("Settings:");
        settings.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    }


}
