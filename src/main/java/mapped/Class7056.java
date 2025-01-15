// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import java.awt.event.WindowAdapter;

public final class Class7056 extends WindowAdapter
{
    public final /* synthetic */ Class2419 field27458;
    public final /* synthetic */ JFrame field27459;
    public final /* synthetic */ Class395 field27460;
    
    public Class7056(final Class2419 field27458, final JFrame field27459, final Class395 field27460) {
        this.field27458 = field27458;
        this.field27459 = field27459;
        this.field27460 = field27460;
    }
    
    @Override
    public void windowClosing(final WindowEvent windowEvent) {
        if (!Class2419.access$000(this.field27458).getAndSet(true)) {
            this.field27459.setTitle("Minecraft server - shutting down!");
            this.field27460.method1456(true);
            Class2419.access$100(this.field27458);
        }
    }
}
