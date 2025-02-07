// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.settings.impl;

import com.mentalfrostbyte.jello.settings.Setting;
import com.mentalfrostbyte.jello.settings.Type;
import mapped.JSONObject;
import mapped.CJsonUtils;
import mapped.JSONArray;

import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

public abstract class SubOptionSetting extends Setting<Boolean> {
    public List<Setting> field21522;

    public SubOptionSetting(final String s, final String s2, final Type class2076, final boolean b, final List<Setting> field21522) {
        super(s, s2, class2076, b);
        this.field21522 = field21522;
    }

    public SubOptionSetting(final String s, final String s2, final Type class2076, final boolean b, final Setting... a) {
        this(s, s2, class2076, b, (List<Setting>) Arrays.asList((Setting[]) a));
    }

    @Override
    public JSONObject method15186(final JSONObject JSONObject) {
        final JSONArray method26638 = CJsonUtils.getJSONArrayOrNull(JSONObject, this.method15204());
        if (method26638 != null) {
            for (int i = 0; i < method26638.length(); ++i) {
                final JSONObject method26639 = method26638.getJSONObject(i);
                final String method26640 = CJsonUtils.method26636(JSONObject, "name", null);
                for (final Setting class4406 : this.method15224()) {
                    if (!class4406.method15204().equals(method26640)) {
                        continue;
                    }
                    class4406.method15186(method26639);
                    break;
                }
            }
        }
        this.currentValue = Boolean.valueOf(CJsonUtils.method26630(JSONObject, "value", this.method15203()));
        return JSONObject;
    }

    @Override
    public JSONObject method15193(final JSONObject JSONObject) {
        final JSONArray class4406 = new JSONArray();
        final Iterator<Setting> iterator = (Iterator<Setting>) this.method15224().iterator();
        while (iterator.hasNext()) {
            class4406.method486(iterator.next().method15193(new JSONObject()));
        }
        JSONObject.put("children", class4406);
        JSONObject.put("name", this.method15204());
        return super.method15193(JSONObject);
    }

    public List<Setting> method15224() {
        return this.field21522;
    }
}
