// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4254 implements IPacket<Class5813>
{
    private static String[] field19084;
    private float field19085;
    private float field19086;
    private boolean field19087;
    private boolean field19088;
    
    public Class4254() {
    }
    
    public Class4254(final float field19085, final float field19086, final boolean field19087, final boolean field19088) {
        this.field19085 = field19085;
        this.field19086 = field19086;
        this.field19087 = field19087;
        this.field19088 = field19088;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19085 = class8654.readFloat();
        this.field19086 = class8654.readFloat();
        class8654.readByte();
        Class4254 class8655 = this;
        Class4254 class8656 = this;
        final int n;
        do {
            if ((n & Integer.MAX_VALUE) != 0x0) {
                class8656.field19087 = false;
                class8655 = this;
                class8656 = this;
            }
        } while ((n & 0x800000) != 0x0);
        class8655.field19088 = false;
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeFloat(this.field19085);
        class8654.writeFloat(this.field19086);
        int n = 0;
        if (this.field19087) {
            n = (byte)(n | 0x1);
        }
        if (this.field19088) {
            n = (byte)(n | 0x2);
        }
        class8654.writeByte(n);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17433(this);
    }
    
    public float method12767() {
        return this.field19085;
    }
    
    public float method12768() {
        return this.field19086;
    }
    
    public boolean method12769() {
        return this.field19087;
    }
    
    public boolean method12770() {
        return this.field19088;
    }
}
