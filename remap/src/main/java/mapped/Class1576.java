// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class1576 extends NamedRunnable
{
    private static String[] field8817;
    public final /* synthetic */ int field8818;
    public final /* synthetic */ Class1680 field8819;
    public final /* synthetic */ int field8820;
    public final /* synthetic */ boolean field8821;
    public final /* synthetic */ Class1758 field8822;
    
    public Class1576(final Class1758 field8822, final String s, final Object[] array, final int field8823, final Class1680 field8824, final int field8825, final boolean field8826) {
        this.field8822 = field8822;
        this.field8818 = field8823;
        this.field8819 = field8824;
        this.field8820 = field8825;
        this.field8821 = field8826;
        super(s, array);
    }
    
    @Override
    public void execute() {
        try {
            final boolean method23703 = this.field8822.field9785.method23703(this.field8818, this.field8819, this.field8820, this.field8821);
            if (method23703) {
                this.field8822.field9794.method6270(this.field8818, Class2082.field12044);
            }
            if (method23703 || this.field8821) {
                synchronized (this.field8822) {
                    this.field8822.field9796.remove(this.field8818);
                }
            }
        }
        catch (final IOException ex) {}
    }
}
