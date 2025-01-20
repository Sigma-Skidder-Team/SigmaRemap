package com.mentalfrostbyte.jello.module.settings.impl;

import com.mentalfrostbyte.jello.module.settings.Setting;
import com.mentalfrostbyte.jello.module.settings.SettingType;
import totalcross.json.CJsonUtils;
import totalcross.json.JSONObject;

public class InputSetting extends Setting<String> {
   public InputSetting(String name, String description, String defaultValue) {
      super(name, description, SettingType.INPUT, defaultValue);
   }

   @Override
   public JSONObject loadCurrentValueFromJSONObject(JSONObject jsonObject) {
      this.currentValue = CJsonUtils.getStringOrDefault(jsonObject, "value", this.getDefaultValue());
      return jsonObject;
   }
}
