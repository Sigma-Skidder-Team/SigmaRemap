// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import javax.annotation.Nullable;

public abstract class Class4107
{
    @Nullable
    public abstract Class9038 method12350(final Class1852 p0, final BlockPos p1, final Class9038 p2, final Class9038 p3, final Class9092 p4);
    
    public abstract Class7756 method12351();
    
    public abstract <T> Dynamic<T> method12352(final DynamicOps<T> p0);
    
    public <T> Dynamic<T> method12355(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.mergeInto(this.method12352((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps).getValue(), dynamicOps.createString("processor_type"), dynamicOps.createString(Registry.field233.getKey(this.method12351()).toString())));
    }
}
