package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5360 extends Module {
    private int field23966;

    public Class5360() {
        super(ModuleCategory.COMBAT, "Minemen", "Criticals for Anti Gaming Chair");
    }

    @Override
    public void isInDevelopment() {
        this.field23966 = 0;
    }

    @EventTarget
    @HigherPriority
    private void method16861(Class4399 var1) {
        if (var1.method13921()) {
            Class5325 var4 = (Class5325) Client.getInstance().getModuleManager().getModuleByClass(Class5334.class);
            if (!var4.isEnabled() || !var4.getStringSettingValueByName("Type").equalsIgnoreCase("Minemen")) {
                if (!mc.player.field5036) {
                    this.field23966 = 0;
                } else {
                    if (this.field23966 > 0) {
                        if (this.field23966 % 2 != 0) {
                            var1.method13912(var1.method13911() - 1.0E-14);
                        }

                        var1.method13920(false);
                    }

                    this.field23966++;
                    var1.method13908(true);
                }

                if (mc.playerController.getIsHittingBlock() && mc.player.field5036) {
                    this.field23966 = 0;
                    var1.method13912(mc.player.getPosY());
                    var1.method13920(true);
                }
            }
        }
    }
}
