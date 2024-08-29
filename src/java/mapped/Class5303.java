package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5303 extends Module {
    public Class5303() {
        super(ModuleCategory.MISC, "PortalGui", "Allows GUIs while in nether portal");
    }

    @EventTarget
    private void method16663(TickEvent var1) {
        if (this.isEnabled()) {
            mc.player.field5080 = false;
        }
    }
}
