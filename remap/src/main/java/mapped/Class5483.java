// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.swing.JComponent;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public final class Class5483 extends Class5479
{
    public final /* synthetic */ String[][] field22763;
    public final /* synthetic */ String field22764;
    public final /* synthetic */ String field22765;
    
    public Class5483(final String s, final String s2, final String[][] field22763, final String field22764, final String field22765) {
        this.field22763 = field22763;
        this.field22764 = field22764;
        this.field22765 = field22765;
        super(s, s2);
    }
    
    @Override
    public void method16727() {
        int selectedIndex = -1;
        final DefaultComboBoxModel aModel = new DefaultComboBoxModel();
        for (int i = 0; i < this.field22763.length; ++i) {
            aModel.addElement(this.field22763[i][0]);
            if (this.method16733(i).equals(this.field22764)) {
                selectedIndex = i;
            }
        }
        final JComboBox comboBox = new JComboBox(aModel);
        comboBox.setSelectedIndex(selectedIndex);
        if (this.method16732(comboBox, this.field22765)) {
            this.field22750 = this.method16733(comboBox.getSelectedIndex());
        }
    }
    
    private String method16733(final int n) {
        if (this.field22763[n].length != 1) {
            return this.field22763[n][1];
        }
        return this.field22763[n][0];
    }
    
    @Override
    public String toString() {
        for (int i = 0; i < this.field22763.length; ++i) {
            if (this.method16733(i).equals(this.field22750)) {
                return this.field22763[i][0];
            }
        }
        return "";
    }
    
    @Override
    public Object method16728() {
        return this.field22750;
    }
}
