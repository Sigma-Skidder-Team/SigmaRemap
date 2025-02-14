package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.Event;
import totalcross.json.JSONObject;

public class EventWritter implements Event {
    private final JSONObject file;

    public EventWritter(JSONObject var1) {
        this.file = var1;
    }

    public JSONObject getFile() {
        return this.file;
    }
}
