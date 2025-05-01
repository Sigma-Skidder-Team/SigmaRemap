// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.blockflys;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.mods.impl.movement.SafeWalk;
import com.mentalfrostbyte.jello.mods.impl.movement.Fly;
import com.mentalfrostbyte.jello.mods.impl.movement.Speed;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class HypixelBlockFly extends Module
{
    private float field15708;
    private float field15709;
    private Class9301 field15710;
    private int field15711;
    private int field15712;
    private int field15713;
    private Class316 field15714;
    private BlockFly field15715;
    private boolean field15716;
    private boolean field15717;
    private double field15718;
    private int field15719;
    
    public HypixelBlockFly() {
        super(Category.MOVEMENT, "Hypixel", "Places block underneath");
        this.field15711 = -1;
        this.field15715 = null;
        this.field15717 = false;
        this.field15719 = 0;
        this.addSetting(new StringSetting("Speed Mode", "Speed mode", 0, "None", "Jump", "AAC", "Cubecraft", "Slow", "Sneak"));
    }
    
    @Override
    public void initialize() {
        this.field15715 = (BlockFly)this.method9914();
    }
    
    @Override
    public void onEnable() {
        this.field15711 = HypixelBlockFly.mc.player.inventory.field2743;
        final float n = 999.0f;
        this.field15708 = n;
        this.field15709 = n;
        ((BlockFly)this.method9914()).field15750 = -1;
        this.field15718 = -1.0;
        this.field15717 = false;
        if (HypixelBlockFly.mc.player.onGround) {
            this.field15718 = HypixelBlockFly.mc.player.posY;
        }
        this.field15713 = -1;
    }
    
    @Override
    public void onDisable() {
        if (this.field15711 != -1) {
            if (this.method9914().getStringSettingValueByName("ItemSpoof").equals("Switch")) {
                HypixelBlockFly.mc.player.inventory.field2743 = this.field15711;
            }
        }
        this.field15711 = -1;
        if (((BlockFly)this.method9914()).field15750 >= 0) {
            HypixelBlockFly.mc.method5269().method17292(new Class4321(HypixelBlockFly.mc.player.inventory.field2743));
            ((BlockFly)this.method9914()).field15750 = -1;
        }
        MovementUtil.method23151(MovementUtil.method23136() * 0.9);
        HypixelBlockFly.mc.timer.timerSpeed = 1.0f;
        if (this.getStringSettingValueByName("Speed Mode").equals("Cubecraft")) {
            if (this.field15713 == 0) {
                AllUtils.method19155(-0.0789);
            }
        }
    }
    
    @EventListener
    public void method10208(final Class5738 class5738) {
        if (this.isEnabled()) {
            if (this.getStringSettingValueByName("Speed Mode").equals("Cubecraft") && !Client.getInstance().moduleManager().getModuleByClass(Fly.class).isEnabled()) {
                if (HypixelBlockFly.mc.world.method6981(HypixelBlockFly.mc.player, HypixelBlockFly.mc.player.boundingBox.expand(0.0, -1.5, 0.0).contract(0.05, 0.0, 0.05).contract(-0.05, 0.0, -0.05)).count() == 0L) {
                    if (HypixelBlockFly.mc.player.fallDistance < 1.0f) {
                        class5738.method17026(true);
                    }
                }
            }
            else if (HypixelBlockFly.mc.player.onGround) {
                if (Client.getInstance().moduleManager().getModuleByClass(SafeWalk.class).isEnabled()) {
                    class5738.method17026(true);
                }
            }
        }
    }
    
    @EventListener
    @LowerPriority
    public void method10209(final UpdateWalkingEventI updateWalkingEvent) {
        if (this.isEnabled() && this.field15715.method10281() != 0) {
            if (!updateWalkingEvent.isPre()) {
                if (this.field15709 != 999.0f) {
                    this.field15715.method10282();
                    if (this.field15710 != null) {
                        final BlockRayTraceResult method13698 = Class4609.method13698(this.field15709, this.field15708, 5.0f, updateWalkingEvent);
                        if (method13698.getType() == RayTraceResult.Type.MISS) {
                            return;
                        }
                        if (method13698.getFace() == Direction.UP) {
                            if (method13698.getPos().getY() <= HypixelBlockFly.mc.player.posY - 1.0) {
                                if (HypixelBlockFly.mc.player.onGround) {
                                    return;
                                }
                            }
                        }
                        final int field2743 = HypixelBlockFly.mc.player.inventory.field2743;
                        if (!this.method9914().getStringSettingValueByName("ItemSpoof").equals("None")) {
                            this.field15715.method10280();
                        }
                        final ItemStack method13699 = HypixelBlockFly.mc.player.method2715(Class316.field1877);
                        final Class7075 class5745 = new Class7075(HypixelBlockFly.mc.player, Class316.field1877, method13698);
                        method13699.method27690();
                        HypixelBlockFly.mc.playerController.method27319(HypixelBlockFly.mc.player, HypixelBlockFly.mc.world, this.field15714, method13698);
                        this.field15710 = null;
                        if (!this.method9914().getBooleanValueFromSettingName("NoSwing")) {
                            HypixelBlockFly.mc.player.method2707(this.field15714);
                        }
                        else {
                            HypixelBlockFly.mc.method5269().method17292(new Class4380(this.field15714));
                        }
                        if (this.method9914().getStringSettingValueByName("ItemSpoof").equals("Spoof") || this.method9914().getStringSettingValueByName("ItemSpoof").equals("LiteSpoof")) {
                            HypixelBlockFly.mc.player.inventory.field2743 = field2743;
                        }
                    }
                }
            }
            else {
                ++this.field15712;
                --this.field15719;
                updateWalkingEvent.method17033(true);
                this.field15714 = Class316.field1877;
                final BlockFly field2744 = this.field15715;
                Label_0100: {
                    if (BlockFly.method10279(HypixelBlockFly.mc.player.method2715(Class316.field1878).getItem())) {
                        if (!HypixelBlockFly.mc.player.method2715(this.field15714).method27620()) {
                            final BlockFly field2745 = this.field15715;
                            if (BlockFly.method10279(HypixelBlockFly.mc.player.method2715(this.field15714).getItem())) {
                                break Label_0100;
                            }
                        }
                        this.field15714 = Class316.field1878;
                    }
                }
                double n = updateWalkingEvent.method17034();
                double n2 = updateWalkingEvent.method17038();
                double n3 = updateWalkingEvent.method17036();
                if (!HypixelBlockFly.mc.player.collidedHorizontally) {
                    if (!HypixelBlockFly.mc.gameSettings.field23439.field2162) {
                        final double[] method13700 = this.method10214();
                        n = method13700[0];
                        n2 = method13700[1];
                    }
                }
                Label_0176: {
                    if (HypixelBlockFly.mc.player.getMotion().y < 0.0) {
                        if (HypixelBlockFly.mc.player.fallDistance > 1.0f) {
                            if (Class4609.method13697(0.0f, 90.0f, 3.0f).getType() == RayTraceResult.Type.MISS) {
                                n3 += Math.min(HypixelBlockFly.mc.player.getMotion().y * 2.0, 4.0);
                                break Label_0176;
                            }
                        }
                    }
                    if (this.getStringSettingValueByName("Speed Mode").equals("Jump") || this.getStringSettingValueByName("Speed Mode").equals("Cubecraft")) {
                        if (!HypixelBlockFly.mc.gameSettings.field23439.method1056()) {
                            n3 = this.field15718;
                        }
                    }
                }
                if (!Class4609.method13708(new BlockPos(HypixelBlockFly.mc.player.method1934().getX(), HypixelBlockFly.mc.player.method1934().getY() - 1.0, HypixelBlockFly.mc.player.method1934().getZ()))) {
                    n = HypixelBlockFly.mc.player.method1934().getX();
                    n2 = HypixelBlockFly.mc.player.method1934().getZ();
                }
                final BlockPos class5746 = new BlockPos(n, n3 - 1.0, n2);
                Label_0589: {
                    if (!Class4609.method13708(class5746)) {
                        if (this.field15715.method10285(this.field15714)) {
                            if (this.field15719 <= 0) {
                                final Class9301 method13701 = Class4609.method13705(class5746, false);
                                this.field15710 = method13701;
                                final float[] method13702 = Class4609.method13695();
                                if (method13701 != null) {
                                    if (method13702 != null) {
                                        this.field15709 = method13702[0];
                                        this.field15708 = method13702[1];
                                    }
                                }
                                break Label_0589;
                            }
                        }
                    }
                    this.field15710 = null;
                }
                if (this.field15709 != 999.0f) {
                    updateWalkingEvent.method17043(this.field15709);
                    updateWalkingEvent.method17041(this.field15708);
                }
                if (HypixelBlockFly.mc.player.rotationYaw != updateWalkingEvent.method17042()) {
                    if (HypixelBlockFly.mc.player.rotationPitch != updateWalkingEvent.method17040()) {
                        this.field15712 = 0;
                    }
                }
            }
        }
    }
    
    @EventListener
    @HigherPriority
    public void method10210(final Class5717 class5717) {
        if (!this.isEnabled() || this.field15715.method10281() == 0) {
            return;
        }
        if (HypixelBlockFly.mc.player.onGround || AllUtils.method19160(HypixelBlockFly.mc.player, 0.01f)) {
            this.field15718 = HypixelBlockFly.mc.player.posY;
        }
        if (this.method9914().getBooleanValueFromSettingName("No Sprint")) {
            HypixelBlockFly.mc.player.method1816(false);
        }
        if (HypixelBlockFly.mc.player.onGround) {
            this.field15713 = 0;
        }
        else if (this.field15713 >= 0) {
            ++this.field15713;
        }
        if (this.field15715 == null) {
            this.field15715 = (BlockFly)this.method9914();
        }
        final String method9887 = this.getStringSettingValueByName("Speed Mode");
        switch (method9887) {
            case "Jump": {
                if (HypixelBlockFly.mc.player.onGround && AllUtils.method19114() && !HypixelBlockFly.mc.player.method1809() && !this.field15716) {
                    this.field15717 = false;
                    HypixelBlockFly.mc.player.method2725();
                    ((Speed) Client.getInstance().moduleManager().getModuleByClass(Speed.class)).method10269();
                    this.field15717 = true;
                    class5717.method16975(HypixelBlockFly.mc.player.getMotion().y);
                    class5717.method16973(HypixelBlockFly.mc.player.getMotion().x);
                    class5717.method16977(HypixelBlockFly.mc.player.getMotion().z);
                    break;
                }
                break;
            }
            case "AAC": {
                if (this.field15712 == 0 && HypixelBlockFly.mc.player.onGround) {
                    MovementUtil.method23149(class5717, MovementUtil.method23136() * 0.82);
                    break;
                }
                break;
            }
            case "Cubecraft": {
                double n2 = 0.2;
                final float method9888 = this.method10217(MathHelper.method35668(HypixelBlockFly.mc.player.rotationYaw));
                if (HypixelBlockFly.mc.gameSettings.field23439.method1056()) {
                    HypixelBlockFly.mc.timer.timerSpeed = 1.0f;
                }
                else if (HypixelBlockFly.mc.player.onGround) {
                    if (AllUtils.method19114() && !HypixelBlockFly.mc.player.method1809() && !this.field15716) {
                        class5717.method16975(1.00000000000001);
                    }
                }
                else if (this.field15713 == 1) {
                    if (class5717.method16974() <= 0.9) {
                        this.field15713 = -1;
                    }
                    else {
                        class5717.method16975(0.122);
                        HypixelBlockFly.mc.timer.timerSpeed = 0.7f;
                        n2 = 2.4;
                    }
                }
                else if (this.field15713 == 2) {
                    if (class5717.method16974() > 0.05) {
                        this.field15713 = -1;
                    }
                    else {
                        HypixelBlockFly.mc.timer.timerSpeed = 0.7f;
                        n2 = 0.28;
                    }
                }
                else if (this.field15713 == 3) {
                    HypixelBlockFly.mc.timer.timerSpeed = 0.3f;
                    n2 = 2.4;
                }
                else if (this.field15713 == 4) {
                    n2 = 0.28;
                    HypixelBlockFly.mc.timer.timerSpeed = 1.0f;
                }
                else if (this.field15713 == 6) {
                    class5717.method16975(-1.023456987345906);
                }
                if (!AllUtils.method19114()) {
                    n2 = 0.0;
                }
                if (HypixelBlockFly.mc.player.fallDistance < 1.0f) {
                    MovementUtil.method23153(class5717, n2, method9888, method9888, 360.0f);
                }
                AllUtils.method19155(class5717.method16974());
                break;
            }
            case "Slow": {
                if (HypixelBlockFly.mc.player.onGround) {
                    class5717.method16973(class5717.method16972() * 0.75);
                    class5717.method16977(class5717.method16976() * 0.75);
                    break;
                }
                class5717.method16973(class5717.method16972() * 0.93);
                class5717.method16977(class5717.method16976() * 0.93);
                break;
            }
            case "Sneak": {
                if (HypixelBlockFly.mc.player.onGround) {
                    class5717.method16973(class5717.method16972() * 0.65);
                    class5717.method16977(class5717.method16976() * 0.65);
                    break;
                }
                class5717.method16973(class5717.method16972() * 0.85);
                class5717.method16977(class5717.method16976() * 0.85);
                break;
            }
        }
        this.field15715.method10287(class5717);
    }
    
    @EventListener
    @LowerPriority
    public void method10211(final Class5721 class5721) {
        if (this.isEnabled() && HypixelBlockFly.mc.player != null) {
            if (class5721.method16990() instanceof Class4321) {
                if (((BlockFly)this.method9914()).field15750 >= 0) {
                    class5721.setCancelled(true);
                }
            }
        }
    }
    
    @EventListener
    public void method10212(final Class5722 class5722) {
        if (this.isEnabled() && this.field15717) {
            if (this.method9914().getStringSettingValueByName("Tower Mode").equalsIgnoreCase("Cubecraft")) {
                if (!AllUtils.method19114() || this.method9914().getBooleanValueFromSettingName("Tower while moving")) {
                    class5722.setCancelled(true);
                }
            }
        }
    }
    
    @EventListener
    public void method10213(final Class5741 class5741) {
        if (this.isEnabled()) {
            if (this.getStringSettingValueByName("Speed Mode").equals("Cubecraft")) {
                if (this.field15713 >= 0) {
                    if (HypixelBlockFly.mc.player.fallDistance > 1.2f) {
                        return;
                    }
                    if (HypixelBlockFly.mc.player.field3019 < this.field15718) {
                        return;
                    }
                    if (!HypixelBlockFly.mc.player.field2967) {
                        HypixelBlockFly.mc.player.posY = this.field15718;
                        HypixelBlockFly.mc.player.lastTickPosY = this.field15718;
                        HypixelBlockFly.mc.player.field3019 = this.field15718;
                        HypixelBlockFly.mc.player.prevPosY = this.field15718;
                        if (MovementUtil.isMoving()) {
                            HypixelBlockFly.mc.player.field3013 = 0.099999994f;
                        }
                    }
                }
            }
        }
    }
    
    public double[] method10214() {
        final double field2395 = HypixelBlockFly.mc.player.posX;
        final double field2396 = HypixelBlockFly.mc.player.posZ;
        final double n = HypixelBlockFly.mc.player.field4085.field24722;
        final double n2 = HypixelBlockFly.mc.player.field4085.field24721;
        final float field2397 = HypixelBlockFly.mc.player.rotationYaw;
        BlockPos class354 = new BlockPos(field2395, HypixelBlockFly.mc.player.posY - 1.0, field2396);
        double n3 = field2395;
        double n4 = field2396;
        double n5 = 0.0;
        final double n6 = this.getNumberSettingValueByName("Extend") * 2.0f;
        while (Class4609.method13708(class354)) {
            final double n7 = field2395;
            final double n8 = field2396;
            ++n5;
            if (n5 > n6) {
                n5 = n6;
            }
            n3 = n7 + (n * 0.45 * Math.cos(Math.toRadians(field2397 + 90.0f)) + n2 * 0.45 * Math.sin(Math.toRadians(field2397 + 90.0f))) * n5;
            n4 = n8 + (n * 0.45 * Math.sin(Math.toRadians(field2397 + 90.0f)) - n2 * 0.45 * Math.cos(Math.toRadians(field2397 + 90.0f))) * n5;
            if (n5 == n6) {
                break;
            }
            class354 = new BlockPos(n3, HypixelBlockFly.mc.player.posY - 1.0, n4);
        }
        return new double[] { n3, n4 };
    }
    
    public static Vec3d method10215(final BlockPos class354, final Direction class355) {
        final double n = class354.getX() + 0.5;
        final double n2 = class354.getY() + 0.5;
        final double n3 = class354.getZ() + 0.5;
        double n4 = n + class355.getXOffset() / 2.0;
        double n5 = n3 + class355.getZOffset() / 2.0;
        double n6 = n2 + class355.getYOffset() / 2.0;
        final double n7 = 0.2;
        if (class355 != Direction.UP && class355 != Direction.DOWN) {
            n6 += method10216(n7, -n7);
        }
        else {
            n4 += method10216(n7, -n7);
            n5 += method10216(n7, -n7);
        }
        if (class355 == Direction.WEST || class355 == Direction.EAST) {
            n5 += method10216(n7, -n7);
        }
        if (class355 == Direction.SOUTH || class355 == Direction.NORTH) {
            n4 += method10216(n7, -n7);
        }
        return new Vec3d(n4, n6, n5);
    }
    
    public static double method10216(final double n, final double n2) {
        return Math.random() * (n - n2) + n2;
    }
    
    public float method10217(float n) {
        float n2 = 0.0f;
        final float field2968 = HypixelBlockFly.mc.player.field2968;
        final float field2969 = HypixelBlockFly.mc.player.field2970;
        if (field2968 <= 0.0f) {
            if (field2968 < 0.0f) {
                if (field2969 <= 0.0f) {
                    if (field2969 >= 0.0f) {
                        n += 90.0f;
                    }
                    else {
                        n -= 45.0f;
                    }
                }
                else {
                    n += 45.0f;
                }
            }
        }
        else if (field2969 <= 0.0f) {
            if (field2969 >= 0.0f) {
                n -= 90.0f;
            }
            else {
                n += 45.0f;
            }
        }
        else {
            n -= 45.0f;
        }
        if (n >= 45.0f && n <= 135.0f) {
            n2 = 90.0f;
        }
        else if (n < 135.0f && n > -135.0f) {
            if (n <= -45.0f && n >= -135.0f) {
                n2 = -90.0f;
            }
            else if (n >= -45.0f) {
                if (n <= 45.0f) {
                    n2 = 0.0f;
                }
            }
        }
        else {
            n2 = 180.0f;
        }
        if (field2969 < 0.0f) {
            n2 -= 180.0f;
        }
        return n2 + 90.0f;
    }
}
