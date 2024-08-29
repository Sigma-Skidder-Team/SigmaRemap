package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4403;
import com.mentalfrostbyte.jello.event.impl.Class4423;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5243 extends Module {
    private final double[] field23605 = new double[]{0.0, 0.0};
    private boolean field23606;

    public Class5243() {
        super(ModuleCategory.PLAYER, "AutoSprint", "Sprints for you");
        this.registerSetting(new BooleanSetting("Keep Sprint", "Keep Sprinting after hitting a player", true));
    }

    @EventTarget
    public void method16343(TickEvent var1) {
        if (this.method15996()) {
            Class5325 var4 = (Class5325) Client.getInstance().getModuleManager().method14662(BlockFly.class);
            Module var5 = var4.field23879;
            if (var5 == null || !var5.method15996() || !(var5 instanceof BlockFlyAACMode) || var5.method15974("Haphe (AACAP)")) {
                mc.player.setSprinting(mc.player.field4984 > 0.0F && !((BlockFly) Client.getInstance().getModuleManager().method14662(BlockFly.class)).method16732());
            }
        }
    }

    @EventTarget
    public void method16344(Class4423 var1) {
        if (this.method15996()
                && !(mc.player.field4984 <= 0.0F)
                && (!mc.player.isHandActive() || mc.player.method3158().getItem() != Items.field37796)
                && !((BlockFly) Client.getInstance().getModuleManager().method14662(BlockFly.class)).method16732()) {
            Class9805 var4 = mc.player.method3085(Class9173.field42108);
            float var5 = (float) (
                    (var4.method38660() + 0.03F + (double) (0.015F * (float) Class9567.method37078())) / (double) mc.player.abilities.method20716() + 1.0
            )
                    / 2.0F;
            var1.field21557 = var5;
        }
    }

    @EventTarget
    public void method16345(Class4403 var1) {
        if (this.method15996() && this.method15974("Keep Sprint")) {
            if (!var1.method13937()) {
                if (this.field23605.length == 2) {
                    double var4 = this.field23605[0] - mc.player.method3433().field18048;
                    double var6 = this.field23605[1] - mc.player.method3433().field18050;
                    if (var4 != 0.0 || var6 != 0.0) {
                        mc.player.method3435(this.field23605[0], mc.player.method3433().field18049, this.field23605[1]);
                    }

                    if (this.field23606 && !mc.player.method3337()) {
                        mc.player.setSprinting(true);
                    }
                }
            } else {
                this.field23605[0] = mc.player.method3433().field18048;
                this.field23605[1] = mc.player.method3433().field18050;
                this.field23606 = mc.player.method3337();
            }
        }
    }
}
