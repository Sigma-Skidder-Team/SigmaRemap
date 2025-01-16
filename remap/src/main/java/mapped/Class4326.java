// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4326 implements IPacket<Class5813>
{
    public static final ResourceLocation field19371;
    private ResourceLocation field19372;
    private PacketBuffer field19373;
    
    public Class4326() {
    }
    
    public Class4326(final ResourceLocation field19372, final PacketBuffer field19373) {
        this.field19372 = field19372;
        this.field19373 = field19373;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19372 = class8654.method29516();
        final int readableBytes = class8654.readableBytes();
        if (readableBytes >= 0 && readableBytes <= 32767) {
            this.field19373 = new PacketBuffer(class8654.readBytes(readableBytes));
            return;
        }
        throw new IOException("Payload may not be larger than 32767 bytes");
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.method29517(this.field19372);
        class8654.writeBytes(this.field19373);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17426(this);
        if (this.field19373 != null) {
            this.field19373.release();
        }
    }
    
    static {
        field19371 = new ResourceLocation("brand");
    }
}
