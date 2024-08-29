package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5211 extends Module {
    public Class5211() {
        super(ModuleCategory.PLAYER, "Sneak", "Always sneaks");
    }

    @Override
    public void method15965() {
        mc.getConnection().sendPacket(new CEntityActionPacket(mc.player, Class1865.field10041));
    }

    @EventTarget
    public void method16229(Class4399 var1) {
        if (this.isEnabled()) {
            if (!var1.method13921()) {
                mc.getConnection().sendPacket(new CEntityActionPacket(mc.player, Class1865.field10041));
                mc.getConnection().sendPacket(new CEntityActionPacket(mc.player, Class1865.field10040));
            } else {
                mc.getConnection().sendPacket(new CEntityActionPacket(mc.player, Class1865.field10040));
                mc.getConnection().sendPacket(new CEntityActionPacket(mc.player, Class1865.field10041));
            }
        }
    }
}
