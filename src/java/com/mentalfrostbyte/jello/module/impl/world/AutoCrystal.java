package com.mentalfrostbyte.jello.module.impl.world;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.combat.Teams;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import com.mentalfrostbyte.jello.settings.NumberSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.timer.TimerUtil;
import mapped.*;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.play.client.CCloseWindowPacket;
import net.minecraft.util.DamageSource;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import org.lwjgl.opengl.GL11;

import java.util.*;
import java.util.stream.Collectors;

public class AutoCrystal extends Module {
    private static float field23629;
    private static float field23630;
    private static boolean field23631;
    private static final boolean field23634 = false;
    private final TimerUtil field23628 = new TimerUtil();
    private BlockPos field23632;
    private Entity field23633;
    private Runnable field23635 = null;
    private int field23636;
    private List<BlockPos> field23637 = new ArrayList<BlockPos>();

    public AutoCrystal() {
        super(ModuleCategory.WORLD, "AutoCrystal", "Automatically detonates crystals");
        this.registerSetting(new ModeSetting("Mode", "Mode", 0, "Single", "Switch"));
        this.registerSetting(new NumberSetting<Float>("Range", "Range value", 4.0F, Float.class, 2.8F, 8.0F, 0.01F));
        this.registerSetting(new NumberSetting<Float>("CPS", "Click per seconds", 9.0F, Float.class, 1.0F, 20.0F, 1.0F));
        this.registerSetting(new BooleanSetting("Players", "Hit players", true));
        this.registerSetting(new BooleanSetting("Animals/Monsters", "Hit animals and monsters", false));
        this.registerSetting(new BooleanSetting("Invisible", "Hit invisible entites", true));
    }

    public static BlockPos method16376() {
        return new BlockPos(
                Math.floor(mc.player.getPosX()), Math.floor(mc.player.getPosY()), Math.floor(mc.player.getPosZ())
        );
    }

    public static float method16380(double var0, double var2, double var4, Entity var6) {
        float var9 = 12.0F;
        double var10 = Math.sqrt(var6.getDistanceNearest(var0, var2, var4)) / (double) var9;
        Vector3d var12 = new Vector3d(var0, var2, var4);
        double var13 = Explosion.method25783(var12, var6);
        double var15 = (1.0 - var10) * var13;
        float var17 = (float) ((int) ((var15 * var15 + var15) / 2.0 * 7.0 * (double) var9 + 1.0));
        double var18 = 1.0;
        if (var6 instanceof LivingEntity) {
            var18 = method16382(
                    (LivingEntity) var6, method16381(var17), new Explosion(mc.world, null, null, null, var0, var2, var4, 6.0F, false, Class2141.field14015)
            );
        }

        return (float) var18;
    }

    private static float method16381(float var0) {
        int var3 = mc.world.method6997().getId();
        return var0 * (var3 != 0 ? (var3 != 2 ? (var3 != 1 ? 1.5F : 0.5F) : 1.0F) : 0.0F);
    }

    public static float method16382(LivingEntity var0, float var1, Explosion var2) {
        if (!(var0 instanceof PlayerEntity)) {
            return Class8913.method32581(var1, (float) var0.method3070(), (float) var0.getAttributeValue(Attributes.field42114));
        } else {
            PlayerEntity var5 = (PlayerEntity) var0;
            DamageSource var6 = DamageSource.method31126(var2);
            var1 = Class8913.method32581(var1, (float) var5.method3070(), (float) var5.getAttributeValue(Attributes.field42114));
            int var7 = EnchantmentHelper.method26317(var5.getArmorInventoryList(), var6);
            float var8 = MathHelper.clamp((float) var7, 0.0F, 20.0F);
            var1 *= 1.0F - var8 / 25.0F;
            if (var0.isPotionActive(Effect.get(11))) {
                var1 -= var1 / 4.0F;
            }

            return Math.max(var1 - var5.getAbsorptionAmount(), 0.0F);
        }
    }

    private static void method16383() {
        if (field23631) {
            field23629 = mc.player.rotationYaw;
            field23630 = mc.player.rotationPitch;
            field23631 = false;
        }
    }

    // $VF: synthetic method
    public static Minecraft method16394() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16395() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16396() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16397() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16398() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16399() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16400() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16401() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16402() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16403() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16404() {
        return mc;
    }

    @Override
    public void onEnable() {
        this.field23628.reset();
        this.field23628.start();
        this.field23635 = null;
    }

