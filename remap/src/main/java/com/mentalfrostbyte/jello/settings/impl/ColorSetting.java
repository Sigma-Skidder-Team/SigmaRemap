// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.settings.impl;

import com.mentalfrostbyte.jello.settings.Setting;
import com.mentalfrostbyte.jello.settings.Type;
import totalcross.json.JSONObject;
import totalcross.json.CJsonUtils;

import java.awt.Color;

public class ColorSetting extends Setting<Integer> {
    public boolean field21520;

    public ColorSetting(final String s, final String s2, final int i, final boolean field21520) {
        super(s, s2, Type.COLOR, i);
        this.field21520 = false;
        this.field21520 = field21520;
    }

    public ColorSetting(final String s, final String s2, final int i) {
        super(s, s2, Type.COLOR, i);
        this.field21520 = false;
    }

    @Override
    public JSONObject method15186(final JSONObject JSONObject) {
        this.currentValue = Integer.valueOf(CJsonUtils.getIntOrDefault(JSONObject, "value", this.method15203()));
        this.field21520 = CJsonUtils.getBooleanOrDefault(JSONObject, "rainbow", false);
        return JSONObject;
    }

    public boolean method15219() {
        return this.field21520;
    }

    public void method15220(final boolean field21520) {
        this.field21520 = field21520;
    }

    @Override
    public JSONObject method15193(final JSONObject JSONObject) {
        JSONObject.put("name", this.method15204());
        JSONObject.put("value", this.method15222());
        JSONObject.put("rainbow", this.field21520);
        return JSONObject;
    }

    public Integer method15221() {
        if (!this.field21520) {
            return this.currentValue;
        }
        final Color color = new Color(this.currentValue);
        final float[] rgBtoHSB = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        return Color.getHSBColor(System.currentTimeMillis() % 4000L / 4000.0f, rgBtoHSB[1], rgBtoHSB[2]).getRGB();
    }

    public Integer method15222() {
        return this.currentValue;
    }
}
