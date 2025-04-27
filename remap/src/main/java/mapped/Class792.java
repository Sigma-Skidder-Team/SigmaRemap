// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Random;
import javax.annotation.Nullable;

public class Class792 extends Class789
{
    private static final DataParameter<Integer> field4228;
    private static final ResourceLocation field4229;
    private int field4230;
    private int field4231;
    private boolean field4232;
    private int field4233;
    private int field4234;
    
    public Class792(final EntityType<? extends Class792> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4111 = new Class7295(this, this);
        this.field4110 = new Class6566(this);
        this.method4434(0.0);
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(1, new Class3490(this));
        this.field4114.method22062(1, new Class3612(this, 2.2));
        this.field4114.method22062(2, new Class3587(this, 0.8));
        this.field4114.method22062(3, new Class3472(this, 1.0, Ingredient.method618(Items.field31517, Items.field31522, Blocks.DANDELION), false));
        this.field4114.method22062(4, new Class3449<Object>(this, PlayerEntity.class, 8.0f, 2.2, 2.2));
        this.field4114.method22062(4, new Class3449<Object>(this, Class799.class, 10.0f, 2.2, 2.2));
        this.field4114.method22062(4, new Class3449<Object>(this, Class763.class, 4.0f, 2.2, 2.2));
        this.field4114.method22062(5, new Class3483(this));
        this.field4114.method22062(6, new Class3517(this, 0.6));
        this.field4114.method22062(11, new Class3628(this, PlayerEntity.class, 10.0f));
    }
    
    @Override
    public float method2724() {
        if (!this.collidedHorizontally && (!this.field4110.method19905() || this.field4110.method19911() <= this.getPosY() + 0.5)) {
            final Class9468 method24727 = this.field4113.method24727();
            if (method24727 != null) {
                if (method24727.method35222() < method24727.method35221()) {
                    if (method24727.method35225(this).y > this.getPosY() + 0.5) {
                        return 0.5f;
                    }
                }
            }
            return (this.field4110.method19906() > 0.6) ? 0.3f : 0.2f;
        }
        return 0.5f;
    }
    
    @Override
    public void method2725() {
        super.method2725();
        if (this.field4110.method19906() > 0.0) {
            if (Entity.horizontalMag(this.getMotion()) < 0.01) {
                this.method1724(0.1f, new Vec3d(0.0, 0.0, 1.0));
            }
        }
        if (!this.world.isRemote) {
            this.world.method6761(this, (byte)1);
        }
    }
    
    public float method4433(final float n) {
        return (this.field4231 != 0) ? ((this.field4230 + n) / this.field4231) : 0.0f;
    }
    
    public void method4434(final double n) {
        this.method4150().method24716(n);
        this.field4110.method19907(this.field4110.method19910(), this.field4110.method19911(), this.field4110.method19912(), n);
    }
    
