package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4422;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.event.impl.Class4436;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5248 extends Module {
    private int field23618;
    private double field23619;
    private double field23620;

    public Class5248() {
        super(ModuleCategory.MOVEMENT, "Cubecraft", "Speed for Cubecraft");
        this.method15972(new Class6005("Mode", "Mode", 0, "Basic", "Hop", "YPort"));
        this.method15972(new Class6009<Float>("Speed", "Speed value", 0.75F, Float.class, 0.1F, 1.0F, 0.01F));
        this.method15972(new Class6004("AutoJump", "Automatically jumps for you.", false));
    }

    @Override
    public void isInDevelopment() {
        this.field23618 = 0;
        this.field23620 = -1.0;
    }

    @Override
    public void method15965() {
        mc.field1284.field40360 = 1.0F;
        Class9567.method37090(0.2);
        if (mc.field1339.method3433().field18049 > 0.0) {
            Class5628.method17725(-0.078);
        }
    }

    @EventTarget
    public void method16361(Class4435 var1) {
        if (this.method15996()
                && !Client.getInstance().getModuleManager().method14662(BlockFly.class).method15996()
                && !Class5628.method17684(mc.field1339)) {
            String var4 = this.getStringSettingValueByName("Mode");
            switch (var4) {
                case "Basic":
                    this.field23618++;
                    this.field23619 = 0.27;
                    mc.field1284.field40360 = 0.7F;
                    if (Class5628.method17730(mc.field1339, 0.01F)) {
                        if (this.method15974("AutoJump")) {
                            mc.field1339.method2914();
                            var1.method13995(mc.field1339.method3433().field18049);
                            Class9567.method37088(var1, this.field23619);
                        }

                        if (this.field23618 == 1) {
                            this.field23619 = (double) this.method15977("Speed") * 2.4;
                        } else if (this.field23618 == 2) {
                            mc.field1284.field40360 = 1.0F;
                            this.field23619 = 0.26;
                        } else if (this.field23618 >= 3) {
                            this.field23618 = 0;
                            this.field23619 = 0.26;
                        }
                    } else {
                        if (mc.field1284.field40360 == 0.7F) {
                            mc.field1284.field40360 = 1.0F;
                        }

                        if (this.field23618 == 1) {
                            this.field23619 = 0.27;
                            if (var1.method13994() > 0.0) {
                                this.field23619 = 2.0;
                            }
                        } else if (this.field23618 > 1) {
                            this.field23618 = 0;
                        }
                    }

                    Class9567.method37088(var1, this.field23619);
                    break;
                case "Hop":
                    if (!mc.field1339.field5038 || !Class5628.method17730(mc.field1339, 0.001F) || !Class9567.method37087()) {
                        this.field23618++;
                        if (this.field23618 == 1) {
                            this.field23619 = 0.4 + (double) Class9567.method37078() * 0.1;
                        }

                        this.field23619 -= 0.015;
                        if (mc.field1299.field44634.field13071) {
                            this.field23619 -= 0.07;
                        }

                        this.field23619 = Math.max(this.field23619, 0.2);
                        Class9567.method37088(var1, this.field23619);
                    } else if (this.method15974("AutoJump")) {
                        mc.field1339.method2914();
                        var1.method13995(mc.field1339.method3433().field18049);
                        Class9567.method37088(var1, this.field23619);
                    }
                    break;
                case "YPort":
                    if (mc.field1339.field5036) {
                        if (Class5628.method17686()) {
                            var1.method13995(0.53000000000001);
                            Class9567.method37088(var1, 3.67 * (double) this.method15977("Speed"));
                            this.field23618 = 0;
                        }

                        this.field23620 = mc.field1339.getPosY();
                        if (!Client.getInstance().getModuleManager().method14662(Class5376.class).method15996()) {
                            mc.field1284.field40360 = 1.0F;
                        }
                    } else {
                        mc.field1284.field40360 = 1.0F - this.method15977("Speed") * 0.13F;
                        if (this.field23618 == 0 && var1.method13994() == 0.44100000858307864) {
                            this.field23618 = 1;
                            Class9567.method37088(var1, 0.286);
                            var1.method13995(-0.265);
                            Class5628.method17725(var1.method13994());
                        } else if (this.field23618 == 1) {
                            this.field23618 = -1;
                            Class9567.method37088(var1, 0.285);
                        }
                    }
            }
        }
    }

    @EventTarget
    public void method16362(Class4422 var1) {
        if (this.method15996() && !(this.field23620 < 0.0) && this.getStringSettingValueByName("Mode").equals("YPort")) {
            if (mc.field1339.field5036 && Class5628.method17730(mc.field1339, 0.001F)) {
                this.field23620 = mc.field1339.getPosY();
            }

            mc.field1339.field5028.field18049 = this.field23620;
            mc.field1339.field5049 = this.field23620;
            mc.field1339.field4915 = this.field23620;
            mc.field1339.field5026 = this.field23620;
            if (Class9567.method37087()) {
                mc.field1339.field4909 = 0.099999994F;
            }
        }
    }

    @EventTarget
    public void method16363(Class4436 var1) {
        if (this.method15996()) {
            var1.method14002(0.4);
            this.field23619 = 0.6 + (double) Class9567.method37078() * 0.1;
            this.field23618 = 0;
            var1.method14003(this.field23619);
        }
    }
}
