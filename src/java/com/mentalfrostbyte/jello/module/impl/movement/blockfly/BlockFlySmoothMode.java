package com.mentalfrostbyte.jello.module.impl.movement.blockfly;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.module.impl.movement.Fly;
import com.mentalfrostbyte.jello.module.impl.movement.SafeWalk;
import com.mentalfrostbyte.jello.module.impl.movement.Speed;
import mapped.*;
import net.minecraft.util.math.BlockPos;

public class BlockFlySmoothMode extends Module {
    private float field23969;
    private float field23970;
    private Class7843 field23971;
    private int field23972 = -1;
    private int field23973;
    private int field23974;
    private Hand field23975;
    private BlockFly field23976 = null;
    private boolean field23977;
    private boolean field23978 = false;
    private double field23979;
    private int field23980 = 0;

    public BlockFlySmoothMode() {
        super(ModuleCategory.MOVEMENT, "Smooth", "Places block underneath");
        this.registerSetting(new ModeSetting("Speed Mode", "Speed mode", 0, "None", "Jump", "AAC", "Cubecraft", "Slow", "Sneak"));
    }

    public static Vector3d method16892(BlockPos var0, Direction var1) {
        double var4 = (double) var0.getX() + 0.5;
        double var6 = (double) var0.getY() + 0.5;
        double var8 = (double) var0.getZ() + 0.5;
        var4 += (double) var1.method539() / 2.0;
        var8 += (double) var1.method541() / 2.0;
        var6 += (double) var1.method540() / 2.0;
        double var10 = 0.2;
        if (var1 != Direction.field673 && var1 != Direction.DOWN) {
            var6 += method16893(var10, -var10);
        } else {
            var4 += method16893(var10, -var10);
            var8 += method16893(var10, -var10);
        }

        if (var1 == Direction.WEST || var1 == Direction.EAST) {
            var8 += method16893(var10, -var10);
        }

        if (var1 == Direction.SOUTH || var1 == Direction.NORTH) {
            var4 += method16893(var10, -var10);
        }

        return new Vector3d(var4, var6, var8);
    }

    public static double method16893(double var0, double var2) {
        return Math.random() * (var0 - var2) + var2;
    }

    @Override
    public void method15953() {
        this.field23976 = (BlockFly) this.method16004();
    }

    @Override
    public void onEnable() {
        this.field23972 = mc.player.inventory.currentItem;
        this.field23970 = this.field23969 = 999.0F;
        ((BlockFly) this.method16004()).field23884 = -1;
        this.field23979 = -1.0;
        this.field23978 = false;
        if (mc.player.onGround) {
            this.field23979 = mc.player.getPosY();
        }

        this.field23974 = -1;
    }

    @Override
    public void onDisable() {
        if (this.field23972 != -1 && this.method16004().getStringSettingValueByName("ItemSpoof").equals("Switch")) {
            mc.player.inventory.currentItem = this.field23972;
        }

        this.field23972 = -1;
        if (((BlockFly) this.method16004()).field23884 >= 0) {
            mc.getConnection().sendPacket(new Class5539(mc.player.inventory.currentItem));
            ((BlockFly) this.method16004()).field23884 = -1;
        }

        Class9567.method37090(Class9567.method37075() * 0.9);
        mc.timer.timerSpeed = 1.0F;
        if (this.getStringSettingValueByName("Speed Mode").equals("Cubecraft") && this.field23974 == 0) {
            ColorUtils.method17725(-0.0789);
        }
    }

