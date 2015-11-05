package com.vstjga.peliculasdam2.json;

import java.util.HashMap;
import java.util.Map;

public class ReleaseDates {

    private String theater;
    private Map<String, Object> additionalProperties = new HashMap<>();

    /**
     * @return The theater
     */
    public String getTheater() {
        return theater;
    }

    /**
     * @param theater The theater
     */
    public void setTheater(String theater) {
        this.theater = theater;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
