// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Iterator;

public class Class470 implements Class446, Class469
{
    private static String[] field2763;
    private final Class2265<ItemStack> field2764;
    private Class3662<?> field2765;
    
    public Class470() {
        this.field2764 = Class2265.method8507(1, ItemStack.field34174);
    }
    
    @Override
    public int method2239() {
        return 1;
    }
    
    @Override
    public boolean method2156() {
        final Iterator<Object> iterator = this.field2764.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().method27620()) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public ItemStack method2157(final int n) {
        return this.field2764.get(0);
    }
    
    @Override
    public ItemStack method2158(final int n, final int n2) {
        return Class8508.method28423(this.field2764, 0);
    }
    
    @Override
    public ItemStack method2159(final int n) {
        return Class8508.method28423(this.field2764, 0);
    }
    
    @Override
    public void method2160(final int n, final ItemStack class8321) {
        this.field2764.set(0, class8321);
    }
    
    @Override
    public void method2161() {
    }
    
    @Override
    public boolean method2162(final Class512 class512) {
        return true;
    }
    
    @Override
    public void method2164() {
        this.field2764.clear();
    }
    
    @Override
    public void method2401(final Class3662<?> field2765) {
        this.field2765 = field2765;
    }
    
    @Nullable
    @Override
    public Class3662<?> method2402() {
        return this.field2765;
    }
}
