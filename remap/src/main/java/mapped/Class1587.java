// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class1587 extends NamedRunnable
{
    private static String[] field8856;
    public final /* synthetic */ Class8703 field8857;
    public final /* synthetic */ Class1583 field8858;
    
    public Class1587(final Class1583 field8858, final String s, final Object[] array, final Class8703 field8859) {
        this.field8858 = field8858;
        this.field8857 = field8859;
        super(s, array);
    }
    
    @Override
    public void execute() {
        try {
            this.field8858.field8847.field9794.method6264(this.field8857);
        }
        catch (final IOException ex) {}
    }
}
