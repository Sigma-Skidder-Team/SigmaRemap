package com.mentalfrostbyte.jello.settings;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.unmapped.SettingType;
import mapped.CJsonUtils;
import net.minecraft.client.Minecraft;
import totalcross.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModeSetting extends Setting<String> {
   private List<String> modes;
   private List<String> premiumModes = new ArrayList<>();

   public ModeSetting(String name, String defaultValue, int index, String... modes) {
      super(name, defaultValue, SettingType.MODE, modes[index]);
      this.modes = Arrays.asList(modes);
   }

   public ModeSetting(String name, String description, String defaultValue, String... modes) {
      super(name, description, SettingType.MODE, defaultValue);
      this.modes = Arrays.asList(modes);
   }

   public ModeSetting setPremiumModes(String... modes) {
      this.premiumModes.addAll(Arrays.asList(modes));
      return this;
   }

   @Override
   public boolean hasPremiumSettings() {
      return !this.premiumModes.isEmpty();
   }

   @Override
   public void clearPremiumModes() {
      this.premiumModes.clear();
   }

   public String getCurrentValue() {
      String currentMode = this.currentValue;
      return !this.premiumModes.contains(currentMode) ? super.getCurrentValue() : this.defaultValue;
   }

   public int getModeIndex() {
      int index = 0;

      for (String mode : this.modes) {
         if (mode.equals(this.currentValue)) {
            return index;
         }

         index++;
      }

      return 0;
   }

   public void setModeByIndex(int index) {
      if (index < this.modes.size()) {
         String mode = this.modes.get(index);
         if (this.premiumModes.contains(mode) && Minecraft.getInstance() != null) {
            Client.getInstance().getNotificationManager().send(new Notification("Premium", "Not yet available for free version"));
         } else {
            this.setCurrentValue(mode);
         }
      }
   }

   @Override
   public JSONObject loadCurrentValueFromJSONObject(JSONObject jsonObject) {
      this.currentValue = CJsonUtils.getStringOrDefault(jsonObject, "value", this.getDefaultValue());
      boolean isValid = this.modes.contains(this.currentValue);

      if (!isValid) {
         this.currentValue = this.getDefaultValue();
      }

      return jsonObject;
   }

   public List<String> getAvailableModes() {
      return this.modes;
   }
}
