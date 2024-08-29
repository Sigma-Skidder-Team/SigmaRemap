package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4417;
import com.mentalfrostbyte.jello.event.impl.Class4434;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5286 extends Module {
    private int field23758;
    private double field23759;
    private double field23760;
    private float field23761;

    public Class5286() {
        super(ModuleCategory.MOVEMENT, "Spider", "Step for Spider");
        this.registerSetting(new ModeSetting("Mode", "Mode", 0, "NCP", "AAC", "Gomme"));
    }

    @Override
    public void isInDevelopment() {
        this.field23758 = 0;
    }

    @EventTarget
    @LowerPriority
    private void method16586(Class4434 var1) {
        if (this.method15996() && !var1.isCancelled()) {
            double var4 = var1.method13988();
            Class2131 var6 = ((Class5330) this.method16004()).method16748(var1);
            if (var6 == Class2131.field13904) {
                var1.method13900(true);
            } else if (var6 != Class2131.field13905) {
                if (!Class9567.method37081() && var4 >= 0.625) {
                    this.field23760 = var4;
                    double var7 = Class9567.method37080();
                    if (var4 < 1.1) {
                        var7 *= var4;
                    }

                    var7 = !(var7 > 0.42) ? var7 : 0.4199998;
                    var1.method13989(var7);
                    this.field23761 = Class9567.method37083()[0] - 90.0F;
                    this.field23758 = 1;
                    this.field23759 = mc.player.getPosY();
                    var4 = var1.method13988();
                }
            }
        }
    }

    @EventTarget
    private void method16587(Class4399 var1) {
        if (this.method15996() && mc.player != null && var1.method13921()) {
            if (this.field23758 != 1) {
                if (this.field23758 == 3) {
                    Module var4 = Client.getInstance().getModuleManager().method14662(Class5332.class);
                    if (var4.method15996() && var4.getStringSettingValueByName("Type").equals("NoGround")) {
                        var1.method13912(var1.method13911() + 1.0E-14);
                    } else {
                        var1.method13920(true);
                    }
                }
            } else {
                var1.method13920(false);
            }
        }
    }

    @EventTarget
    private void method16588(Class4435 var1) {
        if (this.method15996() && mc.player != null) {
            if (this.field23758 == 1) {
                double var4 = Class9567.method37080();
                if (this.field23760 < 1.1) {
                    var4 *= this.field23760;
                }

                var4 = var4 > 0.42 ? 0.4199998 : var4;
                var1.method13995(var4 * 0.797);
                Class9567.method37088(var1, 0.0);
                this.field23758++;
            } else if (this.field23758 == 2) {
                var1.method13995(this.field23759 + this.field23760 - mc.player.getPosY());
                double var10 = this.getStringSettingValueByName("Mode").equals("AAC") ? 0.301 : Class9567.method37075();
                float var6 = this.field23761 * (float) (Math.PI / 180.0);
                var1.method13993((double) (-MathHelper.sin(var6)) * var10);
                var1.method13997((double) MathHelper.cos(var6) * var10);
                this.field23758++;
            } else if (this.field23758 == 3) {
                if (Class5628.method17730(mc.player, 0.001F)) {
                    var1.method13995(-0.078);
                    String var7 = this.getStringSettingValueByName("Mode");
                    switch (var7) {
                        case "NCP":
                            Class9567.method37088(var1, Class9567.method37075());
                            break;
                        case "AAC":
                            Class9567.method37088(var1, 0.301);
                            break;
                        case "Gomme":
                            Class9567.method37088(var1, 0.175);
                    }
                } else {
                    Class9567.method37088(var1, 0.25);
                }

                if (!Class5628.method17686()) {
                    Class9567.method37088(var1, 0.0);
                }

                this.field23758 = 0;
            }
        }
    }

    @EventTarget
    private void method16589(Class4417 var1) {
        if (this.method15996() && mc.player != null) {
            if (!var1.method13967()) {
                mc.player.field5051 = 1.07F;
            } else {
                mc.player.field5051 = 0.5F;
            }
        }
    }
}
