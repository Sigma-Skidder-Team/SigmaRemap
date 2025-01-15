// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class1707 extends Class1703
{
    private static String[] field9591;
    public final /* synthetic */ Class1726 field9592;
    public final /* synthetic */ Class9541 field9593;
    public final /* synthetic */ Class6051 field9594;
    
    public Class1707(final Class6051 field9594, final Class1676 class1676, final Class1726 field9595, final Class9541 field9596) {
        this.field9594 = field9594;
        this.field9592 = field9595;
        this.field9593 = field9596;
        super(class1676);
    }
    
    @Override
    public void close() throws IOException {
        synchronized (this.field9594.field24606) {
            if (this.field9594.field24605) {
                return;
            }
            this.field9594.field24605 = true;
            final Class1726 field24606 = this.field9594.field24606;
            ++field24606.field9654;
        }
        super.close();
        this.field9593.method35621();
    }
}
