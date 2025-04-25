// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.settings.impl;

import com.mentalfrostbyte.jello.settings.Setting;
import com.mentalfrostbyte.jello.settings.Type;
import totalcross.json.JSONObject;
import mapped.CJsonUtils;

public class ButtonSetting extends Setting<Integer> {
    private String[] field21521;

    public ButtonSetting(final String s, final String s2, final Integer n, final String... field21521) {
        super(s, s2, Type.BUTTON, n);
        this.field21521 = field21521;
    }

    @Override
    public JSONObject method15186(final JSONObject JSONObject) {
        this.currentValue = Integer.valueOf(CJsonUtils.method26632(JSONObject, "value", this.method15203()));
        return JSONObject;
    }

    public String[] method15223() {
        return this.field21521;
    }
}
