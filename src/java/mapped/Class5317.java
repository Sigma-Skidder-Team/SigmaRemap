package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4434;
import com.mentalfrostbyte.jello.event.impl.Class4436;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5317 extends Module {
    private static int field23862;

    public Class5317() {
        super(ModuleCategory.COMBAT, "AAC 4", "Criticals for aac 4.*");
        this.registerSetting(new BooleanSetting("KillAura", "Criticals only if KillAura is enabled", false));
    }

    public static boolean method16708() {
        return field23862 == 2;
    }

    @Override
    public void isInDevelopment() {
        field23862 = 0;
    }

    @EventTarget
    @LowerPriority
    private void method16705(Class4434 var1) {
        if (this.isEnabled() && !(var1.method13988() < 0.625)) {
            field23862 = 0;
        }
    }

    @EventTarget
    private void method16706(Class4436 var1) {
        if (field23862 == 2) {
            var1.method13900(true);
        }
    }

    @EventTarget
    @HigherPriority
    private void method16707(Class4399 var1) {
        if (!this.isEnabled() || Client.getInstance().getModuleManager().getModuleByClass(Class5341.class).isEnabled()) {
            field23862 = 0;
        } else if (var1.method13921()) {
            if (mc.playerController.getIsHittingBlock()) {
                field23862 = 0;
            }

            boolean var4 = !this.getBooleanValueFromSetttingName("KillAura") || KillAura.field23948 != null || KillAura.field23949 != null;
            if (mc.player.field5036 && mc.player.field5038 && var4) {
                field23862++;
                mc.player.field6120 = 0.0;
                if (field23862 != 2) {
                    if (field23862 >= 3) {
                        double var5 = 0.001;
                        var1.method13912(var1.method13911() + var5);
                        var1.method13920(false);
                    }
                } else {
                    var1.method13912(var1.method13911() + 0.00101);
                    var1.method13920(false);
                }
            } else {
                field23862 = 0;
            }
        }
    }
}
