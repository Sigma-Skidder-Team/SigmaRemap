// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;

import java.io.IOException;
import java.util.UUID;

public class Class4293 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19251;
    private int field19252;
    private UUID field19253;
    private BlockPos field19254;
    private Direction field19255;
    private int field19256;
    
    public Class4293() {
    }
    
    public Class4293(final Class861 class861) {
        this.field19252 = class861.getEntityId();
        this.field19253 = class861.getUniqueID();
        this.field19254 = class861.method5194();
        this.field19255 = class861.method1882();
        this.field19256 = Registry.field227.getId(class861.field4601);
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19252 = class8654.readVarInt();
        this.field19253 = class8654.method29504();
        this.field19256 = class8654.readVarInt();
        this.field19254 = class8654.method29494();
        this.field19255 = Direction.byHorizontalIndex(class8654.readUnsignedByte());
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19252);
        class8654.method29503(this.field19253);
        class8654.writeVarInt(this.field19256);
        class8654.method29495(this.field19254);
        class8654.writeByte(this.field19255.getHorizontalIndex());
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17276(this);
    }
    
    public int method12894() {
        return this.field19252;
    }
    
    public UUID method12895() {
        return this.field19253;
    }
    
    public BlockPos method12896() {
        return this.field19254;
    }
    
    public Direction method12897() {
        return this.field19255;
    }
    
    public Class8539 method12898() {
        return Registry.field227.method499(this.field19256);
    }
}
