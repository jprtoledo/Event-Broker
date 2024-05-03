package br.com.jprtoledo.eventbroker;

import br.com.jprtoledo.eventbroker.config.DatabaseConfig;

public class EventBroker {
    public static void main(String[] args) throws Exception {
        DatabaseConfig.initDatabases();
    }

}
