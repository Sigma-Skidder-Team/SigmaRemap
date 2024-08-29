package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.event.impl.Class4436;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.util.math.BlockPos;

public class Class5292 extends Module {
    private double field23802;
    private double field23803;
    private int field23804;
    private int field23805;
    private int field23806;
    private boolean field23807;

    public Class5292() {
        super(ModuleCategory.MOVEMENT, "Mineplex", "Mineplex longjump.");
    }

    @Override
    public void onDisable() {
        Class9567.method37090(Class9567.method37075() * 0.7);
    }

    @Override
    public void onEnable() {
        this.field23807 = true;
        this.field23804 = -1;
        this.field23805 = 0;
        this.field23806 = 0;
    }

    @EventTarget
    public void method16621(Class4399 var1) {
        if (this.isEnabled() && var1.method13921() && this.field23804 >= 0) {
            var1.method13908(true);
        }
    }

    @EventTarget
    public void method16622(Class4435 var1) {
        if (this.isEnabled() && mc.player != null) {
            if (!mc.player.onGround) {
                if (this.field23804 >= 0) {
                    if (this.field23807 && !Class5628.method17686()) {
                        this.field23807 = !this.field23807;
                        this.field23802 = 0.5;
                        this.field23805 = 1;
                    }

                    this.field23804++;
                    this.field23803 -= 0.04000000000001;
                    if (this.field23804 <= 22) {
                        if (this.field23804 == 10 && this.field23807) {
                            this.field23803 = -0.005;
                        }
                    } else {
                        this.field23803 -= 0.02;
                    }

                    if (this.field23804 > 6 && !Class5628.method17686()) {
                        this.field23803 -= 0.05;
                    }

                    if (mc.player.collidedHorizontally) {
                        this.field23802 = 0.35;
                        this.field23805 = 1;
                    }

                    if (mc.player.collidedVertically) {
                        this.field23803 = -0.078;
                        this.field23804 = 23;
                    }

                    this.field23802 -= 0.01;
                    if (this.field23802 < 0.3) {
                        this.field23802 = 0.3;
                    }

                    Class9567.method37088(var1, this.field23802);
                    var1.method13995(this.field23803);
                }
            } else {
                if (this.field23806 > 1) {
                    this.field23805 = 0;
                } else {
                    this.field23806++;
                }

                if (this.field23804 > 0) {
                    this.field23804 = -1;
                    if (this.method16004().getBooleanValueFromSetttingName("Auto Disable")) {
                        this.method16004().method16000();
                        return;
                    }
                }

                this.field23807 = Class5628.method17686();
                BlockPos var4 = new BlockPos(mc.player.getPosX(), mc.player.getPosY() - 0.4, mc.player.getPosZ());
                if (Class5628.method17686()
                        && (this.method16004().getBooleanValueFromSetttingName("BorderJump") && !Class9217.method34578(var4) || this.method16004().getBooleanValueFromSetttingName("Auto Jump"))) {
                    mc.player.method2914();
                    var1.method13995(mc.player.method3433().field18049);
                    Class9567.method37088(var1, 0.0);
                }
            }
        }
    }

    @EventTarget
    public void method16623(Class4436 var1) {
        if (this.isEnabled() && mc.player != null) {
            this.field23802 = 0.81 + (double) this.field23805 * 0.095;
            if (mc.player.getPosY() != (double) ((int) mc.player.getPosY())) {
                this.field23802 = 0.52;
                this.field23805 = 1;
            }

            this.field23806 = 0;
            this.field23803 = 0.4299999;
            if (this.field23805 < 2) {
                this.field23805++;
            }

            this.field23804 = 0;
            var1.method14003(0.0);
            var1.method14002(this.field23803);
        }
    }

    @EventTarget
    public void method16624(RecievePacketEvent var1) {
        if (this.isEnabled() && mc.player != null) {
            if (var1.getPacket() instanceof Class5473) {
                this.field23804 = -1;
                this.field23805 = 0;
            }
        }
    }
}
