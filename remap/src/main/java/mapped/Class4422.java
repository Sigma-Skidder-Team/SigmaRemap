// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class4422 implements Class4410<Class8396>
{
    private static String[] field19753;
    
    public void method13373(final PacketBuffer class8654, final Class8396 class8655) {
        class8654.writeFloat(class8655.method27997());
        class8654.writeFloat(class8655.method27998());
        class8654.writeFloat(class8655.method27999());
    }
    
    public Class8396 method13374(final PacketBuffer class8654) {
        return new Class8396(class8654.readFloat(), class8654.readFloat(), class8654.readFloat());
    }
    
    public Class8396 method13375(final Class8396 class8396) {
        return class8396;
    }
}
