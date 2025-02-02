// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap;
import java.util.function.Predicate;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Optional;

import com.mentalfrostbyte.Client;
import com.mojang.datafixers.util.Either;

import java.util.OptionalInt;
import javax.annotation.Nullable;
import java.util.List;
import com.mojang.authlib.GameProfile;
import net.minecraft.entity.*;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.Map;

public abstract class PlayerEntity extends LivingEntity
{
    public static final EntitySize field2997;
    private static final Map<Pose, EntitySize> field2998;
    private static final DataParameter<Float> field2999;
    private static final DataParameter<Integer> field3000;
    public static final DataParameter<Byte> field3001;
    public static final DataParameter<Byte> field3002;
    public static final DataParameter<CompoundNBT> field3003;
    public static final DataParameter<CompoundNBT> field3004;
    private long timeEntitySatOnShoulder;
    public Class464 inventory;
    public Class485 field3007;
    public final Class3427 container;
    public Class3418 field3009;
    public Class9173 field3010;
    public int field3011;
    public float field3012;
    public float field3013;
    public int field3014;
    public double field3015;
    public double field3016;
    public double field3017;
    public double field3018;
    public double field3019;
    public double field3020;
    private int field3021;
    public boolean field3022;
    private BlockPos field3023;
    private boolean field3024;
    public final Class6999 field3025;
    public int field3026;
    public int field3027;
    public float field3028;
    public int field3029;
    public final float field3030 = 0.02f;
    private int field3031;
    private final GameProfile field3032;
    private boolean field3033;
    private ItemStack field3034;
    private final Class7948 field3035;
    public Class425 field3036;
    
    public PlayerEntity(final World class1847, final GameProfile field3032) {
        super(EntityType.field29058, class1847);
        this.inventory = new Class464(this);
        this.field3007 = new Class485();
        this.field3010 = new Class9173();
        this.field3025 = new Class6999();
        this.field3034 = ItemStack.EMPTY;
        this.field3035 = this.method2809();
        this.method1864(method2893(field3032));
        this.field3032 = field3032;
        this.container = new Class3427(this.inventory, !class1847.isRemote, this);
        this.field3009 = this.container;
        final BlockPos method6758 = class1847.method6758();
        this.method1730(method6758.getX() + 0.5, method6758.getY() + 1, method6758.getZ() + 0.5, 0.0f, 0.0f);
        this.field2964 = 180.0f;
    }
    
    public boolean method2803(final World class1847, final BlockPos class1848, final Class101 class1849) {
        if (!class1849.method589()) {
            return false;
        }
        if (class1849 == Class101.field301) {
            return true;
        }
        if (!this.method2880()) {
            final ItemStack method2713 = this.getHeldItemMainhand();
            return method2713.method27620() || !method2713.method27686(class1847.method6793(), new Class7990(class1847, class1848, false));
        }
        return false;
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2711().method20873(Class8107.field33410).method23941(1.0);
        this.method2710(Class8107.field33408).method23941(0.10000000149011612);
        this.method2711().method20873(Class8107.field33412);
        this.method2711().method20873(Class8107.field33415);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(PlayerEntity.field2999, 0.0f);
        this.dataManager.register(PlayerEntity.field3000, 0);
        this.dataManager.register(PlayerEntity.field3001, (Byte)0);
        this.dataManager.register(PlayerEntity.field3002, (Byte)1);
        this.dataManager.register(PlayerEntity.field3003, new CompoundNBT());
        this.dataManager.register(PlayerEntity.field3004, new CompoundNBT());
    }
    
    @Override
    public void method1659() {
        this.noClip = this.isSpectator();
        if (this.isSpectator()) {
            this.onGround = false;
        }
        if (this.field3014 > 0) {
            --this.field3014;
        }
        if (!this.method2783()) {
            if (this.field3021 > 0) {
                ++this.field3021;
                if (this.field3021 >= 110) {
                    this.field3021 = 0;
                }
            }
        }
        else {
            ++this.field3021;
            if (this.field3021 > 100) {
                this.field3021 = 100;
            }
            if (!this.world.isRemote) {
                if (this.world.method6703()) {
                    this.method2849(false, true);
                }
            }
        }
        this.method2807();
        super.method1659();
        if (!this.world.isRemote) {
            if (this.field3009 != null) {
                if (!this.field3009.method10854(this)) {
                    this.method2814();
                    this.field3009 = this.container;
                }
            }
        }
        if (this.method1804()) {
            if (this.field3025.field27301) {
                this.method1667();
            }
        }
        this.method2810();
        if (!this.world.isRemote) {
            this.field3010.method33488(this);
            this.method2857(Class8276.field33989);
            if (this.method1768()) {
                this.method2857(Class8276.field33990);
            }
            if (this.method1812()) {
                this.method2857(Class8276.field33992);
            }
            if (!this.method2783()) {
                this.method2857(Class8276.field33991);
            }
        }
        final double method35654 = MathHelper.clamp(this.getPosX(), -2.9999999E7, 2.9999999E7);
        final double method35655 = MathHelper.clamp(this.getPosZ(), -2.9999999E7, 2.9999999E7);
        if (method35654 != this.getPosX() || method35655 != this.getPosZ()) {
            this.setPosition(method35654, this.getPosY(), method35655);
        }
        ++this.field2944;
        final ItemStack method35656 = this.getHeldItemMainhand();
        if (!ItemStack.method27643(this.field3034, method35656)) {
            if (!ItemStack.method27646(this.field3034, method35656)) {
                this.method2905();
            }
            this.field3034 = method35656.method27641();
        }
        this.method2808();
        this.field3035.method25771();
        this.method2811();
    }
    
    public boolean method2804() {
        return this.method1809();
    }
    
    public boolean method2805() {
        return this.method1809();
    }
    
    public boolean method2806() {
        return this.method1809();
    }
    
    public boolean method2807() {
        return this.field3022 = this.method1721(Class7324.field28319, true);
    }
    
    private void method2808() {
        if (this.method2718(Class2215.field13605).getItem() == Items.field31272) {
            if (!this.method1720(Class7324.field28319)) {
                this.method2655(new Class1948(Class9439.field40486, 200, 0, false, false, true));
            }
        }
    }
    
    public Class7948 method2809() {
        return new Class7948();
    }
    
    private void method2810() {
        this.field3015 = this.field3018;
        this.field3016 = this.field3019;
        this.field3017 = this.field3020;
        final double n = this.getPosX() - this.field3018;
        final double n2 = this.getPosY() - this.field3019;
        final double n3 = this.getPosZ() - this.field3020;
        if (n > 10.0) {
            this.field3018 = this.getPosX();
            this.field3015 = this.field3018;
        }
        if (n3 > 10.0) {
            this.field3020 = this.getPosZ();
            this.field3017 = this.field3020;
        }
        if (n2 > 10.0) {
            this.field3019 = this.getPosY();
            this.field3016 = this.field3019;
        }
        if (n < -10.0) {
            this.field3018 = this.getPosX();
            this.field3015 = this.field3018;
        }
        if (n3 < -10.0) {
            this.field3020 = this.getPosZ();
            this.field3017 = this.field3020;
        }
        if (n2 < -10.0) {
            this.field3019 = this.getPosY();
            this.field3016 = this.field3019;
        }
        this.field3018 += n * 0.25;
        this.field3020 += n3 * 0.25;
        this.field3019 += n2 * 0.25;
    }
    
    public void method2811() {
        if (this.method1782(Pose.field1666)) {
            Pose class290;
            if (!this.method2773()) {
                if (!this.method2783()) {
                    if (!this.method1817()) {
                        if (!this.method2744()) {
                            if (this.method1809() && !this.field3025.field27302) {
                                class290 = Pose.field1668;
                            }
                            else {
                                class290 = Pose.field1663;
                            }
                        }
                        else {
                            class290 = Pose.field1667;
                        }
                    }
                    else {
                        class290 = Pose.field1666;
                    }
                }
                else {
                    class290 = Pose.field1665;
                }
            }
            else {
                class290 = Pose.field1664;
            }
            Pose class291 = null;
            Label_0166: {
                if (!this.isSpectator()) {
                    if (!this.isPassenger()) {
                        if (!this.method1782(class290)) {
                            if (!this.method1782(Pose.field1668)) {
                                class291 = Pose.field1666;
                                break Label_0166;
                            }
                            class291 = Pose.field1668;
                            break Label_0166;
                        }
                    }
                }
                class291 = class290;
            }
            this.method1653(class291);
        }
    }
    
