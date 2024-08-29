package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5167 extends Module {
   public Class5167() {
      super(ModuleCategory.MISC, "PortalGodMode", "Makes you invulnerable when you go through a portal and stay in it");
   }

   @EventTarget
   private void method16069(RecievePacketEvent var1) {
      if (this.isEnabled()) {
         if (var1.getPacket() instanceof Class5580) {
            var1.method13900(true);
         }
      }
   }
}
