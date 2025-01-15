// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4354 extends Class4353
{
    private static String[] field19507;
    
    public Class4354() {
        this.field19505 = true;
    }
    
    public Class4354(final double field19499, final double field19500, final double field19501, final boolean field19502) {
        this.field19499 = field19499;
        this.field19500 = field19500;
        this.field19501 = field19501;
        this.field19504 = field19502;
        this.field19505 = true;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19499 = class8654.readDouble();
        this.field19500 = class8654.readDouble();
        this.field19501 = class8654.readDouble();
        super.readPacketData(class8654);
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeDouble(this.field19499);
        class8654.writeDouble(this.field19500);
        class8654.writeDouble(this.field19501);
        super.writePacketData(class8654);
    }
}
