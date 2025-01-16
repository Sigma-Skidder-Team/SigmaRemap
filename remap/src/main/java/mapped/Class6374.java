// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import java.util.function.Consumer;

public class Class6374 extends Class6367
{
    public static final ResourceLocation field25481;
    private final ResourceLocation field25482;
    
    private Class6374(final ResourceLocation field25482, final int n, final int n2, final Class122[] array, final Class125[] array2) {
        super(n, n2, array, array2);
        this.field25482 = field25482;
    }
    
    @Override
    public void method19013(final Consumer<ItemStack> consumer, final Class7529 class7529) {
        class7529.method23578(this.field25482, consumer);
    }
    
    public static Class4948<?> method19033(final ResourceLocation class1932) {
        return Class6367.method19017((n, n2, array, array2) -> new Class6374(class1932, n, n2, array, array2));
    }
    
    static {
        field25481 = new ResourceLocation("dynamic");
    }
}
