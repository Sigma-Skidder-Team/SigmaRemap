// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Class851 extends FlyingEntity implements IMob
{
    private static final DataParameter<Integer> field4526;
    private final Vec3d field4527;
    private BlockPos field4528;
    private final Class2129 field4529;
    
    public Class851(final EntityType<? extends Class851> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4527 = Vec3d.ZERO;
        this.field4528 = BlockPos.ZERO;
        this.field4529 = Class2129.field12430;
        this.field4108 = 5;
        this.field4110 = new Class6569(this, this);
        this.field4109 = new Class7726(this, this);
    }
    
    @Override
    public Class7232 method4146() {
        return new Class7234(this, this);
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(1, new Class3476(this, null));
        this.field4114.method22062(2, new Class3635(this, null));
        this.field4114.method22062(3, new Class3636(this, null));
        this.field4115.method22062(1, new Class3478(this, null));
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2711().method20873(Class8107.field33410);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class851.field4526, 0);
    }
    
    public void method5087(final int n) {
        this.dataManager.set(Class851.field4526, MathHelper.method35651(n, 0, 64));
    }
    
    private void method5088() {
        this.method1881();
        this.method2710(Class8107.field33410).method23941(6 + this.method5089());
    }
    
    public int method5089() {
        return this.dataManager.get(Class851.field4526);
    }
    
    @Override
    public float method2789(final Pose class290, final EntitySize class291) {
        return class291.field34098 * 0.35f;
    }
    
    @Override
    public void method1880(final DataParameter<?> class8810) {
        if (Class851.field4526.equals(class8810)) {
            this.method5088();
        }
        super.method1880(class8810);
    }
    
    @Override
    public boolean method4170() {
        return true;
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (this.world.isRemote) {
            final float method35639 = MathHelper.cos((this.getEntityId() * 3 + this.ticksExisted) * 0.13f + 3.1415927f);
            final float method35640 = MathHelper.cos((this.getEntityId() * 3 + this.ticksExisted + 1) * 0.13f + 3.1415927f);
            if (method35639 > 0.0f) {
                if (method35640 <= 0.0f) {
                    this.world.method6708(this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field35457, this.method1922(), 0.95f + this.rand.nextFloat() * 0.05f, 0.95f + this.rand.nextFloat() * 0.05f, false);
                }
            }
            final int method35641 = this.method5089();
            final float n = MathHelper.cos(this.rotationYaw * 0.017453292f) * (1.3f + 0.21f * method35641);
            final float n2 = MathHelper.sin(this.rotationYaw * 0.017453292f) * (1.3f + 0.21f * method35641);
            final float n3 = (0.3f + method35639 * 0.45f) * (method35641 * 0.2f + 1.0f);
            this.world.method6709(Class8432.field34634, this.getPosX() + n, this.getPosY() + n3, this.getPosZ() + n2, 0.0, 0.0, 0.0);
            this.world.method6709(Class8432.field34634, this.getPosX() - n, this.getPosY() + n3, this.getPosZ() - n2, 0.0, 0.0, 0.0);
        }
    }
    
    @Override
    public void method2736() {
        if (this.isAlive()) {
            if (this.method4217()) {
                this.setFire(8);
            }
        }
        super.method2736();
    }
    
    @Override
    public void method4172() {
        super.method4172();
    }
    
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, final Class5496 class1854, final CompoundNBT class1855) {
        this.field4528 = new BlockPos(this).method1138(5);
        this.method5087(0);
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        if (class51.contains("AX")) {
            this.field4528 = new BlockPos(class51.getInt("AX"), class51.getInt("AY"), class51.getInt("AZ"));
        }
        this.method5087(class51.getInt("Size"));
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        class51.putInt("AX", this.field4528.getX());
        class51.putInt("AY", this.field4528.getY());
        class51.putInt("AZ", this.field4528.getZ());
        class51.putInt("Size", this.method5089());
    }
    
    @Override
    public boolean method1753(final double n) {
        return true;
    }
    
    @Override
    public Class286 method1922() {
        return Class286.field1583;
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35454;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35458;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35456;
    }
    
    @Override
    public Class6363 method2712() {
        return Class6363.field25461;
    }
    
    @Override
    public float method2720() {
        return 1.0f;
    }
    
    @Override
    public boolean method2620(final EntityType<?> class7499) {
        return true;
    }
    
    @Override
    public EntitySize method1933(final Pose class290) {
        final int method5089 = this.method5089();
        final EntitySize method5090 = super.method1933(class290);
        return method5090.method27561((method5090.field34097 + 0.2f * method5089) / method5090.field34097);
    }
    
    static {
        field4526 = EntityDataManager.method33564(Class851.class, Class7709.field30654);
    }
}
