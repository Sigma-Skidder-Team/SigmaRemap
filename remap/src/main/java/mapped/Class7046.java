// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;

public class Class7046 implements ActionListener
{
    private static String[] field27424;
    public final /* synthetic */ Class2416 field27425;
    public final /* synthetic */ JCheckBox field27426;
    public final /* synthetic */ Class8284 field27427;
    
    public Class7046(final Class8284 field27427, final Class2416 field27428, final JCheckBox field27429) {
        this.field27427 = field27427;
        this.field27425 = field27428;
        this.field27426 = field27429;
    }
    
    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        this.field27425.method9690(this.field27426.isSelected());
    }
}
