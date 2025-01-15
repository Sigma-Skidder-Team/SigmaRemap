// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.swing.JComponent;
import javax.swing.SpinnerModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public final class Class5482 extends Class5479
{
    private static String[] field22758;
    public final /* synthetic */ float field22759;
    public final /* synthetic */ float field22760;
    public final /* synthetic */ float field22761;
    public final /* synthetic */ String field22762;
    
    public Class5482(final String s, final String s2, final float field22759, final float field22760, final float field22761, final String field22762) {
        this.field22759 = field22759;
        this.field22760 = field22760;
        this.field22761 = field22761;
        this.field22762 = field22762;
        super(s, s2);
    }
    
    @Override
    public void method16727() {
        final JSpinner spinner = new JSpinner(new SpinnerNumberModel(this.field22759, this.field22760, this.field22761, 0.10000000149011612));
        if (this.method16732(spinner, this.field22762)) {
            this.field22750 = String.valueOf(((Double)spinner.getValue()).floatValue());
        }
    }
    
    @Override
    public Object method16728() {
        return Float.valueOf(this.field22750);
    }
}
