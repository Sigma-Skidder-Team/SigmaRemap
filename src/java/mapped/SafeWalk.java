package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.SafeWalkEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.movement.BlockFly;

public class SafeWalk extends Module {
    public SafeWalk() {
        super(ModuleCategory.MOVEMENT, "SafeWalk", "Doesn't let you run off edges");
    }

    @EventTarget
    public void method16882(SafeWalkEvent event) {
        if (this.isEnabled() && mc.player.onGround) {
            Module var4 = Client.getInstance().getModuleManager().getModuleByClass(BlockFly.class);
            if (!var4.isEnabled()) {
                event.setSafe(true);
            }
        }
    }
}
