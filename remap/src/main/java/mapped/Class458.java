// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;

import java.util.Random;

public class Class458 extends Class456
{
    private static final Random field2714;
    private Class2265<ItemStack> field2715;
    
    public Class458(final Class5412<?> class5412) {
        super(class5412);
        this.field2715 = Class2265.method8507(9, ItemStack.field34174);
    }
    
    public Class458() {
        this(Class5412.field22546);
    }
    
    @Override
    public int method2239() {
        return 9;
    }
    
    public int method2333() {
        this.method2326(null);
        int n = -1;
        int n2 = 1;
        for (int i = 0; i < this.field2715.size(); ++i) {
            if (!this.field2715.get(i).method27620()) {
                if (Class458.field2714.nextInt(n2++) == 0) {
                    n = i;
                }
            }
        }
        return n;
    }
    
    public int method2334(final ItemStack class8321) {
        for (int i = 0; i < this.field2715.size(); ++i) {
            if (this.field2715.get(i).method27620()) {
                this.method2160(i, class8321);
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public ITextComponent method2243() {
        return new Class2259("container.dispenser", new Object[0]);
    }
    
    @Override
    public void method2179(final CompoundNBT class51) {
        super.method2179(class51);
        this.field2715 = Class2265.method8507(this.method2239(), ItemStack.field34174);
        if (!this.method2324(class51)) {
            Class8508.method28426(class51, this.field2715);
        }
    }
    
    @Override
    public CompoundNBT method2180(final CompoundNBT class51) {
        super.method2180(class51);
        if (!this.method2325(class51)) {
            Class8508.method28424(class51, this.field2715);
        }
        return class51;
    }
    
    @Override
    public Class2265<ItemStack> method2246() {
        return this.field2715;
    }
    
    @Override
    public void method2247(final Class2265<ItemStack> field2715) {
        this.field2715 = field2715;
    }
    
    @Override
    public Class3418 method2253(final int n, final Class464 class464) {
        return new Class3424(n, class464, this);
    }
    
    static {
        field2714 = new Random();
    }
}
