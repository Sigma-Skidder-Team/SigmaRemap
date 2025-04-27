// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.Closeable;

public final class Class6051 implements Class6050
{
    private static String[] field24601;
    private final Class9541 field24602;
    private final Class1676 field24603;
    private final Class1676 field24604;
    public boolean field24605;
    public final /* synthetic */ Class1726 field24606;
    
    public Class6051(final Class1726 field24606, final Class9541 field24607) {
        this.field24606 = field24606;
        this.field24602 = field24607;
        this.field24603 = field24607.method35620(1);
        this.field24604 = new Class1707(this, this.field24603, field24606, field24607);
    }
    
    @Override
    public void method17980() {
        synchronized (this.field24606) {
            if (this.field24605) {
                return;
            }
            this.field24605 = true;
            final Class1726 field24606 = this.field24606;
            ++field24606.field9655;
        }
        Class7690.method24432(this.field24603);
        try {
            this.field24602.method35622();
        }
        catch (final IOException ex) {}
    }
    
    @Override
    public Class1676 method17979() {
        return this.field24604;
    }
}
