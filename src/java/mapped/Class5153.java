package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5153 extends Module {
   public Class5153() {
      super(ModuleCategory.COMBAT, "Regen", "Regenerates hearts faster than ever (1.8 only)");
      this.method15972(new Class6009<Float>("Packet amount", "Number of packets sent", 50.0F, Float.class, 1.0F, 100.0F, 1.0F));
      this.method15972(new Class6004("Only OnGround", "Regen only when on ground", false));
   }

   @EventTarget
   private void method16007(TickEvent var1) {
      if (this.method15996()) {
         if (!mc.field1339.field4919.field29609
            && mc.field1339.method2932().method37574() > 17
            && mc.field1339.method3042() < 20.0F
            && mc.field1339.method3042() != 0.0F
            && (mc.field1339.field5036 || !this.method15974("Only OnGround"))) {
            for (int var4 = 0; (float)var4 < this.method15977("Packet amount"); var4++) {
               mc.getClientPlayNetHandler().sendPacket(new Class5603(mc.field1339.field5036));
            }
         }
      }
   }
}
