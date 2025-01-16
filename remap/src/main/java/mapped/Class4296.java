// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.io.IOException;

public class Class4296 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19262;
    private int field19263;
    private CompoundNBT field19264;
    
    public Class4296() {
    }
    
    public Class4296(final int field19263, final CompoundNBT field19264) {
        this.field19263 = field19263;
        this.field19264 = field19264;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19263 = class8654.readVarInt();
        this.field19264 = class8654.method29508();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19263);
        class8654.method29507(this.field19264);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17329(this);
    }
    
    public int method12902() {
        return this.field19263;
    }
    
    @Nullable
    public CompoundNBT method12903() {
        return this.field19264;
    }
    
    @Override
    public boolean shouldSkipErrors() {
        return true;
    }
}
