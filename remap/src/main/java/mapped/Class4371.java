// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4371 extends SEntityPacket
{
    private static String[] field19578;
    
    public Class4371() {
        this.rotating = true;
        this.isMovePacket = true;
    }
    
    public Class4371(final int n, final short field19570, final short field19571, final short field19572, final byte field19573, final byte field19574, final boolean field19575) {
        super(n);
        this.posX = field19570;
        this.posY = field19571;
        this.posZ = field19572;
        this.yaw = field19573;
        this.pitch = field19574;
        this.onGround = field19575;
        this.rotating = true;
        this.isMovePacket = true;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        super.readPacketData(class8654);
        this.posX = class8654.readShort();
        this.posY = class8654.readShort();
        this.posZ = class8654.readShort();
        this.yaw = class8654.readByte();
        this.pitch = class8654.readByte();
        this.onGround = class8654.readBoolean();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        super.writePacketData(class8654);
        class8654.writeShort(this.posX);
        class8654.writeShort(this.posY);
        class8654.writeShort(this.posZ);
        class8654.writeByte(this.yaw);
        class8654.writeByte(this.pitch);
        class8654.writeBoolean(this.onGround);
    }
}
