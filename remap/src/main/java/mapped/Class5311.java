// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;
import java.util.UUID;

public class Class5311 extends Class5260<UUID>
{
    public Class5311() {
        super(UUID.class);
    }
    
    public UUID method16438(final ByteBuf byteBuf) {
        return new UUID(byteBuf.readLong(), byteBuf.readLong());
    }
    
    public void method16439(final ByteBuf byteBuf, final UUID uuid) {
        byteBuf.writeLong(uuid.getMostSignificantBits());
        byteBuf.writeLong(uuid.getLeastSignificantBits());
    }
}