    @EventTarget
    public void method16885(SafeWalkEvent var1) {
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
            } else if (mc.player.onGround && Client.getInstance().getModuleManager().getModuleByClass(SafeWalk.class).isEnabled()) {
                var1.setSafe(true);
            }
        }
    }

    @EventTarget
    @LowerPriority
    public void method16886(Class4399 var1) {
        if (this.isEnabled() && this.field23976.method16735() != 0) {
            if (!var1.method13921()) {
                if (this.field23970 != 999.0F) {
                    this.field23976.method16736();
                    if (this.field23971 != null) {
                        BlockRayTraceResult var13 = Class9217.method34568(this.field23970, this.field23969, 5.0F, var1);
                        if (var13.getType() == RayTraceResult.Type.MISS) {
                            return;
                        }

                        if (var13.getFace() == Direction.field673
                                && (double) var13.getPos().getY() <= mc.player.getPosY() - 1.0
                                && mc.player.onGround) {
                            return;
                        }

                        int var14 = mc.player.inventory.currentItem;
                        if (!this.method16004().getStringSettingValueByName("ItemSpoof").equals("None")) {
                            this.field23976.method16734();
                        }

                        ItemStack var15 = mc.player.getHeldItem(Hand.MAIN_HAND);
                        new Class5911(mc.player, Hand.MAIN_HAND, var13);
                        int var17 = var15.getCount();
                        mc.playerController.func_217292_a(mc.player, mc.world, this.field23975, var13);
                        this.field23971 = null;
                        if (!this.method16004().getBooleanValueFromSetttingName("NoSwing")) {
                            mc.player.swingArm(this.field23975);
                        } else {
                            mc.getConnection().sendPacket(new CAnimateHandPacket(this.field23975));
                        }

                        if (this.method16004().getStringSettingValueByName("ItemSpoof").equals("Spoof") || this.method16004().getStringSettingValueByName("ItemSpoof").equals("LiteSpoof")) {
                            mc.player.inventory.currentItem = var14;
                        }
                    }
                }
            } else {
                this.field23973++;
                this.field23980--;
                var1.method13908(true);
                this.field23975 = Hand.MAIN_HAND;
                if (BlockFly.method16733(mc.player.getHeldItem(Hand.field183).getItem())
                        && (
                        mc.player.getHeldItem(this.field23975).isEmpty()
                                || !BlockFly.method16733(mc.player.getHeldItem(this.field23975).getItem())
                )) {
                    this.field23975 = Hand.field183;
                }

                double var4 = var1.method13909();
                double var6 = var1.method13913();
                double var8 = var1.method13911();
                if (!mc.player.collidedHorizontally && !mc.gameSettings.keyBindJump.pressed) {
                    double[] var10 = this.method16891();
                    var4 = var10[0];
                    var6 = var10[1];
                }

                if (mc.player.method3433().field18049 < 0.0
                        && mc.player.fallDistance > 1.0F
                        && Class9217.method34567(0.0F, 90.0F, 3.0F).getType() == RayTraceResult.Type.MISS) {
                    var8 += Math.min(mc.player.method3433().field18049 * 2.0, 4.0);
                } else if ((this.getStringSettingValueByName("Speed Mode").equals("Jump") || this.getStringSettingValueByName("Speed Mode").equals("Cubecraft"))
                        && !mc.gameSettings.keyBindJump.isKeyDown()) {
                    var8 = this.field23979;
                }

                if (!Class9217.method34578(
                        new BlockPos(
                                mc.player.getPositionVec().method11320(),
                                mc.player.getPositionVec().method11321() - 1.0,
                                mc.player.getPositionVec().method11322()
                        )
                )) {
                    var4 = mc.player.getPositionVec().method11320();
                    var6 = mc.player.getPositionVec().method11322();
                }

                BlockPos var18 = new BlockPos(var4, var8 - 1.0, var6);
                if (!Class9217.method34578(var18) && this.field23976.method16739(this.field23975) && this.field23980 <= 0) {
                    Class7843 var11 = Class9217.method34575(var18, false);
                    this.field23971 = var11;
                    float[] var12 = Class9217.method34565();
                    if (var11 != null && var12 != null) {
                        this.field23970 = var12[0];
                        this.field23969 = var12[1];
                    }
                } else {
                    this.field23971 = null;
                }

                if (this.field23970 != 999.0F) {
                    var1.method13918(this.field23970);
                    var1.method13916(this.field23969);
                }

                if (mc.player.rotationYaw != var1.method13917() && mc.player.rotationPitch != var1.method13915()) {
                    this.field23973 = 0;
                }
            }
        }
    }

    @EventTarget
    @HigherPriority
    public void method16887(Class4435 var1) {
        if (this.isEnabled() && this.field23976.method16735() != 0) {
            if (mc.player.onGround || ColorUtils.method17730(mc.player, 0.01F)) {
                this.field23979 = mc.player.getPosY();
            }

            if (this.method16004().getBooleanValueFromSetttingName("No Sprint")) {
                mc.player.setSprinting(false);
            }

            if (mc.player.onGround) {
                this.field23974 = 0;
            } else if (this.field23974 >= 0) {
                this.field23974++;
            }

            if (this.field23976 == null) {
                this.field23976 = (BlockFly) this.method16004();
            }

            String var4 = this.getStringSettingValueByName("Speed Mode");
            switch (var4) {
                case "Jump":
                    if (mc.player.onGround && ColorUtils.method17686() && !mc.player.method3331() && !this.field23977) {
                        this.field23978 = false;
                        mc.player.method2914();
                        ((Speed) Client.getInstance().getModuleManager().getModuleByClass(Speed.class)).method16764();
                        this.field23978 = true;
                        var1.method13995(mc.player.method3433().field18049);
                        var1.method13993(mc.player.method3433().field18048);
                        var1.method13997(mc.player.method3433().field18050);
                    }
                    break;
                case "AAC":
                    if (this.field23973 == 0 && mc.player.onGround) {
                        Class9567.method37088(var1, Class9567.method37075() * 0.82);
                    }
                    break;
                case "Cubecraft":
                    double var6 = 0.2;
                    float var8 = this.method16894(MathHelper.method37792(mc.player.rotationYaw));
                    if (mc.gameSettings.keyBindJump.isKeyDown()) {
                        mc.timer.timerSpeed = 1.0F;
                    } else if (mc.player.onGround) {
                        if (ColorUtils.method17686() && !mc.player.method3331() && !this.field23977) {
                            var1.method13995(1.00000000000001);
                        }
                    } else if (this.field23974 == 1) {
                        if (var1.method13994() <= 0.9) {
                            this.field23974 = -1;
                        } else {
                            var1.method13995(0.122);
                            mc.timer.timerSpeed = 0.7F;
                            var6 = 2.4;
                        }
                    } else if (this.field23974 == 2) {
                        if (var1.method13994() > 0.05) {
                            this.field23974 = -1;
                        } else {
                            mc.timer.timerSpeed = 0.7F;
                            var6 = 0.28;
                        }
                    } else if (this.field23974 == 3) {
                        mc.timer.timerSpeed = 0.3F;
                        var6 = 2.4;
                    } else if (this.field23974 == 4) {
                        var6 = 0.28;
                        mc.timer.timerSpeed = 1.0F;
                    } else if (this.field23974 == 6) {
                        var1.method13995(-1.023456987345906);
                    }

                    if (!ColorUtils.method17686()) {
                        var6 = 0.0;
                    }

                    if (mc.player.fallDistance < 1.0F) {
                        Class9567.method37092(var1, var6, var8, var8, 360.0F);
                    }

                    ColorUtils.method17725(var1.method13994());
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

            this.field23976.method16741(var1);
        }
    }

    @EventTarget
    @LowerPriority
    public void method16888(SendPacketEvent var1) {
        if (this.isEnabled() && mc.player != null) {
            if (var1.method13932() instanceof Class5539 && ((BlockFly) this.method16004()).field23884 >= 0) {
                var1.method13900(true);
            }
        }
    }

    @EventTarget
    public void method16889(Class4436 var1) {
        if (this.isEnabled() && this.field23978) {
            if (this.method16004().getStringSettingValueByName("Tower Mode").equalsIgnoreCase("Vanilla")
                    && (!ColorUtils.method17686() || this.method16004().getBooleanValueFromSetttingName("Tower while moving"))) {
                var1.method13900(true);
            }
        }
    }

    @EventTarget
    public void method16890(Render2DEvent var1) {
        if (this.isEnabled() && this.getStringSettingValueByName("Speed Mode").equals("Cubecraft") && this.field23974 >= 0) {
            if (!(mc.player.fallDistance > 1.2F)) {
                if (!(mc.player.field4915 < this.field23979)) {
                    if (!mc.player.field4981) {
                        mc.player.positionVec.field18049 = this.field23979;
                        mc.player.lastTickPosY = this.field23979;
                        mc.player.field4915 = this.field23979;
                        mc.player.prevPosY = this.field23979;
                        if (Class9567.method37087()) {
                            mc.player.field4909 = 0.099999994F;
                        }
                    }
                }
            }
        }
    }

    public double[] method16891() {
        double var3 = mc.player.getPosX();
        double var5 = mc.player.getPosZ();
        double var7 = mc.player.field6131.field43908;
        double var9 = mc.player.field6131.field43907;
        float var11 = mc.player.rotationYaw;
        BlockPos var12 = new BlockPos(var3, mc.player.getPosY() - 1.0, var5);
        double var13 = var3;
        double var15 = var5;
        double var17 = 0.0;

        for (double var19 = this.getNumberValueBySettingName("Extend") * 2.0F;
             Class9217.method34578(var12);
             var12 = new BlockPos(var13, mc.player.getPosY() - 1.0, var15)
        ) {
            if (++var17 > var19) {
                var17 = var19;
            }

            var13 = var3
                    + (var7 * 0.45 * Math.cos(Math.toRadians(var11 + 90.0F)) + var9 * 0.45 * Math.sin(Math.toRadians(var11 + 90.0F))) * var17;
            var15 = var5
                    + (var7 * 0.45 * Math.sin(Math.toRadians(var11 + 90.0F)) - var9 * 0.45 * Math.cos(Math.toRadians(var11 + 90.0F))) * var17;
            if (var17 == var19) {
                break;
            }
        }

        return new double[]{var13, var15};
    }

    public float method16894(float var1) {
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
