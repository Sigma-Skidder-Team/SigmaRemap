// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4261 implements IPacket<Class5813>
{
    private static String[] field19120;
    private int field19121;
    private int field19122;
    
    public Class4261() {
    }
    
    public Class4261(final int field19121, final int field19122) {
        this.field19121 = field19121;
        this.field19122 = field19122;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19121 = class8654.readVarInt();
        this.field19122 = class8654.readVarInt();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19121);
        class8654.writeVarInt(this.field19122);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17455(this);
    }
    
    public int method12791() {
        return this.field19121;
    }
    
    public int method12792() {
        return this.field19122;
    }
}
