// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import java.util.function.Consumer;
import java.util.function.BiFunction;

public abstract class Class6367 extends Class6368
{
    public final int field25468;
    public final int field25469;
    public final Class125[] field25470;
    private final BiFunction<ItemStack, Class7529, ItemStack> field25471;
    private final Class7182 field25472;
    
    public Class6367(final int field25468, final int field25469, final Class122[] array, final Class125[] field25470) {
        super(array);
        this.field25472 = new Class7179(this);
        this.field25468 = field25468;
        this.field25469 = field25469;
        this.field25470 = field25470;
        this.field25471 = Class7463.method22991(field25470);
    }
    
    @Override
    public void method19015(final Class7790 class7790) {
        super.method19015(class7790);
        for (int i = 0; i < this.field25470.length; ++i) {
            this.field25470[i].method636(class7790.method25015(".functions[" + i + "]"));
        }
    }
    
    public abstract void method19013(final Consumer<ItemStack> p0, final Class7529 p1);
    
    @Override
    public boolean method19016(final Class7529 class7529, final Consumer<Class7182> consumer) {
        if (!this.method19019(class7529)) {
            return false;
        }
        consumer.accept(this.field25472);
        return true;
    }
    
    public static Class4948<?> method19017(final Class8807 class8807) {
        return new Class4949(class8807);
    }
}
