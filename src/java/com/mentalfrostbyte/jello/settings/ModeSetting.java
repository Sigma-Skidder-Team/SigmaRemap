package com.mentalfrostbyte.jello.settings;

import totalcross.json.CJsonUtils;
import totalcross.json.JSONObject;

import java.util.Arrays;
import java.util.List;

public class ModeSetting extends Setting<String> {
   private List<String> modes;

   public ModeSetting(String name, String defaultValue, int index, String... modes) {
      super(name, defaultValue, SettingType.MODE, modes[index]);
      this.modes = Arrays.asList(modes);
   }

   public ModeSetting(String name, String description, String defaultValue, String... modes) {
      super(name, description, SettingType.MODE, defaultValue);
      this.modes = Arrays.asList(modes);
   }

   public String getCurrentValue() {
       return this.currentValue;
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
         this.setCurrentValue(mode);
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
