// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4297 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19265;
    private Class1792 field19266;
    
    public Class4297() {
    }
    
    public Class4297(final Class1792 field19266) {
        this.field19266 = field19266;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19266 = Class1792.method6468(class8654);
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        this.field19266.method6467(class8654);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17333(this);
    }
    
    public Class1792 method12904() {
        return this.field19266;
    }
}
