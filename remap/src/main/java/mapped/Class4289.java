// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.io.IOException;

public class Class4289 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19232;
    private int field19233;
    private int field19234;
    
    public Class4289() {
    }
    
    public Class4289(final Entity class399, final int field19234) {
        this.field19233 = class399.getEntityId();
        this.field19234 = field19234;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19233 = class8654.readVarInt();
        this.field19234 = class8654.readUnsignedByte();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19233);
        class8654.writeByte(this.field19234);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17295(this);
    }
    
    public int method12878() {
        return this.field19233;
    }
    
    public int method12879() {
        return this.field19234;
    }
}
