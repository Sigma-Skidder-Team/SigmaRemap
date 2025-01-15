// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1761 extends Class1760
{
    private final Class6957 field9806;
    private final Class1681 field9807;
    
    public Class1761(final Class6957 field9806, final Class1681 field9807) {
        this.field9806 = field9806;
        this.field9807 = field9807;
    }
    
    @Override
    public Class8991 method6282() {
        final String method21360 = this.field9806.method21360("Content-Type");
        return (method21360 == null) ? null : Class8991.method32077(method21360);
    }
    
    @Override
    public long method6283() {
        return Class9558.method35752(this.field9806);
    }
    
    @Override
    public Class1681 method6285() {
        return this.field9807;
    }
}
