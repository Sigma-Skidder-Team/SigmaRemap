// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class4416 implements Class4410<Integer>
{
    private static String[] field19747;
    
    public void method13364(final PacketBuffer class8654, final Integer n) {
        class8654.writeVarInt(n);
    }
    
    public Integer method13365(final PacketBuffer class8654) {
        return class8654.readVarInt();
    }
    
    public Integer method13366(final Integer n) {
        return n;
    }
}
