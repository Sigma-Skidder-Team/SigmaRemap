package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5189 extends Module {
    private int field23495 = 1;
    private boolean field23496;

    public Class5189() {
        super(ModuleCategory.MOVEMENT, "TargetStrafe", "Allows you to strafe arround targets with speed");
        this.method15972(new Class6005("Mode", "Mode", 0, "Basic", "Ninja", "Random"));
        this.method15972(new Class6009<Float>("Radius", "Radius of the circle", 2.0F, Float.class, 1.0F, 6.0F, 0.01F));
        this.method15972(new Class6004("Only speed", "Use target strafe only when speed is enabled", true));
        this.method15972(
                new Class6005("AntiVoid", "The way you will avoid the void", 0, "Smart", "Halt", "Command", "None").method18616(var1 -> this.field23496 = false)
        );
    }

    // $VF: synthetic method
    public static Minecraft method16156() {
        return field23386;
    }

    // $VF: synthetic method
    public static Minecraft method16157() {
        return field23386;
    }

    @EventTarget
    @LowerPriority
    public void method16151(Class4435 var1) {
        if (this.method15996()) {
            Entity var4 = null;
            if (Client.getInstance().getModuleManager().method14662(Class5341.class).method15988() || !this.method15974("Only speed")) {
                if (Class5357.field23949 != null) {
                    var4 = Class5357.field23949.method27397();
                } else if (Class5357.field23948 != null) {
                    var4 = Class5357.field23948;
                }
            }

            if (var4 != null) {
                double var5 = Math.sqrt(var1.method13992() * var1.method13992() + var1.method13996() * var1.method13996());
                float var7 = this.method15977("Radius");
                String var8 = this.method15978("Mode");
                switch (var8) {
                    case "Basic":
                        this.method16152(var4, var5, (double) var7, var1);
                        break;
                    case "Ninja":
                        float var15 = (float) Math.toRadians((double) (var4.method3142() - 180.0F));
                        double var16 = var4.method3431().field18048 - (double) (Class9679.method37763(var15) * var7);
                        double var17 = var4.method3431().field18050 + (double) (Class9679.method37764(var15) * var7);
                        var1.method13993(var16 - field23386.field1339.method3431().field18048);
                        var1.method13997(var17 - field23386.field1339.method3431().field18050);
                        break;
                    case "Random":
                        float var10 = (float) (Math.random() * 2.0 * Math.PI);
                        double var11 = var4.method3431().field18048 - (double) (Class9679.method37763(var10) * var7);
                        double var13 = var4.method3431().field18050 + (double) (Class9679.method37764(var10) * var7);
                        var1.method13993(var11 - field23386.field1339.method3431().field18048);
                        var1.method13997(var13 - field23386.field1339.method3431().field18050);
                }
            }
        }
    }

    public void method16152(Entity var1, double var2, double var4, Class4435 var6) {
        double var9 = var2 / (var4 * Math.PI * 2.0) * 360.0 * (double) this.field23495;
        double var11 = field23386.field1339.getPosX() - var1.getPosX();
        double var13 = field23386.field1339.getPosZ() - var1.getPosZ();
        double var15 = Math.atan2(var13, var11) * 180.0 / Math.PI - 90.0;
        double var17 = (var15 + var9) * Math.PI / 180.0;
        double var19 = var1.method3431().field18048 - Math.sin(var17) * var4;
        double var21 = var1.method3431().field18050 + Math.cos(var17) * var4;
        var11 = var19 - field23386.field1339.getPosX();
        var13 = var21 - field23386.field1339.getPosZ();
        double var23 = Math.atan2(var13, var11) * 180.0 / Math.PI - 90.0;
        var17 = var23 * Math.PI / 180.0;
        var6.method13993(-Math.sin(var17) * var2);
        var6.method13997(Math.cos(var17) * var2);
        Vector3d var25 = field23386.field1339.method3233(var6.method13998());
        if (var25.field18048 != var6.method13992() || var25.field18050 != var6.method13996()) {
            this.field23495 *= -1;
            var9 *= -1.0;
            var17 = (var15 + var9) * Math.PI / 180.0;
            var19 = var1.method3431().field18048 - Math.sin(var17) * var4;
            var21 = var1.method3431().field18050 + Math.cos(var17) * var4;
            var11 = var19 - field23386.field1339.getPosX();
            var13 = var21 - field23386.field1339.getPosZ();
            var23 = Math.atan2(var13, var11) * 180.0 / Math.PI - 90.0;
            var17 = var23 * Math.PI / 180.0;
            var6.method13993(-Math.sin(var17) * var2);
            var6.method13997(Math.cos(var17) * var2);
        }

        Vector3d var26 = new Vector3d(
                field23386.field1339.method3431().field18048 + var6.method13992(),
                field23386.field1339.method3431().field18049 + var6.method13994(),
                field23386.field1339.method3431().field18050 + var6.method13996()
        );
        String var27 = this.method15978("AntiVoid");
        if (!var27.equals("None")) {
            if (!this.field23496 && this.method16153(var26) && !Client.getInstance().getModuleManager().method14662(Class5333.class).method15996()) {
                this.field23495 *= -1;
                this.field23496 = true;
            } else if (this.field23496 && !this.method16153(var26)) {
                this.field23496 = false;
            }
        }

        if (this.field23496 && field23386.field1339.method3275(var1) > this.method15977("Radius")) {
            if (!var27.equals("Halt")) {
                Class9567.method37088(var6, var2);
                if (var27.equals("Smart")) {
                    var26 = new Vector3d(
                            field23386.field1339.method3431().field18048 + var6.method13992(),
                            field23386.field1339.method3431().field18049 + var6.method13994(),
                            field23386.field1339.method3431().field18050 + var6.method13996()
                    );
                    if (this.method16153(var26) && !Client.getInstance().getModuleManager().method14662(Class5333.class).method15996()) {
                        Class9567.method37088(var6, 0.0);
                    }
                }
            } else {
                Class9567.method37088(var6, 0.0);
            }
        }
    }

    private boolean method16153(Vector3d var1) {
        if (!(field23386.field1339.method3431().field18049 < 1.0)) {
            Class6488 var4 = new Class6488(var1.method11339(-0.15, 0.0, -0.15), var1.method11339(0.15, (double) field23386.field1339.method3430(), 0.15));
            var4 = var4.method19662(0.0, -field23386.field1339.method3431().field18049, 0.0);
            return field23386.field1338.method7055(field23386.field1339, var4).count() == 0L;
        } else {
            return true;
        }
    }

    private boolean method16154(double var1, double var3, double var5) {
        return field23386.field1338.method7055(field23386.field1339, field23386.field1339.field5035.method19667(var1, var3, var5)).count() == 0L;
    }
}
