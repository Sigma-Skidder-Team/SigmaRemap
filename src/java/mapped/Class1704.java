// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class1704 extends Class1703
{
    private static String[] field9585;
    private boolean field9586;
    
    public Class1704(final Class1676 class1676) {
        super(class1676);
    }
    
    @Override
    public void method5920(final Class1680 class1680, final long n) throws IOException {
        if (this.field9586) {
            class1680.method5995(n);
            return;
        }
        try {
            super.method5920(class1680, n);
        }
        catch (final IOException ex) {
            this.field9586 = true;
            this.method6057(ex);
        }
    }
    
    @Override
    public void flush() throws IOException {
        if (this.field9586) {
            return;
        }
        try {
            super.flush();
        }
        catch (final IOException ex) {
            this.field9586 = true;
            this.method6057(ex);
        }
    }
    
    @Override
    public void close() throws IOException {
        if (this.field9586) {
            return;
        }
        try {
            super.close();
        }
        catch (final IOException ex) {
            this.field9586 = true;
            this.method6057(ex);
        }
    }
    
    public void method6057(final IOException ex) {
    }
}
