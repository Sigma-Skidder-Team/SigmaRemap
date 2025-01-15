// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;
import java.util.UUID;

public class Class5305 extends Class5260<UUID>
{
    public Class5305() {
        super(UUID.class);
    }
    
    public UUID method16438(final ByteBuf byteBuf) {
        if (byteBuf.readBoolean()) {
            return new UUID(byteBuf.readLong(), byteBuf.readLong());
        }
        return null;
    }
    
    public void method16439(final ByteBuf byteBuf, final UUID uuid) {
        if (uuid != null) {
            byteBuf.writeBoolean(true);
            byteBuf.writeLong(uuid.getMostSignificantBits());
            byteBuf.writeLong(uuid.getLeastSignificantBits());
        }
        else {
            byteBuf.writeBoolean(false);
        }
    }
}