    @Override
    public int method1662() {
        return this.field3025.field27301 ? 1 : 80;
    }
    
    @Override
    public Class7795 method1686() {
        return Class8520.field35489;
    }
    
    @Override
    public Class7795 method1687() {
        return Class8520.field35487;
    }
    
    @Override
    public Class7795 method1688() {
        return Class8520.field35488;
    }
    
    @Override
    public int method1796() {
        return 10;
    }
    
    @Override
    public void method1695(final Class7795 class7795, final float n, final float n2) {
        this.world.method6706(this, this.getPosX(), this.getPosY(), this.getPosZ(), class7795, this.method1922(), n, n2);
    }
    
    public void method2812(final Class7795 class7795, final Class286 class7796, final float n, final float n2) {
    }
    
    @Override
    public Class286 method1922() {
        return Class286.field1585;
    }
    
    @Override
    public int method1923() {
        return 20;
    }
    
    @Override
    public void method1798(final byte b) {
        if (b != 9) {
            if (b != 23) {
                if (b != 22) {
                    if (b != 43) {
                        super.method1798(b);
                    }
                    else {
                        this.method2813(Class8432.field34602);
                    }
                }
                else {
                    this.field3033 = true;
                }
            }
            else {
                this.field3033 = false;
            }
        }
        else {
            this.method2765();
        }
    }
    
    private void method2813(final IParticleData IParticleData) {
        for (int i = 0; i < 5; ++i) {
            this.world.method6709(IParticleData, this.method1940(1.0), this.method1943() + 1.0, this.method1947(1.0), this.rand.nextGaussian() * 0.02, this.rand.nextGaussian() * 0.02, this.rand.nextGaussian() * 0.02);
        }
    }
    
    public void method2814() {
        this.field3009 = this.container;
    }
    
    @Override
    public void method1772() {
        if (!this.world.isRemote) {
            if (this.method2805()) {
                if (this.isPassenger()) {
                    this.stopRiding();
                    this.method1808(false);
                    return;
                }
            }
        }
        final double method1938 = this.getPosX();
        final double method1939 = this.getPosY();
        final double method1940 = this.getPosZ();
        final float field2399 = this.rotationYaw;
        final float field2400 = this.rotationPitch;
        super.method1772();
        this.field3012 = this.field3013;
        this.field3013 = 0.0f;
        this.method2867(this.getPosX() - method1938, this.getPosY() - method1939, this.getPosZ() - method1940);
        if (this.method1920() instanceof Class801) {
            this.rotationPitch = field2400;
            this.rotationYaw = field2399;
            this.field2951 = ((Class801)this.method1920()).field2951;
        }
    }
    
    @Override
    public void method1651() {
        this.method1653(Pose.field1663);
        super.method1651();
        this.method2665(this.method2701());
        this.field2941 = 0;
    }
    
    @Override
    public void method2738() {
        super.method2738();
        this.method2709();
        this.field2953 = this.rotationYaw;
    }
    
    @Override
    public void method2736() {
        if (this.field3011 > 0) {
            --this.field3011;
        }
        if (this.world.method6954() == Class2113.field12290) {
            if (this.world.method6765().method31216(Class8878.field37323)) {
                if (this.method2664() < this.method2701()) {
                    if (this.ticksExisted % 20 == 0) {
                        this.method2663(1.0f);
                    }
                }
                if (this.field3010.method33492()) {
                    if (this.ticksExisted % 10 == 0) {
                        this.field3010.method33495(this.field3010.method33491() + 1);
                    }
                }
            }
        }
        this.inventory.method2361();
        this.field3012 = this.field3013;
        super.method2736();
        final Class7619 method2710 = this.method2710(Class8107.field33408);
        if (!this.world.isRemote) {
            method2710.method23941(this.field3025.method21427());
        }
        this.field2955 = 0.02f;
        if (this.method1815()) {
            this.field2955 += (float)0.005999999865889549;
        }
        this.method2733((float)method2710.method23950());
        float min = 0.0f;
        Label_0290: {
            if (this.onGround) {
                if (this.method2664() > 0.0f) {
                    if (!this.method1817()) {
                        min = Math.min(0.1f, MathHelper.sqrt(Entity.horizontalMag(this.getMotion())));
                        break Label_0290;
                    }
                }
            }
            min = 0.0f;
        }
        this.field3013 += (min - this.field3013) * 0.4f;
        if (this.method2664() > 0.0f) {
            if (!this.isSpectator()) {
                AxisAlignedBB class6221;
                if (this.isPassenger() && !this.method1920().removed) {
                    class6221 = this.getBoundingBox().offset(this.method1920().getBoundingBox()).grow(1.0, 0.0, 1.0);
                }
                else {
                    class6221 = this.getBoundingBox().grow(1.0, 0.5, 1.0);
                }
                final List<Entity> method2711 = this.world.method7127(this, class6221);
                for (int i = 0; i < method2711.size(); ++i) {
                    final Entity class6222 = method2711.get(i);
                    if (!class6222.removed) {
                        this.method2816(class6222);
                    }
                }
            }
        }
        this.method2815(this.method2899());
        this.method2815(this.method2901());
        Label_0355: {
            if (!this.world.isRemote) {
                if (this.fallDistance > 0.5f) {
                    break Label_0355;
                }
                if (this.method1706()) {
                    break Label_0355;
                }
            }
            if (!this.field3025.field27302) {
                if (!this.method2783()) {
                    return;
                }
            }
        }
        this.method2887();
    }
    
    private void method2815(final CompoundNBT class51) {
        if ((class51 != null && !class51.contains("Silent")) || !class51.getBoolean("Silent")) {
            EntityType.method23355(class51.getString("id")).filter(class52 -> class52 == EntityType.field29011).ifPresent(p0 -> Class796.method4498(this.world, this));
        }
    }
    
    private void method2816(final Entity class399) {
        class399.method1736(this);
    }
    
    public int method2817() {
        return this.dataManager.get(PlayerEntity.field3000);
    }
    
    public void method2818(final int i) {
        this.dataManager.set(PlayerEntity.field3000, i);
    }
    
    public void method2819(final int n) {
        this.dataManager.set(PlayerEntity.field3000, this.method2817() + n);
    }
    
    @Override
    public void method2673(final DamageSource class7929) {
        super.method2673(class7929);
        this.method1657();
        if (!this.isSpectator()) {
            this.method2675(class7929);
        }
        if (class7929 == null) {
            this.setMotion(0.0, 0.1, 0.0);
        }
        else {
            this.setMotion(-MathHelper.cos((this.field2940 + this.rotationYaw) * 0.017453292f) * 0.1f, 0.10000000149011612, -MathHelper.sin((this.field2940 + this.rotationYaw) * 0.017453292f) * 0.1f);
        }
        this.method2857(Class8276.field34016);
        this.method2861(Class8276.field33987.method8449(Class8276.field33990));
        this.method2861(Class8276.field33987.method8449(Class8276.field33991));
        this.method1667();
        this.setFlag(0, false);
    }
    
    @Override
    public void method2676() {
        super.method2676();
        if (!this.world.method6765().method31216(Class8878.field37317)) {
            this.method2820();
            this.inventory.method2372();
        }
    }
    
    public void method2820() {
        for (int i = 0; i < this.inventory.getSizeInventory(); ++i) {
            final ItemStack method2157 = this.inventory.getStackInSlot(i);
            if (!method2157.method27620()) {
                if (Class8742.method30218(method2157)) {
                    this.inventory.method2159(i);
                }
            }
        }
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        if (class7929 == DamageSource.field32564) {
            return Class8520.field35483;
        }
        if (class7929 != DamageSource.field32569) {
            return (class7929 != DamageSource.field32583) ? Class8520.field35481 : Class8520.field35484;
        }
        return Class8520.field35482;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35480;
    }
    
