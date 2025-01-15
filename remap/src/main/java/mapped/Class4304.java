// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4304 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19301;
    private int field19302;
    private int field19303;
    private int field19304;
    
    public Class4304() {
    }
    
    public Class4304(final int field19302, final int field19303, final int field19304) {
        this.field19302 = field19302;
        this.field19303 = field19303;
        this.field19304 = field19304;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19302 = class8654.readVarInt();
        this.field19303 = class8654.readVarInt();
        this.field19304 = class8654.readVarInt();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19302);
        class8654.writeVarInt(this.field19303);
        class8654.writeVarInt(this.field19304);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17293(this);
    }
    
    public int method12943() {
        return this.field19302;
    }
    
    public int method12944() {
        return this.field19303;
    }
    
    public int method12945() {
        return this.field19304;
    }
}
