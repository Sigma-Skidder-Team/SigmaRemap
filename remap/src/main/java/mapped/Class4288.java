// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4288 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19229;
    private int field19230;
    private int field19231;
    
    public Class4288() {
    }
    
    public Class4288(final int field19230, final int field19231) {
        this.field19230 = field19230;
        this.field19231 = field19231;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19230 = class8654.readInt();
        this.field19231 = class8654.readInt();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeInt(this.field19230);
        class8654.writeInt(this.field19231);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17288(this);
    }
    
    public int method12876() {
        return this.field19230;
    }
    
    public int method12877() {
        return this.field19231;
    }
}
