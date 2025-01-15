// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4388 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19662;
    private int field19663;
    
    public Class4388() {
    }
    
    public Class4388(final int field19663) {
        this.field19663 = field19663;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19663 = class8654.readByte();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeByte(this.field19663);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17281(this);
    }
    
    public int method13205() {
        return this.field19663;
    }
}
