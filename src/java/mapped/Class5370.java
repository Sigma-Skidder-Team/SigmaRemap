package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4428;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5370 extends Module {
    public Class5370() {
        super(ModuleCategory.EXPLOIT, "Ghostly", "Disable ghostly's anticheat.");
    }

    @EventTarget
    public void method16909(Class4428 var1) {
        if (this.method15996() && mc.method1528() != null) {
            mc.getClientPlayNetHandler().sendPacket(new Class5471(1.0F, 1.0F, false, false));
        }
    }
}
