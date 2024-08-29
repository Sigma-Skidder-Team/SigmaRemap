package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.HigestPriority;
import com.mentalfrostbyte.jello.event.priority.LowestPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.timer.Timer;

import java.util.ArrayList;
import java.util.List;

public class HypixelFly extends Module {
    private short field23559;
    private double field23560;
    private float field23561;
    private boolean field23562;
    private int field23563;
    private Timer field23564;
    private List<Short> field23565 = new ArrayList<Short>();

    public HypixelFly() {
        super(ModuleCategory.MOVEMENT, "Hypixel", "Fly for Hypixel");
        this.registerSetting(new ModeSetting("Mode", "Mode", 0, "Basic", "Fast", "NoDmg", "Funcraft").setModeAsPremium("Fast"));
        this.registerSetting(new NumberSetting<Float>("Speed", "Fast and Funcraft speed", 1.0F, Float.class, 0.0F, 1.0F, 0.1F));
        this.registerSetting(new BooleanSetting("No Collision", "Prevents block collison.", true));
        this.registerSetting(new NumberSetting<Float>("Timer Boost", "Boost strength", 2.5F, Float.class, 1.0F, 3.0F, 0.1F));
        this.registerSetting(new NumberSetting<Float>("Timer Duration", "Boost duration", 0.3F, Float.class, 0.1F, 1.0F, 0.01F));
    }

    @Override
    public void onEnable() {
        String var3 = this.getStringSettingValueByName("Mode");
        this.field23561 = 1.0F;
        this.field23563 = -1;
        if (mc.player.onGround || Class5628.method17730(mc.player, 0.001F)) {
            this.field23561 = this.getNumberValueBySettingName("Timer Boost");
        }

        if (mc.player.onGround) {
            switch (var3) {
                case "Basic":
                    this.field23560 = 0.0;
                    this.field23562 = true;
                    break;
                case "Fast":
                    Class5628.method17749(false);
                    this.field23562 = true;
                    break;
                case "NoDmg":
                    this.field23562 = true;
                    break;
                case "Funcraft":
                    this.field23562 = true;
            }

            this.field23563 = 0;
        } else {
            this.field23560 = 0.0;
            this.field23562 = false;
        }
    }

    @Override
    public void onDisable() {
        double var3 = Class9567.method37075();
        Class9567.method37090(var3 * 0.7);
        this.field23561 = 1.0F;
        mc.timer.field40360 = 1.0F;
        this.field23563 = -1;
    }

    @EventTarget
    @Class5631
    public void method16257(WorldLoadEvent var1) {
        this.field23559 = 0;
        this.field23564 = new Timer();
        this.field23565 = null;
    }

    @EventTarget
    @LowestPriority
    @Class5631
    public void method16258(SendPacketEvent var1) {
        if (Class5628.method17716()) {
            Packet var4 = var1.method13932();
            if (var4 instanceof Class5594) {
                Class5594 var5 = (Class5594) var4;
                this.field23559 = var5.method17582();
            }
        }
    }

    @EventTarget
    @Class5631
    @HigestPriority
    public void method16259(RecievePacketEvent var1) {
        if (mc.getConnection() != null && Class5628.method17716()) {
            Packet var4 = var1.getPacket();
            if (this.isEnabled()) {
                if (var4 instanceof Class5473) {
                    this.method16004().method16000();
                }
            }
        }
    }

    @EventTarget
    @Class5631
    public void method16260(TickEvent var1) {
    }

    @EventTarget
    public void method16261(Class4399 var1) {
        if (var1.method13921()) {
            for (double var7 : Class5628.method17747()) {
                if ((double) ((int) var1.method13911()) - var1.method13911() + var7 == 0.0) {
                    var1.method13920(true);
                    break;
                }
            }

            var1.method13908(true);
        }
    }

