// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class4412 implements Class4410<Class8562>
{
    private static String[] field19743;
    
    public void method13352(final PacketBuffer class8654, final Class8562 class8655) {
        class8654.writeVarInt(Registry.field239.getId(class8655.method28780()));
        class8654.writeVarInt(Registry.field240.getId(class8655.method28781()));
        class8654.writeVarInt(class8655.method28782());
    }
    
    public Class8562 method13353(final PacketBuffer class8654) {
        return new Class8562(Registry.field239.method499(class8654.readVarInt()), Registry.field240.method499(class8654.readVarInt()), class8654.readVarInt());
    }
    
    public Class8562 method13354(final Class8562 class8562) {
        return class8562;
    }
}