    @EventTarget
    public void method16374(EventUpdate var1) {
        if (!var1.isPre()) {
            if (this.field23635 != null) {
                this.field23635.run();
                this.field23635 = null;
            }
        } else {
            this.field23636++;
            List var4 = this.method16385(20.0F);
            if (var4 == null || var4.isEmpty()) {
                this.field23633 = null;
                return;
            }

            this.field23633 = (Entity) var4.get(0);
            if ((float) this.field23636 >= 20.0F / this.getNumberValueBySettingName("CPS")) {
                EnderCrystalEntity var5 = mc.world
                        .getEntitiesInAABBexcluding(
                                Entity.class, this.field23633.boundingBox.expand(2.0, 4.0, 2.0).expand(-2.0, -3.0, -2.0), var0 -> var0 instanceof EnderCrystalEntity
                        )
                        .stream()
                        .map(var0 -> (EnderCrystalEntity) var0)
                        .filter(var0 -> var0.getDistance(mc.player) < 6.0F)
                        .filter(var1x -> (double) var1x.getDistance(this.field23633) < 3.6)
                        .min(Comparator.comparing(var1x -> method16380(var1x.getPosX(), var1x.getPosY(), var1x.getPosZ(), this.field23633)))
                        .orElse(null);
                if (var5 != null) {
                    Rotations var9 = RotationHelper.method34148(var5.positionVec);
                    var1.setYaw(var9.yaw);
                    var1.setPitch(var9.pitch);
                    this.field23636 = 0;
                    this.field23635 = new Class540(this, var5);
                    return;
                }
            }

            int var8 = this.method16386();
            if (var8 < 0) {
                return;
            }

            this.field23637 = this.method16377();
            this.field23637
                    .sort(Comparator.comparing(var1x -> this.field23633.getDistanceNearest(var1x.field13027, var1x.field13028, var1x.field13029)));
            if (this.field23637 != null && !this.field23637.isEmpty()) {
                BlockPos var6 = this.field23637
                        .stream()
                        .max(
                                Comparator.comparing(
                                        var1x -> method16380(var1x.getX(), var1x.getY(), var1x.getZ(), this.field23633)
                                )
                        )
                        .orElse(null);
                if (var6 != null) {
                    Rotations var7 = RotationHelper.method34148(
                            new Vector3d((double) var6.field13027 + 0.5, (double) var6.field13028 + 0.5, (double) var6.field13029 + 0.5)
                    );
                    var1.setYaw(var7.yaw);
                    var1.setPitch(var7.pitch);
                    this.field23635 = new Class335(this, var6, var8);
                }
            }
        }
    }

    @EventTarget
    public void method16375(Render3DEvent var1) {
        int var4 = MultiUtilities.applyAlpha(100000000, 0.2F);
        GL11.glPushMatrix();
        GL11.glDisable(2929);

        for (BlockPos var6 : this.field23637) {
            double var7 = (double) var6.getX() - mc.gameRenderer.getActiveRenderInfo().getPos().getX();
            double var9 = (double) var6.getY() - mc.gameRenderer.getActiveRenderInfo().getPos().getY();
            double var11 = (double) var6.getZ() - mc.gameRenderer.getActiveRenderInfo().getPos().getZ();
            Box3D var13 = new Box3D(var7, var9 + 1.0, var11, var7 + 1.0, var9 + 1.0, var11 + 1.0);
            RenderUtil.render3DColoredBox(var13, var4);
        }

        var4 = MultiUtilities.applyAlpha(9000000, 1.0F);
        if (this.field23633 != null) {
            double var14 = this.field23633.getPosX() - mc.gameRenderer.getActiveRenderInfo().getPos().getX();
            double var19 = this.field23633.getPosY() - mc.gameRenderer.getActiveRenderInfo().getPos().getY() + 0.5;
            double var20 = this.field23633.getPosZ() - mc.gameRenderer.getActiveRenderInfo().getPos().getZ();
            float var16 = 0.3F;
            Box3D var17 = new Box3D(var14 - (double) var16, var19 + 0.9, var20 - (double) var16, var14 + (double) var16, var19 + 1.0, var20 + (double) var16);
            RenderUtil.render3DColoredBox(var17, var4);
        }

        GL11.glEnable(2929);
        GL11.glPopMatrix();
    }

    private List<BlockPos> method16377() {
        NonNullList var3 = NonNullList.create();
        var3.addAll(this.method16379(method16376(), 6.0F, 6, false, true, 0).stream().filter(this::method16378).collect(Collectors.toList()));
        return var3;
    }

