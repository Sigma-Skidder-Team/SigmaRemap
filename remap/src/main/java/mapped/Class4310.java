// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4310 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19321;
    private int field19322;
    private BlockPos field19323;
    private int field19324;
    
    public Class4310() {
    }
    
    public Class4310(final int field19322, final BlockPos field19323, final int field19324) {
        this.field19322 = field19322;
        this.field19323 = field19323;
        this.field19324 = field19324;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19322 = class8654.readVarInt();
        this.field19323 = class8654.method29494();
        this.field19324 = class8654.readUnsignedByte();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19322);
        class8654.method29495(this.field19323);
        class8654.writeByte(this.field19324);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17318(this);
    }
    
    public int method12957() {
        return this.field19322;
    }
    
    public BlockPos method12958() {
        return this.field19323;
    }
    
    public int method12959() {
        return this.field19324;
    }
}
