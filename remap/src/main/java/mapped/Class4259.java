// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4259 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19111;
    private int field19112;
    private int field19113;
    private int field19114;
    
    public Class4259() {
    }
    
    public Class4259(final int field19112, final int field19113, final int field19114) {
        this.field19112 = field19112;
        this.field19113 = field19113;
        this.field19114 = field19114;
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17307(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19112 = class8654.readUnsignedByte();
        this.field19113 = class8654.readVarInt();
        this.field19114 = class8654.readInt();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeByte(this.field19112);
        class8654.writeVarInt(this.field19113);
        class8654.writeInt(this.field19114);
    }
    
    public int method12788() {
        return this.field19112;
    }
    
    public int method12789() {
        return this.field19113;
    }
    
    public int method12790() {
        return this.field19114;
    }
}
