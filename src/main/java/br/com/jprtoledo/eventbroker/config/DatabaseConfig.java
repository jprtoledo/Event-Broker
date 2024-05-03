package br.com.jprtoledo.eventbroker.config;

import java.util.ArrayList;
import java.util.List;

public class DatabaseConfig {

    public static List<String> databases = new ArrayList<>();

    public static void initDatabases() {
        for (EventBuses value : EventBuses.values()) {
            String databaseName = String.format("%s_%s_%s", value.getFacility(), value.getEntity(), value.getVersion().toString())
                    .replace('.', '_').replace('-', '_');
        }

    }
}
