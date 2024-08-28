package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4401;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.util.timer.Timer;

public class Class5195 extends Module {
    private int field23504;
    private final Timer field23505 = new Timer();

    public Class5195() {
        super(ModuleCategory.MOVEMENT, "Bow", "Fly for Bow");
    }

    @Override
    public void method15965() {
        if (mc.field1284.field40360 == 0.1F) {
            mc.field1284.field40360 = 1.0F;
        }
    }

    @Override
    public void method15953() {
    }

    @EventTarget
    public void method16178(Class4401 var1) {
        if (this.method15996()) {
            if (mc.field1339.method3094(Hand.field182).method32107() == Class8514.field37796 && this.field23504 >= 1) {
                var1.method13900(true);
            }
        }
    }

    @EventTarget
    public void method16179(Class4435 var1) {
        if (this.method15996()) {
            double var4 = var1.method13998().field18049;
            var1.method13998().field18049 = 0.0;
            double var6 = var1.method13998().method11348();
            var1.method13998().field18049 = var4;
            float var8 = Class9567.method37082()[1];
            float var9 = Class9567.method37082()[2];
            float var10 = Class9567.method37082()[0];
            System.out.println(var6);
            if ((var8 != 0.0F || var9 != 0.0F) && !(var1.method13998().field18049 < -0.5)) {
                double var11 = Math.cos(Math.toRadians(var10));
                double var13 = Math.sin(Math.toRadians(var10));
                var1.method13993((double) var8 * var6 * var11 + (double) var9 * var6 * var13);
                var1.method13997((double) var8 * var6 * var13 - (double) var9 * var6 * var11);
                mc.field1339.method3433().field18048 = var1.method13992();
                mc.field1339.method3433().field18049 = var1.method13994();
            } else {
                var1.method13993(0.0);
                var1.method13997(0.0);
            }
        }
    }

    @EventTarget
    public void method16180(Class4399 var1) {
        if (this.method15996() && var1.method13921()) {
            if (!this.field23505.method27123()) {
                this.field23505.method27118();
            }

            int var4 = this.method16181();
            if (var4 >= 0 || var4 <= 8) {
                if (mc.field1339.method3094(Hand.field182).method32107() == Class8514.field37796) {
                    if (Class5260.method16437(Class8514.field37797) == 0) {
                        if (this.field23505.method27121() > 5000L) {
                            Client.getInstance().getNotificationManager().post(new Notification("BowFly", "You have no arrows"));
                            this.field23505.method27120();
                        }

                        if (mc.field1284.field40360 == 0.1F) {
                            mc.field1284.field40360 = 1.0F;
                        }

                        return;
                    }

                    float var5 = mc.field1339.field5031;
                    float var6 = -90.0F;
                    if (mc.field1339.field4984 != 0.0F || mc.field1339.field4982 != 0.0F) {
                        var6 = -80.0F;
                    }

                    if (mc.field1339.field4984 < 0.0F) {
                        var5 -= 180.0F;
                    }

                    if (mc.field1339.method3433().field18049 < -0.1) {
                        var6 = 90.0F;
                    }

                    var1.method13916(var6);
                    var1.method13918(var5);
                    if (mc.field1339.field5036 && mc.field1339.field5038) {
                        mc.field1339.method2914();
                    } else if (!(mc.field1339.method3433().field18049 < 0.0)) {
                        if (mc.field1284.field40360 == 0.1F) {
                            mc.field1284.field40360 = 1.0F;
                        }
                    } else {
                        mc.field1284.field40360 = 0.1F;
                    }

                    this.field23504++;
                    if (this.field23504 < 4) {
                        if (this.field23504 == 1) {
                            mc.getClientPlayNetHandler().sendPacket(new Class5555(Hand.field182));
                        }
                    } else {
                        mc.getClientPlayNetHandler().sendPacket(new Class5492(Class2070.field13489, BlockPos.field13032, Direction.field672));
                        this.field23504 = 0;
                    }
                }
            }
        }
    }

    private int method16181() {
        for (int var3 = 36; var3 < 45; var3++) {
            if (mc.field1339.field4904.method18131(var3).method18266()) {
                ItemStack var4 = mc.field1339.field4904.method18131(var3).method18265();
                if (var4.method32107() == Class8514.field37796) {
                    return var3 - 36;
                }
            }
        }

        for (int var5 = 9; var5 < 36; var5++) {
            if (mc.field1339.field4904.method18131(var5).method18266()) {
                ItemStack var6 = mc.field1339.field4904.method18131(var5).method18265();
                if (var6.method32107() == Class8514.field37796) {
                    Class7789.method25873(var5, 7);
                    return 7;
                }
            }
        }

        return -1;
    }
}
