package com.mentalfrostbyte.jello.settings;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.unmapped.SettingType;
import mapped.CJsonUtils;
import totalcross.json.JSONObject;

public class BooleanSetting extends Setting<Boolean> {
   public boolean premiumMode = false;

   public BooleanSetting(String name, String description, boolean value) {
      super(name, description, SettingType.BOOLEAN, value);
   }

   public BooleanSetting enablePremiumMode() {
      this.premiumMode = true;
      return this;
   }

   @Override
   public void clearPremiumModes() {
      this.premiumMode = false;
   }

   @Override
   public boolean hasPremiumSettings() {
      return this.premiumMode;
   }

   public void updateCurrentValue(Boolean value, boolean notify) {
      if (this.premiumMode && notify) {
         Client.getInstance().getNotificationManager().send(new Notification("Premium", "Not yet available for free version"));
      }

      super.updateCurrentValue(value, notify);
   }

   public Boolean getCurrentValue() {
      return !this.premiumMode ? this.currentValue : this.defaultValue;
   }

   @Override
   public JSONObject loadCurrentValueFromJSONObject(JSONObject jsonObject) {
      this.currentValue = CJsonUtils.getBooleanOrDefault(jsonObject, "value", this.getDefaultValue());
      return jsonObject;
   }
}
