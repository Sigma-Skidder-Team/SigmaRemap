package com.mentalfrostbyte.jello.module.impl.movement.speed;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.Class9567;
import mapped.NumberSetting;

public class InvadedSpeed extends Module {
   private int field24022;

   public InvadedSpeed() {
      super(ModuleCategory.MOVEMENT, "Invaded", "Speed for Invadedlands");
      this.registerSetting(new NumberSetting<Float>("Speed", "Speed value", 3.0F, Float.class, 0.5F, 9.5F, 0.1F));
   }

   @Override
   public void onEnable() {
   }

   @Override
   public void onDisable() {
      Class9567.method37090(0.28F);
      mc.timer.timerSpeed = 1.0F;
   }

   @EventTarget
   public void method16969(Class4435 var1) {
      if (this.isEnabled()) {
         this.field24022++;
         if (this.field24022 != 1) {
            if (this.field24022 != 2) {
               if (this.field24022 >= 3) {
                  this.field24022 = 0;
                  mc.timer.timerSpeed = 0.25F;
                  Class9567.method37088(var1, (double)this.getNumberValueBySettingName("Speed"));
               }
            } else {
               mc.timer.timerSpeed = 2.0F;
               Class9567.method37088(var1, Class9567.method37075() + 0.05);
            }
         } else {
            mc.timer.timerSpeed = 2.0F;
            Class9567.method37088(var1, Class9567.method37075() + 0.05);
         }
      }
   }
}
