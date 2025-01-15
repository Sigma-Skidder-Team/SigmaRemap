// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4372 extends SEntityPacket
{
    private static String[] field19579;
    
    public Class4372() {
        this.isMovePacket = true;
    }
    
    public Class4372(final int n, final short field19570, final short field19571, final short field19572, final boolean field19573) {
        super(n);
        this.posX = field19570;
        this.posY = field19571;
        this.posZ = field19572;
        this.onGround = field19573;
        this.isMovePacket = true;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        super.readPacketData(class8654);
        this.posX = class8654.readShort();
        this.posY = class8654.readShort();
        this.posZ = class8654.readShort();
        this.onGround = class8654.readBoolean();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        super.writePacketData(class8654);
        class8654.writeShort(this.posX);
        class8654.writeShort(this.posY);
        class8654.writeShort(this.posZ);
        class8654.writeBoolean(this.onGround);
    }
}
