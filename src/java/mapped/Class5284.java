package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4398;
import com.mentalfrostbyte.jello.event.impl.Class4425;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5284 extends Module {
    public Class5284() {
        super(ModuleCategory.MOVEMENT, "NoClip", "NoClip phase");
    }

    @EventTarget
    private void method16580(Class4425 var1) {
        if (this.isEnabled()) {
            var1.method13900(true);
        }
    }

    @EventTarget
    public void method16581(Class4398 var1) {
        if (this.isEnabled() && mc.world != null) {
            if ((double) var1.method13902().getY() >= mc.player.getPosY()) {
                var1.method13905(Class8022.method27425());
            }
        }
    }

    @EventTarget
    public void method16582(TickEvent var1) {
        if (this.isEnabled()) {
            mc.player.field4999 = 3;
            if (mc.player.field5055 % 2 == 0) {
                if (mc.player.field5036) {
                    if (!mc.player.field4981) {
                        if (mc.player.method3331()) {
                            mc.player
                                    .method3215(mc.player.getPosX(), mc.player.getPosY() - 1.0, mc.player.getPosZ());
                        }
                    } else {
                        mc.player
                                .method3215(mc.player.getPosX(), mc.player.getPosY() + 1.0, mc.player.getPosZ());
                    }
                }
            }
        }
    }
}
