package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5296 extends Module {
    public int field23812 = 30;

    public Class5296() {
        super(ModuleCategory.PLAYER, "AutoRespawn", "Respawns for you");
    }

    @EventTarget
    public void method16635(TickEvent var1) {
        if (this.method15996()) {
            if (!mc.player.method3066()) {
                mc.player.respawnPlayer();
            }
        }
    }
}
