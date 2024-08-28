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
        this.method15972(new Class6004("AutoClimb", "Automatically climbs for you", true));
        this.method15972(new Class6004("Ceiling", "Allows you to fly under ceiling", true));
        this.method15972(new Class6004("SneakVClip", "Allows you to phase through ground", true));
    }

    @Override
    public void method15966() {
        this.field23813 = false;
    }

    @EventTarget
    private void method16636(Class4435 var1) {
        double var4 = 1.0E-5;
        boolean var6 = field23386.field1338
                .method7055(field23386.field1339, field23386.field1339.field5035.method19662(var4, 0.0, var4).method19662(-var4, 0.0, -var4))
                .count()
                > 0L;
        if (var6) {
            if (!field23386.field1339.field5037) {
                if (!field23386.field1339.field5036) {
                    var1.method13995(!field23386.field1299.field44637.method8509() ? 0.0 : var1.method13994());
                }
            } else if (!this.method15974("AutoClimb") && !field23386.field1299.field44636.method8509()) {
                var1.method13995(!field23386.field1299.field44637.method8509() ? 0.0 : var1.method13994());
            } else {
                var1.method13995(0.6);
            }

            Class9567.method37088(var1, 0.689 + (double) Class9567.method37078() * 0.06);
        }

        if (Class5628.method17730(field23386.field1339, 0.001F) && this.method15974("SneakVClip")) {
            if (field23386.field1299.field44637.method8509()
                    && !this.field23813
                    && field23386.field1338.method7055(field23386.field1339, field23386.field1339.field5035.method19667(0.0, -2.8, 0.0)).count() == 0L) {
                field23386.getClientPlayNetHandler()
                        .sendPacket(
                                new Class5605(
                                        field23386.field1339.method3431().field18048,
                                        field23386.field1339.method3431().field18049 - 1.0E-14,
                                        field23386.field1339.method3431().field18050,
                                        false
                                )
                        );
                field23386.field1339
                        .method3215(
                                field23386.field1339.method3431().field18048,
                                field23386.field1339.method3431().field18049 - 2.8,
                                field23386.field1339.method3431().field18050
                        );
                field23386.field1299.field44637.field13071 = false;
                field23386.field1339.field5036 = false;
                field23386.field1284.field40360 = 0.08F;
                var1.method13900(true);
                this.field23813 = true;
                var1.method13995(1.0E-14);
            }
        } else {
            if (this.method15974("Ceiling")
                    && !field23386.field1299.field44637.method8509()
                    && field23386.field1338.method7055(field23386.field1339, field23386.field1339.field5035.method19667(0.0, 0.01, 0.0)).count() > 0L) {
                var1.method13995(1.0E-14);
                Class9567.method37088(var1, 0.689 + (double) Class9567.method37078() * 0.06);
            }

            if (this.field23813) {
                field23386.field1284.field40360 = 1.0F;
                this.field23813 = false;
                var1.method13995(1.0E-14);
                Class9567.method37088(var1, 0.28);
            }
        }

        Class5628.method17725(var1.method13994());
    }

    @EventTarget
    private void method16637(Class4399 var1) {
        if (this.method15996() && var1.method13921()) {
            Class9629 var4 = Class5628.method17760(1.0E-4);
            if (this.method15974("Ceiling")
                    && !field23386.field1339.field5036
                    && field23386.field1338.method7055(field23386.field1339, field23386.field1339.field5035.method19667(0.0, 1.0E-6, 0.0)).count() > 0L) {
                var1.method13912(var1.method13911() + 4.9E-7);
            }

            double var5 = 1.0E-5;
            if (var4 != null
                    && field23386.field1338
                    .method7055(field23386.field1339, field23386.field1339.field5035.method19662(var5, 0.0, var5).method19662(-var5, 0.0, -var5))
                    .count()
                    > 0L) {
                if (!Class5628.method17730(field23386.field1339, 1.0E-4F)) {
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
        if (this.method15996() && field23386.field1339 != null) {
            if (var1.method13903() != null
                    && !var1.method13903().method19516()
                    && var1.method13903().method19514().field28450 > field23386.field1339.field5035.field28450 + 1.0) {
                var1.method13900(true);
            }
        }
    }
}
