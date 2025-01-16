// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.util.ArrayList;
import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Random;
import java.util.List;
import javax.annotation.Nullable;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class Class796 extends Class795 implements Class797
{
    private static final DataParameter<Integer> field4247;
    private static final Predicate<Class759> field4248;
    private static final Item field4249;
    private static final Set<Item> field4250;
    private static final Map<EntityType<?>, Class7795> field4251;
    public float field4252;
    public float field4253;
    public float field4254;
    public float field4255;
    private float field4256;
    private boolean field4257;
    private BlockPos field4258;
    
    public Class796(final EntityType<? extends Class796> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4256 = 1.0f;
        this.field4110 = new Class6574(this, 10, false);
        this.method4145(Class257.field1214, -1.0f);
        this.method4145(Class257.field1215, -1.0f);
        this.method4145(Class257.field1226, -1.0f);
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, Class5496 class1854, final CompoundNBT class1855) {
        this.method4503(this.rand.nextInt(5));
        if (class1854 == null) {
            class1854 = new Class5497();
            ((Class5497)class1854).method16801(false);
        }
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    @Override
    public void method4142() {
        this.field4245 = new Class3495(this);
        this.field4114.method22062(0, new Class3607(this, 1.25));
        this.field4114.method22062(0, new Class3490(this));
        this.field4114.method22062(1, new Class3628(this, PlayerEntity.class, 8.0f));
        this.field4114.method22062(2, this.field4245);
        this.field4114.method22062(2, new Class3528(this, 1.0, 5.0f, 1.0f, true));
        this.field4114.method22062(2, new Class3518(this, 1.0));
        this.field4114.method22062(3, new Class3445(this));
        this.field4114.method22062(3, new Class3502(this, 1.0, 3.0f, 7.0f));
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2711().method20873(Class8107.field33409);
        this.method2710(Class8107.field33405).method23941(6.0);
        this.method2710(Class8107.field33409).method23941(0.4000000059604645);
        this.method2710(Class8107.field33408).method23941(0.20000000298023224);
    }
    
    @Override
    public Class7746 method4143(final World class1847) {
        final Class7750 class1848 = new Class7750(this, class1847);
        class1848.method24750(false);
        class1848.method24741(true);
        class1848.method24751(true);
        return class1848;
    }
    
    @Override
    public float method2789(final Pose class290, final EntitySize class291) {
        return class291.field34098 * 0.6f;
    }
    
    @Override
    public void method2736() {
        method4496(this.world, this);
        Label_0071: {
            if (this.field4258 != null) {
                if (this.field4258.withinDistance(this.method1934(), 3.46)) {
                    if (this.world.getBlockState(this.field4258).method21696() == Class7521.field29335) {
                        break Label_0071;
                    }
                }
            }
            this.field4257 = false;
            this.field4258 = null;
        }
        super.method2736();
        this.method4495();
    }
    
    @Override
    public void method2778(final BlockPos field4258, final boolean field4259) {
        this.field4258 = field4258;
        this.field4257 = field4259;
    }
    
    public boolean method4494() {
        return this.field4257;
    }
    
    private void method4495() {
        this.field4255 = this.field4252;
        this.field4254 = this.field4253;
        this.field4253 += (float)(((!this.onGround && !this.isPassenger()) ? 4 : -1) * 0.3);
        this.field4253 = MathHelper.clamp(this.field4253, 0.0f, 1.0f);
        if (!this.onGround) {
            if (this.field4256 < 1.0f) {
                this.field4256 = 1.0f;
            }
        }
        this.field4256 *= (float)0.9;
        final Vec3d method1935 = this.getMotion();
        if (!this.onGround) {
            if (method1935.y < 0.0) {
                this.method1936(method1935.mul(1.0, 0.6, 1.0));
            }
        }
        this.field4252 += this.field4256 * 2.0f;
    }
    
    private static boolean method4496(final World class1847, final Entity class1848) {
        if (class1848.method1768()) {
            if (!class1848.method1696()) {
                if (class1847.rand.nextInt(50) == 0) {
                    final List<Entity> method6739 = class1847.method6739((Class<? extends Entity>)Class759.class, class1848.getBoundingBox().intersect(20.0), (Predicate<? super Entity>)Class796.field4248);
                    if (!method6739.isEmpty()) {
                        final Class759 class1849 = method6739.get(class1847.rand.nextInt(method6739.size()));
                        if (!class1849.method1696()) {
                            class1847.method6706(null, class1848.getPosX(), class1848.getPosY(), class1848.getPosZ(), method4500(class1849.getType()), class1848.method1922(), 0.7f, method4501(class1847.rand));
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean method4195(final PlayerEntity playerEntity, final Class316 class513) {
        final ItemStack method2715 = playerEntity.method2715(class513);
        if (method2715.getItem() instanceof Class3831) {
            return super.method4195(playerEntity, class513);
        }
        if (!this.method4480() && Class796.field4250.contains(method2715.getItem())) {
            if (!playerEntity.field3025.field27304) {
                method2715.method27693(1);
            }
            if (!this.method1696()) {
                this.world.method6706(null, this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field35422, this.method1922(), 1.0f, 1.0f + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f);
            }
            if (!this.world.isRemote) {
                if (this.rand.nextInt(10) != 0) {
                    this.world.method6761(this, (byte)6);
                }
                else {
                    this.method4487(playerEntity);
                    this.world.method6761(this, (byte)7);
                }
            }
            return true;
        }
        if (method2715.getItem() != Class796.field4249) {
            if (!this.method4504()) {
                if (this.method4480()) {
                    if (this.method4489(playerEntity)) {
                        if (!this.world.isRemote) {
                            this.field4245.method11058(!this.method4483());
                        }
                        return true;
                    }
                }
            }
            return super.method4195(playerEntity, class513);
        }
        if (!playerEntity.field3025.field27304) {
            method2715.method27693(1);
        }
        this.method2655(new Class1948(Class9439.field40492, 900));
        if (playerEntity.method2889() || !this.method1850()) {
            this.attackEntityFrom(DamageSource.method25695(playerEntity), Float.MAX_VALUE);
        }
        return true;
    }
    
    @Override
    public boolean method4357(final ItemStack class8321) {
        return false;
    }
    
    public static boolean method4497(final EntityType<Class796> class7499, final Class1851 class7500, final Class2101 class7501, final BlockPos class7502, final Random random) {
        final Block method21696 = class7500.getBlockState(class7502.method1139()).getBlock();
        if (!method21696.method11785(Class7188.field27907)) {
            if (method21696 != Class7521.field29155) {
                if (!(method21696 instanceof Class4029)) {
                    if (method21696 != Class7521.field29147) {
                        return false;
                    }
                }
            }
        }
        if (class7500.method6993(class7502, 0) > 8) {
            return true;
        }
        return false;
    }
    
    @Override
    public boolean method1705(final float n, final float n2) {
        return false;
    }
    
    @Override
    public void method1701(final double n, final boolean b, final Class7096 class7096, final BlockPos class7097) {
    }
    
    @Override
    public boolean method4365(final Class789 class789) {
        return false;
    }
    
    @Nullable
    @Override
    public Class788 method4349(final Class788 class788) {
        return null;
    }
    
    public static void method4498(final World class1847, final Entity class1848) {
        if (!class1848.method1696()) {
            if (!method4496(class1847, class1848)) {
                if (class1847.rand.nextInt(200) == 0) {
                    class1847.method6706(null, class1848.getPosX(), class1848.getPosY(), class1848.getPosZ(), method4499(class1847.rand), class1848.method1922(), 1.0f, method4501(class1847.rand));
                }
            }
        }
    }
    
    @Override
    public boolean method2734(final Entity class399) {
        return class399.attackEntityFrom(DamageSource.method25693(this), 3.0f);
    }
    
    @Nullable
    @Override
    public Class7795 method4160() {
        return method4499(this.rand);
    }
    
    private static Class7795 method4499(final Random random) {
        if (random.nextInt(1000) != 0) {
            return Class8520.field35420;
        }
        final ArrayList arrayList = Lists.newArrayList((Iterable)Class796.field4251.keySet());
        return method4500((EntityType<?>)arrayList.get(random.nextInt(arrayList.size())));
    }
    
    private static Class7795 method4500(final EntityType<?> key) {
        return Class796.field4251.getOrDefault(key, Class8520.field35420);
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35424;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35421;
    }
    
    @Override
    public void method1691(final BlockPos class354, final Class7096 class355) {
        this.method1695(Class8520.field35453, 0.15f, 1.0f);
    }
    
    @Override
    public float method1693(final float n) {
        this.method1695(Class8520.field35423, 0.15f, 1.0f);
        return n + this.field4253 / 2.0f;
    }
    
    @Override
    public boolean method1694() {
        return true;
    }
    
    @Override
    public float method2721() {
        return method4501(this.rand);
    }
    
    private static float method4501(final Random random) {
        return (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f;
    }
    
    @Override
    public Class286 method1922() {
        return Class286.field1584;
    }
    
    @Override
    public boolean method1750() {
        return true;
    }
    
    @Override
    public void method2741(final Entity class399) {
        if (!(class399 instanceof PlayerEntity)) {
            super.method2741(class399);
        }
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        if (!this.method1849(class7929)) {
            if (this.field4245 != null) {
                this.field4245.method11058(false);
            }
            return super.attackEntityFrom(class7929, n);
        }
        return false;
    }
    
    public int method4502() {
        return MathHelper.method35651(this.dataManager.get(Class796.field4247), 0, 4);
    }
    
    public void method4503(final int i) {
        this.dataManager.set(Class796.field4247, i);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class796.field4247, 0);
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        class51.putInt("Variant", this.method4502());
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        this.method4503(class51.getInt("Variant"));
    }
    
    public boolean method4504() {
        return !this.onGround;
    }
    
    static {
        field4247 = EntityDataManager.method33564(Class796.class, Class7709.field30654);
        field4248 = new Class173();
        field4249 = Items.field31424;
        field4250 = Sets.newHashSet((Object[])new Item[] { Items.field31314, Items.field31430, Items.field31429, Items.field31576 });
        field4251 = Util.method27851(Maps.newHashMap(), hashMap -> {
            hashMap.put(EntityType.field28962, Class8520.field35425);
            hashMap.put(EntityType.field28965, Class8520.field35444);
            hashMap.put(EntityType.field28969, Class8520.field35426);
            hashMap.put(EntityType.field28973, Class8520.field35427);
            hashMap.put(EntityType.field28974, Class8520.field35428);
            hashMap.put(EntityType.field28976, Class8520.field35429);
            hashMap.put(EntityType.field28978, Class8520.field35430);
            hashMap.put(EntityType.field28980, Class8520.field35431);
            hashMap.put(EntityType.field28986, Class8520.field35432);
            hashMap.put(EntityType.field28988, Class8520.field35433);
            hashMap.put(EntityType.field28990, Class8520.field35434);
            hashMap.put(EntityType.field28991, Class8520.field35435);
            hashMap.put(EntityType.field28998, Class8520.field35436);
            hashMap.put(EntityType.field29055, Class8520.field35437);
            hashMap.put(EntityType.field29045, Class8520.field35438);
            hashMap.put(EntityType.field29056, Class8520.field35439);
            hashMap.put(EntityType.field29020, Class8520.field35440);
            hashMap.put(EntityType.field29022, Class8520.field35441);
            hashMap.put(EntityType.field29023, Class8520.field35442);
            hashMap.put(EntityType.field29025, Class8520.field35443);
            hashMap.put(EntityType.field29030, Class8520.field35444);
            hashMap.put(EntityType.field29032, Class8520.field35445);
            hashMap.put(EntityType.field29041, Class8520.field35446);
            hashMap.put(EntityType.field29044, Class8520.field35447);
            hashMap.put(EntityType.field29047, Class8520.field35448);
            hashMap.put(EntityType.field29048, Class8520.field35449);
            hashMap.put(EntityType.field29049, Class8520.field35450);
            hashMap.put(EntityType.field29052, Class8520.field35451);
            hashMap.put(EntityType.field29054, Class8520.field35452);
        });
    }
}
