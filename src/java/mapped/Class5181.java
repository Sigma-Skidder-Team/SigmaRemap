package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4434;
import com.mentalfrostbyte.jello.event.impl.Class4436;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5181 extends Module {
    public Class5181() {
        super(ModuleCategory.COMBAT, "Minis", "Minis criticals");
        this.method15972(new Class6005("Mode", "Mode", 0, "Basic", "Hypixel", "Cubecraft"));
        this.method15972(new Class6004("Avoid Fall Damage", "Avoid fall damages", false));
    }

    @EventTarget
    private void method16126(Class4436 var1) {
        if (this.method15996()) {
            if (Class5357.field23937) {
                mc.getClientPlayNetHandler()
                        .sendPacket(new Class5605(mc.player.getPosX(), mc.player.getPosY(), mc.player.getPosZ(), true));
            }
        }
    }

    @EventTarget
    private void method16127(Class4434 var1) {
        if (this.method15996()) {
            if (Class5357.field23937) {
                var1.method13900(true);
            }
        }
    }
}
