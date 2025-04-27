// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.settings.impl;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.settings.Setting;
import com.mentalfrostbyte.jello.settings.Type;
import mapped.*;
import totalcross.json.CJsonUtils;
import totalcross.json.JSONObject;

public class BooleanSetting extends Setting<Boolean> {
    public boolean field21516;

    public BooleanSetting(final String name, final String desc, final boolean b) {
        super(name, desc, Type.BOOLEAN, b);
        this.field21516 = false;
    }

    public BooleanSetting method15206() {
        this.field21516 = true;
        return this;
    }

    @Override
    public void method15201() {
        this.field21516 = false;
    }

    @Override
    public boolean getValue() {
        return this.field21516;
    }

    public void method15207(final Boolean b, final boolean b2) {
        if (this.field21516) {
            if (b2) {
                Client.getInstance().getNotificationManager().send(new Notification("Premium", "Not yet available for free version"));
            }
        }
        super.method15200(b, b2);
    }

    public Boolean method15208() {
        if (!this.field21516) {
            return this.currentValue;
        }
        return this.value;
    }

    @Override
    public JSONObject method15186(final JSONObject JSONObject) {
        this.currentValue = Boolean.valueOf(CJsonUtils.getBooleanOrDefault(JSONObject, "value", this.method15203()));
        return JSONObject;
    }
}