    @Override
    public void method2745(final boolean b) {
        super.method2745(b);
        if (b) {
            this.method1695(this.method4441(), this.method2720(), ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f) * 0.8f);
        }
    }
    
    public void method4435() {
        this.method2745(true);
        this.field4231 = 10;
        this.field4230 = 0;
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class792.field4228, 0);
    }
    
    @Override
    public void method4172() {
        if (this.field4233 > 0) {
            --this.field4233;
        }
        if (this.field4234 > 0) {
            this.field4234 -= this.rand.nextInt(3);
            if (this.field4234 < 0) {
                this.field4234 = 0;
            }
        }
        if (this.onGround) {
            if (!this.field4232) {
                this.method2745(false);
                this.method4440();
            }
            if (this.method4444() == 99) {
                if (this.field4233 == 0) {
                    final LivingEntity method4152 = this.method4152();
                    if (method4152 != null) {
                        if (this.method1734(method4152) < 16.0) {
                            this.method4436(method4152.getPosX(), method4152.getPosZ());
                            this.field4110.method19907(method4152.getPosX(), method4152.getPosY(), method4152.getPosZ(), this.field4110.method19906());
                            this.method4435();
                            this.field4232 = true;
                        }
                    }
                }
            }
            final Class7295 class7295 = (Class7295)this.field4111;
            if (class7295.method22378()) {
                if (!class7295.method22379()) {
                    this.method4437();
                }
            }
            else if (this.field4110.method19905()) {
                if (this.field4233 == 0) {
                    final Class9468 method4153 = this.field4113.method24727();
                    Vec3d method4154 = new Vec3d(this.field4110.method19910(), this.field4110.method19911(), this.field4110.method19912());
                    if (method4153 != null) {
                        if (method4153.method35222() < method4153.method35221()) {
                            method4154 = method4153.method35225(this);
                        }
                    }
                    this.method4436(method4154.x, method4154.z);
                    this.method4435();
                }
            }
        }
        this.field4232 = this.onGround;
    }
    
    @Override
    public void method1718() {
    }
    
    private void method4436(final double n, final double n2) {
        this.rotationYaw = (float)(MathHelper.method35693(n2 - this.getPosZ(), n - this.getPosX()) * 57.2957763671875) - 90.0f;
    }
    
    private void method4437() {
        ((Class7295)this.field4111).method22380(true);
    }
    
    private void method4438() {
        ((Class7295)this.field4111).method22380(false);
    }
    
    private void method4439() {
        if (this.field4110.method19906() >= 2.2) {
            this.field4233 = 1;
        }
        else {
            this.field4233 = 10;
        }
    }
    
    private void method4440() {
        this.method4439();
        this.method4438();
    }
    
    @Override
    public void method2736() {
        super.method2736();
        if (this.field4230 == this.field4231) {
            if (this.field4231 != 0) {
                this.field4230 = 0;
                this.field4231 = 0;
                this.method2745(false);
            }
        }
        else {
            ++this.field4230;
        }
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(3.0);
        this.method2710(Class8107.field33408).method23941(0.30000001192092896);
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        class51.putInt("RabbitType", this.method4444());
        class51.putInt("MoreCarrotTicks", this.field4234);
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        this.method4445(class51.getInt("RabbitType"));
        this.field4234 = class51.getInt("MoreCarrotTicks");
    }
    
    public Class7795 method4441() {
        return Class8520.field35511;
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35507;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35510;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35509;
    }
    
    @Override
    public boolean method2734(final Entity class399) {
        if (this.method4444() != 99) {
            return class399.attackEntityFrom(DamageSource.method25693(this), 3.0f);
        }
        this.method1695(Class8520.field35508, 1.0f, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f);
        return class399.attackEntityFrom(DamageSource.method25693(this), 8.0f);
    }
    
    @Override
    public Class286 method1922() {
        return (this.method4444() != 99) ? Class286.field1584 : Class286.field1583;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        return !this.method1849(class7929) && super.attackEntityFrom(class7929, n);
    }
    
    private boolean method4442(final Item class3820) {
        if (class3820 != Items.field31517) {
            if (class3820 != Items.field31522) {
                return class3820 == Blocks.DANDELION.method11704();
            }
        }
        return true;
    }
    
    public Class792 method4443(final Class788 class788) {
        final Class792 class789 = EntityType.field29017.method23371(this.world);
        int n = this.method4446(this.world);
        if (this.rand.nextInt(20) != 0) {
            if (class788 instanceof Class792 && this.rand.nextBoolean()) {
                n = ((Class792)class788).method4444();
            }
            else {
                n = this.method4444();
            }
        }
        class789.method4445(n);
        return class789;
    }
    
    @Override
    public boolean method4357(final ItemStack class8321) {
        return this.method4442(class8321.getItem());
    }
    
    public int method4444() {
        return this.dataManager.get(Class792.field4228);
    }
    
    public void method4445(final int i) {
        if (i == 99) {
            this.method2710(Class8107.field33413).method23941(8.0);
            this.field4114.method22062(4, new Class3575(this));
            this.field4115.method22062(1, new Class3547(this, new Class[0]).method11100(new Class[0]));
            this.field4115.method22062(2, new Class3555<Object>(this, PlayerEntity.class, true));
            this.field4115.method22062(2, new Class3555<Object>(this, Class799.class, true));
            if (!this.hasCustomName()) {
                this.method1872(new Class2259(Util.method27836("entity", Class792.field4229)));
            }
        }
        this.dataManager.set(Class792.field4228, i);
    }
    
    @Nullable
    @Override
    public ILivingEntityData method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, ILivingEntityData class1854, final CompoundNBT class1855) {
        int n = this.method4446(class1851);
        if (!(class1854 instanceof Class5499)) {
            class1854 = new Class5499(n);
        }
        else {
            n = ((Class5499)class1854).field22791;
        }
        this.method4445(n);
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    private int method4446(final Class1851 class1851) {
        final Biome method6959 = class1851.method6959(new BlockPos(this));
        final int nextInt = this.rand.nextInt(100);
        if (method6959.method9841() == Class2145.field12630) {
            return (nextInt >= 80) ? 3 : 1;
        }
        if (method6959.method9870() != Class2140.field12597) {
            return (nextInt >= 50) ? ((nextInt >= 90) ? 2 : 5) : 0;
        }
        return 4;
    }
    
    public static boolean method4447(final EntityType<Class792> class7499, final Class1851 class7500, final Class2101 class7501, final BlockPos class7502, final Random random) {
        final Block method21696 = class7500.getBlockState(class7502.method1139()).getBlock();
        if (method21696 != Blocks.GRASS_BLOCK) {
            if (method21696 != Blocks.field29329) {
                if (method21696 != Blocks.field29175) {
                    return false;
                }
            }
        }
        return class7500.method6993(class7502, 0) > 8;
    }
    
    private boolean method4448() {
        return this.field4234 == 0;
    }
    
    @Override
    public void method1798(final byte b) {
        if (b != 1) {
            super.method1798(b);
        }
        else {
            this.method1719();
            this.field4231 = 10;
            this.field4230 = 0;
        }
    }
    
    static {
        field4228 = EntityDataManager.method33564(Class792.class, Class7709.field30654);
        field4229 = new ResourceLocation("killer_bunny");
    }
}
