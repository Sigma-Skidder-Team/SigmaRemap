// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4353 implements IPacket<Class5813>
{
    private static String[] field19498;
    public double field19499;
    public double field19500;
    public double field19501;
    public float field19502;
    public float field19503;
    public boolean field19504;
    public boolean field19505;
    public boolean field19506;
    
    public Class4353() {
    }
    
    public Class4353(final boolean field19504) {
        this.field19504 = field19504;
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17429(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19504 = (class8654.readUnsignedByte() != 0);
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeByte(this.field19504 ? 1 : 0);
    }
    
    public double method13078(final double n) {
        return this.field19505 ? this.field19499 : n;
    }
    
    public double method13079(final double n) {
        return this.field19505 ? this.field19500 : n;
    }
    
    public double method13080(final double n) {
        return this.field19505 ? this.field19501 : n;
    }
    
    public float method13081(final float n) {
        return this.field19506 ? this.field19502 : n;
    }
    
    public float method13082(final float n) {
        return this.field19506 ? this.field19503 : n;
    }
    
    public boolean method13083() {
        return this.field19504;
    }
}
