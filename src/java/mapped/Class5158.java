package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.unmapped.Class8005;

public class Class5158 extends Module {
    private int field23414;
    private double field23415;
    private double field23416;
    private double field23417;
    private Class2094 field23418 = Class2094.field13640;

    public Class5158() {
        super(ModuleCategory.MOVEMENT, "Hypixel", "Speed for Hypixel");
        this.registerSetting(new BooleanSetting("AutoJump", "Automatically jumps for you.", true));
        this.registerSetting(new BooleanSetting("Timer", "Use timer", true));
        this.registerSetting(new BooleanSetting("GroundSpeed", "Move faster on ground", true));
        this.registerSetting(new BooleanSetting("BorderJump", "Automatically jumps off edges with speed", true));
    }

    @Override
    public void isInDevelopment() {
        this.field23415 = Class9567.method37076();
        this.field23414 = 6;
        this.field23418 = Class2094.field13640;
        this.field23416 = -1.0;
        this.field23417 = 0.0;
    }

    @Override
    public void method15965() {
        if (this.field23418 == Class2094.field13641 && mc.player.method3433().field18049 > 0.0 && this.field23414 == 0) {
            Class5628.method17725(-Class9567.method37080() - 1.0E-5 - 0.0625);
        }

        if (Math.abs((double) mc.timer.field40360 - 1.4123) < 0.001
                && !Client.getInstance().getModuleManager().method14662(Class5376.class).method15996()) {
            mc.timer.field40360 = 1.0F;
        }
    }

    @EventTarget
    @LowerPriority
    public void method16037(Class4399 var1) {
        if (mc.player.field5036) {
            if (!Client.getInstance().getModuleManager().method14662(Class5332.class).method15988()
                    || Class5357.field23948 == null && Class5357.field23949 == null
                    || this.field23418 != Class2094.field13641) {
                this.field23417 = 0.0;
            } else if (var1.method13921()) {
                if (this.field23417 > 3.0) {
                    this.field23417 = 0.0;
                    mc.getConnection().sendPacket(new Class5603(true));
                }

                var1.method13920(false);
            }
        }
    }

    @EventTarget
    @Class5631
    @HigherPriority
    public void method16038(Class4435 var1) {
        if (!this.method15996()) {
            if (mc.player.field5036 || Class5628.method17730(mc.player, 0.001F) || mc.player.getPosY() < this.field23416) {
                this.field23416 = -1.0;
            }
        } else {
            mc.player.field4999 = 0;
            if (mc.player.field5036) {
                this.field23416 = mc.player.getPosY();
                if (!Client.getInstance().getModuleManager().method14662(Class5376.class).method15996()) {
                    mc.timer.field40360 = 1.0F;
                }

                if (this.field23414 >= 0 && Class5330.field23887 >= 2) {
                    if ((var1.method13994() > 0.0 || this.method15974("AutoJump") && Class5628.method17686()) && !Class5628.method17684(mc.player)) {
                        mc.player.method2914();
                        var1.method13995(Class9567.method37080());
                        Class9567.method37088(var1, 0.644348756324588 + Math.random() * 1.0E-6 + (double) Class9567.method37078() * 0.13);
                        if (this.method15974("Timer") && !Client.getInstance().getModuleManager().method14662(Class5376.class).method15996()) {
                            mc.timer.field40360 = 1.4123F;
                        }

                        this.field23414 = 0;
                        this.field23418 = Class2094.field13640;
                    } else if (Class5628.method17686() && this.method15974("GroundSpeed") && !Class5628.method17684(mc.player)) {
                        mc.player.field5051 = 0.5F;
                        mc.player.method2914();
                        var1.method13995(0.399 + (double) Class9567.method37079() * 0.1 + 1.0E-14);
                        Class9567.method37088(var1, 0.51 + Math.random() * 1.0E-6 + (double) Class9567.method37078() * 0.098);
                        this.field23414 = 0;
                        if (this.method15974("Timer") && !Client.getInstance().getModuleManager().method14662(Class5376.class).method15996()) {
                            mc.timer.field40360 = 1.1123F;
                        }

                        this.field23418 = Class2094.field13641;
                    } else {
                        this.field23417 = 0.0;
                    }
                } else {
                    Class9567.method37088(var1, 0.25);
                    if (this.field23414 < 0) {
                        this.field23414++;
                    }
                }
            } else if (this.field23414 >= 0) {
                double var4 = Class9567.method37075();
                if (!Client.getInstance().getModuleManager().method14662(Class5376.class).method15996()) {
                    mc.timer.field40360 = 1.0F;
                }

                switch (Class7845.field33649[this.field23418.ordinal()]) {
                    case 1:
                        if (this.field23414 == 0) {
                            this.field23415 = 0.3893478969348657 + Math.random() * 1.0E-6 + (double) Class9567.method37078() * 0.077;
                        } else {
                            double var8 = 0.99375 - (double) this.field23414 * 1.0E-13;
                            this.field23415 *= var8;
                        }

                        if (Class9567.method37079() == 0 && !Client.getInstance().getModuleManager().method14662(BlockFly.class).method15996()) {
                            this.method16043(var1, this.field23414);
                        }

                        if (this.field23417 > 3.0) {
                            this.field23417 = 0.0;
                            mc.getConnection().sendPacket(new Class5603(true));
                        }
                        break;
                    case 2:
                        if (this.field23414 == 0) {
                            double var6 = 0.399 + (double) Class9567.method37079() * 0.1 + 1.0E-5;
                            if (this.method15974("BorderJump")
                                    && mc.world.method7055(mc.player, mc.player.field5035.method19662(0.0, -var6 - 0.0625, 0.0)).count()
                                    == 0L) {
                                this.field23415 = 0.4103345672948576 + Math.random() * 1.0E-6 + (double) Class9567.method37078() * 0.085;
                                this.field23416 = -1.0;
                            } else {
                                var1.method13995(-var6 - 0.0625);
                                this.field23417 = this.field23417 - var1.method13994();
                                this.field23415 = 0.3 + Math.random() * 1.0E-6 + (double) Class9567.method37078() * 0.067;
                            }
                        } else if (this.field23414 == 1 && var1.method13994() < 0.0) {
                            this.field23415 *= 0.7;
                        } else {
                            this.field23415 *= 0.981;
                        }
                }

                if (this.field23415 < var4 || mc.player.field5037 || !Class5628.method17686() || Class5628.method17684(mc.player)) {
                    this.field23415 = var4;
                }

                Class9567.method37088(var1, this.field23415);
                this.field23414++;
            }
        }
    }

