package com.mentalfrostbyte.jello.module.settings.impl;

import com.mentalfrostbyte.jello.module.settings.Setting;
import com.mentalfrostbyte.jello.module.settings.SettingType;
import totalcross.json.CJsonUtils;
import totalcross.json.JSONArray;
import totalcross.json.JSONException;
import totalcross.json.JSONObject;

import java.util.Arrays;
import java.util.List;

public abstract class SubOptionSetting2 extends Setting<Boolean> {
   public List<Setting> subSettings;

   public SubOptionSetting2(String name, String description, SettingType type, boolean defaultValue, List<Setting> subSettings) {
      super(name, description, type, defaultValue);
      this.subSettings = subSettings;
   }

   public SubOptionSetting2(String name, String description, SettingType type, boolean defaultValue, Setting... subSettings) {
      this(name, description, type, defaultValue, Arrays.asList(subSettings));
   }

   @Override
   public JSONObject loadCurrentValueFromJSONObject(JSONObject jsonObject) throws JSONException {
      JSONArray array = CJsonUtils.getJSONArrayOrNull(jsonObject, this.getName());
      if (array != null) {
         for (int i = 0; i < array.length(); i++) {
            JSONObject settingObject = array.getJSONObject(i);
            String settingName = CJsonUtils.getStringOrDefault(settingObject, "name", null);

            for (Setting<?> setting : this.getSubSettings()) {
               if (setting.getName().equals(settingName)) {
                  setting.loadCurrentValueFromJSONObject(settingObject);
                  break;
               }
            }
         }
      }

      this.currentValue = CJsonUtils.getBooleanOrDefault(jsonObject, "value", this.getDefaultValue());
      return jsonObject;
   }

   @Override
   public JSONObject buildUpSettingData(JSONObject jsonObject) {
      JSONArray array = new JSONArray();

      for (Setting setting : this.getSubSettings()) {
         array.put(setting.buildUpSettingData(new JSONObject()));
      }

      jsonObject.put("children", array);
      jsonObject.put("name", this.getName());
      return super.buildUpSettingData(jsonObject);
   }

   public List<Setting> getSubSettings() {
      return this.subSettings;
   }

   public static class CustomSubOptionSetting extends SubOptionSetting2 {
      public CustomSubOptionSetting(String name, String description, boolean defaultValue, List<Setting> subSettings) {
         super(name, description, SettingType.UNUSUED, defaultValue, subSettings);
      }
   }
}
