package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4434;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.event.impl.Class4436;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5244 extends Module {
    private int field23607;
    private int field23608;
    private double field23609;

    public Class5244() {
        super(ModuleCategory.MOVEMENT, "NCP", "Speed for NCP");
        this.method15972(new Class6004("Auto Jump", "Automatically jumps for you.", true));
    }

    @Override
    public void method15966() {
        this.field23608 = 1;
        double var3 = field23386.field1339.method3433().field18048;
        double var5 = field23386.field1339.method3433().field18050;
        this.field23609 = Math.sqrt(var3 * var3 + var5 * var5);
    }

    @EventTarget
    public void method16346(Class4399 var1) {
        if (this.method15996()
                && field23386.field1339 != null
                && !Class5381.method16953()
                && !Client.getInstance().getModuleManager().method14662(Class5333.class).method15996()) {
            if (var1.method13921() && Class5341.field23893 > 1) {
                double var4 = field23386.field1339.getPosX() - field23386.field1339.field6119;
                double var6 = field23386.field1339.getPosZ() - field23386.field1339.field6121;
                if (this.field23607 != 0) {
                    this.field23609 = Math.sqrt(var4 * var4 + var6 * var6);
                } else {
                    this.field23609 = this.field23609 * (0.67 + Math.random() * 1.0E-10);
                }
            }
        }
    }

    @EventTarget
    public void method16347(Class4435 var1) {
        if (this.method15996() && field23386.field1339 != null) {
            if (!Class5381.method16953() && !field23386.field1339.method3250()) {
                if (this.field23608 < 2) {
                    this.field23608++;
                }

                if (!field23386.field1339.field5036) {
                    if (this.field23607 >= 0) {
                        this.field23607++;
                        double var4 = this.field23609;
                        if (this.field23607 > 1) {
                            var4 = Math.max(Class9567.method37076(), this.field23609 - (0.004 - Class9567.method37076() * 0.003) - Math.random() * 1.0E-10);
                        }

                        Class9567.method37088(var1, var4);
                        if (var1.method13994() >= -0.008744698139753596 && var1.method13994() <= -0.008724698139753597) {
                            var1.method13995(0.001);
                        } else if (var1.method13994() >= -0.07743000150680542 && var1.method13994() <= -0.07741000150680542) {
                            var1.method13995(var1.method13994() - 0.01);
                        }
                    }
                } else if (this.field23608 > 1 && (this.method15974("Auto Jump") && Class5628.method17686() || field23386.field1299.field44636.method8509())) {
                    this.field23607 = 0;
                    field23386.field1339.method2914();
                    var1.method13993(field23386.field1339.method3433().field18048);
                    var1.method13995(field23386.field1339.method3433().field18049);
                    var1.method13997(field23386.field1339.method3433().field18050);
                }
            } else {
                this.field23607 = -1;
            }
        }
    }

    @EventTarget
    @LowerPriority
    public void method16348(Class4436 var1) {
        if (this.method15996() && !Class5381.method16953()) {
            if (this.field23607 != 0) {
                var1.method13900(true);
            }

            if (!field23386.field1299.field44636.method8509() || !Client.getInstance().getModuleManager().method14662(Class5328.class).method15996()) {
                double var4 = 0.56 + (double) Class9567.method37078() * 0.1;
                var1.method14002(0.407 + (double) Class9567.method37079() * 0.1 + Math.random() * 1.0E-5);
                if (Class5341.field23893 < 2) {
                    var4 /= 2.5;
                }

                var4 = Math.max(Class9567.method37076(), var4);
                var1.method14003(var4);
                this.field23609 = var4;
            }
        }
    }

    @EventTarget
    public void method16349(Class4434 var1) {
        if (this.method15996() && !(var1.method13988() < 0.9)) {
            this.field23608 = 0;
        }
    }
}
