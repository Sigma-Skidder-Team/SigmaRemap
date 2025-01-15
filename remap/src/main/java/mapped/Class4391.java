// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4391 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19668;
    private Class3820 field19669;
    private int field19670;
    
    public Class4391() {
    }
    
    public Class4391(final Class3820 field19669, final int field19670) {
        this.field19669 = field19669;
        this.field19670 = field19670;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19669 = Class3820.method11697(class8654.readVarInt());
        this.field19670 = class8654.readVarInt();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(Class3820.method11696(this.field19669));
        class8654.writeVarInt(this.field19670);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17352(this);
    }
    
    public Class3820 method13206() {
        return this.field19669;
    }
    
    public int method13207() {
        return this.field19670;
    }
}
