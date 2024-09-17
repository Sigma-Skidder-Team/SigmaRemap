package com.mentalfrostbyte.jello.settings;

import com.mentalfrostbyte.jello.unmapped.SettingType;

import java.util.List;

public class SubOptionSetting extends SubOptionSetting2 {
   public SubOptionSetting(String name, String description, boolean defaultValue, List<Setting> subSettings) {
      super(name, description, SettingType.SUBOPTION, defaultValue, subSettings);
   }

   public SubOptionSetting(String name, String description, boolean defaultValue, Setting... subSettings) {
      super(name, description, SettingType.SUBOPTION, defaultValue, subSettings);
   }
}
