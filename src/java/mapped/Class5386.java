package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5386 extends Module {
   public Class5386() {
      super(ModuleCategory.MOVEMENT, "Vanilla", "Spider for Vanilla");
      this.registerSetting(new NumberSetting<Float>("Motion", "Spider motion", 0.35F, Float.class, 0.2F, 1.0F, 0.05F));
   }

   @EventTarget
   private void method16968(Class4435 var1) {
      if (this.isEnabled()) {
         if (mc.player.field5037) {
            var1.method13995((double)this.getNumberValueBySettingName("Motion"));
         }
      }
   }
}
