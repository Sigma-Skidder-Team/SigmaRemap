// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public class Class505 extends Class433
{
    private static String[] field2885;
    
    public Class505(final Class7499<? extends Class505> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    public Class505(final Class1847 class1847, final double n, final double n2, final double n3) {
        super(Class7499.field29000, n, n2, n3, class1847);
    }
    
    @Override
    public void method2123(final Class7929 class7929) {
        super.method2123(class7929);
        if (this.field2391.method6765().method31216(Class8878.field37321)) {
            this.method1764(Class7521.field29292);
        }
    }
    
    @Override
    public int method2239() {
        return 27;
    }
    
    @Override
    public Class2080 method2139() {
        return Class2080.field12025;
    }
    
    @Override
    public Class7096 method2141() {
        return ((Class7097<O, Class7096>)Class7521.field29292.method11878()).method21773((Class7111<Comparable>)Class3865.field17497, Direction.NORTH);
    }
    
    @Override
    public int method2143() {
        return 8;
    }
    
    @Override
    public Class3418 method2167(final int n, final Class464 class464) {
        return Class3438.method10970(n, class464, this);
    }
}
