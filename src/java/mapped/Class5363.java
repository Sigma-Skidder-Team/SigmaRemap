package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4417;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5363 extends Module {
    public Class5363() {
        super(ModuleCategory.MOVEMENT, "SafeWalk", "Doesn't let you run off edges");
    }

    @EventTarget
    public void method16882(Class4417 var1) {
        if (this.isEnabled() && mc.player.field5036) {
            Module var4 = Client.getInstance().getModuleManager().getModuleByClass(BlockFly.class);
            if (!var4.isEnabled()) {
                var1.method13966(true);
            }
        }
    }
}
