package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5166 extends Module {
   public Class5166() {
      super(ModuleCategory.COMBAT, "Basic", "Places block underneath");
      this.registerSetting(new BooleanSetting("Explosions", "Cancels Explosions knockback", true));
      this.registerSetting(new Class6009<Float>("H-Multiplier", "Horizontal velocity multiplier", 0.0F, Float.class, 0.0F, 1.0F, 0.01F));
      this.registerSetting(new Class6009<Float>("V-Multiplier", "Vertical velocity multiplier", 0.0F, Float.class, 0.0F, 1.0F, 0.01F));
   }

   @EventTarget
   private void method16068(Class4396 var1) {
      if (this.method15996()) {
         if (mc.player != null && var1.method13898() instanceof Class5590) {
            Class5590 var4 = (Class5590)var1.method13898();
            if (var4.method17565() == mc.player.method3205()) {
               if (this.method15977("H-Multiplier") == 0.0F && this.method15977("V-Multiplier") == 0.0F) {
                  var1.method13900(true);
               }

               var4.field24801 = (int)((float)var4.field24801 * this.method15977("H-Multiplier"));
               var4.field24803 = (int)((float)var4.field24803 * this.method15977("H-Multiplier"));
               var4.field24802 = (int)((float)var4.field24802 * this.method15977("V-Multiplier"));
            }
         }

         if (var1.method13898() instanceof Class5515 && this.method15974("Explosions")) {
            Class5515 var5 = (Class5515)var1.method13898();
            var5.field24473 = var5.field24473 * this.method15977("H-Multiplier");
            var5.field24475 = var5.field24475 * this.method15977("H-Multiplier");
            var5.field24474 = var5.field24474 * this.method15977("V-Multiplier");
         }
      }
   }
}
