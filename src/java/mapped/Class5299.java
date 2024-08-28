package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4398;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5299 extends Module {
    private boolean field23832 = false;

    public Class5299() {
        super(ModuleCategory.MOVEMENT, "Jump", "Jump spider");
        this.method15972(new Class6005("Mode", "Mode", 0, "Spartan"));
        this.method15972(new Class6004("AutoJump", "Automatically jumps for you", true));
    }

    @Override
    public void method15966() {
        this.field23832 = false;
    }

    @EventTarget
    private void method16651(Class4435 var1) {
        if (!field23386.field1339.field5037) {
            this.field23832 = false;
        } else if (!field23386.field1339.field5036) {
            if (field23386.field1339.method3431().field18049 != (double) ((int) field23386.field1339.method3431().field18049)) {
                if (var1.method13994() < 0.0
                        && field23386.field1339.method3431().field18049 + var1.method13994() < (double) ((int) field23386.field1339.method3431().field18049)) {
                    var1.method13995((double) ((int) field23386.field1339.method3431().field18049) - field23386.field1339.method3431().field18049);
                    this.field23832 = true;
                }
            } else if (this.method15974("AutoJump") || field23386.field1299.field44636.method8509()) {
                field23386.field1339.method2914();
                var1.method13995(field23386.field1339.method3433().field18049);
            } else if (!field23386.field1299.field44637.method8509()) {
                Class9567.method37088(var1, 0.28 + (double) Class9567.method37078() * 0.05);
                var1.method13995(0.0);
            } else {
                var1.method13995(-0.0784);
            }
        } else if (this.method15974("AutoJump")) {
            field23386.field1339.method2914();
            var1.method13995(field23386.field1339.method3433().field18049);
        }

        Class5628.method17725(var1.method13994());
    }

    @EventTarget
    private void method16652(Class4399 var1) {
        if (this.method15996() && var1.method13921()) {
            Class9629 var4 = Class5628.method17760(1.0E-4);
            String var5 = this.method15978("Mode");
            if (this.method15974("Ceiling")
                    && !field23386.field1339.field5036
                    && field23386.field1338.method7055(field23386.field1339, field23386.field1339.field5035.method19667(0.0, 1.0E-6, 0.0)).count() > 0L) {
                var1.method13912(var1.method13911() + 4.9E-7);
            }

            if (var4 != null) {
                var1.method13908(true);
                double var6 = 0.0;
                switch (var5) {
                    case "AGC":
                        var6 = 4.85E-7;
                        break;
                    case "Spartan":
                        var6 = 1.0E-13;
                }

                if (this.field23832) {
                    if (this.method15974("AutoJump") || field23386.field1299.field44636.method8509()) {
                        this.field23832 = !this.field23832;
                    }

                    var1.method13920(true);
                    switch (var5) {
                        case "AGC":
                            var6 = 4.85E-7;
                            break;
                        case "Spartan":
                            var6 = 1.0E-12;
                    }
                }

                if (((Direction) var4.method37538()).method544() == Class113.field413) {
                    var1.method13910(
                            (double) Math.round((((Vector3d) var4.method37539()).field18048 + 1.1921022E-8) * 10000.0) / 10000.0
                                    + (double) ((Direction) var4.method37538()).method539() * var6
                    );
                } else {
                    var1.method13914(
                            (double) Math.round((((Vector3d) var4.method37539()).field18050 + 1.1921022E-8) * 10000.0) / 10000.0
                                    + (double) ((Direction) var4.method37538()).method541() * var6
                    );
                }
            }
        }
    }

    @EventTarget
    private void method16653(Class4398 var1) {
        if (this.method15996() && field23386.field1339 != null) {
            if (var1.method13903() != null
                    && !var1.method13903().method19516()
                    && var1.method13903().method19514().field28450 > field23386.field1339.field5035.field28450 + 1.0) {
                var1.method13900(true);
            }
        }
    }
}
