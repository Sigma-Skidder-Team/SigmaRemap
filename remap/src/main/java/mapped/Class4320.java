// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import org.apache.logging.log4j.Logger;

public class Class4320 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19355;
    private static final Logger field19356;
    private BlockPos field19357;
    private BlockState field19358;
    public Class2003 field19359;
    private boolean field19360;
    
    public Class4320() {
    }
    
    public Class4320(final BlockPos class354, final BlockState field19358, final Class2003 field19359, final boolean field19360, final String s) {
        this.field19357 = class354.toImmutable();
        this.field19358 = field19358;
        this.field19359 = field19359;
        this.field19360 = field19360;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19357 = class8654.method29494();
        this.field19358 = Block.field17391.method499(class8654.readVarInt());
        this.field19359 = class8654.method29499(Class2003.class);
        this.field19360 = class8654.readBoolean();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.method29495(this.field19357);
        class8654.writeVarInt(Block.method11774(this.field19358));
        class8654.method29500(this.field19359);
        class8654.writeBoolean(this.field19360);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17367(this);
    }
    
    public BlockState method12981() {
        return this.field19358;
    }
    
    public BlockPos method12982() {
        return this.field19357;
    }
    
    public boolean method12983() {
        return this.field19360;
    }
    
    public Class2003 method12984() {
        return this.field19359;
    }
    
    static {
        field19356 = LogManager.getLogger();
    }
}
