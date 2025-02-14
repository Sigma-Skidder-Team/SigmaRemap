package com.mentalfrostbyte.jello.module.impl.misc;

import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.settings.impl.InputSetting;

public class FakeForge extends Module {
   public FakeForge() {
      super(ModuleCategory.MISC, "FakeForge", "Fakes client mod type on connection");
      this.registerSetting(new InputSetting("Client Brand", "Client brand to set", "fml,forge"));
   }
}
