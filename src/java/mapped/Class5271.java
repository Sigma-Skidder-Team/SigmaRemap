package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4418;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5271 extends Module {
    private int field23700;
    private int field23701;
    private double field23702;
    private final double[] field23703 = new double[]{0.0, 0.25, 0.5, 0.75, 1.0};

    public Class5271() {
        super(ModuleCategory.MOVEMENT, "OmegaCraft", "A fly for OmegaCraft anticheat");
    }

    @Override
    public void isInDevelopment() {
        this.field23701 = 0;
        this.field23700 = -1;
        double var3 = this.field23703[0];
        int var5 = this.field23703.length;
        double var6 = mc.player.getPositionVec().field18049 - (double) ((int) mc.player.getPositionVec().field18049);

        for (int var8 = 1; var8 < var5; var8++) {
            double var9 = this.field23703[var8] - var6;
            if (var9 < var6 - var3) {
                var3 = this.field23703[var8];
            }
        }

        this.field23702 = (double) ((int) mc.player.getPositionVec().field18049) + var3;
        mc.player.method3215(mc.player.getPositionVec().field18048, this.field23702, mc.player.getPositionVec().field18050);
    }

    @Override
    public void method15965() {
        Class9567.method37090(0.2);
        if (mc.player.method3433().field18049 > 0.03) {
            Class5628.method17725(-0.0784);
        }
    }

    @EventTarget
    public void method16494(Class4418 var1) {
        this.field23701 = 0;
        this.field23700 = -1;
        double var4 = this.field23703[0];
        int var6 = this.field23703.length;
        double var7 = mc.player.getPositionVec().field18049 - (double) ((int) mc.player.getPositionVec().field18049);

        for (int var9 = 1; var9 < var6; var9++) {
            double var10 = this.field23703[var9] - var7;
            if (var10 < var7 - var4) {
                var4 = this.field23703[var9];
            }
        }

        this.field23702 = (double) ((int) mc.player.getPositionVec().field18049) + var4;
        mc.player.method3215(mc.player.getPositionVec().field18048, this.field23702, mc.player.getPositionVec().field18050);
    }

    @EventTarget
    public void method16495(Class4399 var1) {
        if (var1.method13921()) {
            var1.method13908(true);
            if (this.field23700 != 0) {
                if (this.field23700 == 1) {
                    var1.method13920(false);
                    var1.method13912(var1.method13911() + 0.03);
                }
            } else {
                var1.method13920(true);
            }
        }
    }

    @EventTarget
    public void method16496(Class4435 var1) {
        this.field23700++;
        if (this.field23701 > 0) {
            this.field23701--;
        }

        var1.method13995(0.0);
        if (this.field23700 != 1) {
            if (this.field23700 > 1) {
                mc.player.method3215(mc.player.getPositionVec().field18048, this.field23702, mc.player.getPositionVec().field18050);
                double var4 = !mc.gameSettings.field44637.method8509() ? 0.405 + (double) Class9567.method37078() * 0.02 : 0.25;
                Class9567.method37088(var1, var4);
                this.field23700 = 0;
            }
        } else {
            if (mc.gameSettings.field44636.method8509() && this.field23701 == 0) {
                var1.method13995(0.5);
                this.field23702 = this.field23702 + var1.method13994();
                this.field23701 = 3;
                this.field23700 = 0;
            }

            double var6 = !mc.gameSettings.field44637.method8509() ? 0.6 : 0.25;
            Class9567.method37088(var1, var6);
        }

        Class5628.method17724(var1.method13992());
        Class5628.method17725(var1.method13994());
        Class5628.method17726(var1.method13996());
    }

    @EventTarget
    public void method16497(Class4396 var1) {
        if (var1.method13898() instanceof Class5473) {
            Class5473 var4 = (Class5473) var1.method13898();
            double var5 = this.field23703[0];
            int var7 = this.field23703.length;
            double var8 = var4.field24298 - (double) ((int) var4.field24298);

            for (int var10 = 1; var10 < var7; var10++) {
                double var11 = this.field23703[var10] - var8;
                if (var11 < var8 - var5) {
                    var5 = this.field23703[var10];
                }
            }

            this.field23702 = (double) ((int) var4.field24298) + var5;
        }
    }
}
