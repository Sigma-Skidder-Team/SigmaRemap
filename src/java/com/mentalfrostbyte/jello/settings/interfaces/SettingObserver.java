package com.mentalfrostbyte.jello.settings.interfaces;

import com.mentalfrostbyte.jello.settings.Setting;

public interface SettingObserver {
   void observe(Setting<?> setting);
}