    @EventTarget
    public void method16262(Class4435 var1) {
        String var4 = this.getStringSettingValueByName("Mode");
        float var5 = this.getNumberValueBySettingName("Timer Boost");
        this.field23561 = (float) ((double) this.field23561 - 0.01);
        if (this.field23561 < var5 - this.getNumberValueBySettingName("Timer Duration") || this.field23561 < 1.0F) {
            this.field23561 = 1.0F;
        }

        if (!Client.getInstance().getModuleManager().getModuleByClass(Class5376.class).isEnabled()) {
            mc.timer.field40360 = this.field23561;
        }

        if (this.field23562) {
            double var28 = 0.64 - Math.random() * 1.0E-10;
            if (var4.equals("Funcraft")) {
                var28 -= 0.04;
            }

            switch (var4) {
                case "Basic":
                    this.field23562 = !this.field23562;
                    break;
                case "Fast":
                    var1.method13995(Class9567.method37080());
                    Class9567.method37088(var1, var28);
                    this.field23562 = !this.field23562;
                    this.field23560 = 0.51 + (double) this.getNumberValueBySettingName("Speed") + 0.015 * (double) Class9567.method37078();
                    break;
                case "NoDmg":
                    var1.method13995(Class9567.method37080());
                    Class9567.method37088(var1, var28);
                    this.field23562 = !this.field23562;
                    this.field23560 = var28 * 0.987;
                    break;
                case "Funcraft":
                    var1.method13995(Class9567.method37080());
                    Class9567.method37088(var1, var28);
                    this.field23562 = !this.field23562;
                    this.field23560 = 0.51 + (double) this.getNumberValueBySettingName("Speed");
            }
        } else {
            if (var4.equals("NoDmg") && this.field23563 > 20) {
                this.field23560 = 0.0;
            }

            double var6 = 0.99375 - (double) this.field23563 * 1.0E-13;
            this.field23560 *= var6;
            if (mc.player.collidedHorizontally || mc.player.collidedVertically) {
                this.field23560 = 0.0;
            }

            double var10 = var4.equals("Basic") ? Class9567.method37076() : Class9567.method37076() - 0.008;
            if (this.field23560 < var10) {
                this.field23560 = var10;
            } else if (!Class5628.method17686()) {
                this.field23560 = var10;
            }

            Class9567.method37088(var1, this.field23560);
            if (!mc.player.onGround || !Class5628.method17730(mc.player, 0.001F)) {
                this.field23563++;
                var1.method13995(0.0);
                Class5628.method17725(0.0);
                if (this.field23563 % 5 < 4) {
                    double var12 = mc.player.getPosX();
                    double var14 = mc.player.getPosY();
                    double var16 = mc.player.getPosZ();
                    mc.player.setPosition(var12, var14 + 1.0E-14, var16);
                }
            }

            Vector3d var18 = mc.player.method3233(var1.method13998().method11339(0.0, -var1.method13998().method11321(), 0.0));
            double var19 = Math.abs(Math.sqrt(var18.method11349()) - this.field23560);
            boolean var21 = var19 < 1.0E-4;
            if (this.getBooleanValueFromSetttingName("No Collision") && this.field23560 > var10) {
                List<Vector3d> var22 = new ArrayList();
                float var23 = MathHelper.method37792(Class9567.method37086());
                if (var23 > 0.0F && var23 < 90.0F) {
                    var22.add(new Vector3d(1.0, 0.0, 0.0));
                    var22.add(new Vector3d(0.0, 0.0, 1.0));
                    var22.add(new Vector3d(0.0, 0.0, -1.0));
                    var22.add(new Vector3d(-1.0, 0.0, 0.0));
                } else if (var23 > 90.0F && var23 < 180.0F) {
                    var22.add(new Vector3d(0.0, 0.0, 1.0));
                    var22.add(new Vector3d(-1.0, 0.0, 0.0));
                    var22.add(new Vector3d(0.0, 0.0, -1.0));
                    var22.add(new Vector3d(1.0, 0.0, 0.0));
                } else if (var23 > -180.0F && var23 < -90.0F) {
                    var22.add(new Vector3d(0.0, 0.0, -1.0));
                    var22.add(new Vector3d(-1.0, 0.0, 0.0));
                    var22.add(new Vector3d(1.0, 0.0, 0.0));
                    var22.add(new Vector3d(0.0, 0.0, 1.0));
                } else {
                    var22.add(new Vector3d(0.0, 0.0, -1.0));
                    var22.add(new Vector3d(1.0, 0.0, 0.0));
                    var22.add(new Vector3d(0.0, 0.0, 1.0));
                    var22.add(new Vector3d(-1.0, 0.0, 0.0));
                }

                var1.method13999(var18);
                if (!var21 && mc.player.getPosY() % 1.0 > 0.1F && Class9567.method37087()) {
                    for (Vector3d var25 : var22) {
                        var25.field18048 = var25.field18048 * this.field23560;
                        var25.field18050 = var25.field18050 * this.field23560;
                        double var26 = Math.abs(Math.sqrt(mc.player.method3233(var25).method11349()) - this.field23560);
                        var21 = var26 < 1.0E-4;
                        if (var21) {
                            var1.method13999(var25);
                            break;
                        }
                    }
                }
            }

            if (mc.gameSettings.field44636.field13071) {
                var1.method13995(0.25);
            }
        }
    }
}
