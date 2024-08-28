package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4417;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.event.impl.Class4436;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5178 extends Module {
    private int field23477;
    private int field23478;
    private boolean field23479;
    private double field23480;

    public Class5178() {
        super(ModuleCategory.MOVEMENT, "NCP", "Longjump for NoCheatPlus.");
        this.method15972(new Class6009<Float>("Boost", "Longjump boost", 3.0F, Float.class, 1.0F, 5.0F, 0.01F));
        this.method15972(new Class6009<Float>("Duration", "Speed duration", 10.0F, Float.class, 7.0F, 200.0F, 1.0F));
        this.method15972(new Class6005("Glide Mode", "The way you will glide", 1, "None", "Basic", "High"));
        this.method15972(new Class6005("Speed Mode", "The way you will speed", 0, "Basic", "Funcraft", "Hypixel"));
    }

    @Override
    public void method15965() {
        this.field23479 = false;
        mc.field1284.field40360 = 1.0F;
        Class9567.method37090(Class9567.method37076() * 0.7);
    }

    @Override
    public void method15966() {
        this.field23479 = false;
        this.field23477 = 0;
    }

    @EventTarget
    public void method16122(Class4435 var1) {
        if (this.method15996() && mc.field1339 != null) {
            if (mc.field1339.field5036) {
                this.field23478 = 0;
                this.field23477++;
                if (this.field23479 && var1.method13994() != 0.599 && this.method16004().method15974("Auto Disable")) {
                    this.method16004().method16000();
                    Class9567.method37088(var1, Class9567.method37076() * 0.8);
                    return;
                }

                BlockPos var4 = new BlockPos(mc.field1339.getPosX(), mc.field1339.getPosY() - 0.4, mc.field1339.getPosZ());
                if (Class5330.field23887 > 1) {
                    if (this.method16004().method15974("BorderJump") && !Class9217.method34578(var4) && this.field23477 > 0 && Class5628.method17686()) {
                        mc.field1339.method2914();
                        var1.method13993(mc.field1339.method3433().field18048);
                        var1.method13995(mc.field1339.method3433().field18049);
                        var1.method13997(mc.field1339.method3433().field18050);
                    } else if (this.method16004().method15974("Auto Jump") && this.field23477 > (this.field23479 ? 1 : 0) && Class5628.method17686()) {
                        mc.field1339.method2914();
                        var1.method13993(mc.field1339.method3433().field18048);
                        var1.method13995(mc.field1339.method3433().field18049);
                        var1.method13997(mc.field1339.method3433().field18050);
                    }
                }
            } else {
                this.field23478++;
                this.field23477 = 0;
                if (this.field23479) {
                    double var5 = Class9567.method37076() * 0.95;
                    if (this.field23478 == 1) {
                        this.field23480 = (double) this.method15977("Boost") * 0.4 + (double) Class9567.method37078() * 0.05;
                    } else if ((float) this.field23478 > this.method15977("Duration") + (float) Class9567.method37078()) {
                        this.field23480 = var5;
                    } else if (this.field23480 > var5) {
                        String var7 = this.method15978("Speed Mode");
                        switch (var7) {
                            case "Basic":
                                this.field23480 *= 0.987;
                                break;
                            case "Funcraft":
                                this.field23480 -= 0.0075;
                                break;
                            case "Hypixel":
                                this.field23480 -= 0.0079;
                        }

                        if (this.field23480 < var5) {
                            this.field23480 = var5;
                        }
                    }

                    if (mc.field1339.field5037 || !Class5628.method17686()) {
                        this.field23480 = var5;
                    }

                    Class9567.method37088(var1, this.field23480);
                    if (Class9567.method37079() == 0) {
                        String var13 = this.method15978("Glide Mode");
                        switch (var13) {
                            case "Basic":
                                var1.method13995(((Class5327) this.method16004()).method16730(this.field23478));
                                break;
                            case "High":
                                var1.method13995(((Class5327) this.method16004()).method16731(this.field23478));
                                if (Class5628.method17716()
                                        && Client.getInstance().getModuleManager().method14662(Class5199.class).method15996()
                                        && (this.field23478 == 8 || this.field23478 == 21)) {
                                    double var9 = mc.field1339.getPosY() + var1.method13994();
                                    double var11 = var9 - (double) ((int) (var9 + 0.001));
                                    if (Math.abs(var11) < 0.001) {
                                        var1.method13995(var1.method13994() - var11);
                                    } else {
                                        var11 = var9 - (double) ((int) var9) - 0.25;
                                        if (Math.abs(var11) < 0.007) {
                                            var1.method13995(var1.method13994() - var11);
                                        }
                                    }
                                }
                        }
                    }
                }

                if (this.field23477 == 1 && mc.field1339.method3433().field18049 < 0.0 && this.method16004().method15974("Auto Jump")) {
                    Class9567.method37088(var1, Class9567.method37076() * 0.2);
                }
            }

            Class5628.method17725(var1.method13994());
        }
    }

    @EventTarget
    public void method16123(Class4436 var1) {
        if (this.method15996() && mc.field1339 != null) {
            this.field23479 = true;
            this.field23480 = Class9567.method37076();
            var1.method14003(this.field23480);
            var1.method14002(0.425 + (double) Class9567.method37079() * 0.1);
            if (this.method15978("Glide Mode").equals("High") && Class9567.method37079() == 0) {
                var1.method14002(0.599);
                var1.method14003(0.0);
                if ((double) this.method15977("Boost") > 1.5) {
                    var1.method14003(0.28 + (double) this.method15977("Boost") * 0.1 + (double) Class9567.method37078() * 0.05);
                }

                if (this.method15978("Speed Mode").equals("Hypixel") && (double) this.method15977("Boost") > 1.75) {
                    Class5628.method17749(true);
                }

                mc.getClientPlayNetHandler()
                        .sendPacket(
                                new Class5605(mc.field1339.getPosX(), mc.field1339.getPosY() + 0.425, mc.field1339.getPosZ(), false)
                        );
                mc.getClientPlayNetHandler()
                        .sendPacket(
                                new Class5605(mc.field1339.getPosX(), mc.field1339.getPosY() + 0.425 + 0.396, mc.field1339.getPosZ(), false)
                        );
                mc.getClientPlayNetHandler()
                        .sendPacket(
                                new Class5605(
                                        mc.field1339.getPosX(), mc.field1339.getPosY() + 0.425 + 0.396 - 0.122, mc.field1339.getPosZ(), false
                                )
                        );
            }
        }
    }

    @EventTarget
    public void method16124(Class4417 var1) {
        if (!this.method15996() || !this.method15978("Glide Mode").equals("High")) {
        }
    }
}
