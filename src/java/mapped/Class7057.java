// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.swing.event.ChangeEvent;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;

public class Class7057 implements ChangeListener
{
    private static String[] field27461;
    public final /* synthetic */ Class2416 field27462;
    public final /* synthetic */ JSlider field27463;
    public final /* synthetic */ Class8284 field27464;
    
    public Class7057(final Class8284 field27464, final Class2416 field27465, final JSlider field27466) {
        this.field27464 = field27464;
        this.field27462 = field27465;
        this.field27463 = field27466;
    }
    
    @Override
    public void stateChanged(final ChangeEvent changeEvent) {
        this.field27462.method9686(this.field27463.getValue());
    }
}
