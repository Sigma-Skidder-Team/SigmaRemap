// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4275 implements IPacket<Class5813>
{
    private static String[] field19170;
    private int field19171;
    private BlockPos field19172;
    
    public Class4275() {
    }
    
    public Class4275(final int field19171, final BlockPos field19172) {
        this.field19171 = field19171;
        this.field19172 = field19172;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19171 = class8654.readVarInt();
        this.field19172 = class8654.method29494();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19171);
        class8654.method29495(this.field19172);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17456(this);
    }
    
    public int method12827() {
        return this.field19171;
    }
    
    public BlockPos method12828() {
        return this.field19172;
    }
}
