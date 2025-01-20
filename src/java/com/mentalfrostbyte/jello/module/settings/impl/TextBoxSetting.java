package com.mentalfrostbyte.jello.module.settings.impl;

import com.mentalfrostbyte.jello.module.settings.Setting;
import com.mentalfrostbyte.jello.module.settings.SettingType;
import totalcross.json.CJsonUtils;
import totalcross.json.JSONObject;

public class TextBoxSetting extends Setting<Integer> {
    private final String[] options;

    public TextBoxSetting(String name, String description, Integer defaultValue, String... options) {
        super(name, description, SettingType.TEXTBOX, defaultValue);
        this.options = options;
    }

    @Override
    public JSONObject loadCurrentValueFromJSONObject(JSONObject jsonObject) {
        this.currentValue = CJsonUtils.getIntOrDefault(jsonObject, "value", this.getDefaultValue());
        return jsonObject;
    }

    public String[] getOptions() {
        return this.options;
    }
}
