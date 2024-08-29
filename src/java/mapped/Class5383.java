package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4420;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5383 extends Module {
   public Class5383() {
      super(ModuleCategory.COMBAT, "Basic", "Automatically aims at players");
      this.registerSetting(new Class6009<Float>("Range", "Range value", 4.0F, Float.class, 2.8F, 8.0F, 0.01F));
   }

   @EventTarget
   private void method16962(Class4420 var1) {
      if (this.method15996()) {
         Entity var4 = ((Class5335)this.method16004()).method16750(this.method15977("Range"));
         if (var4 != null) {
            float[] var5 = Class9142.method34137(var4);
            mc.player.field5031 = var5[0];
            mc.player.field5032 = var5[1];
         }
      }
   }
}
