// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

import java.io.IOException;

public class Class4395 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19685;
    private int field19686;
    private BlockPos field19687;
    private int field19688;
    private boolean field19689;
    
    public Class4395() {
    }
    
    public Class4395(final int field19686, final BlockPos class354, final int field19687, final boolean field19688) {
        this.field19686 = field19686;
        this.field19687 = class354.toImmutable();
        this.field19688 = field19687;
        this.field19689 = field19688;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19686 = class8654.readInt();
        this.field19687 = class8654.method29494();
        this.field19688 = class8654.readInt();
        this.field19689 = class8654.readBoolean();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeInt(this.field19686);
        class8654.method29495(this.field19687);
        class8654.writeInt(this.field19688);
        class8654.writeBoolean(this.field19689);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17321(this);
    }
    
    public boolean method13219() {
        return this.field19689;
    }
    
    public int method13220() {
        return this.field19686;
    }
    
    public int method13221() {
        return this.field19688;
    }
    
    public BlockPos method13222() {
        return this.field19687;
    }
}
