package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5167 extends Module {
   public Class5167() {
      super(ModuleCategory.MISC, "PortalGodMode", "Makes you invulnerable when you go through a portal and stay in it");
   }

   @EventTarget
   private void method16069(Class4396 var1) {
      if (this.method15996()) {
         if (var1.method13898() instanceof Class5580) {
            var1.method13900(true);
         }
      }
   }
}
