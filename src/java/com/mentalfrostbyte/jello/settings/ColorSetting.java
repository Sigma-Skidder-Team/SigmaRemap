package com.mentalfrostbyte.jello.settings;

import totalcross.json.CJsonUtils;
import totalcross.json.JSONObject;

import java.awt.Color;

public class ColorSetting extends Setting<Integer> {
   public boolean isRainbowEnabled = false;

   public ColorSetting(String name, String description, int defaultColor, boolean isRainbowEnabled) {
      super(name, description, SettingType.COLOR, defaultColor);
      this.isRainbowEnabled = isRainbowEnabled;
   }

   public ColorSetting(String name, String description, int defaultColor) {
      super(name, description, SettingType.COLOR, defaultColor);
   }

   @Override
   public JSONObject loadCurrentValueFromJSONObject(JSONObject jsonObject) {
      this.currentValue = CJsonUtils.getIntOrDefault(jsonObject, "value", this.getDefaultColor());
      this.isRainbowEnabled = CJsonUtils.getBooleanOrDefault(jsonObject, "rainbow", false);
      return jsonObject;
   }

   public boolean isRainbowEnabled() {
      return this.isRainbowEnabled;
   }

   public void setRainbowEnabled(boolean var1) {
      this.isRainbowEnabled = var1;
   }

   @Override
   public JSONObject buildUpSettingData(JSONObject jsonObject) {
      jsonObject.put("name", this.getName());
      jsonObject.put("value", this.getCurrentValue());
      jsonObject.put("rainbow", this.isRainbowEnabled);
      return jsonObject;
   }

   public Integer getCurrentValue() {
      if (!this.isRainbowEnabled) {
         return this.currentValue;
      } else {
         Color color = new Color(this.currentValue);
         float[] hsb = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
         return Color.getHSBColor((float)(System.currentTimeMillis() % 4000L) / 4000.0F, hsb[1], hsb[2]).getRGB();
      }
   }

   public Integer getDefaultColor() {
      return this.currentValue;
   }
}
