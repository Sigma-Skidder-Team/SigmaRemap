// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.EventQueue;
import java.awt.Component;
import javax.swing.JComponent;

public abstract class Class5479 implements Class5484
{
    public String field22750;
    public String field22751;
    
    public Class5479(final String field22751, final String field22752) {
        this.field22750 = field22752;
        this.field22751 = field22751;
    }
    
    @Override
    public void method16729(final String field22750) {
        this.field22750 = field22750;
    }
    
    @Override
    public String method16730() {
        return this.field22750;
    }
    
    @Override
    public String method16731() {
        return this.field22751;
    }
    
    @Override
    public String toString() {
        if (this.field22750 != null) {
            return this.field22750;
        }
        return "";
    }
    
    public boolean method16732(final JComponent component, final String s) {
        final Class2417 class2417 = new Class2417(component, this.field22751, s);
        class2417.setTitle(this.field22751);
        class2417.setLocationRelativeTo(null);
        EventQueue.invokeLater(new Class1360(this, component));
        class2417.setVisible(true);
        return class2417.field14305;
    }
}
