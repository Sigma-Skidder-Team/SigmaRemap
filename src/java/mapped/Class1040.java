// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.TimerTask;
import java.util.Timer;
import java.util.logging.Level;

public class Class1040 implements Runnable
{
    public final /* synthetic */ Class8332 field5574;
    public final /* synthetic */ Class4967 field5575;
    
    public Class1040(final Class4967 field5575, final Class8332 field5576) {
        this.field5575 = field5575;
        this.field5574 = field5576;
    }
    
    @Override
    public void run() {
        if (Class4967.method15073().isLoggable(Level.FINE)) {
            Class4967.method15073().fine(String.format("readyState %s", this.field5575.field21358));
        }
        if (this.field5575.field21358 != Class1978.field10966 && this.field5575.field21358 != Class1978.field10965) {
            if (Class4967.method15073().isLoggable(Level.FINE)) {
                Class4967.method15073().fine(String.format("opening %s", Class4967.method15074(this.field5575)));
            }
            this.field5575.field21375 = new Class4969(Class4967.method15074(this.field5575), Class4967.method15075(this.field5575));
            final Class4968 field21375 = this.field5575.field21375;
            final Class4967 field21376 = this.field5575;
            this.field5575.field21358 = Class1978.field10965;
            Class4967.method15076(this.field5575, false);
            field21375.method14976("transport", new Class4670(this, field21376));
            final Class4248 method28106 = Class8415.method28106(field21375, "open", new Class4680(this, field21376));
            final Class4248 method28107 = Class8415.method28106(field21375, "error", new Class4699(this, field21376));
            if (Class4967.method15081(this.field5575) >= 0L) {
                final long method28108 = Class4967.method15081(this.field5575);
                Class4967.method15073().fine(String.format("connection attempt will timeout after %d", method28108));
                final Timer timer = new Timer();
                timer.schedule(new Class1621(this, method28108, method28106, field21375, field21376), method28108);
                Class4967.method15082(this.field5575).add(new Class4249(this, timer));
            }
            Class4967.method15082(this.field5575).add(method28106);
            Class4967.method15082(this.field5575).add(method28107);
            this.field5575.field21375.method15101();
        }
    }
}
