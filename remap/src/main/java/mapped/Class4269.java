// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.io.IOException;

public class Class4269 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19149;
    private ResourceLocation field19150;
    
    public Class4269() {
    }
    
    public Class4269(final ResourceLocation field19150) {
        this.field19150 = field19150;
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17323(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        if (class8654.readBoolean()) {
            this.field19150 = class8654.method29516();
        }
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeBoolean(this.field19150 != null);
        if (this.field19150 != null) {
            class8654.method29517(this.field19150);
        }
    }
    
    @Nullable
    public ResourceLocation method12812() {
        return this.field19150;
    }
}