    public boolean method2821(final boolean b) {
        return this.method2823(this.inventory.method2158(this.inventory.field2743, (b && !this.inventory.method2345().method27620()) ? this.inventory.method2345().method27690() : 1), false, true) != null;
    }
    
    @Nullable
    public Class427 method2822(final ItemStack class8321, final boolean b) {
        return this.method2823(class8321, false, b);
    }
    
    @Nullable
    public Class427 method2823(final ItemStack class8321, final boolean b, final boolean b2) {
        if (!class8321.method27620()) {
            final Class427 class8322 = new Class427(this.world, this.getPosX(), this.method1944() - 0.30000001192092896, this.getPosZ(), class8321);
            class8322.method2117(40);
            if (b2) {
                class8322.method2112(this.method1865());
            }
            if (!b) {
                final float method35638 = MathHelper.sin(this.rotationPitch * 0.017453292f);
                final float method35639 = MathHelper.cos(this.rotationPitch * 0.017453292f);
                final float method35640 = MathHelper.sin(this.rotationYaw * 0.017453292f);
                final float method35641 = MathHelper.cos(this.rotationYaw * 0.017453292f);
                final float n = this.rand.nextFloat() * 6.2831855f;
                final float n2 = 0.02f * this.rand.nextFloat();
                class8322.setMotion(-method35640 * method35639 * 0.3f + Math.cos(n) * n2, -method35638 * 0.3f + 0.1f + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.1f, method35641 * method35639 * 0.3f + Math.sin(n) * n2);
            }
            else {
                final float n3 = this.rand.nextFloat() * 0.5f;
                final float n4 = this.rand.nextFloat() * 6.2831855f;
                class8322.setMotion(-MathHelper.sin(n4) * n3, 0.20000000298023224, MathHelper.cos(n4) * n3);
            }
            return class8322;
        }
        return null;
    }
    
    public float method2824(final Class7096 class7096) {
        float method2366 = this.inventory.method2366(class7096);
        if (method2366 > 1.0f) {
            final int method2367 = Class8742.method30211(this);
            final ItemStack method2368 = this.getHeldItemMainhand();
            if (method2367 > 0 && !method2368.method27620()) {
                method2366 += method2367 * method2367 + 1;
            }
        }
        if (Class9434.method35058(this)) {
            method2366 *= 1.0f + (Class9434.method35059(this) + 1) * 0.2f;
        }
        if (this.method2653(Class9439.field40477)) {
            float n = 0.0f;
            switch (this.method2654(Class9439.field40477).method7908()) {
                case 0: {
                    n = 0.3f;
                    break;
                }
                case 1: {
                    n = 0.09f;
                    break;
                }
                case 2: {
                    n = 0.0027f;
                    break;
                }
                default: {
                    n = 8.1E-4f;
                    break;
                }
            }
            method2366 *= n;
        }
        if (this.method1720(Class7324.field28319) && !Class8742.method30215(this)) {
            method2366 /= 5.0f;
        }
        if (!this.onGround) {
            method2366 /= 5.0f;
        }
        return method2366;
    }
    
    public boolean method2825(final Class7096 class7096) {
        return class7096.method21697().method26444() || this.inventory.method2369(class7096);
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        this.method1864(method2893(this.field3032));
        this.inventory.method2368(class51.getList("Inventory", 10));
        this.inventory.field2743 = class51.getInt("SelectedItemSlot");
        this.field3021 = class51.getShort("SleepTimer");
        this.field3028 = class51.getFloat("XpP");
        this.field3026 = class51.getInt("XpLevel");
        this.field3027 = class51.getInt("XpTotal");
        this.field3029 = class51.getInt("XpSeed");
        if (this.field3029 == 0) {
            this.field3029 = this.rand.nextInt();
        }
        this.method2818(class51.getInt("Score"));
        if (class51.contains("SpawnX", 99)) {
            if (class51.contains("SpawnY", 99)) {
                if (class51.contains("SpawnZ", 99)) {
                    this.field3023 = new BlockPos(class51.getInt("SpawnX"), class51.getInt("SpawnY"), class51.getInt("SpawnZ"));
                    this.field3024 = class51.getBoolean("SpawnForced");
                }
            }
        }
        this.field3010.method33489(class51);
        this.field3025.method21424(class51);
        if (class51.contains("EnderItems", 9)) {
            this.field3007.method2430(class51.getList("EnderItems", 10));
        }
        if (class51.contains("ShoulderEntityLeft", 10)) {
            this.method2900(class51.getCompound("ShoulderEntityLeft"));
        }
        if (class51.contains("ShoulderEntityRight", 10)) {
            this.method2902(class51.getCompound("ShoulderEntityRight"));
        }
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        class51.putInt("DataVersion", Class9528.method35579().getWorldVersion());
        class51.put("Inventory", this.inventory.method2367(new ListNBT()));
        class51.putInt("SelectedItemSlot", this.inventory.field2743);
        class51.putShort("SleepTimer", (short)this.field3021);
        class51.putFloat("XpP", this.field3028);
        class51.putInt("XpLevel", this.field3026);
        class51.putInt("XpTotal", this.field3027);
        class51.putInt("XpSeed", this.field3029);
        class51.putInt("Score", this.method2817());
        if (this.field3023 != null) {
            class51.putInt("SpawnX", this.field3023.getX());
            class51.putInt("SpawnY", this.field3023.getY());
            class51.putInt("SpawnZ", this.field3023.getZ());
            class51.putBoolean("SpawnForced", this.field3024);
        }
        this.field3010.method33490(class51);
        this.field3025.method21423(class51);
        class51.put("EnderItems", this.field3007.method2431());
        if (!this.method2899().method331()) {
            class51.put("ShoulderEntityLeft", this.method2899());
        }
        if (!this.method2901().method331()) {
            class51.put("ShoulderEntityRight", this.method2901());
        }
    }
    
    @Override
    public boolean method1849(final DamageSource class7929) {
        if (super.method1849(class7929)) {
            return true;
        }
        if (class7929 == DamageSource.field32569) {
            return !this.world.method6765().method31216(Class8878.field37341);
        }
        if (class7929 != DamageSource.field32572) {
            return class7929.method25719() && !this.world.method6765().method31216(Class8878.field37343);
        }
        return !this.world.method6765().method31216(Class8878.field37342);
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, float min) {
        if (this.method1849(class7929)) {
            return false;
        }
        if (this.field3025.field27301 && !class7929.method25711()) {
            return false;
        }
        this.field2959 = 0;
        if (this.method2664() > 0.0f) {
            this.method2887();
            if (class7929.method25722()) {
                if (this.world.method6954() == Class2113.field12290) {
                    min = 0.0f;
                }
                if (this.world.method6954() == Class2113.field12291) {
                    min = Math.min(min / 2.0f + 1.0f, min);
                }
                if (this.world.method6954() == Class2113.field12293) {
                    min = min * 3.0f / 2.0f;
                }
            }
            return min != 0.0f && super.attackEntityFrom(class7929, min);
        }
        return false;
    }
    
    @Override
    public void method2666(final LivingEntity class511) {
        super.method2666(class511);
        if (class511.getHeldItemMainhand().getItem() instanceof Class4075) {
            this.method2838(true);
        }
    }
    
    public boolean method2826(final PlayerEntity playerEntity) {
        final Team method1825 = this.getTeam();
        final Team method1826 = playerEntity.getTeam();
        return method1825 == null || !method1825.method20565(method1826) || method1825.method20550();
    }
    
    @Override
    public void method2694(final float n) {
        this.inventory.method2371(n);
    }
    
    @Override
    public void method2695(final float n) {
        if (n >= 3.0f) {
            if (this.field2987.getItem() == Items.field31583) {
                final int n2 = 1 + MathHelper.method35642(n);
                final Class316 method2757 = this.method2757();
                this.field2987.method27636(n2, this, class317 -> class317.method2795(class316));
                if (this.field2987.method27620()) {
                    if (method2757 != Class316.field1877) {
                        this.method1803(Class2215.field13601, ItemStack.EMPTY);
                    }
                    else {
                        this.method1803(Class2215.field13600, ItemStack.EMPTY);
                    }
                    this.field2987 = ItemStack.EMPTY;
                    this.method1695(Class8520.field35546, 0.8f, 0.8f + this.world.rand.nextFloat() * 0.4f);
                }
            }
        }
    }
    
