// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4317 implements IPacket<Class5813>
{
    private static String[] field19345;
    public String field19346;
    
    public Class4317() {
    }
    
    public Class4317(String substring) {
        if (substring.length() > 256) {
            substring = substring.substring(0, 256);
        }
        this.field19346 = substring;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19346 = class8654.method29513(256);
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.method29514(this.field19346);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17418(this);
    }
    
    public String method12973() {
        return this.field19346;
    }
}
