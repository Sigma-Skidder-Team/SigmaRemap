// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class4426 implements Class4410<Class6909>
{
    private static String[] field19757;
    
    public void method13385(final PacketBuffer class8654, final Class6909 class8655) {
        class8654.writeVarInt(Registry.field222.getId((Class6907<? extends Class6909>)class8655.method21272()));
        class8655.method21273(class8654);
    }
    
    public Class6909 method13386(final PacketBuffer class8654) {
        return this.method13387(class8654, Registry.field222.method499(class8654.readVarInt()));
    }
    
    private <T extends Class6909> T method13387(final PacketBuffer class8654, final Class6907<T> class8655) {
        return class8655.method21271().method19056(class8655, class8654);
    }
    
    public Class6909 method13388(final Class6909 class6909) {
        return class6909;
    }
}