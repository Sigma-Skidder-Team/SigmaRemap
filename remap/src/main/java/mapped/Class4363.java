// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

import java.io.IOException;

public class Class4363 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19550;
    private BlockPos field19551;
    private int field19552;
    private int field19553;
    private Block field19554;
    
    public Class4363() {
    }
    
    public Class4363(final BlockPos field19551, final Block field19552, final int field19553, final int field19554) {
        this.field19551 = field19551;
        this.field19554 = field19552;
        this.field19552 = field19553;
        this.field19553 = field19554;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19551 = class8654.method29494();
        this.field19552 = class8654.readUnsignedByte();
        this.field19553 = class8654.readUnsignedByte();
        this.field19554 = Registry.BLOCK.method499(class8654.readVarInt());
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.method29495(this.field19551);
        class8654.writeByte(this.field19552);
        class8654.writeByte(this.field19553);
        class8654.writeVarInt(Registry.BLOCK.getId(this.field19554));
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17317(this);
    }
    
    public BlockPos method13123() {
        return this.field19551;
    }
    
    public int method13124() {
        return this.field19552;
    }
    
    public int method13125() {
        return this.field19553;
    }
    
    public Block method13126() {
        return this.field19554;
    }
}
