// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;
import javax.annotation.Nullable;

public class Class817 extends Class789
{
    private static final Ingredient field4376;
    private static final DataParameter<Boolean> field4377;
    private Class3452<PlayerEntity> field4378;
    private Class3474 field4379;
    
    public Class817(final EntityType<? extends Class817> class7499, final World class7500) {
        super(class7499, class7500);
        this.method4812();
    }
    
    private boolean method4808() {
        return this.dataManager.get(Class817.field4377);
    }
    
    private void method4809(final boolean b) {
        this.dataManager.set(Class817.field4377, b);
        this.method4812();
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        class51.putBoolean("Trusting", this.method4808());
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        this.method4809(class51.getBoolean("Trusting"));
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class817.field4377, false);
    }
    
    @Override
    public void method4142() {
        this.field4379 = new Class3474(this, 0.6, Class817.field4376, true);
        this.field4114.method22062(1, new Class3490(this));
        this.field4114.method22062(3, this.field4379);
        this.field4114.method22062(7, new Class3526(this, 0.3f));
        this.field4114.method22062(8, new Class3475(this));
        this.field4114.method22062(9, new Class3587(this, 0.8));
        this.field4114.method22062(10, new Class3517(this, 0.8, 1.0000001E-5f));
        this.field4114.method22062(11, new Class3628(this, PlayerEntity.class, 10.0f));
        this.field4115.method22062(1, new Class3555<Object>(this, Class818.class, false));
        this.field4115.method22062(1, new Class3555<Object>(this, Class793.class, 10, false, false, Class793.field4242));
    }
    
    @Override
    public void method4172() {
        if (!this.method4148().method19905()) {
            this.method1653(Pose.field1663);
            this.method1816(false);
        }
        else {
            final double method19906 = this.method4148().method19906();
            if (method19906 != 0.6) {
                if (method19906 != 1.33) {
                    this.method1653(Pose.field1663);
                    this.method1816(false);
                }
                else {
                    this.method1653(Pose.field1663);
                    this.method1816(true);
                }
            }
            else {
                this.method1653(Pose.field1668);
                this.method1816(false);
            }
        }
    }
    
    @Override
    public boolean method4168(final double n) {
        return !this.method4808() && this.ticksExisted > 2400;
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(10.0);
        this.method2710(Class8107.field33408).method23941(0.30000001192092896);
        this.method2711().method20873(Class8107.field33410).method23941(3.0);
    }
    
    @Override
    public boolean method1705(final float n, final float n2) {
        return false;
    }
    
    @Nullable
    @Override
    public Class7795 method4160() {
        return Class8520.field35405;
    }
    
    @Override
    public int method4155() {
        return 900;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35404;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35406;
    }
    
    private float method4810() {
        return (float)this.method2710(Class8107.field33410).method23950();
    }
    
    @Override
    public boolean method2734(final Entity class399) {
        return class399.attackEntityFrom(DamageSource.method25693(this), this.method4810());
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        return !this.method1849(class7929) && super.attackEntityFrom(class7929, n);
    }
    
    @Override
    public boolean method4195(final PlayerEntity playerEntity, final Class316 class513) {
        final ItemStack method2715 = playerEntity.method2715(class513);
        if (this.field4379 == null || this.field4379.method11040()) {
            if (!this.method4808()) {
                if (this.method4357(method2715)) {
                    if (playerEntity.method1734(this) < 9.0) {
                        this.method4358(playerEntity, method2715);
                        if (!this.world.isRemote) {
                            if (this.rand.nextInt(3) != 0) {
                                this.method4811(false);
                                this.world.method6761(this, (byte)40);
                            }
                            else {
                                this.method4809(true);
                                this.method4811(true);
                                this.world.method6761(this, (byte)41);
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return super.method4195(playerEntity, class513);
    }
    
    @Override
    public void method1798(final byte b) {
        if (b != 41) {
            if (b != 40) {
                super.method1798(b);
            }
            else {
                this.method4811(false);
            }
        }
        else {
            this.method4811(true);
        }
    }
    
    private void method4811(final boolean b) {
        Class6908 class6908 = Class8432.field34627;
        if (!b) {
            class6908 = Class8432.field34639;
        }
        for (int i = 0; i < 7; ++i) {
            this.world.addParticle(class6908, this.method1940(1.0), this.method1943() + 0.5, this.method1947(1.0), this.rand.nextGaussian() * 0.02, this.rand.nextGaussian() * 0.02, this.rand.nextGaussian() * 0.02);
        }
    }
    
    public void method4812() {
        if (this.field4378 == null) {
            this.field4378 = new Class3452<PlayerEntity>(this, PlayerEntity.class, 16.0f, 0.8, 1.33);
        }
        this.field4114.method22063(this.field4378);
        if (!this.method4808()) {
            this.field4114.method22062(4, this.field4378);
        }
    }
    
    public Class817 method4813(final Class788 class788) {
        return EntityType.field29008.method23371(this.world);
    }
    
    @Override
    public boolean method4357(final ItemStack class8321) {
        return Class817.field4376.test(class8321);
    }
    
    public static boolean method4814(final EntityType<Class817> class7499, final Class1851 class7500, final Class2101 class7501, final BlockPos class7502, final Random random) {
        return random.nextInt(3) != 0;
    }
    
    @Override
    public boolean method4180(final Class1852 class1852) {
        if (class1852.method6975(this)) {
            if (!class1852.method6968(this.getBoundingBox())) {
                final BlockPos class1853 = new BlockPos(this);
                if (class1853.getY() < class1852.method6743()) {
                    return false;
                }
                final BlockState method6701 = class1852.getBlockState(class1853.method1139());
                return method6701.getBlock() == Blocks.GRASS_BLOCK || method6701.method21755(Class7188.field27907);
            }
        }
        return false;
    }
    
    @Nullable
    @Override
    public ILivingEntityData method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, ILivingEntityData class1854, final CompoundNBT class1855) {
        if (class1854 == null) {
            class1854 = new Class5497();
            ((Class5497)class1854).method16803(1.0f);
        }
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    static {
        field4376 = Ingredient.method618(Items.field31379, Items.field31380);
        field4377 = EntityDataManager.method33564(Class817.class, Class7709.field30661);
    }
}
