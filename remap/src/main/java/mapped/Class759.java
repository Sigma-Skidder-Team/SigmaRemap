// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import java.util.Arrays;
import com.google.common.collect.Maps;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.Map;

public abstract class Class759 extends LivingEntity
{
    private static final DataParameter<Byte> field4106;
    public int field4107;
    public int field4108;
    public Class7727 field4109;
    public Class6564 field4110;
    public Class7296 field4111;
    private final Class7232 field4112;
    public Class7746 field4113;
    public final Class7189 field4114;
    public final Class7189 field4115;
    private LivingEntity field4116;
    private final Class9253 field4117;
    private final Class2265<ItemStack> field4118;
    public final float[] field4119;
    private final Class2265<ItemStack> field4120;
    public final float[] field4121;
    private boolean field4122;
    private boolean field4123;
    private final Map<Class257, Float> field4124;
    private ResourceLocation field4125;
    private long field4126;
    private Entity field4127;
    private int field4128;
    private Class51 field4129;
    private BlockPos field4130;
    private float field4131;
    
    public Class759(final EntityType<? extends Class759> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4118 = Class2265.method8507(2, ItemStack.field34174);
        this.field4119 = new float[2];
        this.field4120 = Class2265.method8507(4, ItemStack.field34174);
        this.field4121 = new float[4];
        this.field4124 = Maps.newEnumMap((Class)Class257.class);
        this.field4130 = BlockPos.ZERO;
        this.field4131 = -1.0f;
        this.field4114 = new Class7189((class7500 != null && class7500.method6796() != null) ? class7500.method6796() : null);
        this.field4115 = new Class7189((class7500 != null && class7500.method6796() != null) ? class7500.method6796() : null);
        this.field4109 = new Class7727(this);
        this.field4110 = new Class6564(this);
        this.field4111 = new Class7296(this);
        this.field4112 = this.method4146();
        this.field4113 = this.method4143(class7500);
        this.field4117 = new Class9253(this);
        Arrays.fill(this.field4121, 0.085f);
        Arrays.fill(this.field4119, 0.085f);
        if (class7500 != null) {
            if (!class7500.isRemote) {
                this.method4142();
            }
        }
    }
    
    public void method4142() {
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2711().method20873(Class8107.field33406).method23941(16.0);
        this.method2711().method20873(Class8107.field33411);
    }
    
    public Class7746 method4143(final World class1847) {
        return new Class7747(this, class1847);
    }
    
    public float method4144(final Class257 class257) {
        final Float n = this.field4124.get(class257);
        return (n != null) ? n : class257.method895();
    }
    
    public void method4145(final Class257 class257, final float f) {
        this.field4124.put(class257, f);
    }
    
    public Class7232 method4146() {
        return new Class7232(this);
    }
    
    public Class7727 method4147() {
        return this.field4109;
    }
    
    public Class6564 method4148() {
        if (this.isPassenger() && this.method1920() instanceof Class759) {
            return ((Class759)this.method1920()).method4148();
        }
        return this.field4110;
    }
    
    public Class7296 method4149() {
        return this.field4111;
    }
    
    public Class7746 method4150() {
        if (this.isPassenger() && this.method1920() instanceof Class759) {
            return ((Class759)this.method1920()).method4150();
        }
        return this.field4113;
    }
    
    public Class9253 method4151() {
        return this.field4117;
    }
    
    @Nullable
    public LivingEntity method4152() {
        return this.field4116;
    }
    
    public void method4153(final LivingEntity field4116) {
        this.field4116 = field4116;
        Class9570.method35811(Class9570.field41280, this, field4116);
    }
    
    @Override
    public boolean method2620(final EntityType<?> class7499) {
        return class7499 != EntityType.field28986;
    }
    
