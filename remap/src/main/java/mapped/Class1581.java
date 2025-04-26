// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.List;

public class Class1581 extends NamedRunnable
{
    private static String[] field8839;
    public final /* synthetic */ int field8840;
    public final /* synthetic */ List field8841;
    public final /* synthetic */ boolean field8842;
    public final /* synthetic */ Class1758 field8843;
    
    public Class1581(final Class1758 field8843, final String s, final Object[] array, final int field8844, final List field8845, final boolean field8846) {
        this.field8843 = field8843;
        this.field8840 = field8844;
        this.field8841 = field8845;
        this.field8842 = field8846;
        super(s, array);
    }
    
    @Override
    public void execute() {
        final boolean method23702 = this.field8843.field9785.method23702(this.field8840, this.field8841, this.field8842);
        try {
            if (method23702) {
                this.field8843.field9794.method6270(this.field8840, Class2082.field12044);
            }
            if (method23702 || this.field8842) {
                synchronized (this.field8843) {
                    this.field8843.field9796.remove(this.field8840);
                }
            }
        }
        catch (final IOException ex) {}
    }
}
