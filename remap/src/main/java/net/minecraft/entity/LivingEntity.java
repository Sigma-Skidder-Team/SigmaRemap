// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.entity;

import java.util.AbstractList;

import mapped.*;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.INBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.apache.commons.lang3.tuple.Pair;
import java.util.List;
import java.util.Set;
import com.google.common.collect.ImmutableSet;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import javax.annotation.Nullable;
import java.util.Random;
import com.google.common.base.Objects;

import java.util.Collection;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.Dynamic;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public abstract class LivingEntity extends Entity
{
    private static final UUID field2918;
    private static final Class7919 field2919;
    public static final DataParameter<Byte> field2920;
    private static final DataParameter<Float> field2921;
    private static final DataParameter<Integer> field2922;
    private static final DataParameter<Boolean> field2923;
    private static final DataParameter<Integer> field2924;
    private static final DataParameter<Integer> field2925;
    private static final DataParameter<Optional<BlockPos>> field2926;
    public static final EntitySize field2927;
    private Class6821 field2928;
    private final Class9535 field2929;
    private final Map<Class5328, Class1948> field2930;
    private final Class2265<ItemStack> field2931;
    private final Class2265<ItemStack> field2932;
    public boolean field2933;
    public Class316 field2934;
    public int field2935;
    public int field2936;
    public int field2937;
    public int field2938;
    public int field2939;
    public float field2940;
    public int field2941;
    public float field2942;
    public float field2943;
    public int field2944;
    public float field2945;
    public float field2946;
    public float field2947;
    public final int field2948 = 20;
    public final float field2949;
    public final float field2950;
    public float field2951;
    public float field2952;
    public float field2953;
    public float field2954;
    public float field2955;
    public PlayerEntity field2956;
    public int field2957;
    public boolean field2958;
    public int field2959;
    public float field2960;
    public float field2961;
    public float field2962;
    public float field2963;
    public float field2964;
    public int field2965;
    public float field2966;
    public boolean field2967;
    public float field2968;
    public float field2969;
    public float field2970;
    public int field2971;
    public double field2972;
    public double field2973;
    public double field2974;
    public double field2975;
    public double field2976;
    public double field2977;
    public int field2978;
    private boolean field2979;
    private LivingEntity field2980;
    private int field2981;
    private LivingEntity field2982;
    private int field2983;
    private float field2984;
    public int field2985;
    private float field2986;
    public ItemStack field2987;
    public int field2988;
    public int field2989;
    private BlockPos field2990;
    private DamageSource field2991;
    private long field2992;
    public int field2993;
    private float field2994;
    private float field2995;
    public Class365<?> field2996;
    
    public LivingEntity(final EntityType<? extends LivingEntity> class7499, final World class7500) {
        super(class7499, class7500);
        this.field2929 = new Class9535(this);
        this.field2930 = Maps.newHashMap();
        this.field2931 = Class2265.method8507(2, ItemStack.field34174);
        this.field2932 = Class2265.method8507(4, ItemStack.field34174);
        this.field2955 = 0.02f;
        this.field2979 = true;
        this.field2987 = ItemStack.field34174;
        this.method2621();
        this.method2665(this.method2701());
        this.preventEntitySpawning = true;
        this.field2950 = (float)((Math.random() + 1.0) * 0.009999999776482582);
        this.method1657();
        this.field2949 = (float)Math.random() * 12398.0f;
        this.rotationYaw = (float)(Math.random() * 6.2831854820251465);
        this.field2953 = this.rotationYaw;
        this.stepHeight = 0.6f;
        this.field2996 = this.method2619((Dynamic<?>)new Dynamic((DynamicOps)Class8453.field34721, (Object)new Class51()));
    }
    
    public Class365<?> method2618() {
        return this.field2996;
    }
    
    public Class365<?> method2619(final Dynamic<?> dynamic) {
        return new Class365<Object>((Collection<Class8233<?>>)ImmutableList.of(), (Collection<Class8033<? extends Class6851<?>>>)ImmutableList.of(), dynamic);
    }
    
    @Override
    public void method1648() {
        this.attackEntityFrom(DamageSource.field32574, Float.MAX_VALUE);
    }
    
    public boolean method2620(final EntityType<?> class7499) {
        return true;
    }
    
    @Override
    public void method1649() {
        this.dataManager.register(LivingEntity.field2920, (Byte)0);
        this.dataManager.register(LivingEntity.field2922, 0);
        this.dataManager.register(LivingEntity.field2923, false);
        this.dataManager.register(LivingEntity.field2924, 0);
        this.dataManager.register(LivingEntity.field2925, 0);
        this.dataManager.register(LivingEntity.field2921, 1.0f);
        this.dataManager.register(LivingEntity.field2926, Optional.empty());
    }
    
    public void method2621() {
        this.method2711().method20873(Class8107.field33405);
        this.method2711().method20873(Class8107.field33407);
        this.method2711().method20873(Class8107.field33408);
        this.method2711().method20873(Class8107.field33413);
        this.method2711().method20873(Class8107.field33414);
    }
    
    @Override
    public void method1701(final double n, final boolean b, final Class7096 class7096, final BlockPos class7097) {
        if (!this.method1706()) {
            this.method1715();
        }
        if (!this.world.isRemote) {
            if (this.fallDistance > 3.0f) {
                if (b) {
                    final float n2 = (float) MathHelper.ceil(this.fallDistance - 3.0f);
                    if (!class7096.method21706()) {
                        ((Class1849)this.world).method6911(new Class6911(Class8432.field34600, class7096), this.getPosX(), this.getPosY(), this.getPosZ(), (int)(150.0 * Math.min(0.2f + n2 / 15.0f, 2.5)), 0.0, 0.0, 0.0, 0.15000000596046448);
                    }
                }
            }
        }
        super.method1701(n, b, class7096, class7097);
    }
    
    public boolean method2622() {
        return this.method2712() == Class6363.field25461;
    }
    
    public float method2623(final float n) {
        return MathHelper.method35700(n, this.field2995, this.field2994);
    }
    
    @Override
    public void method1660() {
        this.field2942 = this.field2943;
        if (this.firstUpdate) {
            this.method2780().ifPresent(this::method2785);
        }
        super.method1660();
        this.world.method6796().startSection("livingEntityBaseTick");
        final boolean b = this instanceof PlayerEntity;
        if (this.method1768()) {
            if (!this.method1769()) {
                if (b) {
                    if (!this.world.getWorldBorder().method34781(this.getBoundingBox())) {
                        final double n = this.world.getWorldBorder().method34782(this) + this.world.getWorldBorder().method34800();
                        if (n < 0.0) {
                            final double method34802 = this.world.getWorldBorder().method34802();
                            if (method34802 > 0.0) {
                                this.attackEntityFrom(DamageSource.field32567, (float)Math.max(1, MathHelper.floor(-n * method34802)));
                            }
                        }
                    }
                }
            }
            else {
                this.attackEntityFrom(DamageSource.field32567, 1.0f);
            }
        }
        if (this.method1704() || this.world.isRemote) {
            this.method1667();
        }
        final boolean b2 = b && ((PlayerEntity)this).field3025.field27301;
        if (this.method1768()) {
            if (this.method1720(Class7324.field28319) && this.world.getBlockState(new BlockPos(this.getPosX(), this.method1944(), this.getPosZ())).method21696() != Class7521.field29765) {
                if (!this.method2622()) {
                    if (!Class9434.method35060(this)) {
                        if (!b2) {
                            this.setAir(this.method2629(this.getAir()));
                            if (this.getAir() == -20) {
                                this.setAir(0);
                                final Vec3d method34803 = this.getMotion();
                                for (int i = 0; i < 8; ++i) {
                                    this.world.method6709(Class8432.field34601, this.getPosX() + (this.rand.nextFloat() - this.rand.nextFloat()), this.getPosY() + (this.rand.nextFloat() - this.rand.nextFloat()), this.getPosZ() + (this.rand.nextFloat() - this.rand.nextFloat()), method34803.x, method34803.y, method34803.z);
                                }
                                this.attackEntityFrom(DamageSource.field32569, 2.0f);
                            }
                        }
                    }
                }
                if (!this.world.isRemote) {
                    if (this.isPassenger()) {
                        if (this.method1920() != null) {
                            if (!this.method1920().method1807()) {
                                this.stopRiding();
                            }
                        }
                    }
                }
            }
            else if (this.getAir() < this.getMaxAir()) {
                this.setAir(this.method2630(this.getAir()));
            }
            if (!this.world.isRemote) {
                final BlockPos field2990 = new BlockPos(this);
                if (!Objects.equal((Object)this.field2990, (Object)field2990)) {
                    this.method2624(this.field2990 = field2990);
                }
            }
        }
        if (this.method1768()) {
            if (this.method1710()) {
                this.method1667();
            }
        }
        if (this.field2938 > 0) {
            --this.field2938;
        }
        if (this.hurtResistantTime > 0) {
            if (!(this instanceof Class513)) {
                --this.hurtResistantTime;
            }
        }
        if (this.method2664() <= 0.0f) {
            this.method2627();
        }
        if (this.field2957 <= 0) {
            this.field2956 = null;
        }
        else {
            --this.field2957;
        }
        if (this.field2982 != null) {
            if (!this.field2982.method1768()) {
                this.field2982 = null;
            }
        }
        if (this.field2980 != null) {
            if (this.field2980.method1768()) {
                if (this.ticksExisted - this.field2981 > 100) {
                    this.method2636(null);
                }
            }
            else {
                this.method2636(null);
            }
        }
        this.method2643();
        this.field2963 = this.field2962;
        this.field2952 = this.field2951;
        this.field2954 = this.field2953;
        this.prevRotationYaw = this.rotationYaw;
        this.prevRotationPitch = this.rotationPitch;
        this.world.method6796().endSection();
    }
    
    public void method2624(final BlockPos class354) {
        final int method30206 = Class8742.method30206(Class7882.field32356, this);
        if (method30206 > 0) {
            Class6258.method18605(this, this.world, class354, method30206);
        }
    }
    
    public boolean method2625() {
        return false;
    }
    
    public float method2626() {
        return this.method2625() ? 0.5f : 1.0f;
    }
    
    @Override
    public boolean method1807() {
        return false;
    }
    
    public void method2627() {
        ++this.field2941;
        if (this.field2941 == 20) {
            this.method1652();
            for (int i = 0; i < 20; ++i) {
                this.world.method6709(Class8432.field34636, this.method1940(1.0), this.method1943(), this.method1947(1.0), this.rand.nextGaussian() * 0.02, this.rand.nextGaussian() * 0.02, this.rand.nextGaussian() * 0.02);
            }
        }
    }
    
    public boolean method2628() {
        return !this.method2625();
    }
    
    public int method2629(final int n) {
        final int method30209 = Class8742.method30209(this);
        return (method30209 > 0 && this.rand.nextInt(method30209 + 1) > 0) ? n : (n - 1);
    }
    
    public int method2630(final int n) {
        return Math.min(n + 4, this.getMaxAir());
    }
    
    public int method2631(final PlayerEntity playerEntity) {
        return 0;
    }
    
    public boolean method2632() {
        return false;
    }
    
    public Random method2633() {
        return this.rand;
    }
    
    @Nullable
    public LivingEntity method2634() {
        return this.field2980;
    }
    
    public int method2635() {
        return this.field2981;
    }
    
    public void method2636(final LivingEntity field2980) {
        this.field2980 = field2980;
        this.field2981 = this.ticksExisted;
    }
    
    @Nullable
    public LivingEntity method2637() {
        return this.field2982;
    }
    
    public int method2638() {
        return this.field2983;
    }
    
    public void method2639(final Entity class399) {
        if (!(class399 instanceof LivingEntity)) {
            this.field2982 = null;
        }
        else {
            this.field2982 = (LivingEntity)class399;
        }
        this.field2983 = this.ticksExisted;
    }
    
    public int method2640() {
        return this.field2959;
    }
    
    public void method2641(final int field2959) {
        this.field2959 = field2959;
    }
    
    public void method2642(final ItemStack class8321) {
        if (!class8321.method27620()) {
            Class7795 class8322 = Class8520.field34982;
            final Item method27622 = class8321.getItem();
            if (!(method27622 instanceof Class4055)) {
                if (method27622 == Items.field31584) {
                    class8322 = Class8520.field34981;
                }
            }
            else {
                class8322 = ((Class4055)method27622).method12258().method8099();
            }
            this.method1695(class8322, 1.0f, 1.0f);
        }
    }
    
    @Override
    public void method1761(final Class51 class51) {
        class51.method304("Health", this.method2664());
        class51.method297("HurtTime", (short)this.field2938);
        class51.method298("HurtByTimestamp", this.field2981);
        class51.method297("DeathTime", (short)this.field2941);
        class51.method304("AbsorptionAmount", this.method2750());
        class51.method295("Attributes", Class8107.method26639(this.method2711()));
        if (!this.field2930.isEmpty()) {
            final Class52 class52 = new Class52();
            final Iterator<Class1948> iterator = this.field2930.values().iterator();
            while (iterator.hasNext()) {
                ((AbstractList<Class51>)class52).add(iterator.next().method7916(new Class51()));
            }
            class51.method295("ActiveEffects", class52);
        }
        class51.method312("FallFlying", this.method2773());
        this.method2780().ifPresent(class54 -> {
            class53.method298("SleepingX", class54.getX());
            class53.method298("SleepingY", class54.getY());
            class53.method298("SleepingZ", class54.getZ());
            return;
        });
        class51.method295("Brain", this.field2996.serialize((com.mojang.datafixers.types.DynamicOps<INBT>)Class8453.field34721));
    }
    
    @Override
    public void method1760(final Class51 class51) {
        this.method2751(class51.method321("AbsorptionAmount"));
        if (class51.method316("Attributes", 9)) {
            if (this.world != null) {
                if (!this.world.isRemote) {
                    Class8107.method26642(this.method2711(), class51.method328("Attributes", 10));
                }
            }
        }
        if (class51.method316("ActiveEffects", 9)) {
            final Class52 method328 = class51.method328("ActiveEffects", 10);
            for (int i = 0; i < method328.size(); ++i) {
                final Class1948 method329 = Class1948.method7918(method328.method346(i));
                if (method329 != null) {
                    this.field2930.put(method329.method7906(), method329);
                }
            }
        }
        if (class51.method316("Health", 99)) {
            this.method2665(class51.method321("Health"));
        }
        this.field2938 = class51.method318("HurtTime");
        this.field2941 = class51.method318("DeathTime");
        this.field2981 = class51.method319("HurtByTimestamp");
        if (class51.method316("Team", 8)) {
            final String method330 = class51.method323("Team");
            final Class6749 method331 = this.world.method6782().method19645(method330);
            if (method331 == null || !this.world.method6782().method19615(this.method1866(), method331)) {
                LivingEntity.LOGGER.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", (Object)method330);
            }
        }
        if (class51.method329("FallFlying")) {
            this.setFlag(7, true);
        }
        if (class51.method316("SleepingX", 99)) {
            if (class51.method316("SleepingY", 99)) {
                if (class51.method316("SleepingZ", 99)) {
                    final BlockPos class52 = new BlockPos(class51.method319("SleepingX"), class51.method319("SleepingY"), class51.method319("SleepingZ"));
                    this.method2781(class52);
                    this.dataManager.set(LivingEntity.POSE, Pose.field1665);
                    if (!this.firstUpdate) {
                        this.method2785(class52);
                    }
                }
            }
        }
        if (class51.method316("Brain", 10)) {
            this.field2996 = this.method2619((Dynamic<?>)new Dynamic((DynamicOps)Class8453.field34721, (Object)class51.method313("Brain")));
        }
    }
    
    public void method2643() {
        final Iterator<Class5328> iterator = this.field2930.keySet().iterator();
        try {
            while (iterator.hasNext()) {
                final Class1948 class1948 = this.field2930.get(iterator.next());
                if (!class1948.method7912(this, () -> this.method2661(class1949, (boolean)(1 != 0)))) {
                    if (this.world.isRemote) {
                        continue;
                    }
                    iterator.remove();
                    this.method2662(class1948);
                }
                else {
                    if (class1948.method7907() % 600 != 0) {
                        continue;
                    }
                    this.method2661(class1948, false);
                }
            }
        }
        catch (final ConcurrentModificationException ex) {}
        if (this.field2979) {
            if (!this.world.isRemote) {
                this.method2644();
            }
            this.field2979 = false;
        }
        final int intValue = this.dataManager.get(LivingEntity.field2922);
        final boolean booleanValue = this.dataManager.get(LivingEntity.field2923);
        if (intValue > 0) {
            boolean nextBoolean;
            if (this.method1823()) {
                nextBoolean = (this.rand.nextInt(15) == 0);
            }
            else {
                nextBoolean = this.rand.nextBoolean();
            }
            if (booleanValue) {
                nextBoolean &= (this.rand.nextInt(5) == 0);
            }
            if (nextBoolean && intValue > 0) {
                this.world.method6709(booleanValue ? Class8432.field34597 : Class8432.field34617, this.method1940(0.5), this.method1943(), this.method1947(0.5), (intValue >> 16 & 0xFF) / 255.0, (intValue >> 8 & 0xFF) / 255.0, (intValue >> 0 & 0xFF) / 255.0);
            }
        }
    }
    
    public void method2644() {
        if (!this.field2930.isEmpty()) {
            final Collection<Class1948> values = this.field2930.values();
            this.dataManager.set(LivingEntity.field2923, method2648(values));
            this.dataManager.set(LivingEntity.field2922, Class5333.method16473(values));
            this.method1828(this.method2653(Class9439.field40487));
        }
        else {
            this.method2649();
            this.method1828(false);
        }
    }
    
    public double method2645(final Entity class399) {
        double n = 1.0;
        if (this.method1812()) {
            n *= 0.8;
        }
        if (this.method1823()) {
            float method2719 = this.method2719();
            if (method2719 < 0.1f) {
                method2719 = 0.1f;
            }
            n *= 0.7 * method2719;
        }
        if (class399 != null) {
            final Item method2720 = this.method2718(Class2215.field13605).getItem();
            final EntityType<?> method2721 = class399.getType();
            if (method2721 != EntityType.field29023 || method2720 != Items.field31523) {
                if (method2721 != EntityType.field29052 || method2720 != Items.field31526) {
                    if (method2721 != EntityType.field28969) {
                        return n;
                    }
                    if (method2720 != Items.field31527) {
                        return n;
                    }
                }
            }
            n *= 0.5;
        }
        return n;
    }
    
    public boolean method2646(final LivingEntity class511) {
        return true;
    }
    
    public boolean method2647(final LivingEntity class511, final Class7843 class512) {
        return class512.method25344(this, class511);
    }
    
    public static boolean method2648(final Collection<Class1948> collection) {
        final Iterator<Class1948> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().method7909()) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    public void method2649() {
        this.dataManager.set(LivingEntity.field2923, false);
        this.dataManager.set(LivingEntity.field2922, 0);
    }
    
    public boolean method2650() {
        if (!this.world.isRemote) {
            final Iterator<Class1948> iterator = this.field2930.values().iterator();
            boolean b = false;
            while (iterator.hasNext()) {
                this.method2662(iterator.next());
                iterator.remove();
                b = true;
            }
            return b;
        }
        return false;
    }
    
    public Collection<Class1948> method2651() {
        return this.field2930.values();
    }
    
    public Map<Class5328, Class1948> method2652() {
        return this.field2930;
    }
    
    public boolean method2653(final Class5328 class5328) {
        return this.field2930.containsKey(class5328);
    }
    
    @Nullable
    public Class1948 method2654(final Class5328 class5328) {
        return this.field2930.get(class5328);
    }
    
    public boolean method2655(final Class1948 class1948) {
        if (!this.method2656(class1948)) {
            return false;
        }
        final Class1948 class1949 = this.field2930.get(class1948.method7906());
        if (class1949 == null) {
            this.field2930.put(class1948.method7906(), class1948);
            this.method2660(class1948);
            return true;
        }
        if (!class1949.method7905(class1948)) {
            return false;
        }
        this.method2661(class1949, true);
        return true;
    }
    
    public boolean method2656(final Class1948 class1948) {
        if (this.method2712() == Class6363.field25461) {
            final Class5328 method7906 = class1948.method7906();
            if (method7906 == Class9439.field40483 || method7906 == Class9439.field40492) {
                return false;
            }
        }
        return true;
    }
    
    public boolean method2657() {
        return this.method2712() == Class6363.field25461;
    }
    
    @Nullable
    public Class1948 method2658(final Class5328 class5328) {
        return this.field2930.remove(class5328);
    }
    
    public boolean method2659(final Class5328 class5328) {
        final Class1948 method2658 = this.method2658(class5328);
        if (method2658 == null) {
            return false;
        }
        this.method2662(method2658);
        return true;
    }
    
    public void method2660(final Class1948 class1948) {
        this.field2979 = true;
        if (!this.world.isRemote) {
            class1948.method7906().method16462(this, this.method2711(), class1948.method7908());
        }
    }
    
    public void method2661(final Class1948 class1948, final boolean b) {
        this.field2979 = true;
        if (b) {
            if (!this.world.isRemote) {
                final Class5328 method7906 = class1948.method7906();
                method7906.method16461(this, this.method2711(), class1948.method7908());
                method7906.method16462(this, this.method2711(), class1948.method7908());
            }
        }
    }
    
    public void method2662(final Class1948 class1948) {
        this.field2979 = true;
        if (!this.world.isRemote) {
            class1948.method7906().method16461(this, this.method2711(), class1948.method7908());
        }
    }
    
    public void method2663(final float n) {
        final float method2664 = this.method2664();
        if (method2664 > 0.0f) {
            this.method2665(method2664 + n);
        }
    }
    
    public float method2664() {
        return this.dataManager.get(LivingEntity.field2921);
    }
    
    public void method2665(final float n) {
        this.dataManager.set(LivingEntity.field2921, MathHelper.clamp(n, 0.0f, this.method2701()));
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource field2991, float n) {
        if (this.method1849(field2991)) {
            return false;
        }
        if (this.world.isRemote) {
            return false;
        }
        if (this.method2664() <= 0.0f) {
            return false;
        }
        if (field2991.method25719() && this.method2653(Class9439.field40485)) {
            return false;
        }
        if (this.method2783()) {
            if (!this.world.isRemote) {
                this.method2787();
            }
        }
        this.field2959 = 0;
        final float n2 = n;
        if (field2991 == DamageSource.field32578 || field2991 == DamageSource.field32579) {
            if (!this.method2718(Class2215.field13605).method27620()) {
                this.method2718(Class2215.field13605).method27636((int)(n * 4.0f + this.rand.nextFloat() * n * 2.0f), this, class800 -> class800.method2794(Class2215.field13605));
                n *= 0.75f;
            }
        }
        boolean b = false;
        float n3 = 0.0f;
        if (n > 0.0f) {
            if (this.method2671(field2991)) {
                this.method2695(n);
                n3 = n;
                n = 0.0f;
                if (!field2991.method25705()) {
                    final Entity method25713 = field2991.method25713();
                    if (method25713 instanceof LivingEntity) {
                        this.method2666((LivingEntity)method25713);
                    }
                }
                b = true;
            }
        }
        this.field2946 = 1.5f;
        boolean b2 = true;
        if (this.hurtResistantTime <= 10.0f) {
            this.field2966 = n;
            this.hurtResistantTime = 20;
            this.method2698(field2991, n);
            this.field2939 = 10;
            this.field2938 = this.field2939;
        }
        else {
            if (n <= this.field2966) {
                return false;
            }
            this.method2698(field2991, n - this.field2966);
            this.field2966 = n;
            b2 = false;
        }
        this.field2940 = 0.0f;
        final Entity method25714 = field2991.method25714();
        if (method25714 != null) {
            if (method25714 instanceof LivingEntity) {
                this.method2636((LivingEntity)method25714);
            }
            if (!(method25714 instanceof PlayerEntity)) {
                if (method25714 instanceof Class799) {
                    final Class799 class799 = (Class799)method25714;
                    if (class799.method4480()) {
                        this.field2957 = 100;
                        final LivingEntity method25715 = class799.method4488();
                        if (method25715 != null && method25715.getType() == EntityType.field29058) {
                            this.field2956 = (PlayerEntity)method25715;
                        }
                        else {
                            this.field2956 = null;
                        }
                    }
                }
            }
            else {
                this.field2957 = 100;
                this.field2956 = (PlayerEntity)method25714;
            }
        }
        if (b2) {
            if (!b) {
                if (field2991 instanceof Class7930 && ((Class7930)field2991).method25728()) {
                    this.world.method6761(this, (byte)33);
                }
                else {
                    byte b3;
                    if (field2991 != DamageSource.field32569) {
                        if (!field2991.method25719()) {
                            if (field2991 != DamageSource.field32583) {
                                b3 = 2;
                            }
                            else {
                                b3 = 44;
                            }
                        }
                        else {
                            b3 = 37;
                        }
                    }
                    else {
                        b3 = 36;
                    }
                    this.world.method6761(this, b3);
                }
            }
            else {
                this.world.method6761(this, (byte)29);
            }
            if (field2991 != DamageSource.field32569) {
                if (!b || n > 0.0f) {
                    this.method1739();
                }
            }
            if (method25714 == null) {
                this.field2940 = (float)((int)(Math.random() * 2.0) * 180);
            }
            else {
                double n4;
                double n5;
                for (n4 = method25714.getPosX() - this.getPosX(), n5 = method25714.getPosZ() - this.getPosZ(); n4 * n4 + n5 * n5 < 1.0E-4; n4 = (Math.random() - Math.random()) * 0.01, n5 = (Math.random() - Math.random()) * 0.01) {}
                this.field2940 = (float)(MathHelper.method35693(n5, n4) * 57.2957763671875 - this.rotationYaw);
                this.method2682(method25714, 0.4f, n4, n5);
            }
        }
        if (this.method2664() > 0.0f) {
            if (b2) {
                this.method2670(field2991);
            }
        }
        else if (!this.method2668(field2991)) {
            final Class7795 method25716 = this.method2684();
            if (b2) {
                if (method25716 != null) {
                    this.method1695(method25716, this.method2720(), this.method2721());
                }
            }
            this.method2673(field2991);
        }
        final boolean b4 = !b || n > 0.0f;
        if (b4) {
            this.field2991 = field2991;
            this.field2992 = this.world.method6754();
        }
        if (this instanceof Class513) {
            Class7770.field31782.method13792((Class513)this, field2991, n2, n, b);
            if (n3 > 0.0f) {
                if (n3 < 3.4028235E37f) {
                    ((Class513)this).method2858(Class8276.field34013, Math.round(n3 * 10.0f));
                }
            }
        }
        if (method25714 instanceof Class513) {
            Class7770.field31781.method13769((Class513)method25714, this, field2991, n2, n, b);
        }
        return b4;
    }
    
    public void method2666(final LivingEntity class511) {
        class511.method2667(this);
    }
    
    public void method2667(final LivingEntity class511) {
        class511.method2682(this, 0.5f, class511.getPosX() - this.getPosX(), class511.getPosZ() - this.getPosZ());
    }
    
    private boolean method2668(final DamageSource class7929) {
        if (!class7929.method25711()) {
            ItemStack method27641 = null;
            final Class316[] values = Class316.values();
            for (int length = values.length, i = 0; i < length; ++i) {
                final ItemStack method27642 = this.method2715(values[i]);
                if (method27642.getItem() == Items.field31590) {
                    method27641 = method27642.method27641();
                    method27642.method27693(1);
                    break;
                }
            }
            if (method27641 != null) {
                if (this instanceof Class513) {
                    final Class513 class7930 = (Class513)this;
                    class7930.method2859(Class8276.field33981.method8449(Items.field31590));
                    Class7770.field31802.method13846(class7930, method27641);
                }
                this.method2665(1.0f);
                this.method2650();
                this.method2655(new Class1948(Class9439.field40483, 900, 1));
                this.method2655(new Class1948(Class9439.field40495, 100, 1));
                this.world.method6761(this, (byte)35);
            }
            return method27641 != null;
        }
        return false;
    }
    
    @Nullable
    public DamageSource method2669() {
        if (this.world.method6754() - this.field2992 > 40L) {
            this.field2991 = null;
        }
        return this.field2991;
    }
    
    public void method2670(final DamageSource class7929) {
        final Class7795 method2683 = this.method2683(class7929);
        if (method2683 != null) {
            this.method1695(method2683, this.method2720(), this.method2721());
        }
    }
    
    private boolean method2671(final DamageSource class7929) {
        final Entity method25713 = class7929.method25713();
        boolean b = false;
        if (method25713 instanceof Class402) {
            if (((Class402)method25713).method1983() > 0) {
                b = true;
            }
        }
        if (!class7929.method25709()) {
            if (this.method2771()) {
                if (!b) {
                    final Vec3d method25714 = class7929.method25726();
                    if (method25714 != null) {
                        final Vec3d method25715 = this.method1741(1.0f);
                        final Vec3d method25716 = method25714.subtractReverse(this.method1934()).normalize();
                        if (new Vec3d(method25716.x, 0.0, method25716.z).dotProduct(method25715) < 0.0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    private void method2672(final ItemStack class8321) {
        if (!class8321.method27620()) {
            if (!this.method1696()) {
                this.world.method6708(this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field35326, this.method1922(), 0.8f, 0.8f + this.world.rand.nextFloat() * 0.4f, false);
            }
            this.method2764(class8321, 5);
        }
    }
    
    public void method2673(final DamageSource class7929) {
        if (!this.removed) {
            if (!this.field2958) {
                final Entity method25714 = class7929.method25714();
                final LivingEntity method25715 = this.method2700();
                if (this.field2965 >= 0) {
                    if (method25715 != null) {
                        method25715.method1751(this, this.field2965, class7929);
                    }
                }
                if (method25714 != null) {
                    method25714.onKillEntity(this);
                }
                if (this.method2783()) {
                    this.method2787();
                }
                this.field2958 = true;
                this.method2699().method35601();
                if (!this.world.isRemote) {
                    this.method2675(class7929);
                    this.method2674(method25715);
                }
                this.world.method6761(this, (byte)3);
                this.method1653(Pose.field1669);
            }
        }
    }
    
    public void method2674(final LivingEntity class511) {
        if (!this.world.isRemote) {
            int n = 0;
            if (class511 instanceof Class767) {
                if (this.world.method6765().method31216(Class8878.field37316)) {
                    final BlockPos class512 = new BlockPos(this);
                    final Class7096 method11878 = Class7521.field29276.getDefaultState();
                    if (this.world.getBlockState(class512).method21706()) {
                        if (method11878.method21752(this.world, class512)) {
                            this.world.setBlockState(class512, method11878, 3);
                            n = 1;
                        }
                    }
                }
                if (n == 0) {
                    this.world.method6886(new Class427(this.world, this.getPosX(), this.getPosY(), this.getPosZ(), new ItemStack(Items.field30864)));
                }
            }
        }
    }
    
    public void method2675(final DamageSource class7929) {
        final Entity method25714 = class7929.method25714();
        int method25715;
        if (!(method25714 instanceof PlayerEntity)) {
            method25715 = 0;
        }
        else {
            method25715 = Class8742.method30214((LivingEntity)method25714);
        }
        final boolean b = this.field2957 > 0;
        if (this.method2628()) {
            if (this.world.method6765().method31216(Class8878.field37319)) {
                this.method2680(class7929, b);
                this.method2678(class7929, method25715, b);
            }
        }
        this.method2676();
        this.method2677();
    }
    
    public void method2676() {
    }
    
    public void method2677() {
        if (!this.world.isRemote) {
            if (!this.method2632()) {
                if (this.field2957 <= 0) {
                    return;
                }
                if (!this.method2628()) {
                    return;
                }
                if (!this.world.method6765().method31216(Class8878.field37319)) {
                    return;
                }
            }
            int i = this.method2631(this.field2956);
            while (i > 0) {
                final int method2609 = Class508.method2609(i);
                i -= method2609;
                this.world.method6886(new Class508(this.world, this.getPosX(), this.getPosY(), this.getPosZ(), method2609));
            }
        }
    }
    
    public void method2678(final DamageSource class7929, final int n, final boolean b) {
    }
    
    public ResourceLocation method2679() {
        return this.getType().method23368();
    }
    
    public void method2680(final DamageSource class7929, final boolean b) {
        this.world.getServer().method1581().method6402(this.method2679()).method34484(this.method2681(b, class7929).method32883(Class7104.field27715), this::method1766);
    }
    
    public Class9098 method2681(final boolean b, final DamageSource class7929) {
        Class9098 class7930 = new Class9098((Class1849)this.world).method32873(this.rand).method32877(Class6683.field26362, this).method32877(Class6683.field26367, new BlockPos(this)).method32877(Class6683.field26364, class7929).method32878(Class6683.field26365, class7929.method25714()).method32878(Class6683.field26366, class7929.method25713());
        if (b) {
            if (this.field2956 != null) {
                class7930 = class7930.method32877(Class6683.field26363, this.field2956).method32876(this.field2956.method2907());
            }
        }
        return class7930;
    }
    
    public void method2682(final Entity class399, final float n, final double n2, final double n3) {
        if (this.rand.nextDouble() >= this.method2710(Class8107.field33407).method23950()) {
            this.isAirBorne = true;
            final Vec3d method1935 = this.getMotion();
            final Vec3d method1936 = new Vec3d(n2, 0.0, n3).normalize().scale(n);
            this.setMotion(method1935.x / 2.0 - method1936.x, this.onGround ? Math.min(0.4, method1935.y / 2.0 + n) : method1935.y, method1935.z / 2.0 - method1936.z);
        }
    }
    
    @Nullable
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35220;
    }
    
    @Nullable
    public Class7795 method2684() {
        return Class8520.field35215;
    }
    
    public Class7795 method2685(final int n) {
        return (n <= 4) ? Class8520.field35221 : Class8520.field35213;
    }
    
    public Class7795 method2686(final ItemStack class8321) {
        return class8321.method27696();
    }
    
    public Class7795 method2687(final ItemStack class8321) {
        return class8321.method27697();
    }
    
    public boolean method2688() {
        if (!this.isSpectator()) {
            final Class7096 method2689 = this.method2689();
            final Block method2690 = method2689.method21696();
            if (method2690 != Class7521.field29307) {
                if (method2690 != Class7521.field29388) {
                    if (method2690 != Class7521.field29805) {
                        return method2690 instanceof Class3894 && this.method2690(new BlockPos(this), method2689);
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public Class7096 method2689() {
        return this.world.getBlockState(new BlockPos(this));
    }
    
    private boolean method2690(final BlockPos class354, final Class7096 class355) {
        if (class355.method21772((IProperty<Boolean>)Class3894.field17567)) {
            final Class7096 method6701 = this.world.getBlockState(class354.method1139());
            if (method6701.method21696() == Class7521.field29307) {
                if (((StateHolder<Object, Object>)method6701).get((IProperty<Comparable>)Class3917.field17752) == class355.method21772((IProperty<Comparable>)Class3894.field17564)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean method1768() {
        return !this.removed && this.method2664() > 0.0f;
    }
    
    @Override
    public boolean method1705(final float n, final float n2) {
        final boolean method1705 = super.method1705(n, n2);
        final int method1706 = this.method2691(n, n2);
        if (method1706 <= 0) {
            return method1705;
        }
        this.method1695(this.method2685(method1706), 1.0f, 1.0f);
        this.method2692();
        this.attackEntityFrom(DamageSource.field32572, (float)method1706);
        return true;
    }
    
    public int method2691(final float n, final float n2) {
        final Class1948 method2654 = this.method2654(Class9439.field40481);
        return MathHelper.ceil((n - 3.0f - ((method2654 != null) ? ((float)(method2654.method7908() + 1)) : 0.0f)) * n2);
    }
    
    public void method2692() {
        if (!this.method1696()) {
            final Class7096 method6701 = this.world.getBlockState(new BlockPos(MathHelper.floor(this.getPosX()), MathHelper.floor(this.getPosY() - 0.20000000298023224), MathHelper.floor(this.getPosZ())));
            if (!method6701.method21706()) {
                final SoundType method6702 = method6701.method21759();
                this.method1695(method6702.method24483(), method6702.method24477() * 0.5f, method6702.method24478() * 0.75f);
            }
        }
    }
    
    @Override
    public void method1799() {
        this.field2939 = 10;
        this.field2938 = this.field2939;
        this.field2940 = 0.0f;
    }
    
    public int method2693() {
        return MathHelper.floor(this.method2710(Class8107.field33413).method23950());
    }
    
    public void method2694(final float n) {
    }
    
    public void method2695(final float n) {
    }
    
    public float method2696(final DamageSource class7929, float method27401) {
        if (!class7929.method25709()) {
            this.method2694(method27401);
            method27401 = Class8257.method27401(method27401, (float)this.method2693(), (float)this.method2710(Class8107.field33414).method23950());
        }
        return method27401;
    }
    
    public float method2697(final DamageSource class7929, float n) {
        if (class7929.method25712()) {
            return n;
        }
        if (this.method2653(Class9439.field40484)) {
            if (class7929 != DamageSource.field32574) {
                final float n2 = n * (25 - (this.method2654(Class9439.field40484).method7908() + 1) * 5);
                final float n3 = n;
                n = Math.max(n2 / 25.0f, 0.0f);
                final float n4 = n3 - n;
                if (n4 > 0.0f) {
                    if (n4 < 3.4028235E37f) {
                        if (!(this instanceof Class513)) {
                            if (class7929.method25714() instanceof Class513) {
                                ((Class513)class7929.method25714()).method2858(Class8276.field34011, Math.round(n4 * 10.0f));
                            }
                        }
                        else {
                            ((Class513)this).method2858(Class8276.field34015, Math.round(n4 * 10.0f));
                        }
                    }
                }
            }
        }
        if (n > 0.0f) {
            final int method30201 = Class8742.method30201(this.method1801(), class7929);
            if (method30201 > 0) {
                n = Class8257.method27402(n, (float)method30201);
            }
            return n;
        }
        return 0.0f;
    }
    
    public void method2698(final DamageSource class7929, float n) {
        if (!this.method1849(class7929)) {
            n = this.method2696(class7929, n);
            n = this.method2697(class7929, n);
            final float max = Math.max(n - this.method2750(), 0.0f);
            this.method2751(this.method2750() - (n - max));
            final float n2 = n - max;
            if (n2 > 0.0f) {
                if (n2 < 3.4028235E37f) {
                    if (class7929.method25714() instanceof Class513) {
                        ((Class513)class7929.method25714()).method2858(Class8276.field34010, Math.round(n2 * 10.0f));
                    }
                }
            }
            if (max != 0.0f) {
                final float method2664 = this.method2664();
                this.method2665(method2664 - max);
                this.method2699().method35594(class7929, method2664, max);
                this.method2751(this.method2750() - max);
            }
        }
    }
    
    public Class9535 method2699() {
        return this.field2929;
    }
    
    @Nullable
    public LivingEntity method2700() {
        if (this.field2929.method35596() != null) {
            return this.field2929.method35596();
        }
        if (this.field2956 == null) {
            return (this.field2980 == null) ? null : this.field2980;
        }
        return this.field2956;
    }
    
    public final float method2701() {
        return (float)this.method2710(Class8107.field33405).method23950();
    }
    
    public final int method2702() {
        return this.dataManager.get(LivingEntity.field2924);
    }
    
    public final void method2703(final int i) {
        this.dataManager.set(LivingEntity.field2924, i);
    }
    
    public final int method2704() {
        return this.dataManager.get(LivingEntity.field2925);
    }
    
    public final void method2705(final int i) {
        this.dataManager.set(LivingEntity.field2925, i);
    }
    
    private int method2706() {
        if (!Class9434.method35058(this)) {
            return this.method2653(Class9439.field40477) ? (6 + (1 + this.method2654(Class9439.field40477).method7908()) * 2) : 6;
        }
        return 6 - (1 + Class9434.method35059(this));
    }
    
    public void method2707(final Class316 class316) {
        this.method2708(class316, false);
    }
    
    public void method2708(final Class316 field2934, final boolean b) {
        if (this.field2933) {
            if (this.field2935 < this.method2706() / 2) {
                if (this.field2935 >= 0) {
                    return;
                }
            }
        }
        this.field2935 = -1;
        this.field2933 = true;
        this.field2934 = field2934;
        if (this.world instanceof Class1849) {
            final Class4289 class4289 = new Class4289(this, (field2934 != Class316.field1877) ? 3 : 0);
            final Class1909 method6904 = ((Class1849)this.world).method6904();
            if (!b) {
                method6904.method7447(this, class4289);
            }
            else {
                method6904.method7446(this, class4289);
            }
        }
    }
    
    @Override
    public void method1798(final byte b) {
        switch (b) {
            case 2:
            case 33:
            case 36:
            case 37:
            case 44: {
                final boolean b2 = b == 33;
                final boolean b3 = b == 36;
                final boolean b4 = b == 37;
                final boolean b5 = b == 44;
                this.field2946 = 1.5f;
                this.hurtResistantTime = 20;
                this.field2939 = 10;
                this.field2938 = this.field2939;
                this.field2940 = 0.0f;
                if (b2) {
                    this.method1695(Class8520.field35631, this.method2720(), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f);
                }
                DamageSource class7929;
                if (b4) {
                    class7929 = DamageSource.field32564;
                }
                else if (b3) {
                    class7929 = DamageSource.field32569;
                }
                else if (b5) {
                    class7929 = DamageSource.field32583;
                }
                else {
                    class7929 = DamageSource.field32575;
                }
                final Class7795 method2683 = this.method2683(class7929);
                if (method2683 != null) {
                    this.method1695(method2683, this.method2720(), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f);
                }
                this.attackEntityFrom(DamageSource.field32575, 0.0f);
                break;
            }
            case 3: {
                final Class7795 method2684 = this.method2684();
                if (method2684 != null) {
                    this.method1695(method2684, this.method2720(), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f);
                }
                if (!(this instanceof PlayerEntity)) {
                    this.method2665(0.0f);
                    this.method2673(DamageSource.field32575);
                    break;
                }
                break;
            }
            default: {
                super.method1798(b);
                break;
            }
            case 29: {
                this.method1695(Class8520.field35545, 1.0f, 0.8f + this.world.rand.nextFloat() * 0.4f);
                break;
            }
            case 30: {
                this.method1695(Class8520.field35546, 0.8f, 0.8f + this.world.rand.nextFloat() * 0.4f);
                break;
            }
            case 46: {
                for (int i = 0; i < 128; ++i) {
                    final double n = i / 127.0;
                    this.world.method6709(Class8432.field34637, MathHelper.lerp(n, this.prevPosX, this.getPosX()) + (this.rand.nextDouble() - 0.5) * this.method1930() * 2.0, MathHelper.lerp(n, this.prevPosY, this.getPosY()) + this.rand.nextDouble() * this.method1931(), MathHelper.lerp(n, this.prevPosZ, this.getPosZ()) + (this.rand.nextDouble() - 0.5) * this.method1930() * 2.0, (this.rand.nextFloat() - 0.5f) * 0.2f, (this.rand.nextFloat() - 0.5f) * 0.2f, (this.rand.nextFloat() - 0.5f) * 0.2f);
                }
                break;
            }
            case 47: {
                this.method2672(this.method2718(Class2215.field13600));
                break;
            }
            case 48: {
                this.method2672(this.method2718(Class2215.field13601));
                break;
            }
            case 49: {
                this.method2672(this.method2718(Class2215.field13605));
                break;
            }
            case 50: {
                this.method2672(this.method2718(Class2215.field13604));
                break;
            }
            case 51: {
                this.method2672(this.method2718(Class2215.field13603));
                break;
            }
            case 52: {
                this.method2672(this.method2718(Class2215.field13602));
                break;
            }
            case 54: {
                Class3848.method11908(this);
                break;
            }
        }
    }
    
    @Override
    public void method1668() {
        this.attackEntityFrom(DamageSource.field32574, 4.0f);
    }
    
    public void method2709() {
        final int method2706 = this.method2706();
        if (!this.field2933) {
            this.field2935 = 0;
        }
        else {
            ++this.field2935;
            if (this.field2935 >= method2706) {
                this.field2935 = 0;
                this.field2933 = false;
            }
        }
        this.field2943 = this.field2935 / (float)method2706;
    }
    
    public Class7619 method2710(final Class8725 class8725) {
        return this.method2711().method20879(class8725);
    }
    
    public Class6821 method2711() {
        if (this.field2928 == null) {
            this.field2928 = new Class6820();
        }
        return this.field2928;
    }
    
    public Class6363 method2712() {
        return Class6363.field25460;
    }
    
    public ItemStack getHeldItemMainhand() {
        return this.method2718(Class2215.field13600);
    }
    
    public ItemStack method2714() {
        return this.method2718(Class2215.field13601);
    }
    
    public ItemStack method2715(final Class316 obj) {
        if (obj == Class316.field1877) {
            return this.method2718(Class2215.field13600);
        }
        if (obj != Class316.field1878) {
            throw new IllegalArgumentException("Invalid hand " + obj);
        }
        return this.method2718(Class2215.field13601);
    }
    
    public void method2716(final Class316 obj, final ItemStack class8321) {
        if (obj != Class316.field1877) {
            if (obj != Class316.field1878) {
                throw new IllegalArgumentException("Invalid hand " + obj);
            }
            this.method1803(Class2215.field13601, class8321);
        }
        else {
            this.method1803(Class2215.field13600, class8321);
        }
    }
    
    public boolean method2717(final Class2215 class2215) {
        return !this.method2718(class2215).method27620();
    }
    
    @Override
    public abstract Iterable<ItemStack> method1801();
    
    public abstract ItemStack method2718(final Class2215 p0);
    
    @Override
    public abstract void method1803(final Class2215 p0, final ItemStack p1);
    
    public float method2719() {
        final Iterable<ItemStack> method1801 = this.method1801();
        int n = 0;
        int n2 = 0;
        final Iterator<ItemStack> iterator = method1801.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().method27620()) {
                ++n2;
            }
            ++n;
        }
        return (n <= 0) ? 0.0f : (n2 / (float)n);
    }
    
    @Override
    public void method1816(final boolean b) {
        super.method1816(b);
        final Class7619 method2710 = this.method2710(Class8107.field33408);
        if (method2710.method23945(LivingEntity.field2918) != null) {
            method2710.method23947(LivingEntity.field2919);
        }
        if (b) {
            method2710.method23946(LivingEntity.field2919);
        }
    }
    
    public float method2720() {
        return 1.0f;
    }
    
    public float method2721() {
        return this.method2625() ? ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.5f) : ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f);
    }
    
    public boolean method2722() {
        return this.method2664() <= 0.0f;
    }
    
    @Override
    public void method1737(final Entity class399) {
        if (!this.method2783()) {
            super.method1737(class399);
        }
    }
    
    private void method2723(final Entity class399) {
        if (!this.world.getBlockState(new BlockPos(class399)).method21696().method11785(Class7188.field27934)) {
            if (!(class399 instanceof Class423) && !(class399 instanceof Class806)) {
                double method1938 = class399.getPosX();
                double method1939 = class399.method1942(1.0);
                double method1940 = class399.getPosZ();
                final Direction method1941 = class399.method1883();
                if (method1941 != null) {
                    if (method1941.getAxis() != Direction.Axis.Y) {
                        final Direction method1942 = method1941.rotateY();
                        final int[][] array = { { 0, 1 }, { 0, -1 }, { -1, 1 }, { -1, -1 }, { 1, 1 }, { 1, -1 }, { -1, 0 }, { 1, 0 }, { 0, 1 } };
                        final double n = Math.floor(this.getPosX()) + 0.5;
                        final double n2 = Math.floor(this.getPosZ()) + 0.5;
                        final double n3 = this.getBoundingBox().maxX - this.getBoundingBox().minX;
                        final double n4 = this.getBoundingBox().maxZ - this.getBoundingBox().minZ;
                        final AxisAlignedBB class400 = new AxisAlignedBB(n - n3 / 2.0, class399.getBoundingBox().minY, n2 - n4 / 2.0, n + n3 / 2.0, Math.floor(class399.getBoundingBox().minY) + this.method1931(), n2 + n4 / 2.0);
                        for (final int[] array3 : array) {
                            final double n5 = method1941.getXOffset() * array3[0] + method1942.getXOffset() * array3[1];
                            final double n6 = method1941.getZOffset() * array3[0] + method1942.getZOffset() * array3[1];
                            final double n7 = n + n5;
                            final double n8 = n2 + n6;
                            final AxisAlignedBB method1943 = class400.offset(n5, 0.0, n6);
                            if (!this.world.method6978(this, method1943)) {
                                final BlockPos class401 = new BlockPos(n7, this.getPosY() + 1.0, n8);
                                if (this.world.method6978(this, method1943.offset(0.0, 1.0, 0.0))) {
                                    if (this.world.getBlockState(class401).method21731(this.world, class401, this)) {
                                        method1938 = n7;
                                        method1939 = this.getPosY() + 2.0;
                                        method1940 = n8;
                                    }
                                }
                            }
                            else {
                                final BlockPos class402 = new BlockPos(n7, this.getPosY(), n8);
                                if (this.world.getBlockState(class402).method21731(this.world, class402, this)) {
                                    this.method1878(n7, this.getPosY() + 1.0, n8);
                                    return;
                                }
                                final BlockPos class403 = new BlockPos(n7, this.getPosY() - 1.0, n8);
                                if (this.world.getBlockState(class403).method21731(this.world, class403, this) || this.world.getFluidState(class403).isTagged(Class7324.field28319)) {
                                    method1938 = n7;
                                    method1939 = this.getPosY() + 1.0;
                                    method1940 = n8;
                                }
                            }
                        }
                    }
                }
                this.method1878(method1938, method1939, method1940);
            }
            else {
                final double n9 = this.method1930() / 2.0f + class399.method1930() / 2.0f + 0.4;
                final AxisAlignedBB method1944 = class399.getBoundingBox();
                double n10;
                int n11;
                float n12;
                if (!(class399 instanceof Class423)) {
                    n10 = method1944.minY;
                    n11 = 3;
                    n12 = 1.5707964f * ((this.method2755() != Class2226.field13698) ? 1 : -1);
                }
                else {
                    n10 = method1944.maxY;
                    n11 = 2;
                    n12 = 0.0f;
                }
                final float n13 = -this.rotationYaw * 0.017453292f - 3.1415927f + n12;
                final float n14 = -MathHelper.sin(n13);
                final float n15 = -MathHelper.cos(n13);
                final double n16 = (Math.abs(n14) <= Math.abs(n15)) ? (n9 / Math.abs(n15)) : (n9 / Math.abs(n14));
                final AxisAlignedBB method1945 = this.getBoundingBox().offset(-this.getPosX(), -this.getPosY(), -this.getPosZ());
                final ImmutableSet of = ImmutableSet.of((Object)this, (Object)class399);
                final double n17 = this.getPosX() + n14 * n16;
                final double n18 = this.getPosZ() + n15 * n16;
                double n19 = 0.001;
                for (int j = 0; j < n11; ++j) {
                    final double n20 = n10 + n19;
                    if (this.world.method6979(this, method1945.offset(n17, n20, n18), (Set<Entity>)of)) {
                        this.setPosition(n17, n20, n18);
                        return;
                    }
                    ++n19;
                }
                this.setPosition(class399.getPosX(), class399.method1942(1.0) + 0.001, class399.getPosZ());
            }
        }
        else {
            this.setPosition(class399.getPosX(), class399.method1942(1.0) + 0.001, class399.getPosZ());
        }
    }
    
    @Override
    public boolean method1879() {
        return this.method1876();
    }
    
    public float method2724() {
        return 0.42f * this.method1673();
    }
    
    public void method2725() {
        float method2724 = this.method2724();
        if (this.method2653(Class9439.field40481)) {
            method2724 += 0.1f * (this.method2654(Class9439.field40481).method7908() + 1);
        }
        final Vec3d method2725 = this.getMotion();
        final Class5722 class5722 = new Class5722(new Vec3d(method2725.x, method2724, method2725.z));
        if (this instanceof Class756) {
            Class9463.method35173().method35188().method21097(class5722);
        }
        if (!class5722.method16962()) {
            this.method1936(class5722.method16994());
            if (this.method1815()) {
                if (!class5722.method16993()) {
                    final float n = this.rotationYaw * 0.017453292f;
                    this.method1936(this.getMotion().add(-MathHelper.sin(n) * 0.2f, 0.0, MathHelper.cos(n) * 0.2f));
                }
            }
            this.isAirBorne = true;
        }
    }
    
    public void method2726() {
        this.method1936(this.getMotion().add(0.0, -0.03999999910593033, 0.0));
    }
    
    public void method2727(final Class7909<Fluid> class7909) {
        this.method1936(this.getMotion().add(0.0, 0.03999999910593033, 0.0));
    }
    
    public float method2728() {
        return 0.8f;
    }
    
    public void method2729(final Vec3d class5487) {
        if (this.method2749() || this.method1919()) {
            double n = 0.08;
            final boolean b = this.getMotion().y <= 0.0;
            if (b) {
                if (this.method2653(Class9439.field40501)) {
                    n = 0.01;
                    this.fallDistance = 0.0f;
                }
            }
            if (this.method1706() && (this instanceof PlayerEntity && ((PlayerEntity)this).field3025.field27302)) {
                final double method1941 = this.getPosY();
                float n2 = this.method1815() ? 0.9f : this.method2728();
                float n3 = 0.02f;
                float n4 = (float)Class8742.method30210(this);
                if (n4 > 3.0f) {
                    n4 = 3.0f;
                }
                if (!this.onGround) {
                    n4 *= 0.5f;
                }
                if (n4 > 0.0f) {
                    n2 += (0.54600006f - n2) * n4 / 3.0f;
                    n3 += (this.method2732() - n3) * n4 / 3.0f;
                }
                if (this.method2653(Class9439.field40503)) {
                    n2 = 0.96f;
                }
                this.method1724(n3, class5487);
                this.method1671(Class2160.field12826, this.getMotion());
                Vec3d method1942 = this.getMotion();
                if (this.collidedHorizontally) {
                    if (this.method2688()) {
                        method1942 = new Vec3d(method1942.x, 0.2, method1942.z);
                    }
                }
                this.method1936(method1942.mul(n2, 0.800000011920929, n2));
                if (!this.method1698()) {
                    if (!this.method1815()) {
                        final Vec3d method1943 = this.getMotion();
                        double n5 = 0.0;
                        Label_1488: {
                            if (b) {
                                if (Math.abs(method1943.y - 0.005) >= 0.003) {
                                    if (Math.abs(method1943.y - n / 16.0) < 0.003) {
                                        n5 = -0.003;
                                        break Label_1488;
                                    }
                                }
                            }
                            n5 = method1943.y - n / 16.0;
                        }
                        this.setMotion(method1943.x, n5, method1943.z);
                    }
                }
                final Vec3d method1944 = this.getMotion();
                if (this.collidedHorizontally) {
                    if (this.method1669(method1944.x, method1944.y + 0.6000000238418579 - this.getPosY() + method1941, method1944.z)) {
                        this.setMotion(method1944.x, 0.30000001192092896, method1944.z);
                    }
                }
            }
            else if (this.method1723() && (this instanceof PlayerEntity && ((PlayerEntity)this).field3025.field27302)) {
                final double method1945 = this.getPosY();
                this.method1724(0.02f, class5487);
                this.method1671(Class2160.field12826, this.getMotion());
                this.method1936(this.getMotion().scale(0.5));
                if (!this.method1698()) {
                    this.method1936(this.getMotion().add(0.0, -n / 4.0, 0.0));
                }
                final Vec3d method1946 = this.getMotion();
                if (this.collidedHorizontally) {
                    if (this.method1669(method1946.x, method1946.y + 0.6000000238418579 - this.getPosY() + method1945, method1946.z)) {
                        this.setMotion(method1946.x, 0.30000001192092896, method1946.z);
                    }
                }
            }
            else if (!this.method2773()) {
                final BlockPos method1947 = this.getPositionUnderneath();
                final float method1948 = this.world.getBlockState(method1947).method21696().method11865();
                final float n6 = this.onGround ? (method1948 * 0.91f) : 0.91f;
                this.method1724(this.method2731(method1948), class5487);
                this.method1936(this.method2730(this.getMotion()));
                this.method1671(Class2160.field12826, this.getMotion());
                Vec3d method1949 = this.getMotion();
                if (this.collidedHorizontally || this.field2967) {
                    if (this.method2688()) {
                        method1949 = new Vec3d(method1949.x, 0.2, method1949.z);
                    }
                }
                double field22771 = method1949.y;
                if (!this.method2653(Class9439.field40498)) {
                    if (this.world.isRemote && !this.world.method6971(method1947)) {
                        if (this.getPosY() <= 0.0) {
                            field22771 = 0.0;
                        }
                        else {
                            field22771 = -0.1;
                        }
                    }
                    else if (!this.method1698()) {
                        field22771 -= n;
                    }
                }
                else {
                    field22771 += (0.05 * (this.method2654(Class9439.field40498).method7908() + 1) - method1949.y) * 0.2;
                    this.fallDistance = 0.0f;
                }
                this.setMotion(method1949.x * n6, field22771 * 0.9800000190734863, method1949.z * n6);
            }
            else {
                final Vec3d method1950 = this.getMotion();
                if (method1950.y > -0.5) {
                    this.fallDistance = 1.0f;
                }
                final Vec3d method1951 = this.method1791();
                final float n7 = this.rotationPitch * 0.017453292f;
                final double sqrt = Math.sqrt(method1951.x * method1951.x + method1951.z * method1951.z);
                final double sqrt2 = Math.sqrt(Entity.horizontalMag(method1950));
                final double method1952 = method1951.length();
                final float method1953 = MathHelper.cos(n7);
                final float n8 = (float)(method1953 * (double)method1953 * Math.min(1.0, method1952 / 0.4));
                Vec3d class5488 = this.getMotion().add(0.0, n * (-1.0 + n8 * 0.75), 0.0);
                if (class5488.y < 0.0) {
                    if (sqrt > 0.0) {
                        final double n9 = class5488.y * -0.1 * n8;
                        class5488 = class5488.add(method1951.x * n9 / sqrt, n9, method1951.z * n9 / sqrt);
                    }
                }
                if (n7 < 0.0f) {
                    if (sqrt > 0.0) {
                        final double n10 = sqrt2 * -MathHelper.sin(n7) * 0.04;
                        class5488 = class5488.add(-method1951.x * n10 / sqrt, n10 * 3.2, -method1951.z * n10 / sqrt);
                    }
                }
                if (sqrt > 0.0) {
                    class5488 = class5488.add((method1951.x / sqrt * sqrt2 - class5488.x) * 0.1, 0.0, (method1951.z / sqrt * sqrt2 - class5488.z) * 0.1);
                }
                this.method1936(class5488.mul(0.9900000095367432, 0.9800000190734863, 0.9900000095367432));
                this.method1671(Class2160.field12826, this.getMotion());
                if (this.collidedHorizontally) {
                    if (!this.world.isRemote) {
                        final float n11 = (float)((sqrt2 - Math.sqrt(Entity.horizontalMag(this.getMotion()))) * 10.0 - 3.0);
                        if (n11 > 0.0f) {
                            this.method1695(this.method2685((int)n11), 1.0f, 1.0f);
                            this.attackEntityFrom(DamageSource.field32573, n11);
                        }
                    }
                }
                if (this.onGround) {
                    if (!this.world.isRemote) {
                        this.setFlag(7, false);
                    }
                }
            }
        }
        this.field2945 = this.field2946;
        final double n12 = this.getPosX() - this.prevPosX;
        final double n13 = this.getPosZ() - this.prevPosZ;
        final double n14 = (this instanceof Class797) ? (this.getPosY() - this.prevPosY) : 0.0;
        float n15 = MathHelper.sqrt(n12 * n12 + n14 * n14 + n13 * n13) * 4.0f;
        if (n15 > 1.0f) {
            n15 = 1.0f;
        }
        this.field2946 += (n15 - this.field2946) * 0.4f;
        this.field2947 += this.field2946;
    }
    
    private Vec3d method2730(Vec3d class5487) {
        if (this.method2688()) {
            this.fallDistance = 0.0f;
            final double method35654 = MathHelper.clamp(class5487.x, -0.15000000596046448, 0.15000000596046448);
            final double method35655 = MathHelper.clamp(class5487.z, -0.15000000596046448, 0.15000000596046448);
            double max = Math.max(class5487.y, -0.15000000596046448);
            if (max < 0.0) {
                if (this.method2689().method21696() != Class7521.field29805) {
                    if (this.method2772()) {
                        if (this instanceof PlayerEntity) {
                            max = 0.0;
                        }
                    }
                }
            }
            class5487 = new Vec3d(method35654, max, method35655);
        }
        return class5487;
    }
    
    private float method2731(final float n) {
        return this.onGround ? (this.method2732() * (0.21600002f / (n * n * n))) : this.field2955;
    }
    
    public float method2732() {
        return this.field2984;
    }
    
    public void method2733(final float field2984) {
        this.field2984 = field2984;
    }
    
    public boolean method2734(final Entity class399) {
        this.method2639(class399);
        return false;
    }
    
    @Override
    public void method1659() {
        super.method1659();
        this.method2758();
        this.method2760();
        if (!this.world.isRemote) {
            final int method2702 = this.method2702();
            if (method2702 > 0) {
                if (this.field2936 <= 0) {
                    this.field2936 = 20 * (30 - method2702);
                }
                --this.field2936;
                if (this.field2936 <= 0) {
                    this.method2703(method2702 - 1);
                }
            }
            final int method2703 = this.method2704();
            if (method2703 > 0) {
                if (this.field2937 <= 0) {
                    this.field2937 = 20 * (30 - method2703);
                }
                --this.field2937;
                if (this.field2937 <= 0) {
                    this.method2705(method2703 - 1);
                }
            }
            for (final Class2215 class2215 : Class2215.values()) {
                Label_0409: {
                    ItemStack class2216 = null;
                    switch (Class8839.field37150[class2215.method8401().ordinal()]) {
                        case 1: {
                            class2216 = this.field2931.get(class2215.method8402());
                            break;
                        }
                        case 2: {
                            class2216 = this.field2932.get(class2215.method8402());
                            break;
                        }
                        default: {
                            break Label_0409;
                        }
                    }
                    final ItemStack method2704 = this.method2718(class2215);
                    if (!ItemStack.method27643(method2704, class2216)) {
                        ((Class1849)this.world).method6904().method7447(this, new Class4402(this.getEntityId(), class2215, method2704));
                        if (!class2216.method27620()) {
                            this.method2711().method20881(class2216.method27682(class2215));
                        }
                        if (!method2704.method27620()) {
                            this.method2711().method20882(method2704.method27682(class2215));
                        }
                        switch (Class8839.field37150[class2215.method8401().ordinal()]) {
                            case 1: {
                                this.field2931.set(class2215.method8402(), method2704.method27641());
                                break;
                            }
                            case 2: {
                                this.field2932.set(class2215.method8402(), method2704.method27641());
                                break;
                            }
                        }
                    }
                }
            }
            if (this.ticksExisted % 20 == 0) {
                this.method2699().method35601();
            }
            if (!this.glowing) {
                final boolean method2705 = this.method2653(Class9439.field40497);
                if (this.method1829(6) != method2705) {
                    this.setFlag(6, method2705);
                }
            }
            if (this.method2783() && !this.method2786()) {
                this.method2787();
            }
        }
        this.method2736();
        final double n = this.getPosX() - this.prevPosX;
        final double n2 = this.getPosZ() - this.prevPosZ;
        final float n3 = (float)(n * n + n2 * n2);
        float n4 = this.field2951;
        float n5 = 0.0f;
        this.field2960 = this.field2961;
        float n6 = 0.0f;
        if (n3 > 0.0025000002f) {
            n6 = 1.0f;
            n5 = (float)Math.sqrt(n3) * 3.0f;
            final float n7 = (float) MathHelper.method35693(n2, n) * 57.295776f - 90.0f;
            final float method2706 = MathHelper.method35647(MathHelper.method35668(this.rotationYaw) - n7);
            if (95.0f < method2706 && method2706 < 265.0f) {
                n4 = n7 - 180.0f;
            }
            else {
                n4 = n7;
            }
        }
        if (this.field2943 > 0.0f) {
            n4 = this.rotationYaw;
        }
        if (!this.onGround) {
            n6 = 0.0f;
        }
        this.field2961 += (n6 - this.field2961) * 0.3f;
        this.world.method6796().startSection("headTurn");
        final float method2707 = this.method2735(n4, n5);
        this.world.method6796().endSection();
        this.world.method6796().startSection("rangeChecks");
        while (this.rotationYaw - this.prevRotationYaw < -180.0f) {
            this.prevRotationYaw -= 360.0f;
        }
        while (this.rotationYaw - this.prevRotationYaw >= 180.0f) {
            this.prevRotationYaw += 360.0f;
        }
        while (this.field2951 - this.field2952 < -180.0f) {
            this.field2952 -= 360.0f;
        }
        while (this.field2951 - this.field2952 >= 180.0f) {
            this.field2952 += 360.0f;
        }
        while (this.rotationPitch - this.prevRotationPitch < -180.0f) {
            this.prevRotationPitch -= 360.0f;
        }
        while (this.rotationPitch - this.prevRotationPitch >= 180.0f) {
            this.prevRotationPitch += 360.0f;
        }
        while (this.field2953 - this.field2954 < -180.0f) {
            this.field2954 -= 360.0f;
        }
        while (this.field2953 - this.field2954 >= 180.0f) {
            this.field2954 += 360.0f;
        }
        this.world.method6796().endSection();
        this.field2962 += method2707;
        if (this.method2773()) {
            ++this.field2989;
        }
        else {
            this.field2989 = 0;
        }
        if (this.method2783()) {
            this.rotationPitch = 0.0f;
        }
    }
    
    public float method2735(final float n, float n2) {
        this.field2951 += MathHelper.method35668(n - this.field2951) * 0.3f;
        float method35668 = MathHelper.method35668(this.rotationYaw - this.field2951);
        final boolean b = method35668 < -90.0f || method35668 >= 90.0f;
        if (method35668 < -75.0f) {
            method35668 = -75.0f;
        }
        if (method35668 >= 75.0f) {
            method35668 = 75.0f;
        }
        this.field2951 = this.rotationYaw - method35668;
        if (method35668 * method35668 > 2500.0f) {
            this.field2951 += method35668 * 0.2f;
        }
        if (b) {
            n2 *= -1.0f;
        }
        return n2;
    }
    
    public void method2736() {
        if (this.field2985 > 0) {
            --this.field2985;
        }
        if (this.method1919()) {
            this.field2971 = 0;
            this.setPacketCoordinates(this.getPosX(), this.getPosY(), this.getPosZ());
        }
        if (this.field2971 <= 0) {
            if (!this.method2749()) {
                this.method1936(this.getMotion().scale(0.98));
            }
        }
        else {
            final double n = this.getPosX() + (this.field2972 - this.getPosX()) / this.field2971;
            final double n2 = this.getPosY() + (this.field2973 - this.getPosY()) / this.field2971;
            final double n3 = this.getPosZ() + (this.field2974 - this.getPosZ()) / this.field2971;
            this.rotationYaw += (float)(MathHelper.method35669(this.field2975 - this.rotationYaw) / this.field2971);
            this.rotationPitch += (float)((this.field2976 - this.rotationPitch) / this.field2971);
            --this.field2971;
            this.setPosition(n, n2, n3);
            this.method1655(this.rotationYaw, this.rotationPitch);
        }
        if (this.field2978 > 0) {
            this.field2953 += (float)(MathHelper.method35669(this.field2977 - this.field2953) / this.field2978);
            --this.field2978;
        }
        final Vec3d method1935 = this.getMotion();
        double field22770 = method1935.x;
        double field22771 = method1935.y;
        double field22772 = method1935.z;
        if (Math.abs(method1935.x) < 0.003) {
            field22770 = 0.0;
        }
        if (Math.abs(method1935.y) < 0.003) {
            field22771 = 0.0;
        }
        if (Math.abs(method1935.z) < 0.003) {
            field22772 = 0.0;
        }
        this.setMotion(field22770, field22771, field22772);
        this.world.method6796().startSection("ai");
        if (!this.method2722()) {
            if (this.method2749()) {
                this.world.method6796().startSection("newAi");
                this.method2738();
                this.world.method6796().endSection();
            }
        }
        else {
            this.field2967 = false;
            this.field2968 = 0.0f;
            this.field2970 = 0.0f;
        }
        this.world.method6796().endSection();
        this.world.method6796().startSection("jump");
        Label_0551: {
            if (!this.field2967) {
                this.field2985 = 0;
            }
            else if (this.submergedHeight > 0.0 && (!this.onGround || this.submergedHeight > 0.4)) {
                this.method2727(Class7324.field28319);
            }
            else if (!this.method1723()) {
                if (!this.onGround) {
                    if (this.submergedHeight <= 0.0) {
                        break Label_0551;
                    }
                    if (this.submergedHeight > 0.4) {
                        break Label_0551;
                    }
                }
                if (this.field2985 == 0) {
                    this.method2725();
                    this.field2985 = 10;
                }
            }
            else {
                this.method2727(Class7324.field28320);
            }
        }
        this.world.method6796().endSection();
        this.world.method6796().startSection("travel");
        this.field2968 *= 0.98f;
        this.field2970 *= 0.98f;
        this.method2737();
        final AxisAlignedBB method1936 = this.getBoundingBox();
        this.method2729(new Vec3d(this.field2968, this.field2969, this.field2970));
        this.world.method6796().endSection();
        this.world.method6796().startSection("push");
        if (this.field2993 > 0) {
            --this.field2993;
            this.method2740(method1936, this.getBoundingBox());
        }
        this.method2739();
        this.world.method6796().endSection();
    }
    
    private void method2737() {
        boolean b = false;
        Label_0125: {
            if (this.method1829(7)) {
                if (!this.onGround) {
                    if (!this.isPassenger()) {
                        final ItemStack method2718 = this.method2718(Class2215.field13604);
                        if (method2718.getItem() == Items.field31584 && Class4080.method12285(method2718)) {
                            b = true;
                            if (!this.world.isRemote) {
                                if ((this.field2989 + 1) % 20 == 0) {
                                    method2718.method27636(1, this, class511 -> class511.method2794(Class2215.field13604));
                                }
                            }
                        }
                        else {
                            b = false;
                        }
                        break Label_0125;
                    }
                }
            }
            b = false;
        }
        if (!this.world.isRemote) {
            this.setFlag(7, b);
        }
    }
    
    public void method2738() {
    }
    
    public void method2739() {
        final List<Entity> method6737 = this.world.method6737(this, this.getBoundingBox(), Class9170.method33474(this));
        if (!method6737.isEmpty()) {
            final int method6738 = this.world.method6765().method31217(Class8878.field37333);
            if (method6738 > 0) {
                if (method6737.size() > method6738 - 1) {
                    if (this.rand.nextInt(4) == 0) {
                        int n = 0;
                        for (int i = 0; i < method6737.size(); ++i) {
                            if (!((Entity)method6737.get(i)).isPassenger()) {
                                ++n;
                            }
                        }
                        if (n > method6738 - 1) {
                            this.attackEntityFrom(DamageSource.field32568, 6.0f);
                        }
                    }
                }
            }
            for (int j = 0; j < method6737.size(); ++j) {
                this.method2741((Entity)method6737.get(j));
            }
        }
    }
    
    public void method2740(final AxisAlignedBB class6221, final AxisAlignedBB class6222) {
        final List<Entity> method7127 = this.world.method7127(this, class6221.offset(class6222));
        if (method7127.isEmpty()) {
            if (this.collidedHorizontally) {
                this.field2993 = 0;
            }
        }
        else {
            for (int i = 0; i < method7127.size(); ++i) {
                final Entity class6223 = method7127.get(i);
                if (class6223 instanceof LivingEntity) {
                    this.method2742((LivingEntity)class6223);
                    this.field2993 = 0;
                    this.method1936(this.getMotion().scale(-0.2));
                    break;
                }
            }
        }
        if (!this.world.isRemote) {
            if (this.field2993 <= 0) {
                this.method2761(4, false);
            }
        }
    }
    
    public void method2741(final Entity class399) {
        class399.method1737(this);
    }
    
    public void method2742(final LivingEntity class511) {
    }
    
    public void method2743(final int field2993) {
        this.field2993 = field2993;
        if (!this.world.isRemote) {
            this.method2761(4, true);
        }
    }
    
    public boolean method2744() {
        return (this.dataManager.get(LivingEntity.field2920) & 0x4) != 0x0;
    }
    
    @Override
    public void stopRiding() {
        final Entity method1920 = this.method1920();
        super.stopRiding();
        if (method1920 != null) {
            if (method1920 != this.method1920()) {
                if (!this.world.isRemote) {
                    this.method2723(method1920);
                }
            }
        }
    }
    
    @Override
    public void method1772() {
        super.method1772();
        this.field2960 = this.field2961;
        this.field2961 = 0.0f;
        this.fallDistance = 0.0f;
    }
    
    @Override
    public void method1788(final double field2972, final double field2973, final double field2974, final float n, final float n2, final int field2975, final boolean b) {
        this.field2972 = field2972;
        this.field2973 = field2973;
        this.field2974 = field2974;
        this.field2975 = n;
        this.field2976 = n2;
        this.field2971 = field2975;
    }
    
    @Override
    public void method1789(final float n, final int field2978) {
        this.field2977 = n;
        this.field2978 = field2978;
    }
    
    public void method2745(final boolean field2967) {
        this.field2967 = field2967;
    }
    
    public void method2746(final Entity class399, final int n) {
        if (!class399.removed) {
            if (!this.world.isRemote) {
                if (!(class399 instanceof Class427)) {
                    if (!(class399 instanceof Class402)) {
                        if (!(class399 instanceof Class508)) {
                            return;
                        }
                    }
                }
                ((Class1849)this.world).method6904().method7447(class399, new Class4304(class399.getEntityId(), this.getEntityId(), n));
            }
        }
    }
    
    public boolean method2747(final Entity class399) {
        return this.world.rayTraceBlocks(new RayTraceContext(new Vec3d(this.getPosX(), this.method1944(), this.getPosZ()), new Vec3d(class399.getPosX(), class399.method1944(), class399.getPosZ()), RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, this)).getType() == RayTraceResult.Type.MISS;
    }
    
    @Override
    public float getYaw(final float n) {
        return (n != 1.0f) ? MathHelper.method35700(n, this.field2954, this.field2953) : this.field2953;
    }
    
    public float method2748(final float n) {
        float n2 = this.field2943 - this.field2942;
        if (n2 < 0.0f) {
            ++n2;
        }
        return this.field2942 + n2 * n;
    }
    
    public boolean method2749() {
        return !this.world.isRemote;
    }
    
    @Override
    public boolean method1749() {
        return !this.removed;
    }
    
    @Override
    public boolean method1750() {
        return this.method1768() && !this.method2688();
    }
    
    @Override
    public void method1739() {
        this.velocityChanged = (this.rand.nextDouble() >= this.method2710(Class8107.field33407).method23950());
    }
    
    @Override
    public float method1844() {
        return this.field2953;
    }
    
    @Override
    public void method1845(final float field2953) {
        this.field2953 = field2953;
    }
    
    @Override
    public void method1846(final float field2951) {
        this.field2951 = field2951;
    }
    
    public float method2750() {
        return this.field2986;
    }
    
    public void method2751(float field2986) {
        if (field2986 < 0.0f) {
            field2986 = 0.0f;
        }
        this.field2986 = field2986;
    }
    
    public void method2752() {
    }
    
    public void method2753() {
    }
    
    public void method2754() {
        this.field2979 = true;
    }
    
    public abstract Class2226 method2755();
    
    public boolean method2756() {
        return (this.dataManager.get(LivingEntity.field2920) & 0x1) > 0;
    }
    
    public Class316 method2757() {
        return ((this.dataManager.get(LivingEntity.field2920) & 0x2) <= 0) ? Class316.field1877 : Class316.field1878;
    }
    
    private void method2758() {
        if (this.method2756()) {
            if (!ItemStack.method27646(this.method2715(this.method2757()), this.field2987)) {
                this.method2770();
            }
            else {
                this.field2987.method27694(this.world, this, this.method2767());
                if (this.method2759()) {
                    this.method2763(this.field2987, 5);
                }
                if (--this.field2988 == 0) {
                    if (!this.world.isRemote) {
                        if (!this.field2987.method27655()) {
                            this.method2765();
                        }
                    }
                }
            }
        }
    }
    
    private boolean method2759() {
        final int method2767 = this.method2767();
        final Class9082 method2768 = this.field2987.getItem().method11744();
        return ((method2768 != null && method2768.method32748()) | method2767 <= this.field2987.method27652() - 7) && method2767 % 4 == 0;
    }
    
    private void method2760() {
        this.field2995 = this.field2994;
        if (!this.method1818()) {
            this.field2994 = Math.max(0.0f, this.field2994 - 0.09f);
        }
        else {
            this.field2994 = Math.min(1.0f, this.field2994 + 0.09f);
        }
    }
    
    public void method2761(final int n, final boolean b) {
        final byte byteValue = this.dataManager.get(LivingEntity.field2920);
        int n2;
        if (!b) {
            n2 = (byteValue & ~n);
        }
        else {
            n2 = (byteValue | n);
        }
        this.dataManager.set(LivingEntity.field2920, (byte)n2);
    }
    
    public void method2762(final Class316 class316) {
        final ItemStack method2715 = this.method2715(class316);
        if (!method2715.method27620()) {
            if (!this.method2756()) {
                this.field2987 = method2715;
                this.field2988 = method2715.method27652();
                if (!this.world.isRemote) {
                    this.method2761(1, true);
                    this.method2761(2, class316 == Class316.field1878);
                }
            }
        }
    }
    
    @Override
    public void method1880(final DataParameter<?> class8810) {
        super.method1880(class8810);
        if (!LivingEntity.field2926.equals(class8810)) {
            if (LivingEntity.field2920.equals(class8810)) {
                if (this.world.isRemote) {
                    if (this.method2756() && this.field2987.method27620()) {
                        this.field2987 = this.method2715(this.method2757());
                        if (!this.field2987.method27620()) {
                            this.field2988 = this.field2987.method27652();
                        }
                    }
                    else if (!this.method2756()) {
                        if (!this.field2987.method27620()) {
                            this.field2987 = ItemStack.field34174;
                            this.field2988 = 0;
                        }
                    }
                }
            }
        }
        else if (this.world.isRemote) {
            this.method2780().ifPresent(this::method2785);
        }
    }
    
    @Override
    public void method1927(final Class2042 class2042, final Vec3d class2043) {
        super.method1927(class2042, class2043);
        this.field2954 = this.field2953;
        this.field2951 = this.field2953;
        this.field2952 = this.field2951;
    }
    
    public void method2763(final ItemStack class8321, final int n) {
        if (!class8321.method27620()) {
            if (this.method2756()) {
                if (class8321.method27653() == Class1992.field11156) {
                    this.method1695(this.method2686(class8321), 0.5f, this.world.rand.nextFloat() * 0.1f + 0.9f);
                }
                if (class8321.method27653() == Class1992.field11155) {
                    this.method2764(class8321, n);
                    this.method1695(this.method2687(class8321), 0.5f + 0.5f * this.rand.nextInt(2), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f);
                }
            }
        }
    }
    
    private void method2764(final ItemStack class8321, final int n) {
        for (int i = 0; i < n; ++i) {
            final Vec3d method16755 = new Vec3d((this.rand.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0).rotatePitch(-this.rotationPitch * 0.017453292f).rotateYaw(-this.rotationYaw * 0.017453292f);
            final Vec3d method16756 = new Vec3d((this.rand.nextFloat() - 0.5) * 0.3, -this.rand.nextFloat() * 0.6 - 0.3, 0.6).rotatePitch(-this.rotationPitch * 0.017453292f).rotateYaw(-this.rotationYaw * 0.017453292f).add(this.getPosX(), this.method1944(), this.getPosZ());
            this.world.method6709(new Class6910(Class8432.field34629, class8321), method16756.x, method16756.y, method16756.z, method16755.x, method16755.y + 0.05, method16755.z);
        }
    }
    
    public void method2765() {
        if (this.field2987.equals(this.method2715(this.method2757()))) {
            if (!this.field2987.method27620()) {
                if (this.method2756()) {
                    this.method2763(this.field2987, 16);
                    this.method2716(this.method2757(), this.field2987.method27626(this.world, this));
                    this.method2770();
                }
            }
        }
        else {
            this.method2769();
        }
    }
    
    public ItemStack method2766() {
        return this.field2987;
    }
    
    public int method2767() {
        return this.field2988;
    }
    
    public int method2768() {
        return this.method2756() ? (this.field2987.method27652() - this.method2767()) : 0;
    }
    
    public void method2769() {
        if (!this.field2987.method27620()) {
            this.field2987.method27654(this.world, this, this.method2767());
            if (this.field2987.method27655()) {
                this.method2758();
            }
        }
        this.method2770();
    }
    
    public void method2770() {
        if (!this.world.isRemote) {
            this.method2761(1, false);
        }
        this.field2987 = ItemStack.field34174;
        this.field2988 = 0;
    }
    
    public boolean method2771() {
        if (this.method2756() && !this.field2987.method27620()) {
            final Item method27622 = this.field2987.getItem();
            return method27622.method11725(this.field2987) == Class1992.field11157 && method27622.method11726(this.field2987) - this.field2988 >= 5;
        }
        return false;
    }
    
    public boolean method2772() {
        return this.method1809();
    }
    
    public boolean method2773() {
        return this.method1829(7);
    }
    
    @Override
    public boolean method1818() {
        return super.method1818() || (!this.method2773() && this.method1654() == Pose.field1664);
    }
    
    public int method2774() {
        return this.field2989;
    }
    
    public boolean method2775(final double n, final double n2, final double n3, final boolean b) {
        final double method1938 = this.getPosX();
        final double method1939 = this.getPosY();
        final double method1940 = this.getPosZ();
        double n4 = n2;
        int n5 = 0;
        BlockPos class354 = new BlockPos(n, n2, n3);
        final World field2391 = this.world;
        if (field2391.method6971(class354)) {
            int n6 = 0;
            while (n6 == 0 && class354.getY() > 0) {
                final BlockPos method1941 = class354.method1139();
                if (!field2391.getBlockState(method1941).method21697().method26440()) {
                    --n4;
                    class354 = method1941;
                }
                else {
                    n6 = 1;
                }
            }
            if (n6 != 0) {
                this.method1878(n, n4, n3);
                if (field2391.method6977(this)) {
                    if (!field2391.method6968(this.getBoundingBox())) {
                        n5 = 1;
                    }
                }
            }
        }
        if (n5 != 0) {
            if (b) {
                field2391.method6761(this, (byte)46);
            }
            if (this instanceof Class787) {
                ((Class787)this).method4150().method24733();
            }
            return true;
        }
        this.method1878(method1938, method1939, method1940);
        return false;
    }
    
    public boolean method2776() {
        return true;
    }
    
    public boolean method2777() {
        return true;
    }
    
    public void method2778(final BlockPos class354, final boolean b) {
    }
    
    public boolean method2779(final ItemStack class8321) {
        return false;
    }
    
    @Override
    public IPacket<?> method1932() {
        return new Class4276(this);
    }
    
    @Override
    public EntitySize method1933(final Pose class290) {
        return (class290 != Pose.field1665) ? super.method1933(class290).method27561(this.method2626()) : LivingEntity.field2927;
    }
    
    public Optional<BlockPos> method2780() {
        return this.dataManager.get(LivingEntity.field2926);
    }
    
    public void method2781(final BlockPos value) {
        this.dataManager.set(LivingEntity.field2926, Optional.of(value));
    }
    
    public void method2782() {
        this.dataManager.set(LivingEntity.field2926, Optional.empty());
    }
    
    public boolean method2783() {
        return this.method2780().isPresent();
    }
    
    public void method2784(final BlockPos class354) {
        if (this.isPassenger()) {
            this.stopRiding();
        }
        final Class7096 method6701 = this.world.getBlockState(class354);
        if (method6701.method21696() instanceof Class3900) {
            this.world.setBlockState(class354, ((StateHolder<Object, Class7096>)method6701).with((IProperty<Comparable>)Class3900.field17600, true), 3);
        }
        this.method1653(Pose.field1665);
        this.method2785(class354);
        this.method2781(class354);
        this.method1936(Vec3d.ZERO);
        this.isAirBorne = true;
    }
    
    private void method2785(final BlockPos class354) {
        this.setPosition(class354.getX() + 0.5, class354.getY() + 0.6875f, class354.getZ() + 0.5);
    }
    
    private boolean method2786() {
        return this.method2780().map(class354 -> this.world.getBlockState(class354).method21696() instanceof Class3900).orElse(false);
    }
    
    public void method2787() {
        this.method2780().filter(this.world::method6971).ifPresent(class354 -> {
            this.world.getBlockState(class354);
            final StateHolder<Object, Class7096> class355;
            if (!(!(((Class7096)class355).method21696() instanceof Class3900))) {
                this.world.setBlockState(class354, class355.with((IProperty<Comparable>)Class3900.field17600, false), 3);
                final Vec3d class356 = Class3900.method11991(this.getType(), this.world, class354, 0).orElseGet(() -> {
                    class357.method1137();
                    final BlockPos class358;
                    return (Vec3d)(Vec3d)new Vec3d(class358.getX() + 0.5, class358.getY() + 0.1, class358.getZ() + 0.5);
                });
                this.setPosition(class356.x, class356.y, class356.z);
            }
            return;
        });
        this.method1653(Pose.field1663);
        this.method2782();
    }
    
    @Nullable
    public Direction method2788() {
        final BlockPos class354 = this.method2780().orElse(null);
        return (class354 == null) ? null : Class3900.method11985(this.world, class354);
    }
    
    @Override
    public boolean method1769() {
        return !this.method2783() && super.method1769();
    }
    
    @Override
    public final float method1890(final Pose class290, final EntitySize class291) {
        return (class290 != Pose.field1665) ? this.method2789(class290, class291) : 0.2f;
    }
    
    public float method2789(final Pose class290, final EntitySize class291) {
        return super.method1890(class290, class291);
    }
    
    public ItemStack method2790(final ItemStack class8321) {
        return ItemStack.field34174;
    }
    
    public ItemStack method2791(final World class1847, final ItemStack class1848) {
        if (class1848.method27695()) {
            class1847.method6706(null, this.getPosX(), this.getPosY(), this.getPosZ(), this.method2687(class1848), Class286.field1584, 1.0f, 1.0f + (class1847.rand.nextFloat() - class1847.rand.nextFloat()) * 0.4f);
            this.method2792(class1848, class1847, this);
            if (!(this instanceof PlayerEntity) || !((PlayerEntity)this).field3025.field27304) {
                class1848.method27693(1);
            }
        }
        return class1848;
    }
    
    private void method2792(final ItemStack class8321, final World class8322, final LivingEntity class8323) {
        final Item method27622 = class8321.getItem();
        if (method27622.method11743()) {
            for (final Pair pair : method27622.method11744().method32749()) {
                if (class8322.isRemote) {
                    continue;
                }
                if (pair.getLeft() == null) {
                    continue;
                }
                if (class8322.rand.nextFloat() >= (float)pair.getRight()) {
                    continue;
                }
                class8323.method2655(new Class1948((Class1948)pair.getLeft()));
            }
        }
    }
    
    private static byte method2793(final Class2215 class2215) {
        switch (Class8839.field37151[class2215.ordinal()]) {
            case 1: {
                return 47;
            }
            case 2: {
                return 48;
            }
            case 3: {
                return 49;
            }
            case 4: {
                return 50;
            }
            case 5: {
                return 52;
            }
            case 6: {
                return 51;
            }
            default: {
                return 47;
            }
        }
    }
    
    public void method2794(final Class2215 class2215) {
        this.world.method6761(this, method2793(class2215));
    }
    
    public void method2795(final Class316 class316) {
        this.method2794((class316 != Class316.field1877) ? Class2215.field13601 : Class2215.field13600);
    }
    
    static {
        field2918 = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
        field2919 = new Class7919(LivingEntity.field2918, "Sprinting speed boost", 0.30000001192092896, Class2157.field12811).method25640(false);
        field2920 = EntityDataManager.method33564(LivingEntity.class, Class7709.field30653);
        field2921 = EntityDataManager.method33564(LivingEntity.class, Class7709.field30655);
        field2922 = EntityDataManager.method33564(LivingEntity.class, Class7709.field30654);
        field2923 = EntityDataManager.method33564(LivingEntity.class, Class7709.field30661);
        field2924 = EntityDataManager.method33564(LivingEntity.class, Class7709.field30654);
        field2925 = EntityDataManager.method33564(LivingEntity.class, Class7709.field30654);
        field2926 = EntityDataManager.method33564(LivingEntity.class, Class7709.field30665);
        field2927 = EntitySize.method27564(0.2f, 0.2f);
    }
}
