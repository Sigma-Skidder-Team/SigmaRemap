package com.mentalfrostbyte.jello.module.impl.combat.aimbot;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.combat.Aimbot;
import mapped.RotationHelper;
import mapped.NumberSetting;
import net.minecraft.entity.Entity;

public class BasicAimbot extends Module {
   public BasicAimbot() {
      super(ModuleCategory.COMBAT, "Basic", "Automatically aims at players");
      this.registerSetting(new NumberSetting<Float>("Range", "Range value", 4.0F, Float.class, 2.8F, 8.0F, 0.01F));
   }

   @EventTarget
   private void method16962(Render3DEvent var1) {
      if (this.isEnabled()) {
         Entity var4 = ((Aimbot)this.access()).getTarget(this.getNumberValueBySettingName("Range"));
         if (var4 != null) {
            float[] var5 = RotationHelper.doBasicRotation(var4);
            mc.player.rotationYaw = var5[0];
            mc.player.rotationPitch = var5[1];
         }
      }
   }
}
