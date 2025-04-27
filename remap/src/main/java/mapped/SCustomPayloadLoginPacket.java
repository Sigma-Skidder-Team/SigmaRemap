// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class SCustomPayloadLoginPacket implements IPacket<IClientLoginNetHandler>
{
    private int field19276;
    private ResourceLocation field19277;
    private PacketBuffer field19278;
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19276 = class8654.readVarInt();
        this.field19277 = class8654.method29516();
        final int readableBytes = class8654.readableBytes();
        if (readableBytes >= 0 && readableBytes <= 1048576) {
            this.field19278 = new PacketBuffer(class8654.readBytes(readableBytes));
            return;
        }
        throw new IOException("Payload may not be larger than 1048576 bytes");
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19276);
        class8654.method29517(this.field19277);
        class8654.writeBytes(this.field19278.copy());
    }
    
    public void method12841(final IClientLoginNetHandler IClientLoginNetHandler) {
        IClientLoginNetHandler.handleCustomPayloadLogin(this);
    }
    
    public int method12916() {
        return this.field19276;
    }
}
