// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Random;
import javax.annotation.Nullable;
import java.util.function.Predicate;

public class Class793 extends Class789
{
    private static final DataParameter<BlockPos> field4235;
    private static final DataParameter<Boolean> field4236;
    private static final DataParameter<Boolean> field4237;
    private static final DataParameter<BlockPos> field4238;
    private static final DataParameter<Boolean> field4239;
    private static final DataParameter<Boolean> field4240;
    private int field4241;
    public static final Predicate<LivingEntity> field4242;
    
    public Class793(final EntityType<? extends Class793> class7499, final World class7500) {
        super(class7499, class7500);
        this.method4145(Class257.field1211, 0.0f);
        this.field4110 = new Class6576(this);
        this.stepHeight = 1.0f;
    }
    
    public void method4452(final BlockPos class354) {
        this.dataManager.set(Class793.field4235, class354);
    }
    
    private BlockPos method4453() {
        return this.dataManager.get(Class793.field4235);
    }
    
    private void method4454(final BlockPos class354) {
        this.dataManager.set(Class793.field4238, class354);
    }
    
    private BlockPos method4455() {
        return this.dataManager.get(Class793.field4238);
    }
    
    public boolean method4456() {
        return this.dataManager.get(Class793.field4236);
    }
    
    private void method4457(final boolean b) {
        this.dataManager.set(Class793.field4236, b);
    }
    
    public boolean method4458() {
        return this.dataManager.get(Class793.field4237);
    }
    
    private void method4459(final boolean b) {
        this.field4241 = (b ? 1 : 0);
        this.dataManager.set(Class793.field4237, b);
    }
    
    private boolean method4460() {
        return this.dataManager.get(Class793.field4239);
    }
    
    private void method4461(final boolean b) {
        this.dataManager.set(Class793.field4239, b);
    }
    
    private boolean method4462() {
        return this.dataManager.get(Class793.field4240);
    }
    