    @EventTarget
    @LowerPriority
    public void method16039(Class4436 var1) {
        if (!Class5381.method16953() && !Client.getInstance().getModuleManager().method14662(Fly.class).method15996()) {
            if (this.method15974("Auto Jump") || mc.player.field4981) {
                if (this.field23414 < 0) {
                    var1.method13900(true);
                }
            }
        }
    }

    @EventTarget
    public void method16040(Class4396 var1) {
        if (this.method15996()) {
            if (var1.method13898() instanceof Class5473) {
                this.field23414 = -2;
            }
        }
    }

    @EventTarget
    public void method16041(WorldLoadEvent var1) {
        this.field23416 = -1.0;
    }

    @EventTarget
    @Class5631
    public void method16042(Class4422 var1) {
        if (!mc.player.field5036
                && !Class5628.method17730(mc.player, 1.0E-4F)
                && Class5628.method17730(mc.player, (float) (Class9567.method37080() + 1.0E-5 + 0.0625))
                && Class5330.field23887 >= 2
                && !(this.field23416 < 0.0)
                && this.field23418 == Class2094.field13641
                && !(mc.player.getPosY() < this.field23416)) {
            mc.player.field5028.field18049 = this.field23416;
            mc.player.field5049 = this.field23416;
            mc.player.field4915 = this.field23416;
            mc.player.field5026 = this.field23416;
            if (Class9567.method37087()) {
                mc.player.field4909 = 0.099999994F;
            }
        }
    }

    @Override
    public boolean method15988() {
        return this.method15996()
                && (!mc.player.field5036 || mc.player.field4981 || this.method15974("AutoJump") || this.field23418 == Class2094.field13641);
    }

    private void method16043(Class4435 var1, int var2) {
        if (var2 != 0) {
            if (var2 != 1) {
                if (var2 != 2) {
                    if (var2 == 3 && Math.abs(var1.method13994()) < 0.1 && Class8005.method27349() == Class5989.field26129.method18582()) {
                        var1.method13995(0.0300011120129438);
                    }
                } else {
                    var1.method13995(var1.method13994() * 0.967);
                }
            } else {
                var1.method13995(var1.method13994() * 0.98);
            }
        } else {
            var1.method13995(var1.method13994() * 0.985);
        }
    }

    public void method16044() {
        this.field23414 = 0;
    }
}
