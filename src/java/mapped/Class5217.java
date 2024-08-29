package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5217 extends Module {
    public Class5217() {
        super(ModuleCategory.RENDER, "NoServerInfo", "Hides the server scoreboard and boss bar at top");
    }

    @EventTarget
    private void method16245(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof Class5472) {
                Class5472 var4 = (Class5472) var1.getPacket();
                var1.method13900(true);
            }

            if (var1.getPacket() instanceof Class5576) {
                Class5576 var5 = (Class5576) var1.getPacket();
                var1.method13900(true);
            }
        }
    }
}
