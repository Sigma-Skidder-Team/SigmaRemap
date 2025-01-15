// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import java.util.function.Consumer;

public class Class6377 extends Class6367
{
    private static String[] field25487;
    private final Item field25488;
    
    private Class6377(final Item field25488, final int n, final int n2, final Class122[] array, final Class125[] array2) {
        super(n, n2, array, array2);
        this.field25488 = field25488;
    }
    
    @Override
    public void method19013(final Consumer<ItemStack> consumer, final Class7529 class7529) {
        consumer.accept(new ItemStack(this.field25488));
    }
    
    public static Class4948<?> method19045(final Class3832 class3832) {
        return Class6367.method19017((n, n2, array, array2) -> new Class6377(class3832.method11704(), n, n2, array, array2));
    }
}
