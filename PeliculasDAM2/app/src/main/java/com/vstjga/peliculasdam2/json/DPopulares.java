
package com.vstjga.peliculasdam2.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class DPopulares {

    private DImages images;
    private List<String> changeKeys = new ArrayList<String>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The images
     */
    public DImages getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    public void setImages(DImages images) {
        this.images = images;
    }

    /**
     * 
     * @return
     *     The changeKeys
     */
    public List<String> getChangeKeys() {
        return changeKeys;
    }

    /**
     * 
     * @param changeKeys
     *     The change_keys
     */
    public void setChangeKeys(List<String> changeKeys) {
        this.changeKeys = changeKeys;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