    private void method4463(final boolean b) {
        this.dataManager.set(Class793.field4240, b);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class793.field4235, BlockPos.ZERO);
        this.dataManager.register(Class793.field4236, false);
        this.dataManager.register(Class793.field4238, BlockPos.ZERO);
        this.dataManager.register(Class793.field4239, false);
        this.dataManager.register(Class793.field4240, false);
        this.dataManager.register(Class793.field4237, false);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method298("HomePosX", this.method4453().getX());
        class51.method298("HomePosY", this.method4453().getY());
        class51.method298("HomePosZ", this.method4453().getZ());
        class51.method312("HasEgg", this.method4456());
        class51.method298("TravelPosX", this.method4455().getX());
        class51.method298("TravelPosY", this.method4455().getY());
        class51.method298("TravelPosZ", this.method4455().getZ());
    }
    
    @Override
    public void method1760(final Class51 class51) {
        this.method4452(new BlockPos(class51.method319("HomePosX"), class51.method319("HomePosY"), class51.method319("HomePosZ")));
        super.method1760(class51);
        this.method4457(class51.method329("HasEgg"));
        this.method4454(new BlockPos(class51.method319("TravelPosX"), class51.method319("TravelPosY"), class51.method319("TravelPosZ")));
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, final Class5496 class1854, final Class51 class1855) {
        this.method4452(new BlockPos(this));
        this.method4454(BlockPos.ZERO);
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    public static boolean method4464(final EntityType<Class793> class7499, final Class1851 class7500, final Class2101 class7501, final BlockPos class7502, final Random random) {
        if (class7502.getY() < class7500.method6743() + 4) {
            if (class7500.method6701(class7502.method1139()).method21696() == Class7521.field29175) {
                if (class7500.method6993(class7502, 0) > 8) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(0, new Class3610(this, 1.2));
        this.field4114.method22062(1, new Class3588(this, 1.0));
        this.field4114.method22062(1, new Class3480(this, 1.0));
        this.field4114.method22062(2, new Class3598(this, 1.1, Class7521.field29244.method11704()));
        this.field4114.method22062(3, new Class3488(this, 1.0, null));
        this.field4114.method22062(4, new Class3540(this, 1.0));
        this.field4114.method22062(7, new Class3506(this, 1.0));
        this.field4114.method22062(8, new Class3628(this, Class512.class, 8.0f));
        this.field4114.method22062(9, new Class3519(this, 1.0, 100, null));
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(30.0);
        this.method2710(Class8107.field33408).method23941(0.25);
    }
    
    @Override
    public boolean method1868() {
        return false;
    }
    
    @Override
    public boolean method2622() {
        return true;
    }
    
    @Override
    public Class6363 method2712() {
        return Class6363.field25464;
    }
    
    @Override
    public int method4155() {
        return 200;
    }
    
    @Nullable
    @Override
    public Class7795 method4160() {
        if (!this.method1706()) {
            if (this.onGround) {
                if (!this.method2625()) {
                    return Class8520.field35650;
                }
            }
        }
        return super.method4160();
    }
    
    @Override
    public void method1692(final float n) {
        super.method1692(n * 1.5f);
    }
    
    @Override
    public Class7795 method1686() {
        return Class8520.field35661;
    }
    
    @Nullable
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return this.method2625() ? Class8520.field35657 : Class8520.field35656;
    }
    
    @Nullable
    @Override
    public Class7795 method2684() {
        return this.method2625() ? Class8520.field35652 : Class8520.field35651;
    }
    
    @Override
    public void method1691(final BlockPos class354, final Class7096 class355) {
        this.method1695(this.method2625() ? Class8520.field35660 : Class8520.field35659, 0.15f, 1.0f);
    }
    
    @Override
    public boolean method4359() {
        return super.method4359() && !this.method4456();
    }
    
    @Override
    public float method1684() {
        return this.distanceWalkedOnStepModified + 0.15f;
    }
    
    @Override
    public float method2626() {
        return this.method2625() ? 0.3f : 1.0f;
    }
    
    @Override
    public Class7746 method4143(final World class1847) {
        return new Class7753(this, class1847);
    }
    
    @Nullable
    @Override
    public Class788 method4349(final Class788 class788) {
        return EntityType.field29035.method23371(this.world);
    }
    
    @Override
    public boolean method4357(final ItemStack class8321) {
        return class8321.method27622() == Class7521.field29244.method11704();
    }
    
    @Override
    public float method4228(final BlockPos class354, final Class1852 class355) {
        if (!this.method4460() && class355.method6702(class354).method21793(Class7324.field28319)) {
            return 10.0f;
        }
        return (class355.method6701(class354.method1139()).method21696() != Class7521.field29175) ? (class355.method6963(class354) - 0.5f) : 10.0f;
    }
    
    @Override
    public void method2736() {
        super.method2736();
        if (this.method1768()) {
            if (this.method4458()) {
                if (this.field4241 >= 1) {
                    if (this.field4241 % 5 == 0) {
                        final BlockPos class354 = new BlockPos(this);
                        if (this.world.method6701(class354.method1139()).method21696() == Class7521.field29175) {
                            this.world.method6955(2001, class354, Class3833.method11774(Class7521.field29175.method11878()));
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public void method4355() {
        super.method4355();
        if (!this.method2625()) {
            if (this.world.method6765().method31216(Class8878.field37319)) {
                this.method1765(Class7739.field31273, 1);
            }
        }
    }
    
    @Override
    public void method2729(final Vec3d class5487) {
        if (this.method2749() && this.method1706()) {
            this.method1724(0.1f, class5487);
            this.method1671(Class2160.field12826, this.getMotion());
            this.method1936(this.getMotion().scale(0.9));
            if (this.method4152() == null) {
                if (!this.method4460() || !this.method4453().withinDistance(this.method1934(), 20.0)) {
                    this.method1936(this.getMotion().add(0.0, -0.005, 0.0));
                }
            }
        }
        else {
            super.method2729(class5487);
        }
    }
    
    @Override
    public boolean method4204(final Class512 class512) {
        return false;
    }
    
    @Override
    public void onStruckByLightning(final LightningBoltEntity class422) {
        this.attackEntityFrom(DamageSource.LIGHTNING_BOLT, Float.MAX_VALUE);
    }
    
    static {
        field4235 = EntityDataManager.method33564(Class793.class, Class7709.field30664);
        field4236 = EntityDataManager.method33564(Class793.class, Class7709.field30661);
        field4237 = EntityDataManager.method33564(Class793.class, Class7709.field30661);
        field4238 = EntityDataManager.method33564(Class793.class, Class7709.field30664);
        field4239 = EntityDataManager.method33564(Class793.class, Class7709.field30661);
        field4240 = EntityDataManager.method33564(Class793.class, Class7709.field30661);
        field4242 = (class511 -> class511.method2625() && !class511.method1706());
    }
}
