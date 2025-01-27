// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.settings.impl;

import com.mentalfrostbyte.jello.settings.Setting;
import com.mentalfrostbyte.jello.settings.Type;
import mapped.JSONObject;
import mapped.Class8105;

public class TextInputSetting extends Setting<String> {
    public TextInputSetting(final String s, final String s2, final String s3) {
        super(s, s2, Type.TEXTINPUT, s3);
    }

    @Override
    public JSONObject method15186(final JSONObject JSONObject) {
        this.currentValue = Class8105.method26636(JSONObject, "value", this.method15203());
        return JSONObject;
    }
}
