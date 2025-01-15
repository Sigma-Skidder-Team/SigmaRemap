// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import javax.annotation.Nullable;

public class Class4111 extends Class4107
{
    private static String[] field18214;
    public static final Class4111 field18215;
    
    private Class4111() {
    }
    
    @Nullable
    @Override
    public Class9038 method12350(final Class1852 class1852, final Class354 class1853, final Class9038 class1854, final Class9038 class1855, final Class9092 class1856) {
        return class1855;
    }
    
    @Override
    public Class7756 method12351() {
        return Class7756.field31697;
    }
    
    @Override
    public <T> Dynamic<T> method12352(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.emptyMap());
    }
    
    static {
        field18215 = new Class4111();
    }
}
