// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Random;

public class Class6215 extends Class6213
{
    private static String[] field25063;
    public static final Class6215 field25064;
    
    private Class6215() {
    }
    
    @Override
    public boolean method18485(final BlockState class7096, final Random random) {
        return true;
    }
    
    @Override
    public Class7757 method18486() {
        return Class7757.field31698;
    }
    
    @Override
    public <T> Dynamic<T> method18487(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.emptyMap());
    }
    
    static {
        field25064 = new Class6215();
    }
}
