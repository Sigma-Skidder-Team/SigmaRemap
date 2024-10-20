package com.mentalfrostbyte.jello.module.impl.combat.aimbot;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.combat.Aimbot;
import com.mentalfrostbyte.jello.settings.NumberSetting;
import mapped.RotationHelper;
import net.minecraft.entity.Entity;

public class BasicAimbot extends Module {
   public BasicAimbot() {
      super(ModuleCategory.COMBAT, "Basic", "Automatically aims at players");
      this.registerSetting(new NumberSetting<Float>("Range", "Range value", 4.0F, Float.class, 2.8F, 8.0F, 0.01F));
   }

   @EventTarget
   private void Render3DEvent(Render3DEvent event) {
      if (this.isEnabled()) {
         Entity range = ((Aimbot)this.access()).getTarget(this.getNumberValueBySettingName("Range"));
         if (range != null) {
            float[] rotation = RotationHelper.doBasicRotation(range);
            mc.player.rotationYaw = rotation[0];
            mc.player.rotationPitch = rotation[1];
         }
      }
   }
}
