// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;

public class Class7054 implements ActionListener
{
    private static String[] field27451;
    public final /* synthetic */ Class2416 field27452;
    public final /* synthetic */ JCheckBox field27453;
    public final /* synthetic */ Class8284 field27454;
    
    public Class7054(final Class8284 field27454, final Class2416 field27455, final JCheckBox field27456) {
        this.field27454 = field27454;
        this.field27452 = field27455;
        this.field27453 = field27456;
    }
    
    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        this.field27452.method9688(this.field27453.isSelected());
    }
}
