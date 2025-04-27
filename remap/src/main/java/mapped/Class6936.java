// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class6936 implements Class6926
{
    private static String[] field27167;
    
    @Override
    public <T> Dynamic<T> method21299(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.emptyMap());
    }
    
    public static Class6936 method21310(final Dynamic<?> dynamic) {
        return new Class6936();
    }
}
