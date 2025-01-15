// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4373 extends SEntityPacket
{
    private static String[] field19580;
    
    public Class4373() {
        this.rotating = true;
    }
    
    public Class4373(final int n, final byte field19573, final byte field19574, final boolean field19575) {
        super(n);
        this.yaw = field19573;
        this.pitch = field19574;
        this.rotating = true;
        this.onGround = field19575;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        super.readPacketData(class8654);
        this.yaw = class8654.readByte();
        this.pitch = class8654.readByte();
        this.onGround = class8654.readBoolean();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        super.writePacketData(class8654);
        class8654.writeByte(this.yaw);
        class8654.writeByte(this.pitch);
        class8654.writeBoolean(this.onGround);
    }
}
