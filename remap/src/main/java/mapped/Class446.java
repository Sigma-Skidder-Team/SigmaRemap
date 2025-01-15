// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import java.util.Set;

public interface Class446 extends Class447
{
    int method2239();
    
    boolean method2156();
    
    ItemStack method2157(final int p0);
    
    ItemStack method2158(final int p0, final int p1);
    
    ItemStack method2159(final int p0);
    
    void method2160(final int p0, final ItemStack p1);
    
    default int method2254() {
        return 64;
    }
    
    void method2161();
    
    boolean method2162(final Class512 p0);
    
    default void method2241(final Class512 class512) {
    }
    
    default void method2242(final Class512 class512) {
    }
    
    default boolean method2264(final int n, final ItemStack class8321) {
        return true;
    }
    
    default int method2265(final Class3820 obj) {
        int n = 0;
        for (int i = 0; i < this.method2239(); ++i) {
            final ItemStack method2157 = this.method2157(i);
            if (method2157.method27622().equals(obj)) {
                n += method2157.method27690();
            }
        }
        return n;
    }
    
    default boolean method2266(final Set<Class3820> set) {
        for (int i = 0; i < this.method2239(); ++i) {
            final ItemStack method2157 = this.method2157(i);
            if (set.contains(method2157.method27622()) && method2157.method27690() > 0) {
                return true;
            }
        }
        return false;
    }
}
