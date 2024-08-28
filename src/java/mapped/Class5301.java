package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4404;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5301 extends Module {
    public Class5301() {
        super(ModuleCategory.PLAYER, "Parkour", "Automatically jumps at the edge of blocks");
    }

    @EventTarget
    public void method16656(Class4404 var1) {
        if (this.method15996()) {
            if (mc.field1339.field5036) {
                if (!Class5628.method17729()) {
                    mc.field1339.method2914();
                }
            }
        }
    }
}
