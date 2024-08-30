package com.mentalfrostbyte.jello.module.impl.movement.blockfly;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.module.impl.movement.Fly;
import com.mentalfrostbyte.jello.module.impl.movement.Speed;
import mapped.*;
import net.minecraft.util.math.BlockPos;

public class BlockFlyHypixelMode extends Module {
    private float field23466;
    private float field23467;
    private Class7843 field23468;
    private int field23469 = -1;
    private int field23470;
    private int field23471;
    private Hand field23472;
    private BlockFly field23473 = null;
    private boolean field23474;
    private boolean field23475 = false;
    private double field23476;

    public BlockFlyHypixelMode() {
        super(ModuleCategory.MOVEMENT, "Hypixel", "Places block underneath");
        this.registerSetting(new ModeSetting("Speed Mode", "Speed mode", 0, "None", "Jump", "AAC", "Cubecraft", "Slow", "Sneak"));
        this.registerSetting(new BooleanSetting("KeepRotations", "Keeps your rotations.", true));
        this.registerSetting(new BooleanSetting("Downwards", "Allows you to go down when sneaking.", true));
    }

    public static Vector3d method16116(BlockPos var0, Direction var1) {
        double var4 = (double) var0.getX() + 0.5;
        double var6 = (double) var0.getY() + 0.5;
        double var8 = (double) var0.getZ() + 0.5;
        var4 += (double) var1.method539() / 2.0;
        var8 += (double) var1.method541() / 2.0;
        var6 += (double) var1.method540() / 2.0;
        double var10 = 0.2;
        if (var1 != Direction.field673 && var1 != Direction.DOWN) {
            var6 += method16117(var10, -var10);
        } else {
            var4 += method16117(var10, -var10);
            var8 += method16117(var10, -var10);
        }

        if (var1 == Direction.WEST || var1 == Direction.EAST) {
            var8 += method16117(var10, -var10);
        }

        if (var1 == Direction.SOUTH || var1 == Direction.NORTH) {
            var4 += method16117(var10, -var10);
        }

        return new Vector3d(var4, var6, var8);
    }

    public static double method16117(double var0, double var2) {
        return Math.random() * (var0 - var2) + var2;
    }

    @Override
    public void method15953() {
        this.field23473 = (BlockFly) this.method16004();
    }

    @Override
    public void onEnable() {
        this.field23469 = mc.player.inventory.currentItem;
        this.field23467 = this.field23466 = 999.0F;
        ((BlockFly) this.method16004()).field23884 = -1;
        if (mc.gameSettings.keyBindSneak.isKeyDown() && this.getBooleanValueFromSetttingName("Downwards")) {
            mc.gameSettings.keyBindSneak.pressed = false;
            this.field23474 = true;
        }

        if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
            this.field23474 = false;
        }

        this.field23476 = -1.0;
        this.field23475 = false;
        if (mc.player.onGround) {
            this.field23476 = mc.player.getPosY();
        }

