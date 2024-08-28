package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class JetpackFly extends Module {
    public JetpackFly() {
        super(ModuleCategory.MOVEMENT, "Jetpack", "A jetpack type fly");
    }

    @EventTarget
    public void onTick(TickEvent event) {
        if (this.method15996()) {
            if (mc.player.field4981) {
                mc.player.method2914();
            }
        }
    }
}