    public void method4154() {
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class759.field4106, (Byte)0);
    }
    
    public int method4155() {
        return 80;
    }
    
    public void method4156() {
        final Class7795 method4160 = this.method4160();
        if (method4160 != null) {
            this.method1695(method4160, this.method2720(), this.method2721());
        }
    }
    
    @Override
    public void method1660() {
        super.method1660();
        this.world.method6796().startSection("mobBaseTick");
        if (this.method1768()) {
            if (this.rand.nextInt(1000) < this.field4107++) {
                this.method4157();
                this.method4156();
            }
        }
        this.world.method6796().endSection();
    }
    
    @Override
    public void method2670(final DamageSource class7929) {
        this.method4157();
        super.method2670(class7929);
    }
    
    private void method4157() {
        this.field4107 = -this.method4155();
    }
    
    @Override
    public int method2631(final PlayerEntity playerEntity) {
        if (this.field4108 <= 0) {
            return this.field4108;
        }
        int field4108 = this.field4108;
        for (int i = 0; i < this.field4120.size(); ++i) {
            if (!this.field4120.get(i).method27620()) {
                if (this.field4121[i] <= 1.0f) {
                    field4108 += 1 + this.rand.nextInt(3);
                }
            }
        }
        for (int j = 0; j < this.field4118.size(); ++j) {
            if (!this.field4118.get(j).method27620()) {
                if (this.field4119[j] <= 1.0f) {
                    field4108 += 1 + this.rand.nextInt(3);
                }
            }
        }
        return field4108;
    }
    
    public void method4158() {
        if (!this.world.isRemote) {
            this.world.method6761(this, (byte)20);
        }
        else {
            for (int i = 0; i < 20; ++i) {
                final double n = this.rand.nextGaussian() * 0.02;
                final double n2 = this.rand.nextGaussian() * 0.02;
                final double n3 = this.rand.nextGaussian() * 0.02;
                this.world.method6709(Class8432.field34636, this.method1939(1.0) - n * 10.0, this.method1943() - n2 * 10.0, this.method1947(1.0) - n3 * 10.0, n, n2, n3);
            }
        }
    }
    
    @Override
    public void method1798(final byte b) {
        if (b != 20) {
            super.method1798(b);
        }
        else {
            this.method4158();
        }
    }
    
    @Override
    public void method1659() {
        if (Config.method28972() && this.method4219()) {
            this.method4221();
        }
        else {
            super.method1659();
            if (!this.world.isRemote) {
                this.method4202();
                if (this.ticksExisted % 5 == 0) {
                    this.method4159();
                }
            }
        }
    }
    
    public void method4159() {
        final boolean b = !(this.method1907() instanceof Class759);
        final boolean b2 = !(this.method1920() instanceof Class423);
        this.field4114.method22070(Class2139.field12580, b);
        this.field4114.method22070(Class2139.field12582, b && b2);
        this.field4114.method22070(Class2139.field12581, b);
    }
    
    @Override
    public float method2735(final float n, final float n2) {
        this.field4112.method22131();
        return n2;
    }
    
    @Nullable
    public Class7795 method4160() {
        return null;
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method312("CanPickUpLoot", this.method4192());
        class51.method312("PersistenceRequired", this.field4123);
        final Class52 class52 = new Class52();
        for (final ItemStack class53 : this.field4120) {
            final Class51 e = new Class51();
            if (!class53.method27620()) {
                class53.method27627(e);
            }
            ((AbstractList<Class51>)class52).add(e);
        }
        class51.method295("ArmorItems", class52);
        final Class52 class54 = new Class52();
        for (final ItemStack class55 : this.field4118) {
            final Class51 e2 = new Class51();
            if (!class55.method27620()) {
                class55.method27627(e2);
            }
            ((AbstractList<Class51>)class54).add(e2);
        }
        class51.method295("HandItems", class54);
        final Class52 class56 = new Class52();
        final float[] field4121 = this.field4121;
        for (int length = field4121.length, i = 0; i < length; ++i) {
            ((AbstractList<Class46>)class56).add(Class46.method281(field4121[i]));
        }
        class51.method295("ArmorDropChances", class56);
        final Class52 class57 = new Class52();
        final float[] field4122 = this.field4119;
        for (int length2 = field4122.length, j = 0; j < length2; ++j) {
            ((AbstractList<Class46>)class57).add(Class46.method281(field4122[j]));
        }
        class51.method295("HandDropChances", class57);
        if (this.field4127 == null) {
            if (this.field4129 != null) {
                class51.method295("Leash", this.field4129.method333());
            }
        }
        else {
            final Class51 class58 = new Class51();
            if (!(this.field4127 instanceof LivingEntity)) {
                if (this.field4127 instanceof Class860) {
                    final BlockPos method5194 = ((Class860)this.field4127).method5194();
                    class58.method298("X", method5194.getX());
                    class58.method298("Y", method5194.getY());
                    class58.method298("Z", method5194.getZ());
                }
            }
            else {
                class58.method300("UUID", this.field4127.method1865());
            }
            class51.method295("Leash", class58);
        }
        class51.method312("LeftHanded", this.method4215());
        if (this.field4125 != null) {
            class51.method306("DeathLootTable", this.field4125.toString());
            if (this.field4126 != 0L) {
                class51.method299("DeathLootTableSeed", this.field4126);
            }
        }
        if (this.method4214()) {
            class51.method312("NoAI", this.method4214());
        }
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        if (class51.method316("CanPickUpLoot", 1)) {
            this.method4193(class51.method329("CanPickUpLoot"));
        }
        this.field4123 = class51.method329("PersistenceRequired");
        if (class51.method316("ArmorItems", 9)) {
            final Class52 method328 = class51.method328("ArmorItems", 10);
            for (int i = 0; i < this.field4120.size(); ++i) {
                this.field4120.set(i, ItemStack.method27619(method328.method346(i)));
            }
        }
        if (class51.method316("HandItems", 9)) {
            final Class52 method329 = class51.method328("HandItems", 10);
            for (int j = 0; j < this.field4118.size(); ++j) {
                this.field4118.set(j, ItemStack.method27619(method329.method346(j)));
            }
        }
        if (class51.method316("ArmorDropChances", 9)) {
            final Class52 method330 = class51.method328("ArmorDropChances", 5);
            for (int k = 0; k < method330.size(); ++k) {
                this.field4121[k] = method330.method352(k);
            }
        }
        if (class51.method316("HandDropChances", 9)) {
            final Class52 method331 = class51.method328("HandDropChances", 5);
            for (int l = 0; l < method331.size(); ++l) {
                this.field4119[l] = method331.method352(l);
            }
        }
        if (class51.method316("Leash", 10)) {
            this.field4129 = class51.method327("Leash");
        }
        this.method4212(class51.method329("LeftHanded"));
        if (class51.method316("DeathLootTable", 8)) {
            this.field4125 = new ResourceLocation(class51.method323("DeathLootTable"));
            this.field4126 = class51.method320("DeathLootTableSeed");
        }
        this.method4211(class51.method329("NoAI"));
    }
    
    @Override
    public void method2680(final DamageSource class7929, final boolean b) {
        super.method2680(class7929, b);
        this.field4125 = null;
    }
    
    @Override
    public Class9098 method2681(final boolean b, final DamageSource class7929) {
        return super.method2681(b, class7929).method32875(this.field4126, this.rand);
    }
    
    @Override
    public final ResourceLocation method2679() {
        return (this.field4125 != null) ? this.field4125 : this.method4161();
    }
    
    public ResourceLocation method4161() {
        return super.method2679();
    }
    
    public void method4162(final float field2970) {
        this.field2970 = field2970;
    }
    
    public void method4163(final float field2969) {
        this.field2969 = field2969;
    }
    
    public void method4164(final float field2968) {
        this.field2968 = field2968;
    }
    
    @Override
    public void method2733(final float n) {
        super.method2733(n);
        this.method4162(n);
    }
    
    @Override
    public void method2736() {
        super.method2736();
        this.world.method6796().startSection("looting");
        boolean b = this.world.method6765().method31216(Class8878.field37316);
        if (Class9570.field41266.method22605()) {
            b = Class9570.method35812(Class9570.field41266, this.world, this);
        }
        if (!this.world.isRemote) {
            if (this.method4192()) {
                if (this.method1768()) {
                    if (!this.field2958) {
                        if (b) {
                            for (final Class427 class427 : this.world.method7128((Class<? extends Class427>)Class427.class, this.getBoundingBox().method18495(1.0, 0.0, 1.0))) {
                                if (class427.removed) {
                                    continue;
                                }
                                if (class427.method2107().method27620()) {
                                    continue;
                                }
                                if (class427.method2118()) {
                                    continue;
                                }
                                this.method4165(class427);
                            }
                        }
                    }
                }
            }
        }
        this.world.method6796().endSection();
    }
    
    public void method4165(final Class427 class427) {
        final ItemStack method2107 = class427.method2107();
        final Class2215 method2108 = method4185(method2107);
        final ItemStack method2109 = this.method2718(method2108);
        if (this.method4166(method2107, method2109, method2108) && this.method4167(method2107)) {
            final double n = this.method4183(method2108);
            if (!method2109.method27620() && Math.max(this.rand.nextFloat() - 0.1f, 0.0f) < n) {
                this.method1766(method2109);
            }
            this.method1803(method2108, method2107);
            switch (Class7556.field29964[method2108.method8401().ordinal()]) {
                case 1: {
                    this.field4119[method2108.method8402()] = 2.0f;
                    break;
                }
                case 2: {
                    this.field4121[method2108.method8402()] = 2.0f;
                    break;
                }
            }
            this.field4123 = true;
            this.method2746(class427, method2107.method27690());
            class427.method1652();
        }
    }
    
    public boolean method4166(final ItemStack class8321, final ItemStack class8322, final Class2215 class8323) {
        boolean b = true;
        if (!class8322.method27620()) {
            if (class8323.method8401() != Class295.field1681) {
                if (class8321.getItem() instanceof Class4055 && !(class8322.getItem() instanceof Class4055)) {
                    b = true;
                }
                else {
                    if (class8321.getItem() instanceof Class4055) {
                        if (class8322.getItem() instanceof Class4055) {
                            if (!Class8742.method30217(class8322)) {
                                final Class4055 class8324 = (Class4055)class8321.getItem();
                                final Class4055 class8325 = (Class4055)class8322.getItem();
                                if (class8324.method12259() != class8325.method12259()) {
                                    b = (class8324.method12259() > class8325.method12259());
                                }
                                else {
                                    b = (class8321.method27632() < class8322.method27632() || (class8321.method27656() && !class8322.method27656()));
                                }
                                return b;
                            }
                        }
                    }
                    b = false;
                }
            }
            else if (class8321.getItem() instanceof Class4077 && !(class8322.getItem() instanceof Class4077)) {
                b = true;
            }
            else if (class8321.getItem() instanceof Class4077 && class8322.getItem() instanceof Class4077) {
                final Class4077 class8326 = (Class4077)class8321.getItem();
                final Class4077 class8327 = (Class4077)class8322.getItem();
                if (class8326.method12281() != class8327.method12281()) {
                    b = (class8326.method12281() > class8327.method12281());
                }
                else {
                    b = (class8321.method27632() < class8322.method27632() || (class8321.method27656() && !class8322.method27656()));
                }
            }
            else {
                b = (class8321.getItem() instanceof Class4087 && class8322.getItem() instanceof Class4087 && class8321.method27656() && !class8322.method27656());
            }
        }
        return b;
    }
    
    public boolean method4167(final ItemStack class8321) {
        return true;
    }
    
    public boolean method4168(final double n) {
        return true;
    }
    
    public boolean method4169() {
        return false;
    }
    
    public boolean method4170() {
        return false;
    }
    
    @Override
    public void method1949() {
        if (this.world.method6954() == Class2113.field12290 && this.method4170()) {
            this.method1652();
        }
        else if (!this.method4194() && !this.method4169()) {
            PlayerEntity method7131 = this.world.method7131(this, -1.0);
            if (Class9570.field41263.method22605()) {
                final Object method7132 = Class9570.field41263.method22608(this);
                if (method7132 != Class7667.field30453) {
                    if (method7132 == Class7667.field30452) {
                        this.method1652();
                        method7131 = null;
                    }
                }
                else {
                    this.field2959 = 0;
                    method7131 = null;
                }
            }
            if (method7131 != null) {
                final double method7133 = method7131.method1734(this);
                if (method7133 > 16384.0) {
                    if (this.method4168(method7133)) {
                        this.method1652();
                    }
                }
                if (this.field2959 > 600) {
                    if (this.rand.nextInt(800) == 0) {
                        if (method7133 > 1024.0) {
                            if (this.method4168(method7133)) {
                                this.method1652();
                                return;
                            }
                        }
                    }
                }
                if (method7133 < 1024.0) {
                    this.field2959 = 0;
                }
            }
        }
        else {
            this.field2959 = 0;
        }
    }
    
    @Override
    public final void method2738() {
        ++this.field2959;
        this.world.method6796().startSection("sensing");
        this.field4117.method34142();
        this.world.method6796().endSection();
        this.world.method6796().startSection("targetSelector");
        this.field4115.method22064();
        this.world.method6796().endSection();
        this.world.method6796().startSection("goalSelector");
        this.field4114.method22064();
        this.world.method6796().endSection();
        this.world.method6796().startSection("navigation");
        this.field4113.method24728();
        this.world.method6796().endSection();
        this.world.method6796().startSection("mob tick");
        this.method4172();
        this.world.method6796().endSection();
        this.world.method6796().startSection("controls");
        this.world.method6796().startSection("move");
        this.field4110.method19904();
        this.world.method6796().method15300("look");
        this.field4109.method24665();
        this.world.method6796().method15300("jump");
        this.field4111.method22381();
        this.world.method6796().endSection();
        this.world.method6796().endSection();
        this.method4171();
    }
    
    public void method4171() {
        Class9324.method34538(this.world, this, this.field4114);
    }
    
    public void method4172() {
    }
    
    public int method4173() {
        return 40;
    }
    
    public int method4174() {
        return 75;
    }
    
    public int method4175() {
        return 10;
    }
    
    public void method4176(final Entity class399, final float n, final float n2) {
        final double n3 = class399.getPosX() - this.getPosX();
        final double n4 = class399.getPosZ() - this.getPosZ();
        double n5;
        if (!(class399 instanceof LivingEntity)) {
            n5 = (class399.getBoundingBox().minY + class399.getBoundingBox().maxY) / 2.0 - this.method1944();
        }
        else {
            n5 = class399.method1944() - this.method1944();
        }
        final double n6 = MathHelper.sqrt(n3 * n3 + n4 * n4);
        final float n7 = (float)(MathHelper.method35693(n4, n3) * 57.2957763671875) - 90.0f;
        this.rotationPitch = this.method4177(this.rotationPitch, (float)(-(MathHelper.method35693(n5, n6) * 57.2957763671875)), n2);
        this.rotationYaw = this.method4177(this.rotationYaw, n7, n);
    }
    
    private float method4177(final float n, final float n2, final float n3) {
        float method35668 = MathHelper.method35668(n2 - n);
        if (method35668 > n3) {
            method35668 = n3;
        }
        if (method35668 < -n3) {
            method35668 = -n3;
        }
        return n + method35668;
    }
    
    public static boolean method4178(final EntityType<? extends Class759> class7499, final Class1851 class7500, final Class2101 class7501, final BlockPos class7502, final Random random) {
        final BlockPos method1139 = class7502.method1139();
        return class7501 == Class2101.field12176 || class7500.getBlockState(method1139).canEntitySpawn(class7500, method1139, class7499);
    }
    
    public boolean method4179(final Class1851 class1851, final Class2101 class1852) {
        return true;
    }
    
    public boolean method4180(final Class1852 class1852) {
        return !class1852.method6968(this.getBoundingBox()) && class1852.method6975(this);
    }
    
    public int method4181() {
        return 4;
    }
    
    public boolean method4182(final int n) {
        return false;
    }
    
    @Override
    public int method1858() {
        if (this.method4152() != null) {
            int n = (int)(this.method2664() - this.method2701() * 0.33f) - (3 - this.world.method6954().method8235()) * 4;
            if (n < 0) {
                n = 0;
            }
            return n + 3;
        }
        return 3;
    }
    
    @Override
    public Iterable<ItemStack> method1800() {
        return this.field4118;
    }
    
    @Override
    public Iterable<ItemStack> method1801() {
        return this.field4120;
    }
    
    @Override
    public ItemStack method2718(final Class2215 class2215) {
        switch (Class7556.field29964[class2215.method8401().ordinal()]) {
            case 1: {
                return this.field4118.get(class2215.method8402());
            }
            case 2: {
                return this.field4120.get(class2215.method8402());
            }
            default: {
                return ItemStack.field34174;
            }
        }
    }
    
    @Override
    public void method1803(final Class2215 class2215, final ItemStack class2216) {
        switch (Class7556.field29964[class2215.method8401().ordinal()]) {
            case 1: {
                this.field4118.set(class2215.method8402(), class2216);
                break;
            }
            case 2: {
                this.field4120.set(class2215.method8402(), class2216);
                break;
            }
        }
    }
    
    @Override
    public void method2678(final DamageSource class7929, final int n, final boolean b) {
        super.method2678(class7929, n, b);
        for (final Class2215 class7930 : Class2215.values()) {
            final ItemStack method2718 = this.method2718(class7930);
            final float method2719 = this.method4183(class7930);
            final boolean b2 = method2719 > 1.0f;
            if (!method2718.method27620()) {
                if (!Class8742.method30218(method2718)) {
                    if (b || b2) {
                        if (Math.max(this.rand.nextFloat() - n * 0.01f, 0.0f) < method2719) {
                            if (!b2) {
                                if (method2718.method27630()) {
                                    method2718.method27633(method2718.method27634() - this.rand.nextInt(1 + this.rand.nextInt(Math.max(method2718.method27634() - 3, 1))));
                                }
                            }
                            this.method1766(method2718);
                        }
                    }
                }
            }
        }
    }
    
    public float method4183(final Class2215 class2215) {
        float n = 0.0f;
        switch (Class7556.field29964[class2215.method8401().ordinal()]) {
            case 1: {
                n = this.field4119[class2215.method8402()];
                break;
            }
            case 2: {
                n = this.field4121[class2215.method8402()];
                break;
            }
            default: {
                n = 0.0f;
                break;
            }
        }
        return n;
    }
    
    public void method4184(final Class9592 class9592) {
        if (this.rand.nextFloat() < 0.15f * class9592.method35975()) {
            int nextInt = this.rand.nextInt(2);
            final float n = (this.world.method6954() != Class2113.field12293) ? 0.25f : 0.1f;
            if (this.rand.nextFloat() < 0.095f) {
                ++nextInt;
            }
            if (this.rand.nextFloat() < 0.095f) {
                ++nextInt;
            }
            if (this.rand.nextFloat() < 0.095f) {
                ++nextInt;
            }
            int n2 = 1;
            for (final Class2215 class9593 : Class2215.values()) {
                if (class9593.method8401() == Class295.field1682) {
                    final ItemStack method2718 = this.method2718(class9593);
                    if (n2 == 0 && this.rand.nextFloat() < n) {
                        break;
                    }
                    n2 = 0;
                    if (method2718.method27620()) {
                        final Item method2719 = method4186(class9593, nextInt);
                        if (method2719 != null) {
                            this.method1803(class9593, new ItemStack(method2719));
                        }
                    }
                }
            }
        }
    }
    
    public static Class2215 method4185(final ItemStack class8321) {
        if (Class9570.field41325.method22605()) {
            final Class2215 class8322 = (Class2215)Class9570.method35826(class8321.getItem(), Class9570.field41325, class8321);
            if (class8322 != null) {
                return class8322;
            }
        }
        final Item method27622 = class8321.getItem();
        if (method27622 == Class7521.field29342.method11704() || (method27622 instanceof Class4036 && ((Class4036)method27622).method12240() instanceof Class3932)) {
            return Class2215.field13605;
        }
        if (method27622 instanceof Class4055) {
            return ((Class4055)method27622).method12257();
        }
        if (method27622 != Items.field31584) {
            boolean method27623 = class8321.getItem() == Items.field31583;
            if (Class9570.field41329.method22605()) {
                method27623 = Class9570.method35820(class8321.getItem(), Class9570.field41329, class8321, null);
            }
            return method27623 ? Class2215.field13601 : Class2215.field13600;
        }
        return Class2215.field13604;
    }
    
    @Nullable
    public static Item method4186(final Class2215 class2215, final int n) {
        switch (Class7556.field29965[class2215.ordinal()]) {
            case 1: {
                if (n == 0) {
                    return Items.field31317;
                }
                if (n == 1) {
                    return Items.field31333;
                }
                if (n == 2) {
                    return Items.field31321;
                }
                if (n == 3) {
                    return Items.field31325;
                }
                if (n == 4) {
                    return Items.field31329;
                }
            }
            case 2: {
                if (n == 0) {
                    return Items.field31318;
                }
                if (n == 1) {
                    return Items.field31334;
                }
                if (n == 2) {
                    return Items.field31322;
                }
                if (n == 3) {
                    return Items.field31326;
                }
                if (n == 4) {
                    return Items.field31330;
                }
            }
            case 3: {
                if (n == 0) {
                    return Items.field31319;
                }
                if (n == 1) {
                    return Items.field31335;
                }
                if (n == 2) {
                    return Items.field31323;
                }
                if (n == 3) {
                    return Items.field31327;
                }
                if (n == 4) {
                    return Items.field31331;
                }
            }
            case 4: {
                if (n == 0) {
                    return Items.field31320;
                }
                if (n == 1) {
                    return Items.field31336;
                }
                if (n == 2) {
                    return Items.field31324;
                }
                if (n == 3) {
                    return Items.field31328;
                }
                if (n == 4) {
                    return Items.field31332;
                }
                break;
            }
        }
        return null;
    }
    
    public void method4187(final Class9592 class9592) {
        final float method35975 = class9592.method35975();
        if (!this.getHeldItemMainhand().method27620()) {
            if (this.rand.nextFloat() < 0.25f * method35975) {
                this.method1803(Class2215.field13600, Class8742.method30224(this.rand, this.getHeldItemMainhand(), (int)(5.0f + method35975 * this.rand.nextInt(18)), false));
            }
        }
        for (final Class2215 class9593 : Class2215.values()) {
            if (class9593.method8401() == Class295.field1682) {
                final ItemStack method35976 = this.method2718(class9593);
                if (!method35976.method27620()) {
                    if (this.rand.nextFloat() < 0.5f * method35975) {
                        this.method1803(class9593, Class8742.method30224(this.rand, method35976, (int)(5.0f + method35975 * this.rand.nextInt(18)), false));
                    }
                }
            }
        }
    }
    
    @Nullable
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, final Class5496 class1854, final Class51 class1855) {
        this.method2710(Class8107.field33406).method23946(new Class7919("Random spawn bonus", this.rand.nextGaussian() * 0.05, Class2157.field12810));
        if (this.rand.nextFloat() >= 0.05f) {
            this.method4212(false);
        }
        else {
            this.method4212(true);
        }
        return class1854;
    }
    
    public boolean method4189() {
        return false;
    }
    
    public void method4190() {
        this.field4123 = true;
    }
    
    public void method4191(final Class2215 class2215, final float n) {
        switch (Class7556.field29964[class2215.method8401().ordinal()]) {
            case 1: {
                this.field4119[class2215.method8402()] = n;
                break;
            }
            case 2: {
                this.field4121[class2215.method8402()] = n;
                break;
            }
        }
    }
    
    public boolean method4192() {
        return this.field4122;
    }
    
    public void method4193(final boolean field4122) {
        this.field4122 = field4122;
    }
    
    @Override
    public boolean method2779(final ItemStack class8321) {
        return this.method2718(method4185(class8321)).method27620() && this.method4192();
    }
    
    public boolean method4194() {
        return this.field4123;
    }
    
    @Override
    public final boolean method1770(final PlayerEntity playerEntity, final Class316 class513) {
        if (!this.method1768()) {
            return false;
        }
        if (this.method4206() == playerEntity) {
            this.method4203(true, !playerEntity.field3025.field27304);
            return true;
        }
        final ItemStack method2715 = playerEntity.method2715(class513);
        if (method2715.getItem() == Items.field31551 && this.method4204(playerEntity)) {
            this.method4207(playerEntity, true);
            method2715.method27693(1);
            return true;
        }
        return this.method4195(playerEntity, class513) || super.method1770(playerEntity, class513);
    }
    
    public boolean method4195(final PlayerEntity playerEntity, final Class316 class513) {
        return false;
    }
    
    public boolean method4196() {
        return this.method4197(new BlockPos(this));
    }
    
    public boolean method4197(final BlockPos class354) {
        return this.field4131 == -1.0f || this.field4130.distanceSq(class354) < this.field4131 * this.field4131;
    }
    
    public void method4198(final BlockPos field4130, final int n) {
        this.field4130 = field4130;
        this.field4131 = (float)n;
    }
    
    public BlockPos method4199() {
        return this.field4130;
    }
    
    public float method4200() {
        return this.field4131;
    }
    
    public boolean method4201() {
        return this.field4131 != -1.0f;
    }
    
    public void method4202() {
        if (this.field4129 != null) {
            this.method4209();
        }
        if (this.field4127 != null) {
            if (!this.method1768() || !this.field4127.method1768()) {
                this.method4203(true, true);
            }
        }
    }
    
    public void method4203(final boolean b, final boolean b2) {
        if (this.field4127 != null) {
            this.forceSpawn = false;
            if (!(this.field4127 instanceof PlayerEntity)) {
                this.field4127.forceSpawn = false;
            }
            this.field4127 = null;
            if (!this.world.isRemote) {
                if (b2) {
                    this.method1764(Items.field31551);
                }
            }
            if (!this.world.isRemote) {
                if (b) {
                    if (this.world instanceof Class1849) {
                        ((Class1849)this.world).method6904().method7447(this, new Class4305(this, null));
                    }
                }
            }
        }
    }
    
    public boolean method4204(final PlayerEntity playerEntity) {
        return !this.method4205() && !(this instanceof Class762);
    }
    
    public boolean method4205() {
        return this.field4127 != null;
    }
    
    @Nullable
    public Entity method4206() {
        if (this.field4127 == null) {
            if (this.field4128 != 0) {
                if (this.world.isRemote) {
                    this.field4127 = this.world.getEntityByID(this.field4128);
                }
            }
        }
        return this.field4127;
    }
    
    public void method4207(final Entity field4127, final boolean b) {
        this.field4127 = field4127;
        this.forceSpawn = true;
        if (!(this.field4127 instanceof PlayerEntity)) {
            this.field4127.forceSpawn = true;
        }
        if (!this.world.isRemote) {
            if (b) {
                if (this.world instanceof Class1849) {
                    ((Class1849)this.world).method6904().method7447(this, new Class4305(this, this.field4127));
                }
            }
        }
        if (this.isPassenger()) {
            this.stopRiding();
        }
    }
    
    public void method4208(final int field4128) {
        this.field4128 = field4128;
        this.method4203(false, false);
    }
    
    @Override
    public boolean method1780(final Entity class399, final boolean b) {
        final boolean method1780 = super.method1780(class399, b);
        if (method1780) {
            if (this.method4205()) {
                this.method4203(true, true);
            }
        }
        return method1780;
    }
    
    private void method4209() {
        if (this.field4129 != null) {
            if (this.world instanceof Class1849) {
                Label_0194: {
                    if (!this.field4129.method302("UUID")) {
                        if (this.field4129.method316("X", 99)) {
                            if (this.field4129.method316("Y", 99)) {
                                if (this.field4129.method316("Z", 99)) {
                                    this.method4207(Class863.method5205(this.world, new BlockPos(this.field4129.method319("X"), this.field4129.method319("Y"), this.field4129.method319("Z"))), true);
                                    break Label_0194;
                                }
                            }
                        }
                        this.method4203(false, true);
                    }
                    else {
                        final Entity method6914 = ((Class1849)this.world).method6914(this.field4129.method301("UUID"));
                        if (method6914 != null) {
                            this.method4207(method6914, true);
                        }
                    }
                }
                this.field4129 = null;
            }
        }
    }
    
    @Override
    public boolean method1893(final int n, final ItemStack class8321) {
        Class2215 class8322;
        if (n != 98) {
            if (n != 99) {
                if (n != 100 + Class2215.field13605.method8402()) {
                    if (n != 100 + Class2215.field13604.method8402()) {
                        if (n != 100 + Class2215.field13603.method8402()) {
                            if (n != 100 + Class2215.field13602.method8402()) {
                                return false;
                            }
                            class8322 = Class2215.field13602;
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
            }
            else {
                class8322 = Class2215.field13601;
            }
        }
        else {
            class8322 = Class2215.field13600;
        }
        if (!class8321.method27620()) {
            if (!method4210(class8322, class8321)) {
                if (class8322 != Class2215.field13605) {
                    return false;
                }
            }
        }
        this.method1803(class8322, class8321);
        return true;
    }
    
    @Override
    public boolean method1919() {
        return this.method4189() && super.method1919();
    }
    
    public static boolean method4210(final Class2215 class2215, final ItemStack class2216) {
        final Class2215 method4185 = method4185(class2216);
        if (method4185 != class2215) {
            if (method4185 != Class2215.field13600 || class2215 != Class2215.field13601) {
                if (method4185 != Class2215.field13601 || class2215 != Class2215.field13600) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
    public boolean method2749() {
        return super.method2749() && !this.method4214();
    }
    
    public void method4211(final boolean b) {
        final byte byteValue = this.dataManager.get(Class759.field4106);
        this.dataManager.set(Class759.field4106, b ? ((byte)(byteValue | 0x1)) : ((byte)(byteValue & 0xFFFFFFFE)));
    }
    
    public void method4212(final boolean b) {
        final byte byteValue = this.dataManager.get(Class759.field4106);
        this.dataManager.set(Class759.field4106, b ? ((byte)(byteValue | 0x2)) : ((byte)(byteValue & 0xFFFFFFFD)));
    }
    
    public void method4213(final boolean b) {
        final byte byteValue = this.dataManager.get(Class759.field4106);
        this.dataManager.set(Class759.field4106, b ? ((byte)(byteValue | 0x4)) : ((byte)(byteValue & 0xFFFFFFFB)));
    }
    
    public boolean method4214() {
        return (this.dataManager.get(Class759.field4106) & 0x1) != 0x0;
    }
    
    public boolean method4215() {
        return (this.dataManager.get(Class759.field4106) & 0x2) != 0x0;
    }
    
    public boolean method4216() {
        return (this.dataManager.get(Class759.field4106) & 0x4) != 0x0;
    }
    
    @Override
    public Class2226 method2755() {
        return this.method4215() ? Class2226.field13697 : Class2226.field13698;
    }
    
    @Override
    public boolean method2646(final LivingEntity class511) {
        return (class511.getType() != EntityType.field29058 || !((PlayerEntity)class511).field3025.field27301) && super.method2646(class511);
    }
    
    @Override
    public boolean method2734(final Entity class399) {
        float n = (float)this.method2710(Class8107.field33410).method23950();
        float n2 = (float)this.method2710(Class8107.field33411).method23950();
        if (class399 instanceof LivingEntity) {
            n += Class8742.method30202(this.getHeldItemMainhand(), ((LivingEntity)class399).method2712());
            n2 += Class8742.method30207(this);
        }
        final int method30208 = Class8742.method30208(this);
        if (method30208 > 0) {
            class399.setFire(method30208 * 4);
        }
        final boolean method30209 = class399.attackEntityFrom(DamageSource.method25693(this), n);
        if (method30209) {
            if (n2 > 0.0f) {
                if (class399 instanceof LivingEntity) {
                    ((LivingEntity)class399).method2682(this, n2 * 0.5f, MathHelper.sin(this.rotationYaw * 0.017453292f), -MathHelper.cos(this.rotationYaw * 0.017453292f));
                    this.method1936(this.getMotion().mul(0.6, 1.0, 0.6));
                }
            }
            if (class399 instanceof PlayerEntity) {
                final PlayerEntity class400 = (PlayerEntity)class399;
                final ItemStack method30210 = this.getHeldItemMainhand();
                final ItemStack class401 = class400.method2756() ? class400.method2766() : ItemStack.field34174;
                final boolean method30211 = Class7667.method24310(method30210, class401, class400, this);
                final boolean method30212 = Class7667.method24311(class401, class400);
                if (!method30210.method27620()) {
                    if (!class401.method27620()) {
                        if (method30211) {
                            if (method30212) {
                                if (this.rand.nextFloat() < 0.25f + Class8742.method30211(this) * 0.05f) {
                                    class400.method2906().method25772(class401.getItem(), 100);
                                    this.world.method6761(class400, (byte)30);
                                }
                            }
                        }
                    }
                }
            }
            this.method1900(this, class399);
            this.method2639(class399);
        }
        return method30209;
    }
    
    public boolean method4217() {
        if (this.world.method6703()) {
            if (!this.world.isRemote) {
                final float method1726 = this.method1726();
                final BlockPos class354 = (this.method1920() instanceof Class423) ? new BlockPos(this.getPosX(), (double)Math.round(this.getPosY()), this.getPosZ()).method1137() : new BlockPos(this.getPosX(), (double)Math.round(this.getPosY()), this.getPosZ());
                if (method1726 > 0.5f) {
                    if (this.rand.nextFloat() * 30.0f < (method1726 - 0.4f) * 2.0f) {
                        if (this.world.method6994(class354)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public void method2727(final Class7909<Fluid> class7909) {
        if (!this.method4150().method24742()) {
            this.method1936(this.getMotion().add(0.0, 0.3, 0.0));
        }
        else {
            super.method2727(class7909);
        }
    }
    
    public boolean method4218(final Item class3820) {
        return this.getHeldItemMainhand().getItem() == class3820 || this.method2714().getItem() == class3820;
    }
    
    private boolean method4219() {
        if (this.method2625()) {
            return false;
        }
        if (this.field2938 > 0) {
            return false;
        }
        if (this.ticksExisted < 20) {
            return false;
        }
        final List method4220 = this.method4220(this.method1896());
        if (method4220 == null) {
            return false;
        }
        if (method4220.size() == 1) {
            final Entity class399 = method4220.get(0);
            final double max = Math.max(Math.abs(this.getPosX() - class399.getPosX()) - 16.0, 0.0);
            final double max2 = Math.max(Math.abs(this.getPosZ() - class399.getPosZ()) - 16.0, 0.0);
            return !this.method1753(max * max + max2 * max2);
        }
        return false;
    }
    
    private List method4220(final World class1847) {
        final World method1896 = this.method1896();
        if (method1896 instanceof Class1848) {
            return ((Class1848)method1896).method6840();
        }
        if (!(method1896 instanceof Class1849)) {
            return null;
        }
        return ((Class1849)method1896).method6840();
    }
    
    private void method4221() {
        ++this.field2959;
        if (this instanceof Class763) {
            if (this.method1726() > 0.5f) {
                this.field2959 += 2;
            }
        }
        this.method1949();
    }
    
    static {
        field4106 = EntityDataManager.method33564(Class759.class, Class7709.field30653);
    }
}
