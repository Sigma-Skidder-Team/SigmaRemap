// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class932 extends Thread
{
    public final /* synthetic */ RealmsMainScreen field4919;
    
    public Class932(final RealmsMainScreen field4919, final String name) {
        this.field4919 = field4919;
        super(name);
    }
    
    @Override
    public void run() {
        final RealmsClient method35444 = RealmsClient.func_224911_a();
        try {
            if (method35444.method35453()) {
                RealmsMainScreen.method15819().info("Realms is available for this user");
                RealmsMainScreen.method15820(true);
            }
            else {
                RealmsMainScreen.method15819().info("Realms is not available for this user");
                RealmsMainScreen.method15820(false);
                Realms.setScreen(new Class5068(RealmsMainScreen.method15811(this.field4919)));
            }
            RealmsMainScreen.method15821(true);
        }
        catch (final RealmsServiceException class2330) {
            RealmsMainScreen.method15819().error("Couldn't connect to realms: ", (Object)class2330.toString());
            Realms.setScreen(new RealmsGenericErrorScreen(class2330, RealmsMainScreen.method15811(this.field4919)));
        }
        catch (final IOException ex) {
            RealmsMainScreen.method15819().error("Couldn't connect to realms: ", (Object)ex.getMessage());
            Realms.setScreen(new RealmsGenericErrorScreen(ex.getMessage(), RealmsMainScreen.method15811(this.field4919)));
        }
    }
}
