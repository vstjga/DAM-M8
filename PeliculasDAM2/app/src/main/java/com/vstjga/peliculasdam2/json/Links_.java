package com.vstjga.peliculasdam2.json;

import java.util.HashMap;
import java.util.Map;

public class Links_ {

    private String self;
    private String alternate;
    private Map<String, Object> additionalProperties = new HashMap<>();

    /**
     * @return The self
     */
    public String getSelf() {
        return self;
    }

    /**
     * @param self The self
     */
    public void setSelf(String self) {
        this.self = self;
    }

    /**
     * @return The alternate
     */
    public String getAlternate() {
        return alternate;
    }

    /**
     * @param alternate The alternate
     */
    public void setAlternate(String alternate) {
        this.alternate = alternate;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
