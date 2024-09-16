package com.mentalfrostbyte.jello.settings;

import com.mentalfrostbyte.jello.unmapped.SettingType;
import mapped.Class8000;
import mapped.Class9318;
import totalcross.json.JSONObject;

public class SpeedRampSetting extends Setting<Class9318> {
    public SpeedRampSetting(String var1, String var2, float var3, float var4, float var5, float var6) {
        super(var1, var2, SettingType.SPEEDRAMP, new Class9318(var3, var4, var5, var6));
    }

    @Override
    public JSONObject method18610(JSONObject var1) {
        this.currentValue = new Class9318(Class8000.method27332(var1, "value"));
        return var1;
    }

    @Override
    public JSONObject addDataToJSONObject(JSONObject jsonObject) {
        jsonObject.put("name", this.getName());
        jsonObject.put("value", this.getCurrentValue().method35208());
        return jsonObject;
    }

    public void method18612(float var1, float var2, float var3, float var4) {
        this.method18614(var1, var2, var3, var4, true);
    }

    public float[] method18613() {
        Class9318 var3 = this.getCurrentValue();
        return new float[]{var3.field43257, var3.field43258, var3.field43259, var3.field43260};
    }

    public void method18614(float var1, float var2, float var3, float var4, boolean var5) {
        Class9318 var8 = new Class9318(var1, var2, var3, var4);
        if (!this.currentValue.equals(var8)) {
            this.currentValue = var8;
            if (var5) {
                this.method18617();
            }
        }
    }
}
