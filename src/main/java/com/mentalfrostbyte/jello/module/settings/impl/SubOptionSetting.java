package com.mentalfrostbyte.jello.module.settings.impl;

import com.mentalfrostbyte.jello.module.settings.Setting;
import com.mentalfrostbyte.jello.module.settings.SettingType;

import java.util.List;

public class SubOptionSetting extends SubOptionSetting2 {
   public SubOptionSetting(String name, String description, boolean defaultValue, List<Setting> subSettings) {
      super(name, description, SettingType.SUBOPTION, defaultValue, subSettings);
   }

   public SubOptionSetting(String name, String description, boolean defaultValue, Setting... subSettings) {
      super(name, description, SettingType.SUBOPTION, defaultValue, subSettings);
   }
}
