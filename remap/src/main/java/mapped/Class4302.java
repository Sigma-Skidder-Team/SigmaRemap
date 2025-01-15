// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4302 implements IPacket<Class5813>
{
    private static String[] field19296;
    private boolean field19297;
    private boolean field19298;
    
    public Class4302() {
    }
    
    public Class4302(final boolean field19297, final boolean field19298) {
        this.field19297 = field19297;
        this.field19298 = field19298;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19297 = class8654.readBoolean();
        this.field19298 = class8654.readBoolean();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeBoolean(this.field19297);
        class8654.writeBoolean(this.field19298);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17441(this);
    }
    
    public boolean method12940() {
        return this.field19297;
    }
    
    public boolean method12941() {
        return this.field19298;
    }
}