        this.field23471 = -1;
    }

    @Override
    public void onDisable() {
        if (this.field23469 != -1 && this.method16004().getStringSettingValueByName("ItemSpoof").equals("Switch")) {
            mc.player.inventory.currentItem = this.field23469;
        }

        this.field23469 = -1;
        if (((BlockFly) this.method16004()).field23884 >= 0) {
            mc.getConnection().sendPacket(new Class5539(mc.player.inventory.currentItem));
            ((BlockFly) this.method16004()).field23884 = -1;
        }

        Class9567.method37090(Class9567.method37075() * 0.9);
        mc.timer.timerSpeed = 1.0F;
        if (this.getStringSettingValueByName("Speed Mode").equals("Cubecraft") && this.field23471 == 0) {
            Class5628.method17725(-0.0789);
        }
    }

    @EventTarget
    public void method16108(SafeWalkEvent var1) {
        if (this.isEnabled()) {
            if (this.getStringSettingValueByName("Speed Mode").equals("Cubecraft") && !Client.getInstance().getModuleManager().getModuleByClass(Fly.class).isEnabled()) {
                if (mc.world
                        .method7055(
                                mc.player,
                                mc.player.boundingBox.method19662(0.0, -1.5, 0.0).method19660(0.05, 0.0, 0.05).method19660(-0.05, 0.0, -0.05)
                        )
                        .count()
                        == 0L
                        && mc.player.fallDistance < 1.0F) {
                    var1.setSafe(true);
                }
            } else if (mc.player.onGround
                    && Client.getInstance().getModuleManager().getModuleByClass(SafeWalk.class).isEnabled()
                    && (!this.field23474 || !this.getBooleanValueFromSetttingName("Downwards"))) {
                var1.setSafe(true);
            }
        }
    }

    @EventTarget
    private void method16109(Class4430 var1) {
        if (this.isEnabled() && this.getBooleanValueFromSetttingName("Downwards")) {
            if (var1.method13977() == mc.gameSettings.keyBindSneak.keycode.keyCode) {
                var1.method13900(true);
                this.field23474 = true;
            }
        }
    }

    @EventTarget
    private void method16110(Class4426 var1) {
        if (this.isEnabled() && this.getBooleanValueFromSetttingName("Downwards")) {
            if (var1.method13973() == mc.gameSettings.keyBindSneak.keycode.keyCode) {
                var1.method13900(true);
                this.field23474 = false;
            }
        }
    }

    @EventTarget
    @LowerPriority
    public void method16111(Class4399 var1) {
        if (this.isEnabled() && this.field23473.method16735() != 0) {
            ModuleWithModuleSettings var4 = (ModuleWithModuleSettings) Client.getInstance().getModuleManager().getModuleByClass(Fly.class);
            if (!var4.isEnabled() || !var4.getStringSettingValueByName("Type").equalsIgnoreCase("Hypixel") || !var4.method16726().getStringSettingValueByName("Bypass").equals("Blink")) {
                if (!var1.method13921()) {
                    this.field23473.method16736();
                    if (this.field23468 != null) {
                        BlockRayTraceResult var20 = new BlockRayTraceResult(
                                method16116(this.field23468.field33646, this.field23468.field33647), this.field23468.field33647, this.field23468.field33646, false
                        );
                        int var21 = mc.player.inventory.currentItem;
                        if (!this.method16004().getStringSettingValueByName("ItemSpoof").equals("None")) {
                            this.field23473.method16734();
                        }

                        mc.playerController.func_217292_a(mc.player, mc.world, this.field23472, var20);
                        if (!this.method16004().getBooleanValueFromSetttingName("NoSwing")) {
                            mc.player.swingArm(this.field23472);
                        } else {
                            mc.getConnection().sendPacket(new CAnimateHandPacket(this.field23472));
                        }

                        if (this.method16004().getStringSettingValueByName("ItemSpoof").equals("Spoof") || this.method16004().getStringSettingValueByName("ItemSpoof").equals("LiteSpoof")) {
                            mc.player.inventory.currentItem = var21;
                        }
                    }
                } else {
                    this.field23470++;
                    var1.method13908(true);
                    this.field23472 = Hand.MAIN_HAND;
                    if (BlockFly.method16733(mc.player.getHeldItem(Hand.field183).getItem())
                            && (
                            mc.player.getHeldItem(this.field23472).isEmpty()
                                    || !BlockFly.method16733(mc.player.getHeldItem(this.field23472).getItem())
                    )) {
                        this.field23472 = Hand.field183;
                    }

                    double var5 = var1.method13909();
                    double var7 = var1.method13913();
                    double var9 = var1.method13911();
                    if (mc.player.method3433().field18049 < 0.0
                            && mc.player.fallDistance > 1.0F
                            && Class9217.method34567(0.0F, 90.0F, 3.0F).getType() == RayTraceResult.Type.MISS) {
                        var9 += Math.min(mc.player.method3433().field18049 * 2.0, 4.0);
                    } else if (this.field23474 && this.getBooleanValueFromSetttingName("Downwards")) {
                        var9--;
                    } else if ((this.getStringSettingValueByName("Speed Mode").equals("Jump") || this.getStringSettingValueByName("Speed Mode").equals("Cubecraft"))
                            && !mc.gameSettings.keyBindJump.isKeyDown()) {
                        var9 = this.field23476;
                    }

                    if (!Class9217.method34578(
                            new BlockPos(
                                    mc.player.getPositionVec().method11320(),
                                    mc.player.getPositionVec().method11321() - 1.0,
                                    mc.player.getPositionVec().method11322()
                            )
                    )) {
                        var5 = mc.player.getPositionVec().method11320();
                        var7 = mc.player.getPositionVec().method11322();
                    }

                    BlockPos var11 = new BlockPos(var5, var9 - 1.0, var7);
                    if (!Class9217.method34578(var11) && this.field23473.method16739(this.field23472)) {
                        Class7843 var12 = Class9217.method34575(var11, !this.field23474 && this.getBooleanValueFromSetttingName("Downwards"));
                        this.field23468 = var12;
                        if (var12 != null) {
                            float[] var13 = Class9217.method34542(this.field23468.field33646, this.field23468.field33647);
                            if ((double) var12.field33646.field13028 - mc.player.getPosY() < 0.0) {
                                double var14 = mc.player.getPosX()
                                        - ((double) var12.field33646.field13027 + 0.5 + (double) var12.field33647.method539() / 2.0);
                                double var16 = mc.player.getPosZ()
                                        - ((double) var12.field33646.field13029 + 0.5 + (double) var12.field33647.method541() / 2.0);
                                double var18 = Math.sqrt(var14 * var14 + var16 * var16);
                                if (var18 < 2.0) {
                                    var13[0] = mc.player.rotationYaw + 1.0F;
                                    var13[1] = 90.0F;
                                }
                            }

                            this.field23467 = var13[0];
                            this.field23466 = var13[1];
                            var1.method13918(this.field23467);
                            var1.method13916(this.field23466);
                        }
                    } else {
                        if (this.getBooleanValueFromSetttingName("KeepRotations") && this.field23466 != 999.0F) {
                            var1.method13918(mc.player.rotationYaw + 1.0F);
                            var1.method13916(90.0F);
                        }

                        this.field23468 = null;
                    }

                    if (mc.player.rotationYaw != var1.method13917() && mc.player.rotationPitch != var1.method13915()) {
                        this.field23470 = 0;
                    }
                }
            }
        }
    }

    @EventTarget
    @HigherPriority
    public void method16112(Class4435 var1) {
        if (this.isEnabled() && this.field23473.method16735() != 0) {
            if (mc.player.onGround || Class5628.method17730(mc.player, 0.01F)) {
                this.field23476 = mc.player.getPosY();
            }

            if (this.method16004().getBooleanValueFromSetttingName("No Sprint")) {
                mc.player.setSprinting(false);
            }

            if (mc.player.onGround) {
                this.field23471 = 0;
            } else if (this.field23471 >= 0) {
                this.field23471++;
            }

            if (this.field23473 == null) {
                this.field23473 = (BlockFly) this.method16004();
            }

            String var4 = this.getStringSettingValueByName("Speed Mode");
            switch (var4) {
                case "Jump":
                    if (mc.player.onGround && Class5628.method17686() && !mc.player.method3331() && !this.field23474) {
                        this.field23475 = false;
                        mc.player.method2914();
                        ((Speed) Client.getInstance().getModuleManager().getModuleByClass(Speed.class)).method16764();
                        this.field23475 = true;
                        var1.method13995(mc.player.method3433().field18049);
                        var1.method13993(mc.player.method3433().field18048);
                        var1.method13997(mc.player.method3433().field18050);
                    }
                    break;
                case "AAC":
                    if (this.field23470 == 0 && mc.player.onGround) {
                        Class9567.method37088(var1, Class9567.method37075() * 0.82);
                    }
                    break;
                case "Cubecraft":
                    double var6 = 0.2;
                    float var8 = this.method16118(MathHelper.method37792(mc.player.rotationYaw));
                    if (mc.gameSettings.keyBindJump.isKeyDown()) {
                        mc.timer.timerSpeed = 1.0F;
                    } else if (mc.player.onGround) {
                        if (Class5628.method17686() && !mc.player.method3331() && !this.field23474) {
                            var1.method13995(1.00000000000001);
                        }
                    } else if (this.field23471 == 1) {
                        if (var1.method13994() <= 0.9) {
                            this.field23471 = -1;
                        } else {
                            var1.method13995(0.122);
                            mc.timer.timerSpeed = 0.7F;
                            var6 = 2.4;
                        }
                    } else if (this.field23471 == 2) {
                        if (var1.method13994() > 0.05) {
                            this.field23471 = -1;
                        } else {
                            mc.timer.timerSpeed = 0.7F;
                            var6 = 0.28;
                        }
                    } else if (this.field23471 == 3) {
                        mc.timer.timerSpeed = 0.3F;
                        var6 = 2.4;
                    } else if (this.field23471 == 4) {
                        var6 = 0.28;
                        mc.timer.timerSpeed = 1.0F;
                    } else if (this.field23471 == 6) {
                        var1.method13995(-1.023456987345906);
                    }

                    if (!Class5628.method17686()) {
                        var6 = 0.0;
                    }

                    if (mc.player.fallDistance < 1.0F) {
                        Class9567.method37092(var1, var6, var8, var8, 360.0F);
                    }

                    Class5628.method17725(var1.method13994());
                    break;
                case "Slow":
                    if (mc.player.onGround) {
                        var1.method13993(var1.method13992() * 0.75);
                        var1.method13997(var1.method13996() * 0.75);
                    } else {
                        var1.method13993(var1.method13992() * 0.93);
                        var1.method13997(var1.method13996() * 0.93);
                    }
                    break;
                case "Sneak":
                    if (mc.player.onGround) {
                        var1.method13993(var1.method13992() * 0.65);
                        var1.method13997(var1.method13996() * 0.65);
                    } else {
                        var1.method13993(var1.method13992() * 0.85);
                        var1.method13997(var1.method13996() * 0.85);
                    }
            }

            this.field23473.method16741(var1);
        }
    }

    @EventTarget
    @LowerPriority
    public void method16113(SendPacketEvent var1) {
        if (this.isEnabled() && mc.player != null) {
            if (var1.method13932() instanceof Class5539 && ((BlockFly) this.method16004()).field23884 >= 0) {
                var1.method13900(true);
            }
        }
    }

    @EventTarget
    public void method16114(Class4436 var1) {
        if (this.isEnabled() && this.field23475) {
            if (this.method16004().getStringSettingValueByName("Tower Mode").equalsIgnoreCase("Vanilla")
                    && (!Class5628.method17686() || this.method16004().getBooleanValueFromSetttingName("Tower while moving"))) {
                var1.method13900(true);
            }
        }
    }

    @EventTarget
    public void method16115(Render2DEvent var1) {
        if (this.isEnabled() && this.getStringSettingValueByName("Speed Mode").equals("Cubecraft") && this.field23471 >= 0) {
            if (!(mc.player.fallDistance > 1.2F)) {
                if (!(mc.player.field4915 < this.field23476)) {
                    if (!mc.player.field4981) {
                        mc.player.positionVec.field18049 = this.field23476;
                        mc.player.lastTickPosY = this.field23476;
                        mc.player.field4915 = this.field23476;
                        mc.player.prevPosY = this.field23476;
                        if (Class9567.method37087()) {
                            mc.player.field4909 = 0.099999994F;
                        }
                    }
                }
            }
        }
    }

    public float method16118(float var1) {
        float var4 = 0.0F;
        float var5 = mc.player.field4982;
        float var6 = mc.player.field4984;
        if (!(var5 > 0.0F)) {
            if (var5 < 0.0F) {
                if (!(var6 > 0.0F)) {
                    if (!(var6 < 0.0F)) {
                        var1 += 90.0F;
                    } else {
                        var1 -= 45.0F;
                    }
                } else {
                    var1 += 45.0F;
                }
            }
        } else if (!(var6 > 0.0F)) {
            if (!(var6 < 0.0F)) {
                var1 -= 90.0F;
            } else {
                var1 += 45.0F;
            }
        } else {
            var1 -= 45.0F;
        }

        if (var1 >= 45.0F && var1 <= 135.0F) {
            var4 = 90.0F;
        } else if (var1 >= 135.0F || var1 <= -135.0F) {
            var4 = 180.0F;
        } else if (var1 <= -45.0F && var1 >= -135.0F) {
            var4 = -90.0F;
        } else if (var1 >= -45.0F && var1 <= 45.0F) {
            var4 = 0.0F;
        }

        if (var6 < 0.0F) {
            var4 -= 180.0F;
        }

        return var4 + 90.0F;
    }
}
