package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4403;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5385 extends Module {
   public Class5385() {
      super(ModuleCategory.COMBAT, "Normal", "Increase the knockback you give to players");
   }

   @EventTarget
   @HigherPriority
   private void method16967(Class4403 var1) {
      if (this.isEnabled() && var1.method13937()) {
         mc.getConnection().sendPacket(new CEntityActionPacket(mc.player, Class1865.field10043));
      }
   }
}
