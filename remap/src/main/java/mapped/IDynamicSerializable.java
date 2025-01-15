// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.types.DynamicOps;

public interface IDynamicSerializable
{
     <T> T serialize(final DynamicOps<T> p0);
}
