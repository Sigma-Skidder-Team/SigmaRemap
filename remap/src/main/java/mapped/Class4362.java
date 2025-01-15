// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4362 implements IPacket<Class5813>
{
    private static String[] field19548;
    private String field19549;
    
    public Class4362() {
    }
    
    public Class4362(final String field19549) {
        this.field19549 = field19549;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19549 = class8654.method29513(32767);
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.method29514(this.field19549);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17450(this);
    }
    
    public String method13122() {
        return this.field19549;
    }
}
