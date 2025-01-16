// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class903 extends Thread
{
    public final /* synthetic */ RealmsMainScreen field4854;
    
    public Class903(final RealmsMainScreen field4854, final String name) {
        this.field4854 = field4854;
        super(name);
    }
    
    @Override
    public void run() {
        final RealmsClient method35444 = RealmsClient.func_224911_a();
        try {
            if (method35444.method35454()) {
                RealmsClient.method35445();
                RealmsMainScreen.method15819().info("Switched to stage");
                RealmsMainScreen.method15822().method32593();
            }
        }
        catch (final RealmsServiceException obj) {
            RealmsMainScreen.method15819().error("Couldn't connect to Realms: " + obj);
        }
        catch (final IOException ex) {
            RealmsMainScreen.method15819().error("Couldn't parse response connecting to Realms: " + ex.getMessage());
        }
    }
}
