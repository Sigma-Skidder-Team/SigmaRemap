package com.mentalfrostbyte.jello.settings;

import totalcross.json.CJsonUtils;
import totalcross.json.JSONArray;
import totalcross.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BooleanListSetting extends Setting<List<String>> {
   private boolean enabled;

   public BooleanListSetting(String name, String description, boolean enabled, String... values) {
      super(name, description, SettingType.BOOLEAN2, Arrays.asList(values));
      this.setEnabled(enabled);
   }

   @Override
   public JSONObject buildUpSettingData(JSONObject jsonObject) {
      jsonObject.put("name", this.getName());
      jsonObject.put("value", new JSONArray(this.currentValue.toArray()));
      return jsonObject;
   }

   @Override
   public JSONObject loadCurrentValueFromJSONObject(JSONObject jsonObject) {
      JSONArray jsonArray = CJsonUtils.getJSONArrayOrNull(jsonObject, "value");
      this.currentValue = new ArrayList<>();
      if (jsonArray != null) {
         for (int i = 0; i < jsonArray.length(); i++) {
            this.currentValue.add(jsonArray.getString(i));
         }
      }

      return jsonObject;
   }

   public boolean isEnabled() {
      return this.enabled;
   }

   public void setEnabled(boolean enabled) {
      this.enabled = enabled;
   }
}
