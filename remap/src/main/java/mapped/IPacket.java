// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public interface IPacket<T extends INetHandler>
{
    void readPacketData(final PacketBuffer p0) throws IOException;
    
    void writePacketData(final PacketBuffer p0) throws IOException;
    
    void processPacket(final T p0);
    
    default boolean shouldSkipErrors() {
        return false;
    }
}
