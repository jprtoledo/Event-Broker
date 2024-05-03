package br.com.jprtoledo.eventbroker.config;

import br.com.jprtoledo.eventbroker.schema.*;

import java.util.ArrayList;
import java.util.List;

public enum EventBuses {
    EVENT_TEST("api-test", "event-test", 1.0, EventTest.class);
//    EVENT_TEST0("event-test", "create", 1.0, EventTest.class),
//    EVENT_TEST1("event-test", "create", 1.0, EventTest.class),
//    EVENT_TEST2("event-test", "create", 1.0, EventTest.class),
//    EVENT_TEST3("event-test", "create", 1.0, EventTest.class),
//    EVENT_TEST4("event-test", "create", 1.0, EventTest.class),
//    EVENT_TEST65("event-test", "create", 1.0, EventTest.class),
//    EVENT_TEST87("event-test", "create", 1.0, EventTest.class),
//    EVENT_TEST9("event-test", "create", 1.0, EventTest.class),
//    EVENT_TEST10("event-test", "create", 1.0, EventTest.class),
//    EVENT_TEST11("event-test", "create", 1.0, EventTest.class),
//    EVENT_TEST12("event-test", "create", 1.0, EventTest.class),
//    EVENT_TEST13("event-test", "create", 1.0, EventTest.class),
//    EVENT_TEST14("event-test", "create", 1.0, EventTest.class),
//    EVENT_TEST15("event-test", "create", 1.0, EventTest.class),
//    EVENT_TEST16("event-test", "create", 1.0, EventTest.class),
//    EVENT_TEST17("event-test", "create", 1.0, EventTest.class),
//    EVENT_TEST18("event-test", "create", 1.0, EventTest.class),
//    EVENT_TEST19("event-test", "create", 1.0, EventTest.class),
//    EVENT_TEST20("event-test", "create", 1.0, EventTest.class),
//    EVENT_TEST21("event-test", "create", 1.0, EventTest.class);

    private final String facility;
    private final String entity;
    private final Double version;
    private final Class<?> schema;

    EventBuses(String facility, String entity, Double version, Class<?> schema) {
        this.facility = facility;
        this.entity = entity;
        this.version = version;
        this.schema = schema;
    }

    public String getFacility() {
        return facility;
    }

    public String getEntity() {
        return entity;
    }

    public Double getVersion() {
        return version;
    }

    public Class<?> getSchema() {
        return schema;
    }

    public static EventBuses findByEntity(String entity) {
        for (EventBuses value : values()) {
            if (value.entity.equals(entity)){
                return value;
            }
        }
        return null;
    }

    public static List<String> entities() {
        List<String> entities = new ArrayList<>();

        for (EventBuses value : values()) {
            entities.add(value.entity);
        }

        return entities;
    }


}
