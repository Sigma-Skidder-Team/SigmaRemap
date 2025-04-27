// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Class506 extends Class428
{
    private static final DataParameter<Boolean> field2886;
    private int field2887;
    public double field2888;
    public double field2889;
    private static final Ingredient field2890;
    
    public Class506(final EntityType<? extends Class506> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    public Class506(final World class1847, final double n, final double n2, final double n3) {
        super(EntityType.field29002, class1847, n, n2, n3);
    }
    
    @Override
    public Class2080 method2139() {
        return Class2080.field12026;
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class506.field2886, false);
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (!this.world.isRemote()) {
            if (this.field2887 > 0) {
                --this.field2887;
            }
            if (this.field2887 <= 0) {
                this.field2888 = 0.0;
                this.field2889 = 0.0;
            }
            this.method2599(this.field2887 > 0);
        }
        if (this.method2598()) {
            if (this.rand.nextInt(4) == 0) {
                this.world.addParticle(Class8432.field34632, this.getPosX(), this.getPosY() + 0.8, this.getPosZ(), 0.0, 0.0, 0.0);
            }
        }
    }
    
    @Override
    public double method2125() {
        return 0.2;
    }
    
    @Override
    public void method2123(final DamageSource class7929) {
        super.method2123(class7929);
        if (!class7929.method25707()) {
            if (this.world.method6765().method31216(Class8878.field37321)) {
                this.method1764(Blocks.field29299);
            }
        }
    }
    
    @Override
    public void method2128(final BlockPos class354, final BlockState class355) {
        super.method2128(class354, class355);
        final Vec3d method1935 = this.getMotion();
        final double method1936 = Entity.horizontalMag(method1935);
        final double n = this.field2888 * this.field2888 + this.field2889 * this.field2889;
        if (n > 1.0E-4) {
            if (method1936 > 0.001) {
                final double n2 = MathHelper.sqrt(method1936);
                final double n3 = MathHelper.sqrt(n);
                this.field2888 = method1935.x / n2 * n3;
                this.field2889 = method1935.z / n2 * n3;
            }
        }
    }
    
    @Override
    public void method2130() {
        final double n = this.field2888 * this.field2888 + this.field2889 * this.field2889;
        if (n <= 1.0E-7) {
            this.method1936(this.getMotion().mul(0.98, 0.0, 0.98));
        }
        else {
            final double n2 = MathHelper.sqrt(n);
            this.field2888 /= n2;
            this.field2889 /= n2;
            this.method1936(this.getMotion().mul(0.8, 0.0, 0.8).add(this.field2888, 0.0, this.field2889));
        }
        super.method2130();
    }
    
    @Override
    public boolean method1770(final PlayerEntity playerEntity, final Class316 class513) {
        final ItemStack method2715 = playerEntity.method2715(class513);
        if (Class506.field2890.test(method2715)) {
            if (this.field2887 + 3600 <= 32000) {
                if (!playerEntity.field3025.field27304) {
                    method2715.method27693(1);
                }
                this.field2887 += 3600;
            }
        }
        if (this.field2887 > 0) {
            this.field2888 = this.getPosX() - playerEntity.getPosX();
            this.field2889 = this.getPosZ() - playerEntity.getPosZ();
        }
        return true;
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        class51.putDouble("PushX", this.field2888);
        class51.putDouble("PushZ", this.field2889);
        class51.putShort("Fuel", (short)this.field2887);
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        this.field2888 = class51.getDouble("PushX");
        this.field2889 = class51.getDouble("PushZ");
        this.field2887 = class51.getShort("Fuel");
    }
    
    public boolean method2598() {
        return this.dataManager.get(Class506.field2886);
    }
    
    public void method2599(final boolean b) {
        this.dataManager.set(Class506.field2886, b);
    }
    
    @Override
    public BlockState method2141() {
        return ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>) Blocks.field29299.getDefaultState()).with((IProperty<Comparable>)Class3951.field17846, Direction.NORTH)).with((IProperty<Comparable>)Class3951.field17847, this.method2598());
    }
    
    static {
        field2886 = EntityDataManager.method33564(Class506.class, Class7709.field30661);
        field2890 = Ingredient.method618(Items.field31281, Items.field31282);
    }
}
