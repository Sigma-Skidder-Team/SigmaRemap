package com.mentalfrostbyte.jello.module.impl.combat.antikb;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import net.minecraft.network.play.server.SExplosionPacket;
import net.minecraft.network.play.server.SEntityVelocityPacket;
import com.mentalfrostbyte.jello.settings.NumberSetting;

public class BasicAntiKB extends Module {
   public BasicAntiKB() {
      super(ModuleCategory.COMBAT, "Basic", "Places block underneath");
      this.registerSetting(new BooleanSetting("Explosions", "Cancels Explosions knockback", true));
      this.registerSetting(new NumberSetting<Float>("H-Multiplier", "Horizontal velocity multiplier", 0.0F, Float.class, 0.0F, 1.0F, 0.01F));
      this.registerSetting(new NumberSetting<Float>("V-Multiplier", "Vertical velocity multiplier", 0.0F, Float.class, 0.0F, 1.0F, 0.01F));
   }

   @EventTarget
   private void method16068(ReceivePacketEvent var1) {
      if (this.isEnabled()) {
         if (mc.player != null && var1.getPacket() instanceof SEntityVelocityPacket) {
            SEntityVelocityPacket var4 = (SEntityVelocityPacket)var1.getPacket();
            if (var4.getEntityID() == mc.player.getEntityId()) {
               if (this.getNumberValueBySettingName("H-Multiplier") == 0.0F && this.getNumberValueBySettingName("V-Multiplier") == 0.0F) {
                  var1.setCancelled(true);
               }

               var4.motionX = (int)((float)var4.motionX * this.getNumberValueBySettingName("H-Multiplier"));
               var4.motionZ = (int)((float)var4.motionZ * this.getNumberValueBySettingName("H-Multiplier"));
               var4.motionY = (int)((float)var4.motionY * this.getNumberValueBySettingName("V-Multiplier"));
            }
         }

         if (var1.getPacket() instanceof SExplosionPacket && this.getBooleanValueFromSettingName("Explosions")) {
            SExplosionPacket var5 = (SExplosionPacket)var1.getPacket();
            var5.motionX = var5.motionX * this.getNumberValueBySettingName("H-Multiplier");
            var5.motionZ = var5.motionZ * this.getNumberValueBySettingName("H-Multiplier");
            var5.motionY = var5.motionY * this.getNumberValueBySettingName("V-Multiplier");
         }
      }
   }
}
