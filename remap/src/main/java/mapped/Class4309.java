// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.security.PublicKey;

public class Class4309 implements IPacket<Class5807>
{
    private static String[] field19317;
    private String field19318;
    private PublicKey field19319;
    private byte[] field19320;
    
    public Class4309() {
    }
    
    public Class4309(final String field19318, final PublicKey field19319, final byte[] field19320) {
        this.field19318 = field19318;
        this.field19319 = field19319;
        this.field19320 = field19320;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19318 = class8654.method29513(20);
        this.field19319 = Class9359.method34701(class8654.method29486());
        this.field19320 = class8654.method29486();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.method29514(this.field19318);
        class8654.method29485(this.field19319.getEncoded());
        class8654.method29485(this.field19320);
    }
    
    public void method12841(final Class5807 class5807) {
        class5807.method17404(this);
    }
    
    public String method12954() {
        return this.field19318;
    }
    
    public PublicKey method12955() {
        return this.field19319;
    }
    
    public byte[] method12956() {
        return this.field19320;
    }
}
