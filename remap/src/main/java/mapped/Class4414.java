// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class4414 implements Class4410<Float>
{
    private static String[] field19745;
    
    public void method13358(final PacketBuffer class8654, final Float n) {
        class8654.writeFloat(n);
    }
    
    public Float method13359(final PacketBuffer class8654) {
        return class8654.readFloat();
    }
    
    public Float method13360(final Float n) {
        return n;
    }
}
