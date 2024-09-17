package com.mentalfrostbyte.jello.settings;

import com.mentalfrostbyte.jello.unmapped.SettingType;
import mapped.CJsonUtils;
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
