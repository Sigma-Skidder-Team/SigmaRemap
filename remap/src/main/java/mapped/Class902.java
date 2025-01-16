// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class902 extends Thread
{
    public final /* synthetic */ RealmsMainScreen field4853;
    
    public Class902(final RealmsMainScreen field4853, final String name) {
        this.field4853 = field4853;
        super(name);
    }
    
    @Override
    public void run() {
        final RealmsClient method35444 = RealmsClient.func_224911_a();
        try {
            if (method35444.method35454()) {
                RealmsClient.method35447();
                RealmsMainScreen.method15819().info("Switched to local");
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
