// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;

public class PremiumChecker implements Runnable
{
    private final boolean field8286;
    
    public PremiumChecker(final boolean field8286) {
        this.field8286 = field8286;
    }
    
    @Override
    public void run() {
        while (!Thread.interrupted()) {
            if (Client.getInstance().getClientMode() == ClientMode.INDETERMINATE) {
                try {
                    Thread.sleep(200L);
                    continue;
                }
                catch (final InterruptedException ex) {
                    break;
                }
            }
            NetworkManager2.premium = this.field8286;
            break;
        }
    }
}
