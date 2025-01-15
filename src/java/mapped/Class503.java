// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class503 implements Class434
{
    public final /* synthetic */ Class475 field2878;
    public final /* synthetic */ Class475 field2879;
    public final /* synthetic */ Class446 field2880;
    public final /* synthetic */ Class6392 field2881;
    
    public Class503(final Class6392 field2881, final Class475 field2882, final Class475 field2883, final Class446 field2884) {
        this.field2881 = field2881;
        this.field2878 = field2882;
        this.field2879 = field2883;
        this.field2880 = field2884;
    }
    
    @Nullable
    @Override
    public Class3418 method2166(final int n, final Class464 class464, final Class512 class465) {
        if (this.field2878.method2328(class465) && this.field2879.method2328(class465)) {
            this.field2878.method2326(class464.field2744);
            this.field2879.method2326(class464.field2744);
            return Class3438.method10971(n, class464, this.field2880);
        }
        return null;
    }
    
    @Override
    public Class2250 method1871() {
        if (!this.field2878.method1874()) {
            return this.field2879.method1874() ? this.field2879.method1871() : new Class2259("container.chestDouble", new Object[0]);
        }
        return this.field2878.method1871();
    }
}