    @Override
    public void method2698(final DamageSource class7929, float n) {
        if (!this.method1849(class7929)) {
            n = this.method2696(class7929, n);
            n = this.method2697(class7929, n);
            final float max = Math.max(n - this.method2750(), 0.0f);
            this.method2751(this.method2750() - (n - max));
            final float n2 = n - max;
            if (n2 > 0.0f) {
                if (n2 < 3.4028235E37f) {
                    this.method2858(Class8276.field34014, Math.round(n2 * 10.0f));
                }
            }
            if (max != 0.0f) {
                this.method2876(class7929.method25710());
                final float method2664 = this.method2664();
                this.method2665(this.method2664() - max);
                this.method2699().method35594(class7929, method2664, max);
                if (max < 3.4028235E37f) {
                    this.method2858(Class8276.field34012, Math.round(max * 10.0f));
                }
            }
        }
    }
    
    public void method2827(final Class497 class497) {
    }
    
    public void method2828(final Class865 class865) {
    }
    
    public void method2829(final Class500 class500) {
    }
    
    public void method2830(final Class501 class501) {
    }
    
    public void method2831(final Class498 class498) {
    }
    
    public void method2832(final Class806 class806, final IInventory class807) {
    }
    
    public OptionalInt method2833(final INamedContainerProvider INamedContainerProvider) {
        return OptionalInt.empty();
    }
    
    public void method2834(final int n, final Class57 class57, final int n2, final int n3, final boolean b, final boolean b2) {
    }
    
    public void method2835(final ItemStack class8321, final Class316 class8322) {
    }
    
    public Class2201 method2836(final Entity class399, final Class316 class400) {
        if (this.isSpectator()) {
            if (class399 instanceof INamedContainerProvider) {
                this.method2833((INamedContainerProvider)class399);
            }
            return Class2201.field13402;
        }
        ItemStack method2715 = this.method2715(class400);
        final ItemStack method2716 = method2715.method27641();
        if (!class399.method1770(this, class400)) {
            if (!method2715.method27620()) {
                if (class399 instanceof LivingEntity) {
                    if (this.field3025.field27304) {
                        method2715 = method2716;
                    }
                    if (method2715.method27640(this, (LivingEntity)class399, class400)) {
                        if (method2715.method27620()) {
                            if (!this.field3025.field27304) {
                                this.method2716(class400, ItemStack.EMPTY);
                            }
                        }
                        return Class2201.field13400;
                    }
                }
            }
            return Class2201.field13402;
        }
        if (this.field3025.field27304) {
            if (method2715 == this.method2715(class400)) {
                if (method2715.method27690() < method2716.method27690()) {
                    method2715.method27691(method2716.method27690());
                }
            }
        }
        return Class2201.field13400;
    }
    
    @Override
    public double method1776() {
        return -0.35;
    }
    
    @Override
    public void stopRiding() {
        super.stopRiding();
        this.rideCooldown = 0;
    }
    
    @Override
    public boolean method2722() {
        return super.method2722() || this.method2783();
    }
    
    @Override
    public Vec3d method1676(Vec3d class5487, final Class2160 class5488) {
        final Class5738 class5489 = new Class5738(true);
        Client.getInstance().method35188().method21097(class5489);
        Label_0074: {
            if ((class5488 != Class2160.field12826 && class5488 != Class2160.field12827) || class5489.method17025() != Class2228.field13706) {
                if (!this.onGround) {
                    break Label_0074;
                }
                if (!this.method2806()) {
                    break Label_0074;
                }
            }
            double field22770 = class5487.x;
            double field22771 = class5487.z;
            while (field22770 != 0.0) {
                if (!this.world.method6978(this, this.getBoundingBox().offset(field22770, -this.stepHeight, 0.0))) {
                    break;
                }
                if (field22770 < 0.05 && field22770 >= -0.05) {
                    field22770 = 0.0;
                }
                else if (field22770 <= 0.0) {
                    field22770 += 0.05;
                }
                else {
                    field22770 -= 0.05;
                }
            }
            while (field22771 != 0.0) {
                if (!this.world.method6978(this, this.getBoundingBox().offset(0.0, -this.stepHeight, field22771))) {
                    break;
                }
                if (field22771 < 0.05 && field22771 >= -0.05) {
                    field22771 = 0.0;
                }
                else if (field22771 <= 0.0) {
                    field22771 += 0.05;
                }
                else {
                    field22771 -= 0.05;
                }
            }
            while (field22770 != 0.0) {
                if (field22771 == 0.0) {
                    break;
                }
                if (!this.world.method6978(this, this.getBoundingBox().offset(field22770, -this.stepHeight, field22771))) {
                    break;
                }
                if (field22770 < 0.05 && field22770 >= -0.05) {
                    field22770 = 0.0;
                }
                else if (field22770 <= 0.0) {
                    field22770 += 0.05;
                }
                else {
                    field22770 -= 0.05;
                }
                if (field22771 < 0.05 && field22771 >= -0.05) {
                    field22771 = 0.0;
                }
                else if (field22771 <= 0.0) {
                    field22771 += 0.05;
                }
                else {
                    field22771 -= 0.05;
                }
            }
            class5487 = new Vec3d(field22770, class5487.y, field22771);
        }
        Client.getInstance().method35188().method21097(new Class5738(false));
        return class5487;
    }
    
