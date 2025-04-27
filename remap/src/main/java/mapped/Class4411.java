// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class4411 implements Class4410<String>
{
    private static String[] field19742;
    
    public void method13349(final PacketBuffer class8654, final String s) {
        class8654.writeString(s);
    }
    
    public String method13350(final PacketBuffer class8654) {
        return class8654.readString(32767);
    }
    
    public String method13351(final String s) {
        return s;
    }
}
