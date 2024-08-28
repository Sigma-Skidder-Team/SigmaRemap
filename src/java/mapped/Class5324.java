package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5324 extends Module {
    public Class5324() {
        super(ModuleCategory.PLAYER, "NoViewReset", "Prevents the server from resetting your client yaw/pitch");
    }

    @EventTarget
    private void method16723(Class4396 var1) {
        if (this.method15996()) {
            if (mc.field1339 != null) {
                if (mc.field1339.field5055 >= 10) {
                    if (mc.field1339 != null && var1.method13898() instanceof Class5473) {
                        Class5473 var4 = (Class5473) var1.method13898();
                        mc.field1339.field5033 = var4.field24300;
                        mc.field1339.field5034 = var4.field24301;
                        var4.field24300 = mc.field1339.field5031;
                        var4.field24301 = mc.field1339.field5032;
                    }
                }
            }
        }
    }
}
