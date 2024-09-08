package com.mentalfrostbyte.jello.unmapped;

import mapped.Class8000;
import totalcross.json.JSONObject;

public class TextBoxSetting extends Setting<Integer> {
    private final String[] field26184;

    public TextBoxSetting(String var1, String var2, Integer var3, String... var4) {
        super(var1, var2, SettingType.TEXTBOX, var3);
        this.field26184 = var4;
    }

    @Override
    public JSONObject method18610(JSONObject var1) {
        this.currentValue = Class8000.method27326(var1, "value", this.method18624());
        return var1;
    }

    public String[] method18627() {
        return this.field26184;
    }
}
