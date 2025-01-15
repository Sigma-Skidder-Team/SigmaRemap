// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.swing.JComponent;
import javax.swing.SpinnerModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public final class Class5481 extends Class5479
{
    private static String[] field22755;
    public final /* synthetic */ int field22756;
    public final /* synthetic */ String field22757;
    
    public Class5481(final String s, final String s2, final int field22756, final String field22757) {
        this.field22756 = field22756;
        this.field22757 = field22757;
        super(s, s2);
    }
    
    @Override
    public void method16727() {
        final JSpinner spinner = new JSpinner(new SpinnerNumberModel(this.field22756, -32768, 32767, 1));
        if (this.method16732(spinner, this.field22757)) {
            this.field22750 = String.valueOf(spinner.getValue());
        }
    }
    
    @Override
    public Object method16728() {
        return Integer.valueOf(this.field22750);
    }
}
