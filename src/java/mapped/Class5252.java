package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5252 extends Module {
    private int field23627;

    public Class5252() {
        super(ModuleCategory.COMBAT, "FastBow", "Shoots arrows faster");
    }

    @EventTarget
    private void method16373(TickEvent var1) {
        if (this.method15996()) {
            if (mc.player.method3090() != null
                    && mc.player.method3090().method32107() instanceof Class3263
                    && mc.player.field5036) {
                for (int var4 = 0; var4 < 25; var4++) {
                    mc.getClientPlayNetHandler().sendPacket(new Class5603(true));
                }

                mc.getClientPlayNetHandler().sendPacket(new Class5492(Class2070.field13489, BlockPos.field13032, Direction.field672));
            }
        }
    }
}
