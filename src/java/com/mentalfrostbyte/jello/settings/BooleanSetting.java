package com.mentalfrostbyte.jello.settings;

import totalcross.json.CJsonUtils;
import totalcross.json.JSONObject;

public class BooleanSetting extends Setting<Boolean> {
   public BooleanSetting(String name, String description, boolean value) {
      super(name, description, SettingType.BOOLEAN, value);
   }

   public void updateCurrentValue(Boolean value, boolean notify) {
      super.updateCurrentValue(value, notify);
   }

   public Boolean getCurrentValue() {
      return this.currentValue;
   }

   @Override
   public JSONObject loadCurrentValueFromJSONObject(JSONObject jsonObject) {
      this.currentValue = CJsonUtils.getBooleanOrDefault(jsonObject, "value", this.getDefaultValue());
      return jsonObject;
   }
}
