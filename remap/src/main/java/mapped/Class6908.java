// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6908 extends Class6907<Class6908> implements IParticleData
{
    private static String[] field27091;
    private static final Class6382<Class6908> field27094;
    
    public Class6908(final boolean b) {
        super(b, Class6908.field27094);
    }
    
    @Override
    public Class6907<Class6908> method21272() {
        return this;
    }
    
    @Override
    public void method21273(final PacketBuffer class8654) {
    }
    
    @Override
    public String method21274() {
        return Registry.field222.getKey(this).toString();
    }
    
    static {
        field27094 = new Class6381();
    }
}
