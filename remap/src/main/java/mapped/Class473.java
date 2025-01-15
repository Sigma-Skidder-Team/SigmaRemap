// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class473 implements Class446, Class472
{
    private static String[] field2768;
    private final Class2265<ItemStack> field2769;
    private final int field2770;
    private final int field2771;
    private final Class3418 field2772;
    
    public Class473(final Class3418 field2772, final int field2773, final int field2774) {
        this.field2769 = Class2265.method8507(field2773 * field2774, ItemStack.field34174);
        this.field2772 = field2772;
        this.field2770 = field2773;
        this.field2771 = field2774;
    }
    
    @Override
    public int method2239() {
        return this.field2769.size();
    }
    
    @Override
    public boolean method2156() {
        final Iterator<Object> iterator = this.field2769.iterator();
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
        return (n < this.method2239()) ? this.field2769.get(n) : ItemStack.field34174;
    }
    
    @Override
    public ItemStack method2159(final int n) {
        return Class8508.method28423(this.field2769, n);
    }
    
    @Override
    public ItemStack method2158(final int n, final int n2) {
        final ItemStack method28422 = Class8508.method28422(this.field2769, n, n2);
        if (!method28422.method27620()) {
            this.field2772.method10855(this);
        }
        return method28422;
    }
    
    @Override
    public void method2160(final int n, final ItemStack class8321) {
        this.field2769.set(n, class8321);
        this.field2772.method10855(this);
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
        this.field2769.clear();
    }
    
    public int method2417() {
        return this.field2771;
    }
    
    public int method2418() {
        return this.field2770;
    }
    
    @Override
    public void method2259(final Class5024 class5024) {
        final Iterator<Object> iterator = this.field2769.iterator();
        while (iterator.hasNext()) {
            class5024.method15242(iterator.next());
        }
    }
}
