// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public abstract class Class1915 implements AutoCloseable
{
    public boolean field10414;
    
    private Class1915() {
    }
    
    public int method7581(final long n, final long n2, final int n3) {
        try {
            return this.method7584(n2, n3);
        }
        catch (final IOException ex) {
            this.field10414 = true;
            return 0;
        }
    }
    
    public void method7582(final long n, final int n2) {
        try {
            this.method7585(n2);
        }
        catch (final IOException ex) {
            this.field10414 = true;
        }
    }
    
    public int method7583(final long n) {
        return this.field10414 ? 1 : 0;
    }
    
    public abstract int method7584(final long p0, final int p1) throws IOException;
    
    public abstract void method7585(final int p0) throws IOException;
    
    @Override
    public abstract void close() throws IOException;
}
