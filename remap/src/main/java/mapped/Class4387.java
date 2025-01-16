// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4387 implements IPacket<Class5813>
{
    private static String[] field19658;
    private int field19659;
    private ResourceLocation field19660;
    private boolean field19661;
    
    public Class4387() {
    }
    
    public Class4387(final int field19659, final Class3662<?> class3662, final boolean field19660) {
        this.field19659 = field19659;
        this.field19660 = class3662.method11298();
        this.field19661 = field19660;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19659 = class8654.readByte();
        this.field19660 = class8654.method29516();
        this.field19661 = class8654.readBoolean();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeByte(this.field19659);
        class8654.method29517(this.field19660);
        class8654.writeBoolean(this.field19661);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17424(this);
    }
    
    public int method13202() {
        return this.field19659;
    }
    
    public ResourceLocation method13203() {
        return this.field19660;
    }
    
    public boolean method13204() {
        return this.field19661;
    }
}
