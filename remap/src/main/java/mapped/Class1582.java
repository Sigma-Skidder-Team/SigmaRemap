// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class1582 extends NamedRunnable
{
    public final /* synthetic */ Class8082 field8844;
    public final /* synthetic */ Class1583 field8845;
    
    public Class1582(final Class1583 field8845, final String s, final Object[] array, final Class8082 field8846) {
        this.field8845 = field8845;
        this.field8844 = field8846;
        super(s, array);
    }
    
    @Override
    public void execute() {
        try {
            this.field8845.field8847.field9777.method15347(this.field8844);
            return;
        }
        catch (final IOException ex) {
            Class6550.method19842().method19846(4, "Http2Connection.Listener failure for " + this.field8845.field8847.field9779, ex);
            final Class1582 class1582 = this;
            final Class8082 class1583 = class1582.field8844;
            final Class2082 class1584 = Class2082.field12040;
            class1583.method26529(class1584);
            return;
        }
        try {
            final Class1582 class1582 = this;
            final Class8082 class1583 = class1582.field8844;
            final Class2082 class1584 = Class2082.field12040;
            class1583.method26529(class1584);
        }
        catch (final IOException ex2) {}
    }
}
