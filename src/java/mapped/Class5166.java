package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5166 extends Module {
   public Class5166() {
      super(ModuleCategory.COMBAT, "Basic", "Places block underneath");
      this.registerSetting(new BooleanSetting("Explosions", "Cancels Explosions knockback", true));
      this.registerSetting(new NumberSetting<Float>("H-Multiplier", "Horizontal velocity multiplier", 0.0F, Float.class, 0.0F, 1.0F, 0.01F));
      this.registerSetting(new NumberSetting<Float>("V-Multiplier", "Vertical velocity multiplier", 0.0F, Float.class, 0.0F, 1.0F, 0.01F));
   }

   @EventTarget
   private void method16068(RecievePacketEvent var1) {
      if (this.isEnabled()) {
         if (mc.player != null && var1.getPacket() instanceof Class5590) {
            Class5590 var4 = (Class5590)var1.getPacket();
            if (var4.method17565() == mc.player.method3205()) {
               if (this.getNumberValueBySettingName("H-Multiplier") == 0.0F && this.getNumberValueBySettingName("V-Multiplier") == 0.0F) {
                  var1.method13900(true);
               }

               var4.field24801 = (int)((float)var4.field24801 * this.getNumberValueBySettingName("H-Multiplier"));
               var4.field24803 = (int)((float)var4.field24803 * this.getNumberValueBySettingName("H-Multiplier"));
               var4.field24802 = (int)((float)var4.field24802 * this.getNumberValueBySettingName("V-Multiplier"));
            }
         }

         if (var1.getPacket() instanceof Class5515 && this.getBooleanValueFromSetttingName("Explosions")) {
            Class5515 var5 = (Class5515)var1.getPacket();
            var5.field24473 = var5.field24473 * this.getNumberValueBySettingName("H-Multiplier");
            var5.field24475 = var5.field24475 * this.getNumberValueBySettingName("H-Multiplier");
            var5.field24474 = var5.field24474 * this.getNumberValueBySettingName("V-Multiplier");
         }
      }
   }
}
