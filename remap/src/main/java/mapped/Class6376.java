// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.function.Consumer;

public class Class6376 extends Class6367
{
    private static String[] field25484;
    private final Class7909<Class3820> field25485;
    private final boolean field25486;
    
    private Class6376(final Class7909<Class3820> field25485, final boolean field25486, final int n, final int n2, final Class122[] array, final Class125[] array2) {
        super(n, n2, array, array2);
        this.field25485 = field25485;
        this.field25486 = field25486;
    }
    
    @Override
    public void method19013(final Consumer<ItemStack> consumer, final Class7529 class7529) {
        this.field25485.method25616().forEach(class7530 -> consumer2.accept(new ItemStack(class7530)));
    }
    
    private boolean method19039(final Class7529 class7529, final Consumer<Class7182> consumer) {
        if (this.method19019(class7529)) {
            final Iterator<Class3820> iterator = this.field25485.method25616().iterator();
            while (iterator.hasNext()) {
                consumer.accept(new Class7181(this, iterator.next()));
            }
            return true;
        }
        return false;
    }
    
    @Override
    public boolean method19016(final Class7529 class7529, final Consumer<Class7182> consumer) {
        return this.field25486 ? this.method19039(class7529, consumer) : super.method19016(class7529, consumer);
    }
    
    public static Class4948<?> method19040(final Class7909<Class3820> class7909) {
        return Class6367.method19017((n, n2, array, array2) -> new Class6376(class7909, true, n, n2, array, array2));
    }
}
