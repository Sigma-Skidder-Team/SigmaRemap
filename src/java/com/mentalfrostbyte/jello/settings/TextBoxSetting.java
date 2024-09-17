package com.mentalfrostbyte.jello.settings;

import com.mentalfrostbyte.jello.unmapped.SettingType;
import mapped.CJsonUtils;
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
