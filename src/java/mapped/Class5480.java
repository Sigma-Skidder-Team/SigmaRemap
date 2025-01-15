// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.swing.JComponent;
import javax.swing.JCheckBox;

public final class Class5480 extends Class5479
{
    private static String[] field22752;
    public final /* synthetic */ boolean field22753;
    public final /* synthetic */ String field22754;
    
    public Class5480(final String s, final String s2, final boolean field22753, final String field22754) {
        this.field22753 = field22753;
        this.field22754 = field22754;
        super(s, s2);
    }
    
    @Override
    public void method16727() {
        final JCheckBox checkBox = new JCheckBox();
        checkBox.setSelected(this.field22753);
        if (this.method16732(checkBox, this.field22754)) {
            this.field22750 = String.valueOf(checkBox.isSelected());
        }
    }
    
    @Override
    public Object method16728() {
        return Boolean.valueOf(this.field22750);
    }
}