    private boolean method16378(BlockPos var1) {
        BlockPos var4 = var1.add(0, 1, 0);
        BlockPos var5 = var1.add(0, 2, 0);
        return (
                mc.world.getBlockState(var1).getBlock() == Blocks.BEDROCK
                        || mc.world.getBlockState(var1).getBlock() == Blocks.field36527
        )
                && mc.world.getBlockState(var4).getBlock() == Blocks.AIR
                && mc.world.getBlockState(var5).getBlock() == Blocks.AIR
                && mc.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(var4)).isEmpty();
    }

    public List<BlockPos> method16379(BlockPos var1, float var2, int var3, boolean var4, boolean var5, int var6) {
        ArrayList var9 = new ArrayList();
        int var10 = var1.getX();
        int var11 = var1.getY();
        int var12 = var1.getZ();

        for (int var13 = var10 - (int) var2; (float) var13 <= (float) var10 + var2; var13++) {
            for (int var14 = var12 - (int) var2; (float) var14 <= (float) var12 + var2; var14++) {
                for (int var15 = !var5 ? var11 : var11 - (int) var2; (float) var15 < (!var5 ? (float) (var11 + var3) : (float) var11 + var2); var15++) {
                    double var16 = (var10 - var13) * (var10 - var13) + (var12 - var14) * (var12 - var14) + (!var5 ? 0 : (var11 - var15) * (var11 - var15));
                    if (var16 < (double) (var2 * var2) && (!var4 || !(var16 < (double) ((var2 - 1.0F) * (var2 - 1.0F))))) {
                        BlockPos var18 = new BlockPos(var13, var15 + var6, var14);
                        var9.add(var18);
                    }
                }
            }
        }

        return var9;
    }

    private void method16384(Vector3d var1) {
        Rotations var4 = RotationHelper.method34148(var1);
        field23629 = var4.yaw;
        field23630 = var4.pitch;
        field23631 = true;
    }

    public List<Entity> method16385(float var1) {
        List var4 = MultiUtilities.getEntitesInWorld();
        Iterator var5 = var4.iterator();

        while (var5.hasNext()) {
            Entity var6 = (Entity) var5.next();
            if (var6 != mc.player) {
                if (!Client.getInstance().getFriendManager().method26997(var6)) {
                    if (var6 instanceof LivingEntity) {
                        if (((LivingEntity) var6).getHealth() != 0.0F) {
                            if (!(mc.player.getDistance(var6) > var1)) {
                                if (mc.player.canAttack((LivingEntity) var6)) {
                                    if (!(var6 instanceof ArmorStandEntity)) {
                                        if (!this.getBooleanValueFromSettingName("Players") && var6 instanceof PlayerEntity) {
                                            var5.remove();
                                        } else if (var6 instanceof PlayerEntity && Client.getInstance().getCombatManager().isValidTarget(var6)) {
                                            var5.remove();
                                        } else if (!this.getBooleanValueFromSettingName("Invisible") && var6.isInvisible()) {
                                            var5.remove();
                                        } else if (!this.getBooleanValueFromSettingName("Animals/Monsters") && !(var6 instanceof PlayerEntity)) {
                                            var5.remove();
                                        } else if (mc.player.getRidingEntity() != null && mc.player.getRidingEntity().equals(var6)) {
                                            var5.remove();
                                        } else if (!var6.method3362()) {
                                            if (var6 instanceof PlayerEntity
                                                    && Class8781.method31662((PlayerEntity) var6)
                                                    && Client.getInstance().getModuleManager().getModuleByClass(Teams.class).isEnabled()) {
                                                var5.remove();
                                            }
                                        } else {
                                            var5.remove();
                                        }
                                    } else {
                                        var5.remove();
                                    }
                                } else {
                                    var5.remove();
                                }
                            } else {
                                var5.remove();
                            }
                        } else {
                            var5.remove();
                        }
                    } else {
                        var5.remove();
                    }
                } else {
                    var5.remove();
                }
            } else {
                var5.remove();
            }
        }

        Collections.sort(var4, new Class3603(this));
        return var4;
    }

    public int method16386() {
        for (int var3 = 36; var3 < 45; var3++) {
            if (mc.player.container.getSlot(var3).getHasStack()) {
                ItemStack var4 = mc.player.container.getSlot(var3).getStack();
                if (var4.getItem() == Items.END_CRYSTAL) {
                    return var3 - 36;
                }
            }
        }

        for (int var5 = 9; var5 < 36; var5++) {
            if (mc.player.container.getSlot(var5).getHasStack()) {
                ItemStack var6 = mc.player.container.getSlot(var5).getStack();
                if (var6.getItem() == Items.END_CRYSTAL) {
                    /*
                    if (JelloPortal.getCurrentVersionApplied() <= ViaVerList._1_11_1_or_2.getVersionNumber()) {
                        mc.getConnection().sendPacket(new CClientStatusPacket(CClientStatusPacket.State.OPEN_INVENTORY));
                    }
                     */

                    InvManagerUtils.moveItemToHotbar(var5, 8);
                    mc.getConnection().sendPacket(new CCloseWindowPacket(-1));
                    return 5;
                }
            }
        }

        return -1;
    }
}
