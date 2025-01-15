// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;

public class Class5466 extends Class5419<Class759>
{
    private static String[] field22731;
    private final float field22732;
    private final float field22733;
    
    public Class5466(final float field22732, final float field22733) {
        super((Map)ImmutableMap.of());
        this.field22732 = field22732;
        this.field22733 = field22733;
    }
    
    public boolean method16590(final Class1849 class1849, final Class759 class1850) {
        return (class1850.method1706() && class1850.method1929() > this.field22732) || class1850.method1723();
    }
    
    public boolean method16580(final Class1849 class1849, final Class759 class1850, final long n) {
        return this.method16590(class1849, class1850);
    }
    
    public void method16582(final Class1849 class1849, final Class759 class1850, final long n) {
        if (class1850.method2633().nextFloat() < this.field22733) {
            class1850.method4149().method22382();
        }
    }
}
