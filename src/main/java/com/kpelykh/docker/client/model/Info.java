package com.kpelykh.docker.client.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author Konstantin Pelykh (kpelykh@gmail.com)
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Info {

    @JsonProperty("Debug")
    public boolean debug;

    @JsonProperty("Containers")
    public int    containers;

    @JsonProperty("Images")
    public int    images;

    public int    NFd;

    public int    NGoroutines;

    @JsonProperty("MemoryLimit")
    public boolean memoryLimit;


    @Override
    public String toString() {
        return "Info{" +
                "debug=" + debug +
                ", containers=" + containers +
                ", images=" + images +
                ", NFd=" + NFd +
                ", NGoroutines=" + NGoroutines +
                ", memoryLimit=" + memoryLimit +
                '}';
    }

}
