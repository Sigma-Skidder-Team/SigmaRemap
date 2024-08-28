package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5207 extends Module {
    public Class5207() {
        super(ModuleCategory.COMBAT, "Legit", "Increase the knockback you give to players");
    }

    @EventTarget
    private void method16218(TickEvent var1) {
        if (this.method15996()) {
            mc.field1299.field44638.field13071 = true;
            if (mc.field1339.field4949 != 1) {
                if (mc.field1339.field4949 == 0) {
                    mc.field1299.field44632.field13071 = Class9798.method38639(
                            Minecraft.getInstance().field1283.method8039(), mc.field1299.field44632.field13070.field34875
                    );
                }
            } else {
                mc.field1299.field44632.field13071 = false;
            }
        }
    }
}
