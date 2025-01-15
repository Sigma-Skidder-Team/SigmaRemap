// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4356 extends Class4353
{
    private static String[] field19508;
    
    public Class4356() {
        this.field19506 = true;
    }
    
    public Class4356(final float field19502, final float field19503, final boolean field19504) {
        this.field19502 = field19502;
        this.field19503 = field19503;
        this.field19504 = field19504;
        this.field19506 = true;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19502 = class8654.readFloat();
        this.field19503 = class8654.readFloat();
        super.readPacketData(class8654);
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeFloat(this.field19502);
        class8654.writeFloat(this.field19503);
        super.writePacketData(class8654);
    }
}