    public void method2837(final Entity class399) {
        if (class399.method1847()) {
            if (!class399.method1848(this)) {
                final float n = (float)this.method2710(Class8107.field33410).method23950();
                float n2;
                if (!(class399 instanceof LivingEntity)) {
                    n2 = Class8742.method30202(this.getHeldItemMainhand(), Class6363.field25460);
                }
                else {
                    n2 = Class8742.method30202(this.getHeldItemMainhand(), ((LivingEntity)class399).method2712());
                }
                final float method2904 = this.method2904(0.5f);
                float n3 = n * (0.2f + method2904 * method2904 * 0.8f);
                final float n4 = n2 * method2904;
                this.method2905();
                if (n3 > 0.0f || n4 > 0.0f) {
                    final boolean b = method2904 > 0.9f;
                    boolean b2 = false;
                    int n5 = 0 + Class8742.method30207(this);
                    if (this.method1815()) {
                        if (b) {
                            this.world.method6706(null, this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field35472, this.method1922(), 1.0f, 1.0f);
                            ++n5;
                            b2 = true;
                        }
                    }
                    boolean b3 = false;
                    Label_0318: {
                        if (b) {
                            if (this.fallDistance > 0.0f) {
                                if (!this.onGround) {
                                    if (!this.method2688()) {
                                        if (!this.method1706()) {
                                            if (!this.method2653(Class9439.field40488)) {
                                                if (!this.isPassenger()) {
                                                    if (class399 instanceof LivingEntity) {
                                                        b3 = true;
                                                        break Label_0318;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        b3 = false;
                    }
                    final boolean b4 = b3 && !this.method1815();
                    if (b4) {
                        n3 *= 1.5f;
                    }
                    final float n6 = n3 + n4;
                    boolean b5 = false;
                    final double n7 = this.distanceWalkedModified - this.prevDistanceWalkedModified;
                    if (b) {
                        if (!b4) {
                            if (!b2) {
                                if (this.onGround) {
                                    if (n7 < this.method2732()) {
                                        if (this.method2715(Class316.field1877).getItem() instanceof Class4077) {
                                            b5 = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    float method2905 = 0.0f;
                    int n8 = 0;
                    final int method2906 = Class8742.method30208(this);
                    if (class399 instanceof LivingEntity) {
                        method2905 = ((LivingEntity)class399).method2664();
                        if (method2906 > 0) {
                            if (!class399.method1804()) {
                                n8 = 1;
                                class399.setFire(1);
                            }
                        }
                    }
                    final Vec3d method2907 = class399.getMotion();
                    if (!class399.attackEntityFrom(DamageSource.method25695(this), n6)) {
                        this.world.method6706(null, this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field35473, this.method1922(), 1.0f, 1.0f);
                        if (n8 != 0) {
                            class399.method1667();
                        }
                    }
                    else {
                        if (n5 > 0) {
                            if (!(class399 instanceof LivingEntity)) {
                                class399.method1738(-MathHelper.sin(this.rotationYaw * 0.017453292f) * n5 * 0.5f, 0.1, MathHelper.cos(this.rotationYaw * 0.017453292f) * n5 * 0.5f);
                            }
                            else {
                                ((LivingEntity)class399).method2682(this, n5 * 0.5f, MathHelper.sin(this.rotationYaw * 0.017453292f), -MathHelper.cos(this.rotationYaw * 0.017453292f));
                            }
                            this.method1936(this.getMotion().mul(0.6, 1.0, 0.6));
                            this.method1816(false);
                        }
                        if (b5) {
                            final float n9 = 1.0f + Class8742.method30203(this) * n6;
                            for (final LivingEntity class400 : this.world.method7128((Class<? extends LivingEntity>) LivingEntity.class, class399.getBoundingBox().grow(1.0, 0.25, 1.0))) {
                                if (class400 == this) {
                                    continue;
                                }
                                if (class400 == class399) {
                                    continue;
                                }
                                if (this.method1826(class400)) {
                                    continue;
                                }
                                if (class400 instanceof Class857 && ((Class857)class400).method5166()) {
                                    continue;
                                }
                                if (this.method1734(class400) >= 9.0) {
                                    continue;
                                }
                                class400.method2682(this, 0.4f, MathHelper.sin(this.rotationYaw * 0.017453292f), -MathHelper.cos(this.rotationYaw * 0.017453292f));
                                class400.attackEntityFrom(DamageSource.method25695(this), n9);
                            }
                            this.world.method6706(null, this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field35475, this.method1922(), 1.0f, 1.0f);
                            this.method2841();
                        }
                        if (class399 instanceof Class513) {
                            if (class399.velocityChanged) {
                                ((Class513)class399).field3039.method17469(new Class4273(class399));
                                class399.velocityChanged = false;
                                class399.method1936(method2907);
                            }
                        }
                        if (b4) {
                            this.world.method6706(null, this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field35471, this.method1922(), 1.0f, 1.0f);
                            this.method2839(class399);
                        }
                        if (!b4) {
                            if (!b5) {
                                if (!b) {
                                    this.world.method6706(null, this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field35476, this.method1922(), 1.0f, 1.0f);
                                }
                                else {
                                    this.world.method6706(null, this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field35474, this.method1922(), 1.0f, 1.0f);
                                }
                            }
                        }
                        if (n4 > 0.0f) {
                            this.method2840(class399);
                        }
                        this.method2639(class399);
                        if (class399 instanceof LivingEntity) {
                            Class8742.method30204((LivingEntity)class399, this);
                        }
                        Class8742.method30205(this, class399);
                        final ItemStack method2908 = this.getHeldItemMainhand();
                        Entity field4594 = class399;
                        if (class399 instanceof Class859) {
                            field4594 = ((Class859)class399).field4594;
                        }
                        if (!this.world.isRemote) {
                            if (!method2908.method27620()) {
                                if (field4594 instanceof LivingEntity) {
                                    method2908.method27637((LivingEntity)field4594, this);
                                    if (method2908.method27620()) {
                                        this.method2716(Class316.field1877, ItemStack.EMPTY);
                                    }
                                }
                            }
                        }
                        if (class399 instanceof LivingEntity) {
                            final float n10 = method2905 - ((LivingEntity)class399).method2664();
                            this.method2858(Class8276.field34009, Math.round(n10 * 10.0f));
                            if (method2906 > 0) {
                                class399.setFire(method2906 * 4);
                            }
                            if (this.world instanceof Class1849) {
                                if (n10 > 2.0f) {
                                    ((Class1849)this.world).method6911(Class8432.field34604, class399.getPosX(), class399.method1942(0.5), class399.getPosZ(), (int)(n10 * 0.5), 0.1, 0.0, 0.1, 0.2);
                                }
                            }
                        }
                        this.method2876(0.1f);
                    }
                }
            }
        }
    }
    
    @Override
    public void method2742(final LivingEntity class511) {
        this.method2837(class511);
    }
    
    public void method2838(final boolean b) {
        float n = 0.25f + Class8742.method30211(this) * 0.05f;
        if (b) {
            n += 0.75f;
        }
        if (this.rand.nextFloat() < n) {
            this.method2906().method25772(Items.field31583, 100);
            this.method2770();
            this.world.method6761(this, (byte)30);
        }
    }
    
    public void method2839(final Entity class399) {
    }
    
    public void method2840(final Entity class399) {
    }
    
    public void method2841() {
        final double n = -MathHelper.sin(this.rotationYaw * 0.017453292f);
        final double n2 = MathHelper.cos(this.rotationYaw * 0.017453292f);
        if (this.world instanceof Class1849) {
            ((Class1849)this.world).method6911(Class8432.field34643, this.getPosX() + n, this.method1942(0.5), this.getPosZ() + n2, 0, n, 0.0, n2, 0.0);
        }
    }
    
    public void method2842() {
    }
    
    @Override
    public void method1652() {
        super.method1652();
        this.container.method10859(this);
        if (this.field3009 != null) {
            this.field3009.method10859(this);
        }
    }
    
    public boolean method2843() {
        return false;
    }
    
    public GameProfile method2844() {
        return this.field3032;
    }
    
    public Either<Class2048, Class315> method2845(final BlockPos class354) {
        final Direction class355 = this.world.getBlockState(class354).method21772((IProperty<Direction>)Class3892.field17564);
        if (!this.world.isRemote) {
            if (this.method2783() || !this.method1768()) {
                return (Either<Class2048, Class315>)Either.left((Object)Class2048.field11672);
            }
            if (!this.world.dimension.method20492()) {
                return (Either<Class2048, Class315>)Either.left((Object)Class2048.field11668);
            }
            if (this.world.method6703()) {
                this.method2856(class354, false, true);
                return (Either<Class2048, Class315>)Either.left((Object)Class2048.field11669);
            }
            if (!this.method2846(class354, class355)) {
                return (Either<Class2048, Class315>)Either.left((Object)Class2048.field11670);
            }
            if (this.method2848(class354, class355)) {
                return (Either<Class2048, Class315>)Either.left((Object)Class2048.field11671);
            }
            if (!this.method2889()) {
                final Vec3d class356 = new Vec3d(class354.getX() + 0.5, class354.getY(), class354.getZ() + 0.5);
                if (!this.world.method6739((Class<? extends Entity>)Class763.class, new AxisAlignedBB(class356.getX() - 8.0, class356.getY() - 5.0, class356.getZ() - 8.0, class356.getX() + 8.0, class356.getY() + 5.0, class356.getZ() + 8.0), class357 -> class357.method4232(this)).isEmpty()) {
                    return (Either<Class2048, Class315>)Either.left((Object)Class2048.field11673);
                }
            }
        }
        this.method2784(class354);
        this.field3021 = 0;
        if (this.world instanceof Class1849) {
            ((Class1849)this.world).method6867();
        }
        return (Either<Class2048, Class315>)Either.right((Object)Class315.field1875);
    }
    
    @Override
    public void method2784(final BlockPos class354) {
        this.method2861(Class8276.field33987.method8449(Class8276.field33991));
        this.method2856(class354, false, true);
        super.method2784(class354);
    }
    
    private boolean method2846(final BlockPos class354, final Direction class355) {
        return this.method2847(class354) || this.method2847(class354.method1149(class355.getOpposite()));
    }
    
    private boolean method2847(final BlockPos class354) {
        final Vec3d class355 = new Vec3d(class354.getX() + 0.5, class354.getY(), class354.getZ() + 0.5);
        if (Math.abs(this.getPosX() - class355.getX()) <= 3.0) {
            if (Math.abs(this.getPosY() - class355.getY()) <= 2.0) {
                if (Math.abs(this.getPosZ() - class355.getZ()) <= 3.0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean method2848(final BlockPos class354, final Direction class355) {
        final BlockPos method1137 = class354.method1137();
        return !this.method2865(method1137) || !this.method2865(method1137.method1149(class355.getOpposite()));
    }
    
    public void method2849(final boolean b, final boolean b2) {
        super.method2787();
        if (this.world instanceof Class1849) {
            if (b2) {
                ((Class1849)this.world).method6867();
            }
        }
        this.field3021 = (b ? 0 : 100);
    }
    
    @Override
    public void method2787() {
        this.method2849(true, true);
    }
    
    public static Optional<Vec3d> method2850(final Class1852 class1852, final BlockPos class1853, final boolean b) {
        final Block method21696 = class1852.getBlockState(class1853).getBlock();
        if (method21696 instanceof Class3900) {
            return Class3900.method11991(EntityType.field29058, class1852, class1853, 0);
        }
        if (b) {
            final boolean method21697 = method21696.method11854();
            final boolean method21698 = class1852.getBlockState(class1853.method1137()).getBlock().method11854();
            return (method21697 && method21698) ? Optional.of(new Vec3d(class1853.getX() + 0.5, class1853.getY() + 0.1, class1853.getZ() + 0.5)) : Optional.empty();
        }
        return Optional.empty();
    }
    
    public boolean method2851() {
        return this.method2783() && this.field3021 >= 100;
    }
    
    public int method2852() {
        return this.field3021;
    }
    
    public void method2853(final ITextComponent class2250, final boolean b) {
    }
    
    public BlockPos method2854() {
        return this.field3023;
    }
    
    public boolean method2855() {
        return this.field3024;
    }
    
    public void method2856(final BlockPos field3023, final boolean field3024, final boolean b) {
        if (field3023 == null) {
            this.field3023 = null;
            this.field3024 = false;
        }
        else {
            if (b) {
                if (!field3023.equals(this.field3023)) {
                    this.sendMessage(new Class2259("block.minecraft.bed.set_spawn", new Object[0]));
                }
            }
            this.field3023 = field3023;
            this.field3024 = field3024;
        }
    }
    
    public void method2857(final ResourceLocation class1932) {
        this.method2859(Class8276.field33987.method8449(class1932));
    }
    
    public void method2858(final ResourceLocation class1932, final int n) {
        this.method2860(Class8276.field33987.method8449(class1932), n);
    }
    
    public void method2859(final Class9455<?> class9455) {
        this.method2860(class9455, 1);
    }
    
    public void method2860(final Class9455<?> class9455, final int n) {
    }
    
    public void method2861(final Class9455<?> class9455) {
    }
    
    public int method2862(final Collection<IRecipe<?>> collection) {
        return 0;
    }
    
    public void method2863(final ResourceLocation[] array) {
    }
    
    public int method2864(final Collection<IRecipe<?>> collection) {
        return 0;
    }
    
    @Override
    public void method2725() {
        super.method2725();
        this.method2857(Class8276.field34007);
        if (!this.method1815()) {
            this.method2876(0.05f);
        }
        else {
            this.method2876(0.2f);
        }
    }
    
    @Override
    public void method2729(final Vec3d class5487) {
        final double method1938 = this.getPosX();
        final double method1939 = this.getPosY();
        final double method1940 = this.getPosZ();
        Label_0025: {
            if (this.method1817()) {
                if (!this.isPassenger()) {
                    final double field22771 = this.method1791().y;
                    final double n = (field22771 >= -0.2) ? 0.06 : 0.085;
                    if (field22771 > 0.0) {
                        if (!this.field2967) {
                            if (this.world.getBlockState(new BlockPos(this.getPosX(), this.getPosY() + 1.0 - 0.1, this.getPosZ())).method21756().method21781()) {
                                break Label_0025;
                            }
                        }
                    }
                    final Vec3d method1941 = this.getMotion();
                    this.method1936(method1941.add(0.0, (field22771 - method1941.y) * n, 0.0));
                }
            }
        }
        if (this.field3025.field27302 && !this.isPassenger()) {
            final double field22772 = this.getMotion().y;
            final float field22773 = this.field2955;
            this.field2955 = this.field3025.method21425() * (this.method1815() ? 2 : 1);
            super.method2729(class5487);
            final Vec3d method1942 = this.getMotion();
            this.setMotion(method1942.x, field22772 * 0.6, method1942.z);
            this.field2955 = field22773;
            this.fallDistance = 0.0f;
            this.setFlag(7, false);
        }
        else {
            super.method2729(class5487);
        }
        this.method2866(this.getPosX() - method1938, this.getPosY() - method1939, this.getPosZ() - method1940);
    }
    
    @Override
    public void method1714() {
        if (!this.field3025.field27302) {
            super.method1714();
        }
        else {
            this.method1820(false);
        }
    }
    
    public boolean method2865(final BlockPos class354) {
        return !this.world.getBlockState(class354).method21746(this.world, class354);
    }
    
    @Override
    public float method2732() {
        return (float)this.method2710(Class8107.field33408).method23950();
    }
    
    public void method2866(final double n, final double n2, final double n3) {
        if (!this.isPassenger()) {
            if (!this.method1817()) {
                if (!this.method1721(Class7324.field28319, true)) {
                    if (!this.method1706()) {
                        if (!this.method2688()) {
                            if (!this.onGround) {
                                if (!this.method2773()) {
                                    final int round = Math.round(MathHelper.sqrt(n * n + n3 * n3) * 100.0f);
                                    if (round > 25) {
                                        this.method2858(Class8276.field33999, round);
                                    }
                                }
                                else {
                                    this.method2858(Class8276.field34005, Math.round(MathHelper.sqrt(n * n + n2 * n2 + n3 * n3) * 100.0f));
                                }
                            }
                            else {
                                final int round2 = Math.round(MathHelper.sqrt(n * n + n3 * n3) * 100.0f);
                                if (round2 > 0) {
                                    if (!this.method1815()) {
                                        if (!this.method1814()) {
                                            this.method2858(Class8276.field33993, round2);
                                            this.method2876(0.0f * round2 * 0.01f);
                                        }
                                        else {
                                            this.method2858(Class8276.field33994, round2);
                                            this.method2876(0.0f * round2 * 0.01f);
                                        }
                                    }
                                    else {
                                        this.method2858(Class8276.field33995, round2);
                                        this.method2876(0.1f * round2 * 0.01f);
                                    }
                                }
                            }
                        }
                        else if (n2 > 0.0) {
                            this.method2858(Class8276.field33998, (int)Math.round(n2 * 100.0));
                        }
                    }
                    else {
                        final int round3 = Math.round(MathHelper.sqrt(n * n + n3 * n3) * 100.0f);
                        if (round3 > 0) {
                            this.method2858(Class8276.field33996, round3);
                            this.method2876(0.01f * round3 * 0.01f);
                        }
                    }
                }
                else {
                    final int round4 = Math.round(MathHelper.sqrt(n * n + n2 * n2 + n3 * n3) * 100.0f);
                    if (round4 > 0) {
                        this.method2858(Class8276.field34000, round4);
                        this.method2876(0.01f * round4 * 0.01f);
                    }
                }
            }
            else {
                final int round5 = Math.round(MathHelper.sqrt(n * n + n2 * n2 + n3 * n3) * 100.0f);
                if (round5 > 0) {
                    this.method2858(Class8276.field34006, round5);
                    this.method2876(0.01f * round5 * 0.01f);
                }
            }
        }
    }
    
    private void method2867(final double n, final double n2, final double n3) {
        if (this.isPassenger()) {
            final int round = Math.round(MathHelper.sqrt(n * n + n2 * n2 + n3 * n3) * 100.0f);
            if (round > 0) {
                if (!(this.method1920() instanceof Class428)) {
                    if (!(this.method1920() instanceof Class423)) {
                        if (!(this.method1920() instanceof Class801)) {
                            if (this.method1920() instanceof Class806) {
                                this.method2858(Class8276.field34004, round);
                            }
                        }
                        else {
                            this.method2858(Class8276.field34003, round);
                        }
                    }
                    else {
                        this.method2858(Class8276.field34002, round);
                    }
                }
                else {
                    this.method2858(Class8276.field34001, round);
                }
            }
        }
    }
    
    @Override
    public boolean method1705(final float n, final float n2) {
        if (!this.field3025.field27303) {
            if (n >= 2.0f) {
                this.method2858(Class8276.field33997, (int)Math.round(n * 100.0));
            }
            return super.method1705(n, n2);
        }
        return false;
    }
    
    public boolean method2868() {
        if (!this.onGround) {
            if (!this.method2773()) {
                if (!this.method1706()) {
                    final ItemStack method2718 = this.method2718(Class2215.field13604);
                    if (method2718.getItem() == Items.field31584) {
                        if (Class4080.method12285(method2718)) {
                            this.method2869();
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public void method2869() {
        this.setFlag(7, true);
    }
    
    public void method2870() {
        this.setFlag(7, true);
        this.setFlag(7, false);
    }
    
    @Override
    public void method1717() {
        if (!this.isSpectator()) {
            super.method1717();
        }
    }
    
    @Override
    public Class7795 method2685(final int n) {
        return (n <= 4) ? Class8520.field35486 : Class8520.field35477;
    }
    
    @Override
    public void onKillEntity(final LivingEntity class511) {
        this.method2859(Class8276.field33985.method8449(class511.getType()));
    }
    
    @Override
    public void method1839(final Class7096 class7096, final Vec3d class7097) {
        if (!this.field3025.field27302) {
            super.setMotionMultiplier(class7096, class7097);
        }
    }
    
    public void method2871(final int n) {
        this.method2819(n);
        this.field3028 += n / (float)this.method2875();
        this.field3027 = MathHelper.method35651(this.field3027 + n, 0, Integer.MAX_VALUE);
        while (this.field3028 < 0.0f) {
            final float n2 = this.field3028 * this.method2875();
            if (this.field3026 <= 0) {
                this.method2874(-1);
                this.field3028 = 0.0f;
            }
            else {
                this.method2874(-1);
                this.field3028 = 1.0f + n2 / this.method2875();
            }
        }
        while (this.field3028 >= 1.0f) {
            this.field3028 = (this.field3028 - 1.0f) * this.method2875();
            this.method2874(1);
            this.field3028 /= this.method2875();
        }
    }
    
    public int method2872() {
        return this.field3029;
    }
    
    public void method2873(final ItemStack class8321, final int n) {
        this.field3026 -= n;
        if (this.field3026 < 0) {
            this.field3026 = 0;
            this.field3028 = 0.0f;
            this.field3027 = 0;
        }
        this.field3029 = this.rand.nextInt();
    }
    
    public void method2874(final int n) {
        this.field3026 += n;
        if (this.field3026 < 0) {
            this.field3026 = 0;
            this.field3028 = 0.0f;
            this.field3027 = 0;
        }
        if (n > 0) {
            if (this.field3026 % 5 == 0) {
                if (this.field3031 < this.ticksExisted - 100.0f) {
                    this.world.method6706(null, this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field35485, this.method1922(), ((this.field3026 <= 30) ? (this.field3026 / 30.0f) : 1.0f) * 0.75f, 1.0f);
                    this.field3031 = this.ticksExisted;
                }
            }
        }
    }
    
    public int method2875() {
        if (this.field3026 < 30) {
            return (this.field3026 < 15) ? (7 + this.field3026 * 2) : (37 + (this.field3026 - 15) * 5);
        }
        return 112 + (this.field3026 - 30) * 9;
    }
    
    public void method2876(final float n) {
        if (!this.field3025.field27301) {
            if (!this.world.isRemote) {
                this.field3010.method33493(n);
            }
        }
    }
    
    public Class9173 method2877() {
        return this.field3010;
    }
    
    public boolean method2878(final boolean b) {
        if (!this.field3025.field27301) {
            if (!b) {
                if (!this.field3010.method33492()) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean method2879() {
        return this.method2664() > 0.0f && this.method2664() < this.method2701();
    }
    
    public boolean method2880() {
        return this.field3025.field27305;
    }
    
    public boolean method2881(final BlockPos class354, final Direction class355, final ItemStack class356) {
        return this.field3025.field27305 || class356.method27687(this.world.method6793(), new Class7990(this.world, class354.method1149(class355.getOpposite()), false));
    }
    
    @Override
    public int method2631(final PlayerEntity playerEntity) {
        if (!this.world.method6765().method31216(Class8878.field37317) && !this.isSpectator()) {
            final int n = this.field3026 * 7;
            return (n <= 100) ? n : 100;
        }
        return 0;
    }
    
    @Override
    public boolean method2632() {
        return true;
    }
    
    @Override
    public boolean method1879() {
        return true;
    }
    
    @Override
    public boolean method1700() {
        return !this.field3025.field27302 && (!this.onGround || !this.method1812());
    }
    
    public void method2882() {
    }
    
    public void method2883(final Class101 class101) {
    }
    
    @Override
    public ITextComponent getName() {
        return new StringTextComponent(this.field3032.getName());
    }
    
    public Class485 method2884() {
        return this.field3007;
    }
    
    @Override
    public ItemStack method2718(final Class2215 class2215) {
        if (class2215 == Class2215.field13600) {
            return this.inventory.method2345();
        }
        if (class2215 != Class2215.field13601) {
            return (class2215.getSlotType() != Group.field1682) ? ItemStack.EMPTY : this.inventory.field2740.get(class2215.getIndex());
        }
        return this.inventory.field2741.get(0);
    }
    
    @Override
    public void method1803(final Class2215 class2215, final ItemStack class2216) {
        if (class2215 != Class2215.field13600) {
            if (class2215 != Class2215.field13601) {
                if (class2215.getSlotType() == Group.field1682) {
                    this.method2642(class2216);
                    this.inventory.field2740.set(class2215.getIndex(), class2216);
                }
            }
            else {
                this.method2642(class2216);
                this.inventory.field2741.set(0, class2216);
            }
        }
        else {
            this.method2642(class2216);
            this.inventory.field2739.set(this.inventory.field2743, class2216);
        }
    }
    
    public boolean method2885(final ItemStack class8321) {
        this.method2642(class8321);
        return this.inventory.method2362(class8321);
    }
    
    @Override
    public Iterable<ItemStack> method1800() {
        return Lists.newArrayList((Object[])new ItemStack[] { this.getHeldItemMainhand(), this.method2714() });
    }
    
    @Override
    public Iterable<ItemStack> method1801() {
        return this.inventory.field2740;
    }
    
    public boolean method2886(final CompoundNBT class51) {
        if (!this.isPassenger()) {
            if (this.onGround) {
                if (!this.method1706()) {
                    if (this.method2899().method331()) {
                        this.method2900(class51);
                        this.timeEntitySatOnShoulder = this.world.method6754();
                        return true;
                    }
                    if (!this.method2901().method331()) {
                        return false;
                    }
                    this.method2902(class51);
                    this.timeEntitySatOnShoulder = this.world.method6754();
                    return true;
                }
            }
        }
        return false;
    }
    
    public void method2887() {
        if (this.timeEntitySatOnShoulder + 20L < this.world.method6754()) {
            this.method2888(this.method2899());
            this.method2900(new CompoundNBT());
            this.method2888(this.method2901());
            this.method2902(new CompoundNBT());
        }
    }
    
    private void method2888(final CompoundNBT class51) {
        if (!this.world.isRemote) {
            if (!class51.method331()) {
                EntityType.method23373(class51, this.world).ifPresent(class52 -> {
                    if (!(!(class52 instanceof Class794))) {
                        ((Class794)class52).method4486(this.entityUniqueID);
                    }
                    class52.setPosition(this.getPosX(), this.getPosY() + 0.699999988079071, this.getPosZ());
                    ((Class1849)this.world).method6887(class52);
                });
            }
        }
    }
    
    @Override
    public abstract boolean isSpectator();
    
    @Override
    public boolean method1817() {
        if (!this.field3025.field27302) {
            if (!this.isSpectator()) {
                if (super.method1817()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public abstract boolean method2889();
    
    @Override
    public boolean method1868() {
        return !this.field3025.field27302;
    }
    
    public Class6516 method2890() {
        return this.world.method6782();
    }
    
    @Override
    public ITextComponent getDisplayName() {
        return this.method2892(Class6749.method20549(this.getTeam(), this.getName()));
    }
    
    public ITextComponent method2891() {
        return new StringTextComponent("").appendSibling(this.getName()).appendText(" (").appendText(this.field3032.getId().toString()).appendText(")");
    }
    
    private ITextComponent method2892(final ITextComponent class2250) {
        return class2250.applyTextStyle(class2251 -> {
            this.method2844().getName();
            new Class9485(Class2075.field11974, "/tell " + str + " ");
            final Class9485 class2252;
            class2251.method30419(class2252).method30420(this.method1884()).method30421(str);
        });
    }
    
    @Override
    public String method1867() {
        return this.method2844().getName();
    }
    
    @Override
    public float method2789(final Pose class290, final EntitySize class291) {
        switch (Class9396.field40304[class290.ordinal()]) {
            case 1:
            case 2:
            case 3: {
                return 0.4f;
            }
            case 4: {
                return 1.27f;
            }
            default: {
                return 1.62f;
            }
        }
    }
    
    @Override
    public void method2751(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.method1650().set(PlayerEntity.field2999, f);
    }
    
    @Override
    public float method2750() {
        return this.method1650().get(PlayerEntity.field2999);
    }
    
    public static UUID method2893(final GameProfile gameProfile) {
        UUID uuid = gameProfile.getId();
        if (uuid == null) {
            uuid = method2894(gameProfile.getName());
        }
        return uuid;
    }
    
    public static UUID method2894(final String str) {
        return UUID.nameUUIDFromBytes(("OfflinePlayer:" + str).getBytes(StandardCharsets.UTF_8));
    }
    
    public boolean method2895(final Class189 class189) {
        return (this.method1650().get(PlayerEntity.field3001) & class189.method828()) == class189.method828();
    }
    
    @Override
    public boolean method1893(final int n, final ItemStack class8321) {
        if (n >= 0 && n < this.inventory.field2739.size()) {
            this.inventory.method2160(n, class8321);
            return true;
        }
        Class2215 class8322;
        if (n != 100 + Class2215.field13605.getIndex()) {
            if (n != 100 + Class2215.field13604.getIndex()) {
                if (n != 100 + Class2215.field13603.getIndex()) {
                    if (n != 100 + Class2215.field13602.getIndex()) {
                        class8322 = null;
                    }
                    else {
                        class8322 = Class2215.field13602;
                    }
                }
                else {
                    class8322 = Class2215.field13603;
                }
            }
            else {
                class8322 = Class2215.field13604;
            }
        }
        else {
            class8322 = Class2215.field13605;
        }
        if (n == 98) {
            this.method1803(Class2215.field13600, class8321);
            return true;
        }
        if (n == 99) {
            this.method1803(Class2215.field13601, class8321);
            return true;
        }
        if (class8322 != null) {
            if (!class8321.method27620()) {
                if (!(class8321.getItem() instanceof Class4055) && !(class8321.getItem() instanceof Class4080)) {
                    if (class8322 != Class2215.field13605) {
                        return false;
                    }
                }
                else if (Class759.method4185(class8321) != class8322) {
                    return false;
                }
            }
            this.inventory.method2160(class8322.getIndex() + this.inventory.field2739.size(), class8321);
            return true;
        }
        final int n2 = n - 200;
        if (n2 >= 0 && n2 < this.field3007.getSizeInventory()) {
            this.field3007.method2160(n2, class8321);
            return true;
        }
        return false;
    }
    
    public boolean method2896() {
        return this.field3033;
    }
    
    public void method2897(final boolean field3033) {
        this.field3033 = field3033;
    }
    
    @Override
    public Class2226 method2755() {
        return (this.dataManager.get(PlayerEntity.field3002) != 0) ? Class2226.field13698 : Class2226.field13697;
    }
    
    public void method2898(final Class2226 class2226) {
        this.dataManager.set(PlayerEntity.field3002, (byte)((class2226 != Class2226.field13697) ? 1 : 0));
    }
    
    public CompoundNBT method2899() {
        return this.dataManager.get(PlayerEntity.field3003);
    }
    
    public void method2900(final CompoundNBT class51) {
        this.dataManager.set(PlayerEntity.field3003, class51);
    }
    
    public CompoundNBT method2901() {
        return this.dataManager.get(PlayerEntity.field3004);
    }
    
    public void method2902(final CompoundNBT class51) {
        this.dataManager.set(PlayerEntity.field3004, class51);
    }
    
    public float method2903() {
        return (float)(1.0 / this.method2710(Class8107.field33412).method23950() * 20.0);
    }
    
    public float method2904(final float n) {
        return MathHelper.clamp((this.field2944 + n) / this.method2903(), 0.0f, 1.0f);
    }
    
    public void method2905() {
        this.field2944 = 0;
    }
    
    public Class7948 method2906() {
        return this.field3035;
    }
    
    @Override
    public float method1674() {
        return (!this.field3025.field27302 && !this.method2773()) ? super.method1674() : 1.0f;
    }
    
    public float method2907() {
        return (float)this.method2710(Class8107.field33415).method23950();
    }
    
    public boolean method2908() {
        return this.field3025.field27304 && this.method1925() >= 2;
    }
    
    @Override
    public boolean method2779(final ItemStack class8321) {
        return this.method2718(Class759.method4185(class8321)).method27620();
    }
    
    @Override
    public EntitySize method1933(final Pose key) {
        return PlayerEntity.field2998.getOrDefault(key, PlayerEntity.field2997);
    }
    
    @Override
    public ItemStack method2790(final ItemStack class8321) {
        if (!(class8321.getItem() instanceof Class4085)) {
            return ItemStack.EMPTY;
        }
        final ItemStack method12291 = Class4085.method12291(this, ((Class4085)class8321.getItem()).method12289());
        if (method12291.method27620()) {
            final Predicate<ItemStack> method12292 = ((Class4085)class8321.getItem()).method12290();
            for (int i = 0; i < this.inventory.getSizeInventory(); ++i) {
                final ItemStack method12293 = this.inventory.getStackInSlot(i);
                if (method12292.test(method12293)) {
                    return method12293;
                }
            }
            return this.field3025.field27304 ? new ItemStack(Items.field31280) : ItemStack.EMPTY;
        }
        return method12291;
    }
    
    @Override
    public ItemStack method2791(final World class1847, final ItemStack class1848) {
        this.method2877().method33487(class1848.getItem(), class1848);
        this.method2859(Class8276.field33981.method8449(class1848.getItem()));
        class1847.method6706(null, this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field35479, Class286.field1585, 0.5f, class1847.rand.nextFloat() * 0.1f + 0.9f);
        if (this instanceof Class513) {
            Class7770.field31800.method13819((Class513)this, class1848);
        }
        return super.method2791(class1847, class1848);
    }
    
    static {
        field2997 = EntitySize.method27563(0.6f, 1.8f);
        field2998 = (Map)ImmutableMap.builder().put((Object) Pose.field1663, (Object) PlayerEntity.field2997).put((Object) Pose.field1665, (Object) PlayerEntity.field2927).put((Object) Pose.field1664, (Object) EntitySize.method27563(0.6f, 0.6f)).put((Object) Pose.field1666, (Object) EntitySize.method27563(0.6f, 0.6f)).put((Object) Pose.field1667, (Object) EntitySize.method27563(0.6f, 0.6f)).put((Object) Pose.field1668, (Object) EntitySize.method27563(0.6f, 1.5f)).put((Object) Pose.field1669, (Object) EntitySize.method27564(0.2f, 0.2f)).build();
        field2999 = EntityDataManager.method33564(PlayerEntity.class, Class7709.field30655);
        field3000 = EntityDataManager.method33564(PlayerEntity.class, Class7709.field30654);
        field3001 = EntityDataManager.method33564(PlayerEntity.class, Class7709.field30653);
        field3002 = EntityDataManager.method33564(PlayerEntity.class, Class7709.field30653);
        field3003 = EntityDataManager.method33564(PlayerEntity.class, Class7709.field30668);
        field3004 = EntityDataManager.method33564(PlayerEntity.class, Class7709.field30668);
    }
}
