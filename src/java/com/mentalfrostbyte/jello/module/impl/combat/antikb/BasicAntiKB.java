package com.mentalfrostbyte.jello.module.impl.combat.antikb;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.BooleanSetting;
import net.minecraft.network.play.server.SExplosionPacket;
import net.minecraft.network.play.server.SEntityVelocityPacket;
import mapped.NumberSetting;

public class BasicAntiKB extends Module {
   public BasicAntiKB() {
      super(ModuleCategory.COMBAT, "Basic", "Places block underneath");
      this.registerSetting(new BooleanSetting("Explosions", "Cancels Explosions knockback", true));
      this.registerSetting(new NumberSetting<Float>("H-Multiplier", "Horizontal velocity multiplier", 0.0F, Float.class, 0.0F, 1.0F, 0.01F));
      this.registerSetting(new NumberSetting<Float>("V-Multiplier", "Vertical velocity multiplier", 0.0F, Float.class, 0.0F, 1.0F, 0.01F));
   }

   @EventTarget
   private void method16068(RecievePacketEvent var1) {
      if (this.isEnabled()) {
         if (mc.player != null && var1.getPacket() instanceof SEntityVelocityPacket) {
            SEntityVelocityPacket var4 = (SEntityVelocityPacket)var1.getPacket();
            if (var4.method17565() == mc.player.method3205()) {
               if (this.getNumberValueBySettingName("H-Multiplier") == 0.0F && this.getNumberValueBySettingName("V-Multiplier") == 0.0F) {
                  var1.method13900(true);
               }

               var4.field24801 = (int)((float)var4.field24801 * this.getNumberValueBySettingName("H-Multiplier"));
               var4.field24803 = (int)((float)var4.field24803 * this.getNumberValueBySettingName("H-Multiplier"));
               var4.field24802 = (int)((float)var4.field24802 * this.getNumberValueBySettingName("V-Multiplier"));
            }
         }

         if (var1.getPacket() instanceof SExplosionPacket && this.getBooleanValueFromSetttingName("Explosions")) {
            SExplosionPacket var5 = (SExplosionPacket)var1.getPacket();
            var5.field24473 = var5.field24473 * this.getNumberValueBySettingName("H-Multiplier");
            var5.field24475 = var5.field24475 * this.getNumberValueBySettingName("H-Multiplier");
            var5.field24474 = var5.field24474 * this.getNumberValueBySettingName("V-Multiplier");
         }
      }
   }
}
