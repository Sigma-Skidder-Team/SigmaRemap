// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public abstract class Class1703 implements Class1676
{
    private final Class1676 field9584;
    
    public Class1703(final Class1676 field9584) {
        if (field9584 != null) {
            this.field9584 = field9584;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }
    
    public final Class1676 method6056() {
        return this.field9584;
    }
    
    @Override
    public void method5920(final Class1680 class1680, final long n) throws IOException {
        this.field9584.method5920(class1680, n);
    }
    
    @Override
    public void flush() throws IOException {
        this.field9584.flush();
    }
    
    @Override
    public Class8020 method5921() {
        return this.field9584.method5921();
    }
    
    @Override
    public void close() throws IOException {
        this.field9584.close();
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "(" + this.field9584.toString() + ")";
    }
}
