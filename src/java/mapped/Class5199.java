package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5199 extends Module {
    private boolean field23507 = false;
    private boolean field23508;
    private double field23509;
    private boolean field23510;

    public Class5199() {
        super(ModuleCategory.PLAYER, "NoFall", "Avoid you from getting fall damages");
        this.registerSetting(
                new ModeSetting("Mode", "Nofall mode", 0, "Vanilla", "Hypixel", "Hypixel2", "AAC", "NCPSpigot", "OldHypixel", "Vanilla Legit")
                        .setModeAsPremium("Hypixel", "Hypixel2")
        );
    }

    @Override
    public void onEnable() {
        this.field23507 = false;
        this.field23508 = false;
        this.field23509 = 0.0;
    }

    @EventTarget
    @LowerPriority
    private void method16187(Class4435 var1) {
        if (this.isEnabled()) {
            if (var1.method13994() < -0.5
                    && (double) mc.player.fallDistance > 2.0 + (double) Class9567.method37079() * 0.5
                    && !mc.player.onGround
                    && this.getStringSettingValueByName("Mode").equals("Hypixel")
                    && Class5628.method17716()) {
                double[] var4 = Class5628.method17747();
                int var5 = var4.length;
                double var6 = Double.MAX_VALUE;

                for (int var8 = 0; var8 < var5; var8++) {
                    double var9 = var4[var8];
                    double var11 = mc.player.getPosY();
                    double var13 = (double) ((int) (var11 + var1.method13994())) - var11 - var1.method13994() + var9;
                    double var15 = 0.02;
                    double var17 = -0.05;
                    if (var1.method13994() > -0.5 + (double) (Class9567.method37079())) {
                        var15 = 0.0;
                    }

                    if (var13 > var17 && var13 < var15) {
                        AxisAlignedBB var19 = mc.player.boundingBox.method19667(var1.method13992(), var1.method13994() + var13 + var17, var1.method13996());
                        if (mc.world.method7055(mc.player, var19).count() != 0L) {
                            var13 -= 1.0E-5;
                            var1.method13995(var1.method13994() + var13);
                            Class5628.method17725(var1.method13994());
                            var6 = Double.MAX_VALUE;
                            break;
                        }

                        if (Math.abs(var13) < var6) {
                            var6 = var13;
                        }
                    }
                }

                if (Math.abs(var6) < 0.1) {
                    var1.method13995(var1.method13994() + var6);
                    Class5628.method17725(var1.method13994());
                }
            }
        }
    }

    @EventTarget
    private void method16188(Class4399 var1) {
        if (this.isEnabled() && mc.player != null) {
            if (!(mc.player.getPosY() < 2.0)) {
                String var4 = this.getStringSettingValueByName("Mode");
                if (!Class5628.method17716() && var4.equals("Hypixel")) {
                    var4 = "OldHypixel";
                }

                switch (var4) {
                    case "OldHypixel":
                        if (var1.method13921()) {
                            if (Class5628.method17730(mc.player, 1.0E-4F)) {
                                this.field23509 = 0.0;
                                return;
                            }

                            if (mc.player.method3433().field18049 < -0.1) {
                                if (this.field23509 == 0.0) {
                                }

                                this.field23509 = this.field23509 - mc.player.method3433().field18049;
                            }

                            if (this.field23509 > 3.0) {
                                this.field23509 = 1.0E-14;
                                var1.method13920(true);
                            }
                        }
                        break;
                    case "Hypixel":
                        if (var1.method13921() && mc.player.method3433().field18049 < 0.0 && !mc.player.onGround && Class5628.method17716()) {
                            for (double var10 : Class5628.method17747()) {
                                if ((double) ((int) var1.method13911()) - var1.method13911() + var10 == 0.0) {
                                    var1.method13920(true);
                                    break;
                                }
                            }
                        }
                        break;
                    case "Hypixel2":
                        if (var1.method13921()) {
                            if (Class5628.method17730(mc.player, 1.0E-4F)) {
                                this.field23509 = 0.0;
                                return;
                            }

                            if (mc.player.method3433().field18049 < -0.1 && mc.player.fallDistance > 3.0F) {
                                this.field23509++;
                                if (this.field23509 == 1.0) {
                                    mc.getConnection().sendPacket(new Class5603(true));
                                } else if (this.field23509 > 1.0) {
                                    this.field23509 = 0.0;
                                }
                            }
                        }
                        break;
                    case "AAC":
                        if (var1.method13921()) {
                            if (mc.player.ticksExisted == 1) {
                                this.field23507 = false;
                            }

                            if (!this.field23507 && mc.player.fallDistance > 3.0F && this.getStringSettingValueByName("Mode").equals("AAC")) {
                                this.field23507 = !this.field23507;
                                Class5605 var7 = new Class5605(mc.player.getPosX(), Double.NaN, mc.player.getPosZ(), true);
                                mc.getConnection().sendPacket(var7);
                            }
                        }
                        break;
                    case "Vanilla":
                        if (var1.method13921() && mc.player.method3433().field18049 < -0.1) {
                            var1.method13920(true);
                        }
                        break;
                    case "Vanilla Legit":
                        if (mc.player.method3433().field18049 < -0.1) {
                            var1.method13920(true);
                        }

                        if (mc.player.fallDistance > 3.0F) {
                            this.field23510 = true;
                        }

                        if (this.field23510 && mc.player.onGround && !mc.player.method3250()) {
                            double var12 = mc.player.getPosX();
                            double var14 = mc.player.getPosY();
                            double var16 = mc.player.getPosZ();
                            mc.getConnection().sendPacket(new Class5605(var12, var14 + 3.01, var16, false));
                            mc.getConnection().sendPacket(new Class5605(var12, var14, var16, false));
                            mc.getConnection().sendPacket(new Class5605(var12, var14, var16, true));
                            System.out.println("sent");
                            this.field23510 = false;
                        }
                        break;
                    case "NCPSpigot":
                        if (var1.method13921()) {
                            if (mc.player.fallDistance > 3.0F) {
                                this.field23508 = true;
                            }

                            if (this.field23508 && Client.getInstance().method19939().method31329() == 0 && mc.player.onGround) {
                                var1.method13912(var1.method13911() - 11.0);
                                this.field23508 = false;
                            }
                        }
                }
            }
        }
    }
}
