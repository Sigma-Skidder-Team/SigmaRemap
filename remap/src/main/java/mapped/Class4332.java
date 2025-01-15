// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4332 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19397;
    private int field19398;
    
    public Class4332() {
    }
    
    public Class4332(final int field19398) {
        this.field19398 = field19398;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19398 = class8654.readVarInt();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19398);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17365(this);
    }
    
    public int method13010() {
        return this.field19398;
    }
}
