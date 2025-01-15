// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public abstract class Class1692 implements Class1682
{
    private final Class1682 field9554;
    
    public Class1692(final Class1682 field9554) {
        if (field9554 != null) {
            this.field9554 = field9554;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }
    
    public final Class1682 method6048() {
        return this.field9554;
    }
    
    @Override
    public long method6014(final Class1680 class1680, final long n) throws IOException {
        return this.field9554.method6014(class1680, n);
    }
    
    @Override
    public Class8020 method5921() {
        return this.field9554.method5921();
    }
    
    @Override
    public void close() throws IOException {
        this.field9554.close();
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "(" + this.field9554.toString() + ")";
    }
}
