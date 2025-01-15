// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.awt.event.ActionEvent;
import java.io.OutputStream;
import java.awt.event.ActionListener;
import org.apache.commons.io.output.CountingOutputStream;

public class Class1719 extends CountingOutputStream
{
    private static String[] field9634;
    private ActionListener field9635;
    public final /* synthetic */ Class8113 field9636;
    
    public Class1719(final Class8113 field9636, final OutputStream outputStream) {
        this.field9636 = field9636;
        super(outputStream);
    }
    
    public void method6070(final ActionListener field9635) {
        this.field9635 = field9635;
    }
    
    public void afterWrite(final int n) throws IOException {
        super.afterWrite(n);
        if (this.field9635 != null) {
            this.field9635.actionPerformed(new ActionEvent(this, 0, null));
        }
    }
}
