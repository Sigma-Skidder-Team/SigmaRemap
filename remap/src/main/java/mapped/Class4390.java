// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4390 implements IPacket<Class5802>
{
    private int field19666;
    private PacketBuffer field19667;
    
    public Class4390() {
    }
    
    public Class4390(final int field19666, final PacketBuffer field19667) {
        this.field19666 = field19666;
        this.field19667 = field19667;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19666 = class8654.readVarInt();
        if (!class8654.readBoolean()) {
            this.field19667 = null;
        }
        else {
            final int readableBytes = class8654.readableBytes();
            if (readableBytes < 0 || readableBytes > 1048576) {
                throw new IOException("Payload may not be larger than 1048576 bytes");
            }
            this.field19667 = new PacketBuffer(class8654.readBytes(readableBytes));
        }
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19666);
        if (this.field19667 == null) {
            class8654.writeBoolean(false);
        }
        else {
            class8654.writeBoolean(true);
            class8654.writeBytes(this.field19667.copy());
        }
    }
    
    public void method12990(final Class5802 class5802) {
        class5802.method17390(this);
    }
}
