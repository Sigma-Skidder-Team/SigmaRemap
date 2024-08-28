package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5214 extends Module {
    private boolean field23541;
    private double field23542;
    private double field23543;
    private double field23544;
    private int field23545;

    public Class5214() {
        super(ModuleCategory.MOVEMENT, "YPort", "YPort speed");
        this.method15972(new Class6005("Mode", "YPort mode", 0, "NCP", "OldNCP"));
        this.method15972(new Class6004("OnGround", "See yourself on ground", true));
    }

    @EventTarget
    public void method16235(Class4399 var1) {
        if (this.method15996() && mc.field1339 != null && !Client.getInstance().getModuleManager().method14662(Fly.class).method15996()) {
            if (mc.field1339.field5036 && var1.method13921() && Class5628.method17716()) {
                var1.method13912(var1.method13911() + 1.0E-14);
            }
        }
    }

    @Override
    public void isInDevelopment() {
        this.field23541 = false;
        this.field23545 = 0;
        this.field23543 = mc.field1339 != null ? Class9567.method37075() : 0.2873;
        this.field23542 = mc.field1339.getPosY();
    }

    @Override
    public void method15965() {
        this.field23541 = false;
        if (mc.field1339.method3433().field18049 > 0.33) {
            Class5628.method17725(-0.43 + (double) Class9567.method37079() * 0.1);
            Class9567.method37090(Class9567.method37075());
        }
    }

    @EventTarget
    public void method16236(Class4435 var1) {
        if (this.method15996() && !Client.getInstance().getModuleManager().method14662(Fly.class).method15996()) {
            if (!mc.field1339.field4981) {
                String var4 = this.getStringSettingValueByName("Mode");
                switch (var4) {
                    case "NCP":
                        if (Class9567.method37087() && mc.field1339.field5036) {
                            mc.field1339.method2914();
                            var1.method13995(mc.field1339.method3433().field18049);
                            Class9567.method37088(var1, 0.461);
                            this.field23541 = true;
                            mc.field1339.field5051 = 0.5F;
                        } else if (this.field23541
                                && Class5628.method17730(mc.field1339, (float) (Class9567.method37080() + (double) Class9567.method37079() * 0.1 + 0.001F))) {
                            this.field23541 = !this.field23541;
                            Class9567.method37088(var1, 0.312);
                            var1.method13995(-0.43 + (double) Class9567.method37079() * 0.1);
                            Class5628.method17725(var1.method13994());
                            mc.field1339.field5051 = 0.0F;
                        } else if (this.field23541) {
                            var1.method13995(-0.1);
                            this.field23541 = !this.field23541;
                        }
                        break;
                    case "OldNCP":
                        if (mc.field1339.field5036 && Class5628.method17686()) {
                            this.field23545 = 2;
                        }

                        if (this.field23545 == 1 && Class5628.method17686()) {
                            this.field23545 = 2;
                            this.field23543 = 1.38 * Class9567.method37075() - 0.01;
                        } else if (this.field23545 == 2) {
                            this.field23545 = 3;
                            double var8 = 0.401448482 + 0.002 * Math.random();
                            var8 *= 1.0 + Math.sqrt((float) Class9567.method37079() / 2.0F) / 2.0;
                            var1.method13995(var8);
                            this.field23543 *= 2.149;
                        } else if (this.field23545 == 3) {
                            this.field23545 = 4;
                            double var6 = 0.66 * (this.field23544 - Class9567.method37075());
                            this.field23543 = this.field23544 - var6;
                        } else {
                            if (mc.field1338
                                    .method7055(
                                            mc.field1339, mc.field1339.field5035.method19667(0.0, mc.field1339.method3433().field18049, 0.0)
                                    )
                                    .count()
                                    > 0L
                                    || mc.field1339.field5038) {
                                this.field23545 = 1;
                            }

                            this.field23543 = this.field23544 - this.field23544 / 159.0;
                        }

                        this.field23543 = Math.max(this.field23543, Class9567.method37075());
                        Class9567.method37088(var1, this.field23543);
                        mc.field1339.field5051 = 0.6F;
                        Class5628.method17725(var1.method13994());
                }
            }
        }
    }

    @EventTarget
    private void method16237(Class4404 var1) {
        if (this.method15996()
                && !this.getStringSettingValueByName("Mode").equalsIgnoreCase("NCP")
                && !Client.getInstance().getModuleManager().method14662(Fly.class).method15996()) {
            if (!mc.field1339.method3250() && !mc.field1339.method3264() && !mc.field1339.method3063()) {
                if (!mc.field1299.field44636.field13071
                        && !mc.field1339.method3063()
                        && !Class9567.method37081()
                        && !mc.field1339.method3250()
                        && Class5628.method17730(mc.field1339, 1.0F)
                        && !mc.field1339.field5036
                        && this.field23545 == 3) {
                    Class5628.method17725(-0.3994);
                }

                double var4 = mc.field1339.getPosX() - mc.field1339.field5025;
                double var6 = mc.field1339.getPosZ() - mc.field1339.field5027;
                this.field23544 = Math.sqrt(var4 * var4 + var6 * var6);
            }
        }
    }

    @EventTarget
    public void method16238(Class4422 var1) {
        if (this.method15996()
                && Class5628.method17730(mc.field1339, 0.43F)
                && !((double) mc.field1339.field5045 > 0.09)
                && this.method15974("OnGround")
                && !mc.field1299.field44636.field13071
                && !Client.getInstance().getModuleManager().method14662(Fly.class).method15996()) {
            if (mc.field1339.field5036 && Class5628.method17730(mc.field1339, 0.001F)) {
                this.field23542 = mc.field1339.getPosY();
            }

            mc.field1339.field5028.field18049 = this.field23542;
            mc.field1339.field5049 = this.field23542;
            mc.field1339.field4915 = this.field23542;
            mc.field1339.field5026 = this.field23542;
            if (Class9567.method37087()) {
                mc.field1339.field4909 = 0.099999994F;
            }
        }
    }

    @EventTarget
    private void method16239(Class4396 var1) {
        if (this.method15996()) {
            if (var1.method13898() instanceof Class5473) {
                this.field23544 = 0.0;
            }
        }
    }
}
