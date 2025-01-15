// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4379 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19616;
    private int field19617;
    private int field19618;
    
    public Class4379() {
    }
    
    public Class4379(final int field19617, final int field19618) {
        this.field19617 = field19617;
        this.field19618 = field19618;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19617 = class8654.readVarInt();
        this.field19618 = class8654.readVarInt();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19617);
        class8654.writeVarInt(this.field19618);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17366(this);
    }
    
    public int method13167() {
        return this.field19617;
    }
    
    public int method13168() {
        return this.field19618;
    }
}
