// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.settings.impl;

import com.mentalfrostbyte.jello.settings.Setting;
import com.mentalfrostbyte.jello.settings.Type;
import totalcross.json.JSONObject;
import totalcross.json.CJsonUtils;
import totalcross.json.JSONArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;
import java.util.List;

public class StringListSetting extends Setting<List<String>> {
    private boolean field21517;

    public StringListSetting(final String s, final String s2, final boolean b, final String... a) {
        super(s, s2, Type.field11988, Arrays.asList(a));
        this.method15210(b);
    }

    @Override
    public JSONObject method15193(final JSONObject JSONObject) {
        JSONObject.put("name", this.method15204());
        JSONObject.put("value", new JSONArray((Collection<?>) this.currentValue));
        return JSONObject;
    }

    @Override
    public JSONObject method15186(final JSONObject JSONObject) {
        final JSONArray method26638 = CJsonUtils.getJSONArrayOrNull(JSONObject, "value");
        this.currentValue = new ArrayList();
        if (method26638 != null) {
            for (int i = 0; i < method26638.length(); ++i) {
                ((List) this.currentValue).add(method26638.getString(i));
            }
        }
        return JSONObject;
    }

    public boolean method15209() {
        return this.field21517;
    }

    public void method15210(final boolean field21517) {
        this.field21517 = field21517;
    }
}
