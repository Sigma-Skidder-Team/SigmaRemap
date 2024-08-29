package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4434;
import com.mentalfrostbyte.jello.event.impl.Class4436;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5157 extends Module {
    private int field23410;
    private boolean field23411;
    private boolean field23412;
    private boolean field23413;

    public Class5157() {
        super(ModuleCategory.COMBAT, "NoGround", "NoGround criticals");
        this.registerSetting(new ModeSetting("Offset", "The way you will fake no ground", 0, "Vanilla", "OldHypixel"));
        this.registerSetting(new BooleanSetting("Avoid Fall Damage", "Avoid fall damages.", true));
    }

    @Override
    public void onEnable() {
        if (Class5628.method17730(mc.player, 0.001F)) {
            this.field23411 = this.getStringSettingValueByName("Offset").equals("OldHypixel");
            this.field23410 = !this.field23411 ? 1 : 2;
        }

        this.field23412 = false;
    }

    @EventTarget
    @HigherPriority
    private void method16034(Class4434 var1) {
        if (this.isEnabled() && !(var1.method13988() < 0.625)) {
            if (this.field23410 == 0 && this.field23411) {
                var1.method13900(true);
            }
        }
    }

    @EventTarget
    private void method16035(Class4436 var1) {
        if (this.isEnabled()) {
            if (this.field23410 == 1) {
                var1.method13900(true);
                this.field23412 = true;
            }
        }
    }

    @EventTarget
    @HigherPriority
    private void method16036(Class4399 var1) {
        if (this.isEnabled()) {
            if (mc.player.onGround) {
                this.field23413 = false;
                if (this.field23412 && this.field23410 != 1) {
                    this.field23412 = !this.field23412;
                    mc.player.method2914();
                }

                if (this.getStringSettingValueByName("Offset").equals("OldHypixel") != this.field23411) {
                    this.field23411 = this.getStringSettingValueByName("Offset").equals("OldHypixel");
                    this.field23410 = 2;
                }

                double var4 = this.field23411 ? 1.0E-14 : 0.0;
                boolean var6 = false;
                boolean var7 = mc.objectMouseOver != null && mc.objectMouseOver.getType() == RayTraceResult.Type.BLOCK;
                boolean var8 = mc.playerController.getIsHittingBlock() || mc.gameSettings.keyBindAttack.isKeyDown() && var7;
                if (!var8 && !Jesus.method16953()) {
                    switch (this.field23410) {
                        case 0:
                            var1.method13908(true);
                            this.field23410--;
                            break;
                        case 1:
                            var4 = 0.065;
                            this.field23410--;
                            break;
                        case 2:
                            var1.method13908(true);
                            var4 = 0.065;
                            this.field23410--;
                            if (!this.field23411) {
                                var4 = 1.0E-14;
                                this.field23410--;
                            }
                            break;
                        case 3:
                            var1.method13908(true);
                            var4 = 0.0;
                            var6 = true;
                            this.field23410--;
                    }
                } else {
                    this.field23410 = 2;
                    var6 = true;
                }

                var1.method13912(var1.method13911() + var4);
                var1.method13920(var6);
            } else {
                this.field23410 = this.getBooleanValueFromSetttingName("Avoid Fall Damage") && !this.field23411 ? 3 : 0;
                if (this.getBooleanValueFromSetttingName("Avoid Fall Damage") && this.field23411 && !this.field23413 && mc.player.method3433().field18049 < -0.1) {
                    this.field23413 = !this.field23413;
                    var1.method13920(true);
                }
            }
        }
    }
}
