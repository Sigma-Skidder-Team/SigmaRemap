package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import org.lwjgl.glfw.GLFW;

public class Class5209 extends Module {
    public int field23528 = 0;
    public int field23533 = 0;
    private float field23529;
    private float field23530;
    private float field23531;
    private boolean field23532;

    public Class5209() {
        super(ModuleCategory.MOVEMENT, "ElytraFly", "Better elytra flying");
        this.registerSetting(new BooleanSetting("NCP", "Bypass NCP", true));
    }

    @EventTarget
    public void method16220(TickEvent var1) {
        if (this.method15996()) {
            mc.gameSettings.field44637.field13071 = false;
            if (!(mc.player.method3433().field18049 < 0.08) || mc.player.field5036) {
                mc.player.method3349(7, false);
                if (mc.player.method3331()) {
                    this.method15999(false);
                }
            } else if (!mc.player.method3165()) {
                mc.getConnection().sendPacket(new CEntityActionPacket(mc.player, Class1865.field10048));
                mc.player.method3349(7, true);
            }
        }
    }

    @EventTarget
    public void method16221(Class4435 var1) {
        if (this.method15996()) {
            double var4 = Class9567.method37075();
            boolean var6 = Class5628.method17686();
            if (!this.method15974("NCP") && mc.player.method3331()) {
                var4 *= 2.5;
            }

            Class9567.method37088(var1, 0.0);
            if (!mc.player.method3165()) {
                this.field23528 = 0;
            } else {
                if (this.field23528 > 0) {
                    if (this.field23528 > 7) {
                        Class9567.method37088(var1, var4 * 6.3F);
                    }

                    Class5628.method17725(-0.071);
                    var1.method13995(-1.0001E-4F);
                }

                this.field23528++;
            }

            if (this.field23530 > 1.0001E-4F && mc.player.field4981) {
                Class9567.method37088(var1, var4 * 6.3F);
                var1.method13995(this.field23530);
            }

            int var7 = GLFW.glfwGetKey(mc.mainWindow.getHandle(), mc.gameSettings.field44637.field13070.field34875);
            if (var7 == 1 && this.method15974("NCP")) {
                var1.method13995(-0.9F);
            } else if (!mc.player.method3331()) {
                if (mc.player.field4981 && !this.method15974("NCP")) {
                    var1.method13995(1.4F);
                }
            } else {
                var1.method13995(1.4F);
            }

            this.field23530 = (float) ((double) this.field23530 * 0.85);
        }
    }

    @EventTarget
    private void method16222(Class4396 var1) {
        if (this.method15996()) {
            if (mc.player != null && var1.method13898() instanceof Class5590) {
                Class5590 var4 = (Class5590) var1.method13898();
                Entity var5 = mc.world.method6774(var4.method17565());
                if (var5 instanceof Class888) {
                    Class888 var6 = (Class888) var5;
                    if (var6.field5125 != null && var6.field5125.method3205() == mc.player.method3205()) {
                        this.field23529 = this.field23529 + (float) var4.field24801 / 8000.0F;
                        this.field23531 = this.field23531 + (float) var4.field24803 / 8000.0F;
                        this.field23530 = this.field23530 + (float) var4.field24802 / 8000.0F;
                        this.field23532 = true;
                    }
                }
            }
        }
    }

    @EventTarget
    private void method16223(Class4399 var1) {
        if (this.method15996()) {
            byte var4 = 65;
            if (this.field23533 != var4 - 1) {
                if (this.field23533 <= 0 && mc.player.field4981) {
                    this.field23533 = var4;
                }
            } else {
                int var5 = Class7789.method25843(Items.field38068);
                if (var5 >= 0) {
                    if (var5 != mc.player.inventory.currentItem) {
                        mc.getConnection().sendPacket(new Class5539(var5));
                    }

                    mc.getConnection().sendPacket(new Class5555(Hand.MAIN_HAND));
                    if (var5 != mc.player.inventory.currentItem) {
                        mc.getConnection().sendPacket(new Class5539(mc.player.inventory.currentItem));
                    }
                }
            }

            if (this.field23533 > 0) {
                var1.method13916(-90.0F);
            }

            if (!mc.player.field4981) {
                this.field23533 = 0;
            }

            this.field23533--;
        }
    }

    @EventTarget
    @HigherPriority
    private void method16224(Class4402 var1) {
        if (!this.method15996()) {
        }
    }

    @EventTarget
    private void method16225(Class4426 var1) {
        if (!this.method15996()) {
        }
    }

    @Override
    public void isInDevelopment() {
        if (mc.player.field5036) {
            Class5628.method17725(0.3994F);
        }
    }

    @Override
    public void method15965() {
        if (!Class9567.method37087()) {
            Class5628.method17724(0.0);
            Class5628.method17726(0.0);
        }
    }
}
