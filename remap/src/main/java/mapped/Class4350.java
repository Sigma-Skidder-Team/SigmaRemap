// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4350 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19485;
    private BlockPos field19486;
    
    public Class4350() {
    }
    
    public Class4350(final BlockPos field19486) {
        this.field19486 = field19486;
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17312(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19486 = class8654.method29494();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.method29495(this.field19486);
    }
    
    public BlockPos method13067() {
        return this.field19486;
    }
}
