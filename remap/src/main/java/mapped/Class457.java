// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.text.ITextComponent;

public class Class457 extends Class456
{
    private Class2265<ItemStack> field2712;
    private int field2713;
    
    private Class457(final Class5412<?> class5412) {
        super(class5412);
        this.field2712 = Class2265.method8507(27, ItemStack.EMPTY);
    }
    
    public Class457() {
        this(Class5412.field22566);
    }
    
    @Override
    public CompoundNBT method2180(final CompoundNBT class51) {
        super.method2180(class51);
        if (!this.method2325(class51)) {
            Class8508.method28424(class51, this.field2712);
        }
        return class51;
    }
    
    @Override
    public void method2179(final CompoundNBT class51) {
        super.method2179(class51);
        this.field2712 = Class2265.method8507(this.method2239(), ItemStack.EMPTY);
        if (!this.method2324(class51)) {
            Class8508.method28426(class51, this.field2712);
        }
    }
    
    @Override
    public int method2239() {
        return 27;
    }
    
    @Override
    public Class2265<ItemStack> method2246() {
        return this.field2712;
    }
    
    @Override
    public void method2247(final Class2265<ItemStack> field2712) {
        this.field2712 = field2712;
    }
    
    @Override
    public ITextComponent method2243() {
        return new Class2259("container.barrel", new Object[0]);
    }
    
    @Override
    public Class3418 method2253(final int n, final Class464 class464) {
        return Class3438.method10970(n, class464, this);
    }
    
    @Override
    public void method2241(final PlayerEntity playerEntity) {
        if (!playerEntity.isSpectator()) {
            if (this.field2713 < 0) {
                this.field2713 = 0;
            }
            ++this.field2713;
            final BlockState method2194 = this.method2194();
            if (!method2194.get((IProperty<Boolean>)Class3939.field17825)) {
                this.method2332(method2194, Class8520.field35004);
                this.method2331(method2194, true);
            }
            this.method2329();
        }
    }
    
    private void method2329() {
        this.field2656.method6833().method21345(this.getPos(), this.method2194().getBlock(), 5);
    }
    
    public void method2330() {
        this.field2713 = Class475.method2420(this.field2656, this, this.field2657.getX(), this.field2657.getY(), this.field2657.getZ());
        if (this.field2713 <= 0) {
            final BlockState method2194 = this.method2194();
            if (method2194.getBlock() != Class7521.field29807) {
                this.method2198();
                return;
            }
            if (method2194.get((IProperty<Boolean>)Class3939.field17825)) {
                this.method2332(method2194, Class8520.field35003);
                this.method2331(method2194, false);
            }
        }
        else {
            this.method2329();
        }
    }
    
    @Override
    public void method2242(final PlayerEntity playerEntity) {
        if (!playerEntity.isSpectator()) {
            --this.field2713;
        }
    }
    
    private void method2331(final BlockState class7096, final boolean b) {
        this.field2656.setBlockState(this.getPos(), ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3939.field17825, b), 3);
    }
    
    private void method2332(final BlockState class7096, final Class7795 class7097) {
        final Vec3i method802 = class7096.get((IProperty<Direction>)Class3939.field17824).getDirectionVec();
        this.field2656.method6706(null, this.field2657.getX() + 0.5 + method802.getX() / 2.0, this.field2657.getY() + 0.5 + method802.getY() / 2.0, this.field2657.getZ() + 0.5 + method802.getZ() / 2.0, class7097, Class286.field1582, 0.5f, this.field2656.rand.nextFloat() * 0.1f + 0.9f);
    }
}
