// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4316 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19343;
    private Class316 field19344;
    
    public Class4316() {
    }
    
    public Class4316(final Class316 field19344) {
        this.field19344 = field19344;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19344 = class8654.method29499(Class316.class);
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.method29500(this.field19344);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17354(this);
    }
    
    public Class316 method12972() {
        return this.field19344;
    }
}
