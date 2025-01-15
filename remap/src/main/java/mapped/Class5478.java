// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JColorChooser;

public final class Class5478 extends Class5479
{
    public Class5478(final String s, final String s2) {
        super(s, s2);
    }
    
    @Override
    public void method16727() {
        final Color showDialog = JColorChooser.showDialog(null, "Choose a color", Class7340.method22549(this.field22750));
        if (showDialog != null) {
            this.field22750 = Class7340.toString(showDialog);
        }
    }
    
    @Override
    public Object method16728() {
        return Class7340.method22549(this.field22750);
    }
}
