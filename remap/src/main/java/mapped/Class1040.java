// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.client.Manager;

import java.util.Timer;
import java.util.logging.Level;

public class Class1040 implements Runnable
{
    public final /* synthetic */ Class8332 field5574;
    public final /* synthetic */ Manager field5575;
    
    public Class1040(final Manager field5575, final Class8332 field5576) {
        this.field5575 = field5575;
        this.field5574 = field5576;
    }
    
    @Override
    public void run() {
        if (Manager.method15073().isLoggable(Level.FINE)) {
            Manager.method15073().fine(String.format("readyState %s", this.field5575.readyState));
        }
        if (this.field5575.readyState != Manager.ReadyState.OPEN && this.field5575.readyState != Manager.ReadyState.OPENING) {
            if (Manager.method15073().isLoggable(Level.FINE)) {
                Manager.method15073().fine(String.format("opening %s", Manager.method15074(this.field5575)));
            }
            this.field5575.engine = new Class4969(Manager.method15074(this.field5575), Manager.method15075(this.field5575));
            final Class4968 field21375 = this.field5575.engine;
            final Manager field21376 = this.field5575;
            this.field5575.readyState = Manager.ReadyState.OPENING;
            Manager.method15076(this.field5575, false);
            field21375.method14976("transport", new Class4670(this, field21376));
            final Handle method28106 = Class8415.method28106(field21375, "open", new Class4680(this, field21376));
            final Handle method28107 = Class8415.method28106(field21375, "error", new Class4699(this, field21376));
            if (Manager.method15081(this.field5575) >= 0L) {
                final long method28108 = Manager.method15081(this.field5575);
                Manager.method15073().fine(String.format("connection attempt will timeout after %d", method28108));
                final Timer timer = new Timer();
                timer.schedule(new Class1621(this, method28108, method28106, field21375, field21376), method28108);
                Manager.method15082(this.field5575).add(new Class4249(this, timer));
            }
            Manager.method15082(this.field5575).add(method28106);
            Manager.method15082(this.field5575).add(method28107);
            this.field5575.engine.method15101();
        }
    }
}
