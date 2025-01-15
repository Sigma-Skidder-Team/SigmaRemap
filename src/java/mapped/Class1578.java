// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class1578 extends Class1574
{
    private static String[] field8825;
    public final /* synthetic */ int field8826;
    public final /* synthetic */ Class2082 field8827;
    public final /* synthetic */ Class1758 field8828;
    
    public Class1578(final Class1758 field8828, final String s, final Object[] array, final int field8829, final Class2082 field8830) {
        this.field8828 = field8828;
        this.field8826 = field8829;
        this.field8827 = field8830;
        super(s, array);
    }
    
    @Override
    public void method5660() {
        try {
            this.field8828.method6246(this.field8826, this.field8827);
        }
        catch (final IOException ex) {}
    }
}
