// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.List;

public class Class1586 extends Class1574
{
    private static String[] field8852;
    public final /* synthetic */ int field8853;
    public final /* synthetic */ List field8854;
    public final /* synthetic */ Class1758 field8855;
    
    public Class1586(final Class1758 field8855, final String s, final Object[] array, final int field8856, final List field8857) {
        this.field8855 = field8855;
        this.field8853 = field8856;
        this.field8854 = field8857;
        super(s, array);
    }
    
    @Override
    public void method5660() {
        final boolean method23701 = this.field8855.field9785.method23701(this.field8853, this.field8854);
        try {
            if (method23701) {
                this.field8855.field9794.method6270(this.field8853, Class2082.field12044);
                synchronized (this.field8855) {
                    this.field8855.field9796.remove(this.field8853);
                }
            }
        }
        catch (final IOException ex) {}
    }
}
