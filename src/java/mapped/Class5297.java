package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4398;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5297 extends Module {
    private boolean field23813 = false;

    public Class5297() {
        super(ModuleCategory.MOVEMENT, "Minemen", "Minemen spider");
        this.registerSetting(new BooleanSetting("AutoClimb", "Automatically climbs for you", true));
        this.registerSetting(new BooleanSetting("Ceiling", "Allows you to fly under ceiling", true));
        this.registerSetting(new BooleanSetting("SneakVClip", "Allows you to phase through ground", true));
    }

    @Override
    public void onEnable() {
        this.field23813 = false;
    }

    @EventTarget
    private void method16636(Class4435 var1) {
        double var4 = 1.0E-5;
        boolean var6 = mc.world
                .method7055(mc.player, mc.player.boundingBox.method19662(var4, 0.0, var4).method19662(-var4, 0.0, -var4))
                .count()
                > 0L;
        if (var6) {
            if (!mc.player.collidedHorizontally) {
                if (!mc.player.onGround) {
                    var1.method13995(!mc.gameSettings.keyBindSneak.isKeyDown() ? 0.0 : var1.method13994());
                }
            } else if (!this.getBooleanValueFromSetttingName("AutoClimb") && !mc.gameSettings.keyBindJump.isKeyDown()) {
                var1.method13995(!mc.gameSettings.keyBindSneak.isKeyDown() ? 0.0 : var1.method13994());
            } else {
                var1.method13995(0.6);
            }

            Class9567.method37088(var1, 0.689 + (double) Class9567.method37078() * 0.06);
        }

        if (ColorUtils.method17730(mc.player, 0.001F) && this.getBooleanValueFromSetttingName("SneakVClip")) {
            if (mc.gameSettings.keyBindSneak.isKeyDown()
                    && !this.field23813
                    && mc.world.method7055(mc.player, mc.player.boundingBox.method19667(0.0, -2.8, 0.0)).count() == 0L) {
                mc.getConnection()
                        .sendPacket(
                                new Class5605(
                                        mc.player.getPositionVec().field18048,
                                        mc.player.getPositionVec().field18049 - 1.0E-14,
                                        mc.player.getPositionVec().field18050,
                                        false
                                )
                        );
                mc.player
                        .setPosition(
                                mc.player.getPositionVec().field18048,
                                mc.player.getPositionVec().field18049 - 2.8,
                                mc.player.getPositionVec().field18050
                        );
                mc.gameSettings.keyBindSneak.pressed = false;
                mc.player.onGround = false;
                mc.timer.timerSpeed = 0.08F;
                var1.method13900(true);
                this.field23813 = true;
                var1.method13995(1.0E-14);
            }
        } else {
            if (this.getBooleanValueFromSetttingName("Ceiling")
                    && !mc.gameSettings.keyBindSneak.isKeyDown()
                    && mc.world.method7055(mc.player, mc.player.boundingBox.method19667(0.0, 0.01, 0.0)).count() > 0L) {
                var1.method13995(1.0E-14);
                Class9567.method37088(var1, 0.689 + (double) Class9567.method37078() * 0.06);
            }

            if (this.field23813) {
                mc.timer.timerSpeed = 1.0F;
                this.field23813 = false;
                var1.method13995(1.0E-14);
                Class9567.method37088(var1, 0.28);
            }
        }

        ColorUtils.method17725(var1.method13994());
    }

    @EventTarget
    private void method16637(Class4399 var1) {
        if (this.isEnabled() && var1.method13921()) {
            Class9629 var4 = ColorUtils.method17760(1.0E-4);
            if (this.getBooleanValueFromSetttingName("Ceiling")
                    && !mc.player.onGround
                    && mc.world.method7055(mc.player, mc.player.boundingBox.method19667(0.0, 1.0E-6, 0.0)).count() > 0L) {
                var1.method13912(var1.method13911() + 4.9E-7);
            }

            double var5 = 1.0E-5;
            if (var4 != null
                    && mc.world
                    .method7055(mc.player, mc.player.boundingBox.method19662(var5, 0.0, var5).method19662(-var5, 0.0, -var5))
                    .count()
                    > 0L) {
                if (!ColorUtils.method17730(mc.player, 1.0E-4F)) {
                    var1.method13920(true);
                }

                double var7 = 4.88E-7;
                if (((Direction) var4.method37538()).method544() != Class113.field413) {
                    var1.method13914(
                            (double) Math.round((((Vector3d) var4.method37539()).field18050 + 1.1921022E-8) * 10000.0) / 10000.0
                                    + (double) ((Direction) var4.method37538()).method541() * var7
                    );
                } else {
                    var1.method13910(
                            (double) Math.round((((Vector3d) var4.method37539()).field18048 + 1.1921022E-8) * 10000.0) / 10000.0
                                    + (double) ((Direction) var4.method37538()).method539() * var7
                    );
                }
            }
        }
    }

    @EventTarget
    private void method16638(Class4398 var1) {
        if (this.isEnabled() && mc.player != null) {
            if (var1.method13903() != null
                    && !var1.method13903().method19516()
                    && var1.method13903().method19514().field28450 > mc.player.boundingBox.field28450 + 1.0) {
                var1.method13900(true);
            }
        }
    }
}
