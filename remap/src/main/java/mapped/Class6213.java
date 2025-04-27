// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Random;

public abstract class Class6213
{
    public abstract boolean method18485(final BlockState p0, final Random p1);
    
    public <T> Dynamic<T> method18488(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.mergeInto(this.method18487((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps).getValue(), dynamicOps.createString("predicate_type"), dynamicOps.createString(Registry.field232.getKey(this.method18486()).toString())));
    }
    
    public abstract Class7757 method18486();
    
    public abstract <T> Dynamic<T> method18487(final DynamicOps<T> p0);
}
