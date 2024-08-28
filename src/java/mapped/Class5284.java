package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4398;
import com.mentalfrostbyte.jello.event.impl.Class4425;
import com.mentalfrostbyte.jello.event.impl.Class4428;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5284 extends Module {
    public Class5284() {
        super(ModuleCategory.MOVEMENT, "NoClip", "NoClip phase");
    }

    @EventTarget
    private void method16580(Class4425 var1) {
        if (this.method15996()) {
            var1.method13900(true);
        }
    }

    @EventTarget
    public void method16581(Class4398 var1) {
        if (this.method15996() && mc.field1338 != null) {
            if ((double) var1.method13902().getY() >= mc.field1339.getPosY()) {
                var1.method13905(Class8022.method27425());
            }
        }
    }

    @EventTarget
    public void method16582(Class4428 var1) {
        if (this.method15996()) {
            mc.field1339.field4999 = 3;
            if (mc.field1339.field5055 % 2 == 0) {
                if (mc.field1339.field5036) {
                    if (!mc.field1339.field4981) {
                        if (mc.field1339.method3331()) {
                            mc.field1339
                                    .method3215(mc.field1339.getPosX(), mc.field1339.getPosY() - 1.0, mc.field1339.getPosZ());
                        }
                    } else {
                        mc.field1339
                                .method3215(mc.field1339.getPosX(), mc.field1339.getPosY() + 1.0, mc.field1339.getPosZ());
                    }
                }
            }
        }
    }
}
