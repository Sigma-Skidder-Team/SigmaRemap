// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.swing.JSpinner;
import javax.swing.JComponent;

public class Class1360 implements Runnable
{
    private static String[] field7456;
    public final /* synthetic */ JComponent field7457;
    public final /* synthetic */ Class5479 field7458;
    
    public Class1360(final Class5479 field7458, final JComponent field7459) {
        this.field7458 = field7458;
        this.field7457 = field7459;
    }
    
    @Override
    public void run() {
        JComponent component = this.field7457;
        if (component instanceof JSpinner) {
            component = ((JSpinner.DefaultEditor)((JSpinner)this.field7457).getEditor()).getTextField();
        }
        component.requestFocusInWindow();
    }
}
