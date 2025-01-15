// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class1585 extends Class1574
{
    private static String[] field8848;
    public final /* synthetic */ int field8849;
    public final /* synthetic */ long field8850;
    public final /* synthetic */ Class1758 field8851;
    
    public Class1585(final Class1758 field8851, final String s, final Object[] array, final int field8852, final long field8853) {
        this.field8851 = field8851;
        this.field8849 = field8852;
        this.field8850 = field8853;
        super(s, array);
    }
    
    @Override
    public void method5660() {
        try {
            this.field8851.field9794.method6277(this.field8849, this.field8850);
        }
        catch (final IOException ex) {}
    }
}
