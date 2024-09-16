package com.mentalfrostbyte.jello.settings;

import com.mentalfrostbyte.jello.unmapped.SettingType;
import mapped.Class8000;
import totalcross.json.JSONObject;

import java.awt.Color;

public class ColorSetting extends Setting<Integer> {
   public boolean field26196 = false;

   public ColorSetting(String var1, String var2, int var3, boolean var4) {
      super(var1, var2, SettingType.COLOR, var3);
      this.field26196 = var4;
   }

   public ColorSetting(String name, String description, int defaultColor) {
      super(name, description, SettingType.COLOR, defaultColor);
   }

   @Override
   public JSONObject method18610(JSONObject var1) {
      this.currentValue = Class8000.method27326(var1, "value", this.method18624());
      this.field26196 = Class8000.method27324(var1, "rainbow", false);
      return var1;
   }

   public boolean method18643() {
      return this.field26196;
   }

   public void method18644(boolean var1) {
      this.field26196 = var1;
   }

   @Override
   public JSONObject addDataToJSONObject(JSONObject jsonObject) {
      jsonObject.put("name", this.getName());
      jsonObject.put("value", this.method18645());
      jsonObject.method21800("rainbow", this.field26196);
      return jsonObject;
   }

   public Integer getCurrentValue() {
      if (!this.field26196) {
         return this.currentValue;
      } else {
         Color var3 = new Color(this.currentValue);
         float[] var4 = Color.RGBtoHSB(var3.getRed(), var3.getGreen(), var3.getBlue(), null);
         return Color.getHSBColor((float)(System.currentTimeMillis() % 4000L) / 4000.0F, var4[1], var4[2]).getRGB();
      }
   }

   public Integer method18645() {
      return this.currentValue;
   }
}
