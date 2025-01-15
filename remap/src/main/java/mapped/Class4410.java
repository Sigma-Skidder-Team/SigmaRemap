// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.network.datasync.DataParameter;

public interface Class4410<T>
{
    void method13347(final PacketBuffer p0, final T p1);
    
    T method13346(final PacketBuffer p0);
    
    default DataParameter<T> method13348(final int n) {
        return new DataParameter<T>(n, this);
    }
    
    T method13345(final T p0);
}
