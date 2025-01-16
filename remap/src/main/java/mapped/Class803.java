// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import net.minecraft.entity.*;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.List;
import javax.annotation.Nullable;
import java.util.function.Predicate;
import java.util.UUID;
import java.util.Optional;

public class Class803 extends Class789
{
    private static final DataParameter<Integer> field4310;
    private static final DataParameter<Byte> field4311;
    private static final DataParameter<Optional<UUID>> field4312;
    private static final DataParameter<Optional<UUID>> field4313;
    private static final Predicate<Class427> field4314;
    private static final Predicate<Entity> field4315;
    private static final Predicate<Entity> field4316;
    private static final Predicate<Entity> field4317;
    private Class3446 field4318;
    private Class3446 field4319;
    private Class3446 field4320;
    private float field4321;
    private float field4322;
    private float field4323;
    private float field4324;
    private int field4325;
    
    public Class803(final EntityType<? extends Class803> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4109 = new Class7728(this);
        this.field4110 = new Class6570(this);
        this.method4145(Class257.field1218, 0.0f);
        this.method4145(Class257.field1219, 0.0f);
        this.method4193(true);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class803.field4312, Optional.empty());
        this.dataManager.register(Class803.field4313, Optional.empty());
        this.dataManager.register(Class803.field4310, 0);
        this.dataManager.register(Class803.field4311, (Byte)0);
    }
    
    @Override
    public void method4142() {
        this.field4318 = new Class3555<Object>(this, Class789.class, 10, false, false, class511 -> class511 instanceof Class818 || class511 instanceof Class792);
        this.field4319 = new Class3555<Object>(this, Class793.class, 10, false, false, Class793.field4242);
        this.field4320 = new Class3555<Object>(this, Class833.class, 20, false, false, class512 -> class512 instanceof Class834);
        this.field4114.method22062(0, new Class3491(this));
        this.field4114.method22062(1, new Class3505(this));
        this.field4114.method22062(2, new Class3609(this, 2.2));
        this.field4114.method22062(3, new Class3590(this, 1.0));
        this.field4114.method22062(4, new Class3448<Object>(this, PlayerEntity.class, 16.0f, 1.6, 1.4, class513 -> {
            final boolean b;
            if (!(!Class803.field4317.test(class513))) {
                if (!this.method4676(class513.method1865())) {
                    if (!this.method4658()) {
                        return b;
                    }
                }
            }
            return b;
        }));
        this.field4114.method22062(4, new Class3448<Object>(this, Class799.class, 8.0f, 1.6, 1.4, class514 -> !((Class799)class514).method4480() && !this.method4658()));
        this.field4114.method22062(5, new Class3522(this));
        this.field4114.method22062(6, new Class3593(this));
        this.field4114.method22062(6, new Class3497(this, 1.25));
        this.field4114.method22062(7, new Class3581(this, 1.2000000476837158, true));
        this.field4114.method22062(7, new Class3544(this));
        this.field4114.method22062(8, new Class3457(this, this, 1.25));
        this.field4114.method22062(9, new Class3462(this, 32, 200));
        this.field4114.method22062(10, new Class3484(this, 1.2000000476837158, 12, 2));
        this.field4114.method22062(10, new Class3526(this, 0.4f));
        this.field4114.method22062(11, new Class3517(this, 1.0));
        this.field4114.method22062(11, new Class3638(this));
        this.field4114.method22062(12, new Class3631(this, PlayerEntity.class, 24.0f));
        this.field4114.method22062(13, new Class3543(this));
        this.field4115.method22062(3, new Class3564(LivingEntity.class, false, false, class515 -> Class803.field4315.test(class515) && !this.method4676(class515.method1865())));
    }
    
    @Override
    public Class7795 method2687(final ItemStack class8321) {
        return Class8520.field35206;
    }
    
    @Override
    public void method2736() {
        if (!this.world.isRemote) {
            if (this.method1768()) {
                if (this.method2749()) {
                    ++this.field4325;
                    final ItemStack method2718 = this.method2718(Class2215.field13600);
                    if (this.method4647(method2718)) {
                        if (this.field4325 <= 600) {
                            if (this.field4325 > 560) {
                                if (this.rand.nextFloat() < 0.1f) {
                                    this.method1695(this.method2687(method2718), 1.0f, 1.0f);
                                    this.world.method6761(this, (byte)45);
                                }
                            }
                        }
                        else {
                            final ItemStack method2719 = method2718.method27626(this.world, this);
                            if (!method2719.method27620()) {
                                this.method1803(Class2215.field13600, method2719);
                            }
                            this.field4325 = 0;
                        }
                    }
                    final LivingEntity method2720 = this.method4152();
                    if (method2720 == null || !method2720.method1768()) {
                        this.method4668(false);
                        this.method4669(false);
                    }
                }
            }
        }
        if (this.method2783() || this.method2722()) {
            this.field2967 = false;
            this.field2968 = 0.0f;
            this.field2970 = 0.0f;
        }
        super.method2736();
        if (this.method4658()) {
            if (this.rand.nextFloat() < 0.05f) {
                this.method1695(Class8520.field35202, 1.0f, 1.0f);
            }
        }
    }
    
    @Override
    public boolean method2722() {
        return this.method2664() <= 0.0f;
    }
    
    private boolean method4647(final ItemStack class8321) {
        if (class8321.getItem().method11743()) {
            if (this.method4152() == null) {
                if (this.onGround) {
                    if (!this.method2783()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public void method4184(final Class9592 class9592) {
        if (this.rand.nextFloat() < 0.2f) {
            final float nextFloat = this.rand.nextFloat();
            ItemStack class9593;
            if (nextFloat >= 0.05f) {
                if (nextFloat >= 0.2f) {
                    if (nextFloat >= 0.4f) {
                        if (nextFloat >= 0.6f) {
                            if (nextFloat >= 0.8f) {
                                class9593 = new ItemStack(Items.field31307);
                            }
                            else {
                                class9593 = new ItemStack(Items.field31357);
                            }
                        }
                        else {
                            class9593 = new ItemStack(Items.field31315);
                        }
                    }
                    else {
                        class9593 = (this.rand.nextBoolean() ? new ItemStack(Items.field31544) : new ItemStack(Items.field31545));
                    }
                }
                else {
                    class9593 = new ItemStack(Items.field31374);
                }
            }
            else {
                class9593 = new ItemStack(Items.field31514);
            }
            this.method1803(Class2215.field13600, class9593);
        }
    }
    
    @Override
    public void method1798(final byte b) {
        if (b != 45) {
            super.method1798(b);
        }
        else {
            final ItemStack method2718 = this.method2718(Class2215.field13600);
            if (!method2718.method27620()) {
                for (int i = 0; i < 8; ++i) {
                    final Vec3d method2719 = new Vec3d((this.rand.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0).rotatePitch(-this.rotationPitch * 0.017453292f).rotateYaw(-this.rotationYaw * 0.017453292f);
                    this.world.method6709(new Class6910(Class8432.field34629, method2718), this.getPosX() + this.method1791().x / 2.0, this.getPosY(), this.getPosZ() + this.method1791().z / 2.0, method2719.x, method2719.y + 0.05, method2719.z);
                }
            }
        }
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33408).method23941(0.30000001192092896);
        this.method2710(Class8107.field33405).method23941(10.0);
        this.method2710(Class8107.field33406).method23941(32.0);
        this.method2711().method20873(Class8107.field33410).method23941(2.0);
    }
    
    public Class803 method4648(final Class788 class788) {
        final Class803 class789 = EntityType.field28985.method23371(this.world);
        class789.method4651(this.rand.nextBoolean() ? this.method4650() : ((Class803)class788).method4650());
        return class789;
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, Class5496 class1854, final CompoundNBT class1855) {
        Class2074 class1856 = Class2074.method8173(class1851.method6959(new BlockPos(this)));
        int n = 0;
        if (!(class1854 instanceof Class5498)) {
            class1854 = new Class5498(class1856);
        }
        else {
            class1856 = ((Class5498)class1854).field22790;
            if (((Class5498)class1854).method16798() >= 2) {
                n = 1;
            }
        }
        this.method4651(class1856);
        if (n != 0) {
            this.method4354(-24000);
        }
        this.method4649();
        this.method4184(class1852);
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    private void method4649() {
        if (this.method4650() != Class2074.field11963) {
            this.field4115.method22062(4, this.field4320);
            this.field4115.method22062(6, this.field4318);
            this.field4115.method22062(6, this.field4319);
        }
        else {
            this.field4115.method22062(4, this.field4318);
            this.field4115.method22062(4, this.field4319);
            this.field4115.method22062(6, this.field4320);
        }
    }
    
    @Override
    public void method4358(final PlayerEntity playerEntity, final ItemStack class513) {
        if (this.method4357(class513)) {
            this.method1695(this.method2687(class513), 1.0f, 1.0f);
        }
        super.method4358(playerEntity, class513);
    }
    
    @Override
    public float method2789(final Pose class290, final EntitySize class291) {
        return this.method2625() ? (class291.field34098 * 0.85f) : 0.4f;
    }
    
    public Class2074 method4650() {
        return Class2074.method8172(this.dataManager.get(Class803.field4310));
    }
    
    private void method4651(final Class2074 class2074) {
        this.dataManager.set(Class803.field4310, class2074.method8170());
    }
    
    private List<UUID> method4652() {
        final ArrayList arrayList = Lists.newArrayList();
        arrayList.add(this.dataManager.get(Class803.field4312).orElse(null));
        arrayList.add(this.dataManager.get(Class803.field4313).orElse(null));
        return arrayList;
    }
    
    private void method4653(final UUID uuid) {
        if (!this.dataManager.get(Class803.field4312).isPresent()) {
            this.dataManager.set(Class803.field4312, Optional.ofNullable(uuid));
        }
        else {
            this.dataManager.set(Class803.field4313, Optional.ofNullable(uuid));
        }
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        final List<UUID> method4652 = this.method4652();
        final ListNBT class52 = new ListNBT();
        for (final UUID uuid : method4652) {
            if (uuid == null) {
                continue;
            }
            ((AbstractList<CompoundNBT>)class52).add(Class9346.method34643(uuid));
        }
        class51.put("TrustedUUIDs", class52);
        class51.putBoolean("Sleeping", this.method2783());
        class51.putString("Type", this.method4650().method8168());
        class51.putBoolean("Sitting", this.method4654());
        class51.putBoolean("Crouching", this.method1814());
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        final ListNBT method328 = class51.getList("TrustedUUIDs", 10);
        for (int i = 0; i < method328.size(); ++i) {
            this.method4653(Class9346.method34644(method328.method346(i)));
        }
        this.method4660(class51.getBoolean("Sleeping"));
        this.method4651(Class2074.method8171(class51.getString("Type")));
        this.method4655(class51.getBoolean("Sitting"));
        this.method4668(class51.getBoolean("Crouching"));
        this.method4649();
    }
    
    public boolean method4654() {
        return this.method4662(1);
    }
    
    public void method4655(final boolean b) {
        this.method4661(1, b);
    }
    
    public boolean method4656() {
        return this.method4662(64);
    }
    
    private void method4657(final boolean b) {
        this.method4661(64, b);
    }
    
    private boolean method4658() {
        return this.method4662(128);
    }
    
    private void method4659(final boolean b) {
        this.method4661(128, b);
    }
    
    @Override
    public boolean method2783() {
        return this.method4662(32);
    }
    
    private void method4660(final boolean b) {
        this.method4661(32, b);
    }
    
    private void method4661(final int n, final boolean b) {
        if (!b) {
            this.dataManager.set(Class803.field4311, (byte)(this.dataManager.get(Class803.field4311) & ~n));
        }
        else {
            this.dataManager.set(Class803.field4311, (byte)(this.dataManager.get(Class803.field4311) | n));
        }
    }
    
    private boolean method4662(final int n) {
        return (this.dataManager.get(Class803.field4311) & n) != 0x0;
    }
    
    @Override
    public boolean method2779(final ItemStack class8321) {
        final Class2215 method4185 = Class759.method4185(class8321);
        return this.method2718(method4185).method27620() && method4185 == Class2215.field13600 && super.method2779(class8321);
    }
    
    @Override
    public boolean method4167(final ItemStack class8321) {
        final Item method27622 = class8321.getItem();
        final ItemStack method27623 = this.method2718(Class2215.field13600);
        if (!method27623.method27620()) {
            if (this.field4325 > 0) {
                if (method27622.method11743()) {
                    if (!method27623.getItem().method11743()) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    private void method4663(final ItemStack class8321) {
        if (!class8321.method27620()) {
            if (!this.world.isRemote) {
                final Class427 class8322 = new Class427(this.world, this.getPosX() + this.method1791().x, this.getPosY() + 1.0, this.getPosZ() + this.method1791().z, class8321);
                class8322.method2117(40);
                class8322.method2112(this.method1865());
                this.method1695(Class8520.field35211, 1.0f, 1.0f);
                this.world.method6886(class8322);
            }
        }
    }
    
    private void method4664(final ItemStack class8321) {
        this.world.method6886(new Class427(this.world, this.getPosX(), this.getPosY(), this.getPosZ(), class8321));
    }
    
    @Override
    public void method4165(final Class427 class427) {
        final ItemStack method2107 = class427.method2107();
        if (this.method4167(method2107)) {
            final int method2108 = method2107.method27690();
            if (method2108 > 1) {
                this.method4664(method2107.method27621(method2108 - 1));
            }
            this.method4663(this.method2718(Class2215.field13600));
            this.method1803(Class2215.field13600, method2107.method27621(1));
            this.field4119[Class2215.field13600.method8402()] = 2.0f;
            this.method2746(class427, method2107.method27690());
            class427.method1652();
            this.field4325 = 0;
        }
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (this.method2749()) {
            final boolean method1706 = this.method1706();
            Label_0086: {
                if (!method1706) {
                    if (this.method4152() == null) {
                        if (!this.world.method6770()) {
                            break Label_0086;
                        }
                    }
                }
                this.method4673();
            }
            if (method1706 || this.method2783()) {
                this.method4655(false);
            }
            if (this.method4656()) {
                if (this.world.rand.nextFloat() < 0.2f) {
                    final BlockPos class354 = new BlockPos(this);
                    this.world.method6955(2001, class354, Block.method11774(this.world.getBlockState(class354)));
                }
            }
        }
        this.field4322 = this.field4321;
        if (!this.method4670()) {
            this.field4321 += (0.0f - this.field4321) * 0.4f;
        }
        else {
            this.field4321 += (1.0f - this.field4321) * 0.4f;
        }
        this.field4324 = this.field4323;
        if (!this.method1814()) {
            this.field4323 = 0.0f;
        }
        else {
            this.field4323 += 0.2f;
            if (this.field4323 > 3.0f) {
                this.field4323 = 3.0f;
            }
        }
    }
    
    @Override
    public boolean method4357(final ItemStack class8321) {
        return class8321.getItem() == Items.field31630;
    }
    
    @Override
    public void method4350(final PlayerEntity playerEntity, final Class788 class513) {
        ((Class803)class513).method4653(playerEntity.method1865());
    }
    
    public boolean method4665() {
        return this.method4662(16);
    }
    
    public void method4666(final boolean b) {
        this.method4661(16, b);
    }
    
    public boolean method4667() {
        return this.field4323 == 3.0f;
    }
    
    public void method4668(final boolean b) {
        this.method4661(4, b);
    }
    
    @Override
    public boolean method1814() {
        return this.method4662(4);
    }
    
    public void method4669(final boolean b) {
        this.method4661(8, b);
    }
    
    public boolean method4670() {
        return this.method4662(8);
    }
    
    public float method4671(final float n) {
        return MathHelper.method35700(n, this.field4322, this.field4321) * 0.11f * 3.1415927f;
    }
    
    public float method4672(final float n) {
        return MathHelper.method35700(n, this.field4324, this.field4323);
    }
    
    @Override
    public void method4153(final LivingEntity class511) {
        if (this.method4658()) {
            if (class511 == null) {
                this.method4659(false);
            }
        }
        super.method4153(class511);
    }
    
    @Override
    public int method2691(final float n, final float n2) {
        return MathHelper.ceil((n - 5.0f) * n2);
    }
    
    private void method4673() {
        this.method4660(false);
    }
    
    private void method4674() {
        this.method4669(false);
        this.method4668(false);
        this.method4655(false);
        this.method4660(false);
        this.method4659(false);
        this.method4657(false);
    }
    
    private boolean method4675() {
        if (!this.method2783()) {
            if (!this.method4654()) {
                if (!this.method4656()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public void method4156() {
        final Class7795 method4160 = this.method4160();
        if (method4160 != Class8520.field35208) {
            super.method4156();
        }
        else {
            this.method1695(method4160, 2.0f, this.method2721());
        }
    }
    
    @Nullable
    @Override
    public Class7795 method4160() {
        if (!this.method2783()) {
            if (!this.world.method6703()) {
                if (this.rand.nextFloat() < 0.1f) {
                    if (this.world.method6739((Class<? extends Entity>) PlayerEntity.class, this.getBoundingBox().grow(16.0, 16.0, 16.0), (Predicate<? super Entity>)Class9170.field38850).isEmpty()) {
                        return Class8520.field35208;
                    }
                }
            }
            return Class8520.field35203;
        }
        return Class8520.field35209;
    }
    
    @Nullable
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35207;
    }
    
    @Nullable
    @Override
    public Class7795 method2684() {
        return Class8520.field35205;
    }
    
    private boolean method4676(final UUID uuid) {
        return this.method4652().contains(uuid);
    }
    
    @Override
    public void method2675(final DamageSource class7929) {
        final ItemStack method2718 = this.method2718(Class2215.field13600);
        if (!method2718.method27620()) {
            this.method1766(method2718);
            this.method1803(Class2215.field13600, ItemStack.field34174);
        }
        super.method2675(class7929);
    }
    
    public static boolean method4677(final Class803 class803, final LivingEntity class804) {
        final double n = class804.getPosZ() - class803.getPosZ();
        final double n2 = class804.getPosX() - class803.getPosX();
        final double n3 = n / n2;
        for (int i = 0; i < 6; ++i) {
            final double n4 = (n3 != 0.0) ? (n * (i / 6.0f)) : 0.0;
            final double n5 = (n3 != 0.0) ? (n4 / n3) : (n2 * (i / 6.0f));
            for (int j = 1; j < 4; ++j) {
                if (!class803.world.getBlockState(new BlockPos(class803.getPosX() + n5, class803.getPosY() + j, class803.getPosZ() + n4)).method21697().method26442()) {
                    return false;
                }
            }
        }
        return true;
    }
    
    static {
        field4310 = EntityDataManager.method33564(Class803.class, Class7709.field30654);
        field4311 = EntityDataManager.method33564(Class803.class, Class7709.field30653);
        field4312 = EntityDataManager.method33564(Class803.class, Class7709.field30667);
        field4313 = EntityDataManager.method33564(Class803.class, Class7709.field30667);
        field4314 = (class427 -> !class427.method2118() && class427.method1768());
        field4315 = (class428 -> {
            if (class428 instanceof LivingEntity) {
                final LivingEntity class429 = (LivingEntity)class428;
                return class429.method2637() != null && class429.method2638() < class429.ticksExisted + 600;
            }
            else {
                return false;
            }
        });
        field4316 = (class430 -> class430 instanceof Class818 || class430 instanceof Class792);
        field4317 = (class431 -> !class431.method1812() && Class9170.field38849.test(class431));
    }
}
