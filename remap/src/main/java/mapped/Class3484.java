// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;

public class Class3484 extends Class3479
{
    private static String[] field16410;
    public int field16411;
    public final /* synthetic */ Class803 field16412;
    
    public Class3484(final Class803 field16412, final double n, final int n2, final int n3) {
        this.field16412 = field16412;
        super(field16412, n, n2, n3);
    }
    
    @Override
    public double method11046() {
        return 2.0;
    }
    
    @Override
    public boolean method11047() {
        return this.field16393 % 100 == 0;
    }
    
    @Override
    public boolean method11050(final Class1852 class1852, final BlockPos class1853) {
        final BlockState method6701 = class1852.getBlockState(class1853);
        return method6701.getBlock() == Blocks.SWEET_BERRY_BUSH && method6701.get(Class3884.field17541) >= 2;
    }
    
    @Override
    public void method11016() {
        if (!this.method11048()) {
            if (!this.method11048()) {
                if (Class803.method4688(this.field16412).nextFloat() < 0.05f) {
                    this.field16412.method1695(Class8520.field35210, 1.0f, 1.0f);
                }
            }
        }
        else if (this.field16411 < 40) {
            ++this.field16411;
        }
        else {
            this.method11051();
        }
        super.method11016();
    }
    
    public void method11051() {
        if (this.field16412.world.method6765().method31216(Class8878.field37316)) {
            final BlockState method6701 = this.field16412.world.getBlockState(this.field16395);
            if (method6701.getBlock() == Blocks.SWEET_BERRY_BUSH) {
                final int intValue = method6701.get(Class3884.field17541);
                ((StateHolder<Object, Object>)method6701).with((IProperty<Comparable>)Class3884.field17541, 1);
                int n = 1 + this.field16412.world.rand.nextInt(2) + ((intValue == 3) ? 1 : 0);
                if (this.field16412.method2718(Class2215.field13600).method27620()) {
                    this.field16412.method1803(Class2215.field13600, new ItemStack(Items.field31630));
                    --n;
                }
                if (n > 0) {
                    Block.spawnAsEntity(this.field16412.world, this.field16395, new ItemStack(Items.field31630, n));
                }
                this.field16412.method1695(Class8520.field35630, 1.0f, 1.0f);
                this.field16412.world.setBlockState(this.field16395, ((StateHolder<Object, BlockState>)method6701).with((IProperty<Comparable>)Class3884.field17541, 1), 2);
            }
        }
    }
    
    @Override
    public boolean method11013() {
        return !this.field16412.method2783() && super.method11013();
    }
    
    @Override
    public void method11015() {
        this.field16411 = 0;
        this.field16412.method4655(false);
        super.method11015();
    }
}
